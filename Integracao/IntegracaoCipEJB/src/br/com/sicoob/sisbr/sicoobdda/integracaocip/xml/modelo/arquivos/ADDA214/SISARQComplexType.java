//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.12 at 02:22:11 PM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.arquivos.ADDA214;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SISARQComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SISARQComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ADDA214" type="{http://www.bcb.gov.br/ARQ/ADDA214.xsd}ADDA214ComplexType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SISARQComplexType", propOrder = { "adda214" })
public class SISARQComplexType {

    @XmlElement(name = "ADDA214")
    private ADDA214ComplexType adda214;

    /**
     * Gets the value of the adda214 property.
     * 
     * @return possible object is {@link ADDA214ComplexType }
     * 
     */
    public ADDA214ComplexType getADDA214() {
        return adda214;
    }

    /**
     * Sets the value of the adda214 property.
     * 
     * @param value allowed object is {@link ADDA214ComplexType }
     * 
     */
    public void setADDA214(ADDA214ComplexType value) {
        this.adda214 = value;
    }

}
