//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.26 at 05:37:01 PM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.arquivos.ADDA106;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for Grupo_ADDA106_CanceltBaixaOperacComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grupo_ADDA106_CanceltBaixaOperacComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DtHrCanceltBaixaOperac" type="{http://www.bcb.gov.br/ARQ/ADDA106.xsd}DataHora"/>
 *         &lt;element name="DtCanceltBaixaOperac" type="{http://www.bcb.gov.br/ARQ/ADDA106.xsd}Data"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grupo_ADDA106_CanceltBaixaOperacComplexType", propOrder = { "dtHrCanceltBaixaOperac", "dtCanceltBaixaOperac" })
public class GrupoADDA106CanceltBaixaOperacComplexType {

    @XmlElement(name = "DtHrCanceltBaixaOperac", required = true)
    private XMLGregorianCalendar dtHrCanceltBaixaOperac;
    @XmlElement(name = "DtCanceltBaixaOperac", required = true)
    private XMLGregorianCalendar dtCanceltBaixaOperac;

    /**
     * Gets the value of the dtHrCanceltBaixaOperac property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtHrCanceltBaixaOperac() {
        return dtHrCanceltBaixaOperac;
    }

    /**
     * Sets the value of the dtHrCanceltBaixaOperac property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtHrCanceltBaixaOperac(XMLGregorianCalendar value) {
        this.dtHrCanceltBaixaOperac = value;
    }

    /**
     * Gets the value of the dtCanceltBaixaOperac property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtCanceltBaixaOperac() {
        return dtCanceltBaixaOperac;
    }

    /**
     * Sets the value of the dtCanceltBaixaOperac property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtCanceltBaixaOperac(XMLGregorianCalendar value) {
        this.dtCanceltBaixaOperac = value;
    }

}