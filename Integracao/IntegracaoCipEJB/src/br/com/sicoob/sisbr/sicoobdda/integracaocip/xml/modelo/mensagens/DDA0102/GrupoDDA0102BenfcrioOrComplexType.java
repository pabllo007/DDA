//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 09:22:24 AM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.DDA0102;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Grupo_DDA0102_BenfcrioOrComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grupo_DDA0102_BenfcrioOrComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NomFantsBenfcrioOr" type="{http://www.bcb.gov.br/SPB/DDA0102.xsd}Nome" minOccurs="0"/>
 *         &lt;element name="LogradBenfcrioOr" type="{http://www.bcb.gov.br/SPB/DDA0102.xsd}RuaRem" minOccurs="0"/>
 *         &lt;element name="CidBenfcrioOr" type="{http://www.bcb.gov.br/SPB/DDA0102.xsd}CidEnd" minOccurs="0"/>
 *         &lt;element name="UFBenfcrioOr" type="{http://www.bcb.gov.br/SPB/DDA0102.xsd}UF" minOccurs="0"/>
 *         &lt;element name="CEPBenfcrioOr" type="{http://www.bcb.gov.br/SPB/DDA0102.xsd}CEP" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grupo_DDA0102_BenfcrioOrComplexType", propOrder = { "nomFantsBenfcrioOr", "logradBenfcrioOr", "cidBenfcrioOr", "ufBenfcrioOr", "cepBenfcrioOr" })
public class GrupoDDA0102BenfcrioOrComplexType {

    @XmlElement(name = "NomFantsBenfcrioOr")
    private String nomFantsBenfcrioOr;
    @XmlElement(name = "LogradBenfcrioOr")
    private String logradBenfcrioOr;
    @XmlElement(name = "CidBenfcrioOr")
    private String cidBenfcrioOr;
    @XmlElement(name = "UFBenfcrioOr")
    private String ufBenfcrioOr;
    @XmlElement(name = "CEPBenfcrioOr")
    private BigInteger cepBenfcrioOr;

    /**
     * Gets the value of the nomFantsBenfcrioOr property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNomFantsBenfcrioOr() {
        return nomFantsBenfcrioOr;
    }

    /**
     * Sets the value of the nomFantsBenfcrioOr property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNomFantsBenfcrioOr(String value) {
        this.nomFantsBenfcrioOr = value;
    }

    /**
     * Gets the value of the logradBenfcrioOr property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLogradBenfcrioOr() {
        return logradBenfcrioOr;
    }

    /**
     * Sets the value of the logradBenfcrioOr property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLogradBenfcrioOr(String value) {
        this.logradBenfcrioOr = value;
    }

    /**
     * Gets the value of the cidBenfcrioOr property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCidBenfcrioOr() {
        return cidBenfcrioOr;
    }

    /**
     * Sets the value of the cidBenfcrioOr property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCidBenfcrioOr(String value) {
        this.cidBenfcrioOr = value;
    }

    /**
     * Gets the value of the ufBenfcrioOr property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUFBenfcrioOr() {
        return ufBenfcrioOr;
    }

    /**
     * Sets the value of the ufBenfcrioOr property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setUFBenfcrioOr(String value) {
        this.ufBenfcrioOr = value;
    }

    /**
     * Gets the value of the cepBenfcrioOr property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getCEPBenfcrioOr() {
        return cepBenfcrioOr;
    }

    /**
     * Sets the value of the cepBenfcrioOr property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setCEPBenfcrioOr(BigInteger value) {
        this.cepBenfcrioOr = value;
    }

}