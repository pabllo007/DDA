//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 09:22:24 AM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.DDA0102;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for Grupo_DDA0102R2_MultaTitComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grupo_DDA0102R2_MultaTitComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DtMultaTit" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CodMultaTit" type="{http://www.bcb.gov.br/SPB/DDA0102.xsd}CodMultaTit"/>
 *         &lt;element name="Vlr_PercMultaTit" type="{http://www.bcb.gov.br/SPB/DDA0102.xsd}Vlr_PercDDA"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grupo_DDA0102R2_MultaTitComplexType", propOrder = { "dtMultaTit", "codMultaTit", "vlrPercMultaTit" })
public class GrupoDDA0102R2MultaTitComplexType {

    @XmlElement(name = "DtMultaTit")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar dtMultaTit;
    @XmlElement(name = "CodMultaTit", required = true)
    private String codMultaTit;
    @XmlElement(name = "Vlr_PercMultaTit", required = true)
    private BigDecimal vlrPercMultaTit;

    /**
     * Gets the value of the dtMultaTit property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtMultaTit() {
        return dtMultaTit;
    }

    /**
     * Sets the value of the dtMultaTit property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtMultaTit(XMLGregorianCalendar value) {
        this.dtMultaTit = value;
    }

    /**
     * Gets the value of the codMultaTit property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCodMultaTit() {
        return codMultaTit;
    }

    /**
     * Sets the value of the codMultaTit property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCodMultaTit(String value) {
        this.codMultaTit = value;
    }

    /**
     * Gets the value of the vlrPercMultaTit property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getVlrPercMultaTit() {
        return vlrPercMultaTit;
    }

    /**
     * Sets the value of the vlrPercMultaTit property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setVlrPercMultaTit(BigDecimal value) {
        this.vlrPercMultaTit = value;
    }

}
