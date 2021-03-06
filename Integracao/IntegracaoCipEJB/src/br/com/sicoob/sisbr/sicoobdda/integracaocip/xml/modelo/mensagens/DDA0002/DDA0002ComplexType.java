//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 09:22:19 AM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.DDA0002;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for DDA0002ComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DDA0002ComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodMsg" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}CodMsg"/>
 *         &lt;element name="NumCtrlPart" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}ControleIF"/>
 *         &lt;element name="ISPBPartPrincipal" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}ISPB"/>
 *         &lt;element name="ISPBPartAdmtd" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}ISPB"/>
 *         &lt;element name="Grupo_DDA0002_Pagdr" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}Grupo_DDA0002_PagdrComplexType" minOccurs="0"/>
 *         &lt;element name="CNPJBase" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}CNPJBase" minOccurs="0"/>
 *         &lt;element name="DtIniAtlz" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DtFimAtlz" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DtIniAdesCliPagdrDDA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DtFimAdesCliPagdrDDA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SitCliPagdrPart" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}SitCliPagdrPart" minOccurs="0"/>
 *         &lt;element name="TpRet" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}TpRet"/>
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
@XmlType(name = "DDA0002ComplexType", propOrder = { "codMsg", "numCtrlPart", "ispbPartPrincipal", "ispbPartAdmtd", "grupoDDA0002Pagdr", "cnpjBase", "dtIniAtlz", "dtFimAtlz",
        "dtIniAdesCliPagdrDDA", "dtFimAdesCliPagdrDDA", "sitCliPagdrPart", "tpRet", "dtMovto" })
public class DDA0002ComplexType {

    @XmlElement(name = "CodMsg", required = true)
    private String codMsg;
    @XmlElement(name = "NumCtrlPart", required = true)
    private String numCtrlPart;
    @XmlElement(name = "ISPBPartPrincipal", required = true)
    private String ispbPartPrincipal;
    @XmlElement(name = "ISPBPartAdmtd", required = true)
    private String ispbPartAdmtd;
    @XmlElement(name = "Grupo_DDA0002_Pagdr")
    private GrupoDDA0002PagdrComplexType grupoDDA0002Pagdr;
    @XmlElement(name = "CNPJBase")
    private String cnpjBase;
    @XmlElement(name = "DtIniAtlz")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar dtIniAtlz;
    @XmlElement(name = "DtFimAtlz")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar dtFimAtlz;
    @XmlElement(name = "DtIniAdesCliPagdrDDA")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar dtIniAdesCliPagdrDDA;
    @XmlElement(name = "DtFimAdesCliPagdrDDA")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar dtFimAdesCliPagdrDDA;
    @XmlElement(name = "SitCliPagdrPart")
    private String sitCliPagdrPart;
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
     * Gets the value of the grupoDDA0002Pagdr property.
     * 
     * @return possible object is {@link GrupoDDA0002PagdrComplexType }
     * 
     */
    public GrupoDDA0002PagdrComplexType getGrupoDDA0002Pagdr() {
        return grupoDDA0002Pagdr;
    }

    /**
     * Sets the value of the grupoDDA0002Pagdr property.
     * 
     * @param value allowed object is {@link GrupoDDA0002PagdrComplexType }
     * 
     */
    public void setGrupoDDA0002Pagdr(GrupoDDA0002PagdrComplexType value) {
        this.grupoDDA0002Pagdr = value;
    }

    /**
     * Gets the value of the cnpjBase property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCNPJBase() {
        return cnpjBase;
    }

    /**
     * Sets the value of the cnpjBase property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCNPJBase(String value) {
        this.cnpjBase = value;
    }

    /**
     * Gets the value of the dtIniAtlz property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtIniAtlz() {
        return dtIniAtlz;
    }

    /**
     * Sets the value of the dtIniAtlz property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtIniAtlz(XMLGregorianCalendar value) {
        this.dtIniAtlz = value;
    }

    /**
     * Gets the value of the dtFimAtlz property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtFimAtlz() {
        return dtFimAtlz;
    }

    /**
     * Sets the value of the dtFimAtlz property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtFimAtlz(XMLGregorianCalendar value) {
        this.dtFimAtlz = value;
    }

    /**
     * Gets the value of the dtIniAdesCliPagdrDDA property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtIniAdesCliPagdrDDA() {
        return dtIniAdesCliPagdrDDA;
    }

    /**
     * Sets the value of the dtIniAdesCliPagdrDDA property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtIniAdesCliPagdrDDA(XMLGregorianCalendar value) {
        this.dtIniAdesCliPagdrDDA = value;
    }

    /**
     * Gets the value of the dtFimAdesCliPagdrDDA property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtFimAdesCliPagdrDDA() {
        return dtFimAdesCliPagdrDDA;
    }

    /**
     * Sets the value of the dtFimAdesCliPagdrDDA property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtFimAdesCliPagdrDDA(XMLGregorianCalendar value) {
        this.dtFimAdesCliPagdrDDA = value;
    }

    /**
     * Gets the value of the sitCliPagdrPart property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSitCliPagdrPart() {
        return sitCliPagdrPart;
    }

    /**
     * Sets the value of the sitCliPagdrPart property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSitCliPagdrPart(String value) {
        this.sitCliPagdrPart = value;
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
