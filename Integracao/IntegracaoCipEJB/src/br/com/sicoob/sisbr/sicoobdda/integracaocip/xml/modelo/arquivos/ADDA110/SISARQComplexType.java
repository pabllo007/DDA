//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.12 at 02:22:04 PM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.arquivos.ADDA110;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="ADDA110" type="{http://www.bcb.gov.br/ARQ/ADDA110.xsd}ADDA110ComplexType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "SISARQ")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SISARQComplexType", propOrder = { "adda110" })
public class SISARQComplexType {

    @XmlElement(name = "ADDA110")
    private ADDA110ComplexType adda110;

    public SISARQComplexType(ADDA110ComplexType adda110) {
        this.adda110 = adda110;
    }

    public SISARQComplexType() {
    }

    /**
     * Gets the value of the adda110 property.
     * 
     * @return possible object is {@link ADDA110ComplexType }
     * 
     */
    public ADDA110ComplexType getADDA110() {
        return adda110;
    }

    /**
     * Sets the value of the adda110 property.
     * 
     * @param value allowed object is {@link ADDA110ComplexType }
     * 
     */
    public void setADDA110(ADDA110ComplexType value) {
        this.adda110 = value;
    }

}