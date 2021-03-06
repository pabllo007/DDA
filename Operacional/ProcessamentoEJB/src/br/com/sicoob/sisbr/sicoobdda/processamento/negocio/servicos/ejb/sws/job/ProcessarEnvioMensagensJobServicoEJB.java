/**
 * Projeto:         SicoobDDA
 * Camada Projeto:  sdda-processamento-ejb
 * Pacote:          br.com.sicoob.sisbr.sicoobdda.processamento.negocio.servicos.ejb.sws
 * Arquivo:         ProcessarEnvioMensagensPrioritariasJobServicoEJB.java
 * Data Cria��o:    Jul 8, 2016
 */
package br.com.sicoob.sisbr.sicoobdda.processamento.negocio.servicos.ejb.sws.job;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.com.sicoob.sisbr.sicoobdda.comum.negocio.util.ObjectUtil;
import br.com.sicoob.sisbr.sicoobdda.entidades.util.Constantes;
import br.com.sicoob.sisbr.sicoobdda.processamento.persistencia.dao.ProcessamentoDaoFactory;
import br.com.sicoob.sisbr.sicoobdda.processamento.persistencia.dao.ProcessamentoSWSDao;
import br.com.sicoob.sws.api.contexto.ContextoExecucao;
import br.com.sicoob.sws.api.dominio.TipoParametro;
import br.com.sicoob.sws.api.execucao.JobSicoobServico;
import br.com.sicoob.sws.api.execucao.Step;
import br.com.sicoob.sws.api.execucao.VerificacaoDependencias;
import br.com.sicoob.sws.api.parametro.Parametro;
import br.com.sicoob.sws.api.servico.JobServico;

/**
 * ProcessarEnvioMensagensJobServicoEJB
 * 
 * @author Rafael.Silva
 */
@Stateless
@Remote(JobServico.class)
public class ProcessarEnvioMensagensJobServicoEJB extends JobSicoobServico {

    private static final String JNDI_STEP = "sicoobdda_processamento/ProcessarEnvioMensagensStepServicoRemote";
    private static final int TIMEOUT_STEP = 600;

    private ProcessamentoSWSDao processamentoSWSDao = ProcessamentoDaoFactory.getInstance().criarProcessamentoSWSDao();

    /*
     * (non-Javadoc)
     * 
     * @see br.com.sicoob.sws.api.servico.JobServico#verificarDependencias(br.com.sicoob.sws.api.contexto.ContextoExecucao)
     */
    public VerificacaoDependencias verificarDependencias(ContextoExecucao contexto) {
        return sucesso();
    }

    /**
     * {@inheritDoc}
     * 
     * @see br.com.sicoob.sws.api.servico.JobServico#obterSteps(br.com.sicoob.sws.api.contexto.ContextoExecucao)
     */
    public List<Step> obterSteps(ContextoExecucao contexto) {
        List<Step> listaSteps = new ArrayList<Step>();
        List<Integer> listaNumAgrupamentoSteps = processamentoSWSDao.listarNumAgrupamentoEnvioMsg(Boolean.FALSE);

        if (!ObjectUtil.isEmpty(listaNumAgrupamentoSteps)) {
            double esforcoStep = getEsforcoSteps(listaNumAgrupamentoSteps.size());

            for (Integer numAgrupamentoSteps : listaNumAgrupamentoSteps) {
                Parametro numAgrupamento = new Parametro("numAgrupamentoSteps", numAgrupamentoSteps, TipoParametro.INTEIRO);
                listaSteps.add(ejb(JNDI_STEP).comTimeout(TIMEOUT_STEP).realizandoEsforcoDe(esforcoStep).comParametros(numAgrupamento));
            }
        }
        return listaSteps;
    }

    /**
     * M�todo respons�vel por obter o esfor�o
     * 
     * @param qtdSteps
     * @return
     */
    private double getEsforcoSteps(int qtdSteps) {
        return Constantes.INTEGER_UM / (double) qtdSteps;
    }

}
