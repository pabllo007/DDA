package br.com.sicoob.sisbr.sicoobdda.operacional.persistencia.dao;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.bancoob.infraestrutura.conexao.CorporativoDataSource;
import br.com.bancoob.persistencia.excecao.PersistenciaException;
import br.com.sicoob.sisbr.sicoobdda.comum.persistencia.dao.ComumCrudDaoDB2;
import br.com.sicoob.sisbr.sicoobdda.entidades.SicoobDDAEntidade;

/**
 * OperacionalBackOfficeCrudDaoDB2
 * 
 * @author Kaio.Rocha
 */
public abstract class OperacionalCrudDaoDB2<T extends SicoobDDAEntidade> extends ComumCrudDaoDB2<T> implements OperacionalCrudDaoIF<T> {

    /**
     * @param arquivoQueries
     * @param nomeColecaoComandos
     * @param clazz
     * @param nomeComandoPesquisar
     * @param nomeComandoPesquisaNumeroRegistros
     */
    public OperacionalCrudDaoDB2(String arquivoQueries, String nomeColecaoComandos, Class<T> clazz, String nomeComandoPesquisar, String nomeComandoPesquisaNumeroRegistros) {
        super(arquivoQueries, nomeColecaoComandos, clazz, nomeComandoPesquisar, nomeComandoPesquisaNumeroRegistros);
    }

    /**
     * {@inheritDoc}
     * 
     * @see br.com.sicoob.sisbr.sicoobdda.comum.persistencia.dao.ComumCrudDaoDB2#estabelecerConexao()
     */
    @Override
    protected Connection estabelecerConexao() {
        try {
            CorporativoDataSource dataSource = new CorporativoDataSource(NOME_DATA_SOURCE, System.getProperties());

            return dataSource.getConnection();
        } catch (SQLException excecao) {
            getLogger().erro(excecao, excecao.getMessage());
            throw new PersistenciaException(excecao);
        }
    }

}
