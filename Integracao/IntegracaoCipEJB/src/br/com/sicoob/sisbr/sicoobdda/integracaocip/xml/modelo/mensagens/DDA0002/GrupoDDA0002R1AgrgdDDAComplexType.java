//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 09:22:19 AM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.DDA0002;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Grupo_DDA0002R1_AgrgdDDAComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grupo_DDA0002R1_AgrgdDDAComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SitAgrgd" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}SitAgrgd"/>
 *         &lt;element name="TpPessoaAgrgd" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}TpPessoa"/>
 *         &lt;element name="CNPJ_CPFAgrgd" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}CNPJ_CPF"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grupo_DDA0002R1_AgrgdDDAComplexType", propOrder = { "sitAgrgd", "tpPessoaAgrgd", "cnpjcpfAgrgd" })
public class GrupoDDA0002R1AgrgdDDAComplexType {

    @XmlElement(name = "SitAgrgd", required = true)
    private String sitAgrgd;
    @XmlElement(name = "TpPessoaAgrgd", required = true)
    private String tpPessoaAgrgd;
    @XmlElement(name = "CNPJ_CPFAgrgd", required = true)
    private BigInteger cnpjcpfAgrgd;

    /**
     * Gets the value of the sitAgrgd property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSitAgrgd() {
        return sitAgrgd;
    }

    /**
     * Sets the value of the sitAgrgd property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSitAgrgd(String value) {
        this.sitAgrgd = value;
    }

    /**
     * Gets the value of the tpPessoaAgrgd property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTpPessoaAgrgd() {
        return tpPessoaAgrgd;
    }

    /**
     * Sets the value of the tpPessoaAgrgd property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTpPessoaAgrgd(String value) {
        this.tpPessoaAgrgd = value;
    }

    /**
     * Gets the value of the cnpjcpfAgrgd property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getCNPJCPFAgrgd() {
        return cnpjcpfAgrgd;
    }

    /**
     * Sets the value of the cnpjcpfAgrgd property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setCNPJCPFAgrgd(BigInteger value) {
        this.cnpjcpfAgrgd = value;
    }

}
