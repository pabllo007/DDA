//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.23 at 04:30:41 PM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.DDA0504;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for DDA0504ComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DDA0504ComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodMsg" type="{http://www.bcb.gov.br/SPB/DDA0504.xsd}CodMsg"/>
 *         &lt;element name="NumCtrlPart" type="{http://www.bcb.gov.br/SPB/DDA0504.xsd}ControleIF"/>
 *         &lt;element name="ISPBPartDestinatarioPrincipal" type="{http://www.bcb.gov.br/SPB/DDA0504.xsd}ISPB"/>
 *         &lt;element name="ISPBPartDestinatarioAdmtd" type="{http://www.bcb.gov.br/SPB/DDA0504.xsd}ISPB"/>
 *         &lt;choice>
 *           &lt;element name="NumIdentcBenfcrio" type="{http://www.bcb.gov.br/SPB/DDA0504.xsd}NumIdentcBenfcrio" minOccurs="0"/>
 *           &lt;element name="Grupo_DDA0504_Benfcrio" type="{http://www.bcb.gov.br/SPB/DDA0504.xsd}Grupo_DDA0504_BenfcrioComplexType" minOccurs="0"/>
 *           &lt;element name="CNPJBaseBenfcrio" type="{http://www.bcb.gov.br/SPB/DDA0504.xsd}CNPJBase" minOccurs="0"/>
 *           &lt;element name="SitBenfcrio" type="{http://www.bcb.gov.br/SPB/DDA0504.xsd}SitBenfcrio" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="DtIniUltAltSit" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DtFimUltAltSit" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SitRelctPart" type="{http://www.bcb.gov.br/SPB/DDA0504.xsd}SitRelctPart" minOccurs="0"/>
 *         &lt;element name="TpRet" type="{http://www.bcb.gov.br/SPB/DDA0504.xsd}TpRet"/>
 *         &lt;element name="DtMovto" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DDA0504ComplexType", propOrder = { "codMsg", "numCtrlPart", "ispbPartDestinatarioPrincipal", "ispbPartDestinatarioAdmtd", "numIdentcBenfcrio",
        "grupoDDA0504Benfcrio", "cnpjBaseBenfcrio", "sitBenfcrio", "dtIniUltAltSit", "dtFimUltAltSit", "sitRelctPart", "tpRet", "dtMovto" })
public class DDA0504ComplexType {

    @XmlElement(name = "CodMsg", required = true)
    private String codMsg;
    @XmlElement(name = "NumCtrlPart", required = true)
    private String numCtrlPart;
    @XmlElement(name = "ISPBPartDestinatarioPrincipal", required = true)
    private String ispbPartDestinatarioPrincipal;
    @XmlElement(name = "ISPBPartDestinatarioAdmtd", required = true)
    private String ispbPartDestinatarioAdmtd;
    @XmlElement(name = "NumIdentcBenfcrio")
    private BigInteger numIdentcBenfcrio;
    @XmlElement(name = "Grupo_DDA0504_Benfcrio")
    private GrupoDDA0504BenfcrioComplexType grupoDDA0504Benfcrio;
    @XmlElement(name = "CNPJBaseBenfcrio")
    private String cnpjBaseBenfcrio;
    @XmlElement(name = "SitBenfcrio")
    private String sitBenfcrio;
    @XmlElement(name = "DtIniUltAltSit")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar dtIniUltAltSit;
    @XmlElement(name = "DtFimUltAltSit")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar dtFimUltAltSit;
    @XmlElement(name = "SitRelctPart")
    private String sitRelctPart;
    @XmlElement(name = "TpRet", required = true)
    private String tpRet;
    @XmlElement(name = "DtMovto", required = true)
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar dtMovto;

    /**
     * Gets the value of the codMsg property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCodMsg() {
        return codMsg;
    }

    /**
     * Sets the value of the codMsg property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCodMsg(String value) {
        this.codMsg = value;
    }

    /**
     * Gets the value of the numCtrlPart property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNumCtrlPart() {
        return numCtrlPart;
    }

    /**
     * Sets the value of the numCtrlPart property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNumCtrlPart(String value) {
        this.numCtrlPart = value;
    }

    /**
     * Gets the value of the ispbPartDestinatarioPrincipal property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getISPBPartDestinatarioPrincipal() {
        return ispbPartDestinatarioPrincipal;
    }

    /**
     * Sets the value of the ispbPartDestinatarioPrincipal property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setISPBPartDestinatarioPrincipal(String value) {
        this.ispbPartDestinatarioPrincipal = value;
    }

    /**
     * Gets the value of the ispbPartDestinatarioAdmtd property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getISPBPartDestinatarioAdmtd() {
        return ispbPartDestinatarioAdmtd;
    }

    /**
     * Sets the value of the ispbPartDestinatarioAdmtd property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setISPBPartDestinatarioAdmtd(String value) {
        this.ispbPartDestinatarioAdmtd = value;
    }

    /**
     * Gets the value of the numIdentcBenfcrio property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNumIdentcBenfcrio() {
        return numIdentcBenfcrio;
    }

    /**
     * Sets the value of the numIdentcBenfcrio property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setNumIdentcBenfcrio(BigInteger value) {
        this.numIdentcBenfcrio = value;
    }

    /**
     * Gets the value of the grupoDDA0504Benfcrio property.
     * 
     * @return possible object is {@link GrupoDDA0504BenfcrioComplexType }
     * 
     */
    public GrupoDDA0504BenfcrioComplexType getGrupoDDA0504Benfcrio() {
        return grupoDDA0504Benfcrio;
    }

    /**
     * Sets the value of the grupoDDA0504Benfcrio property.
     * 
     * @param value allowed object is {@link GrupoDDA0504BenfcrioComplexType }
     * 
     */
    public void setGrupoDDA0504Benfcrio(GrupoDDA0504BenfcrioComplexType value) {
        this.grupoDDA0504Benfcrio = value;
    }

    /**
     * Gets the value of the cnpjBaseBenfcrio property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCNPJBaseBenfcrio() {
        return cnpjBaseBenfcrio;
    }

    /**
     * Sets the value of the cnpjBaseBenfcrio property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCNPJBaseBenfcrio(String value) {
        this.cnpjBaseBenfcrio = value;
    }

    /**
     * Gets the value of the sitBenfcrio property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSitBenfcrio() {
        return sitBenfcrio;
    }

    /**
     * Sets the value of the sitBenfcrio property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSitBenfcrio(String value) {
        this.sitBenfcrio = value;
    }

    /**
     * Gets the value of the dtIniUltAltSit property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtIniUltAltSit() {
        return dtIniUltAltSit;
    }

    /**
     * Sets the value of the dtIniUltAltSit property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtIniUltAltSit(XMLGregorianCalendar value) {
        this.dtIniUltAltSit = value;
    }

    /**
     * Gets the value of the dtFimUltAltSit property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtFimUltAltSit() {
        return dtFimUltAltSit;
    }

    /**
     * Sets the value of the dtFimUltAltSit property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtFimUltAltSit(XMLGregorianCalendar value) {
        this.dtFimUltAltSit = value;
    }

    /**
     * Gets the value of the sitRelctPart property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSitRelctPart() {
        return sitRelctPart;
    }

    /**
     * Sets the value of the sitRelctPart property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSitRelctPart(String value) {
        this.sitRelctPart = value;
    }

    /**
     * Gets the value of the tpRet property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTpRet() {
        return tpRet;
    }

    /**
     * Sets the value of the tpRet property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTpRet(String value) {
        this.tpRet = value;
    }

    /**
     * Gets the value of the dtMovto property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtMovto() {
        return dtMovto;
    }

    /**
     * Sets the value of the dtMovto property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtMovto(XMLGregorianCalendar value) {
        this.dtMovto = value;
    }

}
