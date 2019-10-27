//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.26 at 06:15:24 PM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.arquivos.ADDA005;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for Grupo_ADDA005_CtCliPagdrComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grupo_ADDA005_CtCliPagdrComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndrManutCtCliPagdr" type="{http://www.bcb.gov.br/ARQ/ADDA005.xsd}IndrIE"/>
 *         &lt;element name="TpAgCliPagdr" type="{http://www.bcb.gov.br/ARQ/ADDA005.xsd}TpAg"/>
 *         &lt;element name="AgCliPagdr" type="{http://www.bcb.gov.br/ARQ/ADDA005.xsd}Agencia"/>
 *         &lt;element name="TpCtCliPagdr" type="{http://www.bcb.gov.br/ARQ/ADDA005.xsd}TpCtDDA"/>
 *         &lt;element name="CtCliPagdr" type="{http://www.bcb.gov.br/ARQ/ADDA005.xsd}CtBancaria"/>
 *         &lt;element name="DtAdesCliPagdrDDA" type="{http://www.bcb.gov.br/ARQ/ADDA005.xsd}Data" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grupo_ADDA005_CtCliPagdrComplexType", propOrder = { "indrManutCtCliPagdr", "tpAgCliPagdr", "agCliPagdr", "tpCtCliPagdr", "ctCliPagdr", "dtAdesCliPagdrDDA" })
public class GrupoADDA005CtCliPagdrComplexType {

    @XmlElement(name = "IndrManutCtCliPagdr", required = true)
    private String indrManutCtCliPagdr;
    @XmlElement(name = "TpAgCliPagdr", required = true)
    private String tpAgCliPagdr;
    @XmlElement(name = "AgCliPagdr", required = true)
    private BigInteger agCliPagdr;
    @XmlElement(name = "TpCtCliPagdr", required = true)
    private String tpCtCliPagdr;
    @XmlElement(name = "CtCliPagdr", required = true)
    private BigInteger ctCliPagdr;
    @XmlElement(name = "DtAdesCliPagdrDDA")
    private XMLGregorianCalendar dtAdesCliPagdrDDA;

    /**
     * Gets the value of the indrManutCtCliPagdr property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIndrManutCtCliPagdr() {
        return indrManutCtCliPagdr;
    }

    /**
     * Sets the value of the indrManutCtCliPagdr property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setIndrManutCtCliPagdr(String value) {
        this.indrManutCtCliPagdr = value;
    }

    /**
     * Gets the value of the tpAgCliPagdr property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTpAgCliPagdr() {
        return tpAgCliPagdr;
    }

    /**
     * Sets the value of the tpAgCliPagdr property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTpAgCliPagdr(String value) {
        this.tpAgCliPagdr = value;
    }

    /**
     * Gets the value of the agCliPagdr property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getAgCliPagdr() {
        return agCliPagdr;
    }

    /**
     * Sets the value of the agCliPagdr property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setAgCliPagdr(BigInteger value) {
        this.agCliPagdr = value;
    }

    /**
     * Gets the value of the tpCtCliPagdr property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTpCtCliPagdr() {
        return tpCtCliPagdr;
    }

    /**
     * Sets the value of the tpCtCliPagdr property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTpCtCliPagdr(String value) {
        this.tpCtCliPagdr = value;
    }

    /**
     * Gets the value of the ctCliPagdr property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getCtCliPagdr() {
        return ctCliPagdr;
    }

    /**
     * Sets the value of the ctCliPagdr property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setCtCliPagdr(BigInteger value) {
        this.ctCliPagdr = value;
    }

    /**
     * Gets the value of the dtAdesCliPagdrDDA property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtAdesCliPagdrDDA() {
        return dtAdesCliPagdrDDA;
    }

    /**
     * Sets the value of the dtAdesCliPagdrDDA property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtAdesCliPagdrDDA(XMLGregorianCalendar value) {
        this.dtAdesCliPagdrDDA = value;
    }

}
