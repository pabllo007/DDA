//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.05 at 03:37:34 PM BRT 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.sspb.envio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = { "cooperativa", "dataHora", "numSeq" })
public class HeaderEnvio {

    @XmlElement(name = "Cooperativa", required = true)
    private Integer cooperativa;
    @XmlElement(name = "DataHora", required = true)
    private String dataHora;
    @XmlElement(name = "NumSeq", required = true)
    private Long numSeq;

    /**
     * @return the cooperativa
     */
    public Integer getCooperativa() {
        return cooperativa;
    }

    /**
     * @param cooperativa the cooperativa to set
     */
    public void setCooperativa(Integer cooperativa) {
        this.cooperativa = cooperativa;
    }

    /**
     * @return the dataHora
     */
    public String getDataHora() {
        return dataHora;
    }

    /**
     * @param dataHora the dataHora to set
     */
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    /**
     * @return the numSeq
     */
    public Long getNumSeq() {
        return numSeq;
    }

    /**
     * @param numSeq the numSeq to set
     */
    public void setNumSeq(Long numSeq) {
        this.numSeq = numSeq;
    }

}
