//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.26 at 05:36:55 PM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.arquivos.ADDA002;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ADDA002ComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADDA002ComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumCtrlReqOr" type="{http://www.bcb.gov.br/ARQ/ADDA002.xsd}ControleIF"/>
 *         &lt;element name="ISPBPartPrincipal" type="{http://www.bcb.gov.br/ARQ/ADDA002.xsd}ISPB"/>
 *         &lt;element name="ISPBPartAdmtd" type="{http://www.bcb.gov.br/ARQ/ADDA002.xsd}ISPB"/>
 *         &lt;element name="NumCtrlDDA" type="{http://www.bcb.gov.br/ARQ/ADDA002.xsd}ControleIF"/>
 *         &lt;element name="Grupo_ADDA002_Pagdr" type="{http://www.bcb.gov.br/ARQ/ADDA002.xsd}Grupo_ADDA002_PagdrComplexType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADDA002ComplexType", propOrder = { "numCtrlReqOr", "ispbPartPrincipal", "ispbPartAdmtd", "numCtrlDDA", "grupoADDA002Pagdr" })
public class ADDA002ComplexType {

    @XmlElement(name = "NumCtrlReqOr", required = true)
    private String numCtrlReqOr;
    @XmlElement(name = "ISPBPartPrincipal", required = true)
    private String ispbPartPrincipal;
    @XmlElement(name = "ISPBPartAdmtd", required = true)
    private String ispbPartAdmtd;
    @XmlElement(name = "NumCtrlDDA", required = true)
    private String numCtrlDDA;
    @XmlElement(name = "Grupo_ADDA002_Pagdr", required = true)
    private List<GrupoADDA002PagdrComplexType> grupoADDA002Pagdr;

    /**
     * Gets the value of the numCtrlReqOr property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNumCtrlReqOr() {
        return numCtrlReqOr;
    }

    /**
     * Sets the value of the numCtrlReqOr property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNumCtrlReqOr(String value) {
        this.numCtrlReqOr = value;
    }

    /**
     * Gets the value of the ispbPartPrincipal property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getISPBPartPrincipal() {
        return ispbPartPrincipal;
    }

    /**
     * Sets the value of the ispbPartPrincipal property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setISPBPartPrincipal(String value) {
        this.ispbPartPrincipal = value;
    }

    /**
     * Gets the value of the ispbPartAdmtd property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getISPBPartAdmtd() {
        return ispbPartAdmtd;
    }

    /**
     * Sets the value of the ispbPartAdmtd property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setISPBPartAdmtd(String value) {
        this.ispbPartAdmtd = value;
    }

    /**
     * Gets the value of the numCtrlDDA property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNumCtrlDDA() {
        return numCtrlDDA;
    }

    /**
     * Sets the value of the numCtrlDDA property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNumCtrlDDA(String value) {
        this.numCtrlDDA = value;
    }

    /**
     * Gets the value of the grupoADDA002Pagdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the grupoADDA002Pagdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGrupoADDA002Pagdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GrupoADDA002PagdrComplexType }
     * 
     * 
     */
    public List<GrupoADDA002PagdrComplexType> getGrupoADDA002Pagdr() {
        if (grupoADDA002Pagdr == null) {
            grupoADDA002Pagdr = new ArrayList<GrupoADDA002PagdrComplexType>();
        }
        return this.grupoADDA002Pagdr;
    }

}
