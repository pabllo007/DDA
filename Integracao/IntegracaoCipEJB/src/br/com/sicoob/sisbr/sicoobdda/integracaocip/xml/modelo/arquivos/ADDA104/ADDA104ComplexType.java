//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.29 at 02:18:55 PM BRT 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.arquivos.ADDA104;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ADDA104ComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADDA104ComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Grupo_ADDA104_Tit" type="{http://www.bcb.gov.br/ARQ/ADDA104.xsd}Grupo_ADDA104_TitComplexType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADDA104ComplexType", propOrder = { "grupoADDA104Tit" })
public class ADDA104ComplexType {

    @XmlElement(name = "Grupo_ADDA104_Tit")
    private List<GrupoADDA104TitComplexType> grupoADDA104Tit;

    /**
     * Gets the value of the grupoADDA104Tit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the grupoADDA104Tit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGrupoADDA104Tit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GrupoADDA104TitComplexType }
     * 
     * 
     */
    public List<GrupoADDA104TitComplexType> getGrupoADDA104Tit() {
        if (grupoADDA104Tit == null) {
            grupoADDA104Tit = new ArrayList<GrupoADDA104TitComplexType>();
        }
        return this.grupoADDA104Tit;
    }

}