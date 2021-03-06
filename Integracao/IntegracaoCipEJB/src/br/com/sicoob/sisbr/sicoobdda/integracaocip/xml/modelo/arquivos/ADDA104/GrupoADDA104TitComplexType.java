//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.29 at 02:18:55 PM BRT 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.arquivos.ADDA104;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Grupo_ADDA104_TitComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grupo_ADDA104_TitComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumCtrlReqPart" type="{http://www.bcb.gov.br/ARQ/ADDA104.xsd}ControleIF"/>
 *         &lt;element name="ISPBPartRecbdrPrincipal" type="{http://www.bcb.gov.br/ARQ/ADDA104.xsd}ISPB"/>
 *         &lt;element name="ISPBPartRecbdrAdmtd" type="{http://www.bcb.gov.br/ARQ/ADDA104.xsd}ISPB"/>
 *         &lt;element name="NumIdentcTit" type="{http://www.bcb.gov.br/ARQ/ADDA104.xsd}NumIdentcTit"/>
 *         &lt;element name="NumRefAtlActe" type="{http://www.bcb.gov.br/ARQ/ADDA104.xsd}NumRefCad" minOccurs="0"/>
 *         &lt;element name="IndrActe" type="{http://www.bcb.gov.br/ARQ/ADDA104.xsd}IndrActe"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grupo_ADDA104_TitComplexType", propOrder = { "numCtrlReqPart", "ispbPartRecbdrPrincipal", "ispbPartRecbdrAdmtd", "numIdentcTit", "numRefAtlActe", "indrActe" })
public class GrupoADDA104TitComplexType {

    @XmlElement(name = "NumCtrlReqPart", required = true)
    private String numCtrlReqPart;
    @XmlElement(name = "ISPBPartRecbdrPrincipal", required = true)
    private String ispbPartRecbdrPrincipal;
    @XmlElement(name = "ISPBPartRecbdrAdmtd", required = true)
    private String ispbPartRecbdrAdmtd;
    @XmlElement(name = "NumIdentcTit", required = true)
    private BigInteger numIdentcTit;
    @XmlElement(name = "NumRefAtlActe")
    private BigInteger numRefAtlActe;
    @XmlElement(name = "IndrActe", required = true)
    private String indrActe;

    /**
     * Gets the value of the numCtrlReqPart property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNumCtrlReqPart() {
        return numCtrlReqPart;
    }

    /**
     * Sets the value of the numCtrlReqPart property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNumCtrlReqPart(String value) {
        this.numCtrlReqPart = value;
    }

    /**
     * Gets the value of the ispbPartRecbdrPrincipal property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getISPBPartRecbdrPrincipal() {
        return ispbPartRecbdrPrincipal;
    }

    /**
     * Sets the value of the ispbPartRecbdrPrincipal property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setISPBPartRecbdrPrincipal(String value) {
        this.ispbPartRecbdrPrincipal = value;
    }

    /**
     * Gets the value of the ispbPartRecbdrAdmtd property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getISPBPartRecbdrAdmtd() {
        return ispbPartRecbdrAdmtd;
    }

    /**
     * Sets the value of the ispbPartRecbdrAdmtd property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setISPBPartRecbdrAdmtd(String value) {
        this.ispbPartRecbdrAdmtd = value;
    }

    /**
     * Gets the value of the numIdentcTit property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNumIdentcTit() {
        return numIdentcTit;
    }

    /**
     * Sets the value of the numIdentcTit property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setNumIdentcTit(BigInteger value) {
        this.numIdentcTit = value;
    }

    /**
     * Gets the value of the numRefAtlActe property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNumRefAtlActe() {
        return numRefAtlActe;
    }

    /**
     * Sets the value of the numRefAtlActe property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setNumRefAtlActe(BigInteger value) {
        this.numRefAtlActe = value;
    }

    /**
     * Gets the value of the indrActe property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIndrActe() {
        return indrActe;
    }

    /**
     * Sets the value of the indrActe property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setIndrActe(String value) {
        this.indrActe = value;
    }

}
