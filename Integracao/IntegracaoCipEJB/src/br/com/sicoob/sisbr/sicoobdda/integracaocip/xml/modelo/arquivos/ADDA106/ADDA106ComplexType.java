//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.26 at 05:37:01 PM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.arquivos.ADDA106;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ADDA106ComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADDA106ComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Grupo_ADDA106_Tit" type="{http://www.bcb.gov.br/ARQ/ADDA106.xsd}Grupo_ADDA106_TitComplexType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADDA106ComplexType", propOrder = { "grupoADDA106Tit" })
public class ADDA106ComplexType {

    @XmlElement(name = "Grupo_ADDA106_Tit", required = true)
    private List<GrupoADDA106TitComplexType> grupoADDA106Tit;

    /**
     * Gets the value of the grupoADDA106Tit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the grupoADDA106Tit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGrupoADDA106Tit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GrupoADDA106TitComplexType }
     * 
     * 
     */
    public List<GrupoADDA106TitComplexType> getGrupoADDA106Tit() {
        if (grupoADDA106Tit == null) {
            grupoADDA106Tit = new ArrayList<GrupoADDA106TitComplexType>();
        }
        return this.grupoADDA106Tit;
    }

}
