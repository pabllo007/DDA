//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 09:22:23 AM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.DDA0101;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for Grupo_DDA0101R2_NotaFisComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grupo_DDA0101R2_NotaFisComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumNotaFis" type="{http://www.bcb.gov.br/SPB/DDA0101.xsd}NumNotaFis"/>
 *         &lt;element name="DtEmsNotaFis" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="VlrNotaFis" type="{http://www.bcb.gov.br/SPB/DDA0101.xsd}Valor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grupo_DDA0101R2_NotaFisComplexType", propOrder = { "numNotaFis", "dtEmsNotaFis", "vlrNotaFis" })
public class GrupoDDA0101R2NotaFisComplexType {

    @XmlElement(name = "NumNotaFis", required = true)
    private String numNotaFis;
    @XmlElement(name = "DtEmsNotaFis", required = true)
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar dtEmsNotaFis;
    @XmlElement(name = "VlrNotaFis", required = true)
    private BigDecimal vlrNotaFis;

    /**
     * Gets the value of the numNotaFis property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNumNotaFis() {
        return numNotaFis;
    }

    /**
     * Sets the value of the numNotaFis property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNumNotaFis(String value) {
        this.numNotaFis = value;
    }

    /**
     * Gets the value of the dtEmsNotaFis property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtEmsNotaFis() {
        return dtEmsNotaFis;
    }

    /**
     * Sets the value of the dtEmsNotaFis property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtEmsNotaFis(XMLGregorianCalendar value) {
        this.dtEmsNotaFis = value;
    }

    /**
     * Gets the value of the vlrNotaFis property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getVlrNotaFis() {
        return vlrNotaFis;
    }

    /**
     * Sets the value of the vlrNotaFis property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setVlrNotaFis(BigDecimal value) {
        this.vlrNotaFis = value;
    }

}