//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 09:58:01 AM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.DDA0215;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Grupo_DDA0215_DettComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grupo_DDA0215_DettComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUOpOr" type="{http://www.bcb.gov.br/SPB/DDA0215.xsd}NUOp" minOccurs="0"/>
 *         &lt;element name="IdentdArqOr" type="{http://www.bcb.gov.br/SPB/DDA0215.xsd}IdentdArq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grupo_DDA0215_DettComplexType", propOrder = { "nuOpOr", "identdArqOr" })
public class GrupoDDA0215DettComplexType {

    @XmlElement(name = "NUOpOr")
    private String nuOpOr;
    @XmlElement(name = "IdentdArqOr")
    private String identdArqOr;

    /**
     * Gets the value of the nuOpOr property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNUOpOr() {
        return nuOpOr;
    }

    /**
     * Sets the value of the nuOpOr property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNUOpOr(String value) {
        this.nuOpOr = value;
    }

    /**
     * Gets the value of the identdArqOr property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIdentdArqOr() {
        return identdArqOr;
    }

    /**
     * Sets the value of the identdArqOr property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setIdentdArqOr(String value) {
        this.identdArqOr = value;
    }

}
