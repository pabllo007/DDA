//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.26 at 06:15:24 PM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.arquivos.ADDA005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ADDA005ComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADDA005ComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Grupo_ADDA005_Pagdr" type="{http://www.bcb.gov.br/ARQ/ADDA005.xsd}Grupo_ADDA005_PagdrComplexType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADDA005ComplexType", propOrder = { "grupoADDA005Pagdr" })
public class ADDA005ComplexType {

    @XmlElement(name = "Grupo_ADDA005_Pagdr")
    private List<GrupoADDA005PagdrComplexType> grupoADDA005Pagdr;

    /**
     * Gets the value of the grupoADDA005Pagdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the grupoADDA005Pagdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGrupoADDA005Pagdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GrupoADDA005PagdrComplexType }
     * 
     * 
     */
    public List<GrupoADDA005PagdrComplexType> getGrupoADDA005Pagdr() {
        if (grupoADDA005Pagdr == null) {
            grupoADDA005Pagdr = new ArrayList<GrupoADDA005PagdrComplexType>();
        }
        return this.grupoADDA005Pagdr;
    }

}
