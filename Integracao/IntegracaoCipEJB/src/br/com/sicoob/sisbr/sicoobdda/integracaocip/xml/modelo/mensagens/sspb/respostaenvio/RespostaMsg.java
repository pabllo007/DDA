//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.05 at 03:37:34 PM BRT 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.sspb.respostaenvio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Felipe.Rosa
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespostaMsg", propOrder = { "nuOp", "erro" })
public class RespostaMsg {

    @XmlElement(name = "NUOP", required = true)
    private String nuOp;

    @XmlElement(name = "Erro", required = true)
    private String erro;

    /**
     * @return the nuOp
     */
    public String getNuOp() {
        return nuOp;
    }

    /**
     * @param nuOp the nuOp to set
     */
    public void setNuOp(String nuOp) {
        this.nuOp = nuOp;
    }

    /**
     * @return the erro
     */
    public String getErro() {
        return erro;
    }

    /**
     * @param erro the erro to set
     */
    public void setErro(String erro) {
        this.erro = erro;
    }

}
