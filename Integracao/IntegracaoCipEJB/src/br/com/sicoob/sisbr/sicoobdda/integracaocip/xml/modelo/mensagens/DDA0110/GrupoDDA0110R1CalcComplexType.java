//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 09:22:30 AM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.DDA0110;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for Grupo_DDA0110R1_CalcComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grupo_DDA0110R1_CalcComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VlrCalcdJuros" type="{http://www.bcb.gov.br/SPB/DDA0110.xsd}Valor"/>
 *         &lt;element name="VlrCalcdMulta" type="{http://www.bcb.gov.br/SPB/DDA0110.xsd}Valor"/>
 *         &lt;element name="VlrCalcdDesct" type="{http://www.bcb.gov.br/SPB/DDA0110.xsd}Valor"/>
 *         &lt;element name="VlrTotCobrar" type="{http://www.bcb.gov.br/SPB/DDA0110.xsd}Valor"/>
 *         &lt;element name="DtValiddCalc" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grupo_DDA0110R1_CalcComplexType", propOrder = { "vlrCalcdJuros", "vlrCalcdMulta", "vlrCalcdDesct", "vlrTotCobrar", "dtValiddCalc" })
public class GrupoDDA0110R1CalcComplexType {

    @XmlElement(name = "VlrCalcdJuros", required = true)
    private BigDecimal vlrCalcdJuros;
    @XmlElement(name = "VlrCalcdMulta", required = true)
    private BigDecimal vlrCalcdMulta;
    @XmlElement(name = "VlrCalcdDesct", required = true)
    private BigDecimal vlrCalcdDesct;
    @XmlElement(name = "VlrTotCobrar", required = true)
    private BigDecimal vlrTotCobrar;
    @XmlElement(name = "DtValiddCalc", required = true)
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar dtValiddCalc;

    /**
     * Gets the value of the vlrCalcdJuros property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getVlrCalcdJuros() {
        return vlrCalcdJuros;
    }

    /**
     * Sets the value of the vlrCalcdJuros property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setVlrCalcdJuros(BigDecimal value) {
        this.vlrCalcdJuros = value;
    }

    /**
     * Gets the value of the vlrCalcdMulta property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getVlrCalcdMulta() {
        return vlrCalcdMulta;
    }

    /**
     * Sets the value of the vlrCalcdMulta property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setVlrCalcdMulta(BigDecimal value) {
        this.vlrCalcdMulta = value;
    }

    /**
     * Gets the value of the vlrCalcdDesct property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getVlrCalcdDesct() {
        return vlrCalcdDesct;
    }

    /**
     * Sets the value of the vlrCalcdDesct property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setVlrCalcdDesct(BigDecimal value) {
        this.vlrCalcdDesct = value;
    }

    /**
     * Gets the value of the vlrTotCobrar property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getVlrTotCobrar() {
        return vlrTotCobrar;
    }

    /**
     * Sets the value of the vlrTotCobrar property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setVlrTotCobrar(BigDecimal value) {
        this.vlrTotCobrar = value;
    }

    /**
     * Gets the value of the dtValiddCalc property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtValiddCalc() {
        return dtValiddCalc;
    }

    /**
     * Sets the value of the dtValiddCalc property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtValiddCalc(XMLGregorianCalendar value) {
        this.dtValiddCalc = value;
    }

}
