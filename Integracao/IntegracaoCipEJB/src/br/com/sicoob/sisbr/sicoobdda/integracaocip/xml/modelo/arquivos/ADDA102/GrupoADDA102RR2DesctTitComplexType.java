//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.26 at 05:37:00 PM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.arquivos.ADDA102;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for Grupo_ADDA102RR2_DesctTitComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grupo_ADDA102RR2_DesctTitComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DtDesctTit" type="{http://www.bcb.gov.br/ARQ/ADDA102.xsd}Data" minOccurs="0"/>
 *         &lt;element name="CodDesctTit" type="{http://www.bcb.gov.br/ARQ/ADDA102.xsd}CodDesctTit"/>
 *         &lt;element name="Vlr_PercDesctTit" type="{http://www.bcb.gov.br/ARQ/ADDA102.xsd}Vlr_PercDDA"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grupo_ADDA102RR2_DesctTitComplexType", propOrder = { "dtDesctTit", "codDesctTit", "vlrPercDesctTit" })
public class GrupoADDA102RR2DesctTitComplexType {

    @XmlElement(name = "DtDesctTit")
    private XMLGregorianCalendar dtDesctTit;
    @XmlElement(name = "CodDesctTit", required = true)
    private String codDesctTit;
    @XmlElement(name = "Vlr_PercDesctTit", required = true)
    private BigDecimal vlrPercDesctTit;

    /**
     * Gets the value of the dtDesctTit property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtDesctTit() {
        return dtDesctTit;
    }

    /**
     * Sets the value of the dtDesctTit property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtDesctTit(XMLGregorianCalendar value) {
        this.dtDesctTit = value;
    }

    /**
     * Gets the value of the codDesctTit property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCodDesctTit() {
        return codDesctTit;
    }

    /**
     * Sets the value of the codDesctTit property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCodDesctTit(String value) {
        this.codDesctTit = value;
    }

    /**
     * Gets the value of the vlrPercDesctTit property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getVlrPercDesctTit() {
        return vlrPercDesctTit;
    }

    /**
     * Sets the value of the vlrPercDesctTit property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setVlrPercDesctTit(BigDecimal value) {
        this.vlrPercDesctTit = value;
    }

}