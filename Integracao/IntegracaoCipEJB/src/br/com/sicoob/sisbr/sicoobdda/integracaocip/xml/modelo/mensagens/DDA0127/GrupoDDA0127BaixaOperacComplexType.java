//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 09:22:36 AM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.DDA0127;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for Grupo_DDA0127_BaixaOperacComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grupo_DDA0127_BaixaOperacComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumIdentcBaixaOperac" type="{http://www.bcb.gov.br/SPB/DDA0127.xsd}NumIdentcTit" minOccurs="0"/>
 *         &lt;element name="NumRefAtlBaixaOperac" type="{http://www.bcb.gov.br/SPB/DDA0127.xsd}NumRefCad" minOccurs="0"/>
 *         &lt;element name="NumSeqAtlzBaixaOperac" type="{http://www.bcb.gov.br/SPB/DDA0127.xsd}NumSeqAtlzCadDDA"/>
 *         &lt;element name="NumRefCadTitBaixaOperac" type="{http://www.bcb.gov.br/SPB/DDA0127.xsd}NumRefCad" minOccurs="0"/>
 *         &lt;element name="NumRefAtlCadTitBaixaOperac" type="{http://www.bcb.gov.br/SPB/DDA0127.xsd}NumRefCad" minOccurs="0"/>
 *         &lt;element name="ISPBPartRecbdrBaixaOperac" type="{http://www.bcb.gov.br/SPB/DDA0127.xsd}ISPB"/>
 *         &lt;element name="CodPartRecbdrBaixaOperac" type="{http://www.bcb.gov.br/SPB/DDA0127.xsd}CodIF" minOccurs="0"/>
 *         &lt;element name="TpBaixaOperac" type="{http://www.bcb.gov.br/SPB/DDA0127.xsd}TpBaixaOperac"/>
 *         &lt;element name="SitBaixaOperac" type="{http://www.bcb.gov.br/SPB/DDA0127.xsd}SitBaixaOperac"/>
 *         &lt;element name="DtHrSitBaixaOperac" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Grupo_DDA0127_DettBaixaOperac" type="{http://www.bcb.gov.br/SPB/DDA0127.xsd}Grupo_DDA0127_DettBaixaOperacComplexType" minOccurs="0"/>
 *         &lt;element name="Grupo_DDA0127_CanceltBaixaOperac" type="{http://www.bcb.gov.br/SPB/DDA0127.xsd}Grupo_DDA0127_CanceltBaixaOperacComplexType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grupo_DDA0127_BaixaOperacComplexType", propOrder = { "numIdentcBaixaOperac", "numRefAtlBaixaOperac", "numSeqAtlzBaixaOperac", "numRefCadTitBaixaOperac",
        "numRefAtlCadTitBaixaOperac", "ispbPartRecbdrBaixaOperac", "codPartRecbdrBaixaOperac", "tpBaixaOperac", "sitBaixaOperac", "dtHrSitBaixaOperac",
        "grupoDDA0127DettBaixaOperac", "grupoDDA0127CanceltBaixaOperac" })
public class GrupoDDA0127BaixaOperacComplexType {

    @XmlElement(name = "NumIdentcBaixaOperac")
    private BigInteger numIdentcBaixaOperac;
    @XmlElement(name = "NumRefAtlBaixaOperac")
    private BigInteger numRefAtlBaixaOperac;
    @XmlElement(name = "NumSeqAtlzBaixaOperac", required = true)
    private BigInteger numSeqAtlzBaixaOperac;
    @XmlElement(name = "NumRefCadTitBaixaOperac")
    private BigInteger numRefCadTitBaixaOperac;
    @XmlElement(name = "NumRefAtlCadTitBaixaOperac")
    private BigInteger numRefAtlCadTitBaixaOperac;
    @XmlElement(name = "ISPBPartRecbdrBaixaOperac", required = true)
    private String ispbPartRecbdrBaixaOperac;
    @XmlElement(name = "CodPartRecbdrBaixaOperac")
    private String codPartRecbdrBaixaOperac;
    @XmlElement(name = "TpBaixaOperac", required = true)
    private String tpBaixaOperac;
    @XmlElement(name = "SitBaixaOperac", required = true)
    private String sitBaixaOperac;
    @XmlElement(name = "DtHrSitBaixaOperac", required = true)
    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar dtHrSitBaixaOperac;
    @XmlElement(name = "Grupo_DDA0127_DettBaixaOperac")
    private GrupoDDA0127DettBaixaOperacComplexType grupoDDA0127DettBaixaOperac;
    @XmlElement(name = "Grupo_DDA0127_CanceltBaixaOperac")
    private GrupoDDA0127CanceltBaixaOperacComplexType grupoDDA0127CanceltBaixaOperac;

    /**
     * Gets the value of the numIdentcBaixaOperac property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNumIdentcBaixaOperac() {
        return numIdentcBaixaOperac;
    }

    /**
     * Sets the value of the numIdentcBaixaOperac property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setNumIdentcBaixaOperac(BigInteger value) {
        this.numIdentcBaixaOperac = value;
    }

    /**
     * Gets the value of the numRefAtlBaixaOperac property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNumRefAtlBaixaOperac() {
        return numRefAtlBaixaOperac;
    }

    /**
     * Sets the value of the numRefAtlBaixaOperac property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setNumRefAtlBaixaOperac(BigInteger value) {
        this.numRefAtlBaixaOperac = value;
    }

    /**
     * Gets the value of the numSeqAtlzBaixaOperac property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNumSeqAtlzBaixaOperac() {
        return numSeqAtlzBaixaOperac;
    }

    /**
     * Sets the value of the numSeqAtlzBaixaOperac property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setNumSeqAtlzBaixaOperac(BigInteger value) {
        this.numSeqAtlzBaixaOperac = value;
    }

    /**
     * Gets the value of the numRefCadTitBaixaOperac property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNumRefCadTitBaixaOperac() {
        return numRefCadTitBaixaOperac;
    }

    /**
     * Sets the value of the numRefCadTitBaixaOperac property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setNumRefCadTitBaixaOperac(BigInteger value) {
        this.numRefCadTitBaixaOperac = value;
    }

    /**
     * Gets the value of the numRefAtlCadTitBaixaOperac property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNumRefAtlCadTitBaixaOperac() {
        return numRefAtlCadTitBaixaOperac;
    }

    /**
     * Sets the value of the numRefAtlCadTitBaixaOperac property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setNumRefAtlCadTitBaixaOperac(BigInteger value) {
        this.numRefAtlCadTitBaixaOperac = value;
    }

    /**
     * Gets the value of the ispbPartRecbdrBaixaOperac property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getISPBPartRecbdrBaixaOperac() {
        return ispbPartRecbdrBaixaOperac;
    }

    /**
     * Sets the value of the ispbPartRecbdrBaixaOperac property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setISPBPartRecbdrBaixaOperac(String value) {
        this.ispbPartRecbdrBaixaOperac = value;
    }

    /**
     * Gets the value of the codPartRecbdrBaixaOperac property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCodPartRecbdrBaixaOperac() {
        return codPartRecbdrBaixaOperac;
    }

    /**
     * Sets the value of the codPartRecbdrBaixaOperac property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCodPartRecbdrBaixaOperac(String value) {
        this.codPartRecbdrBaixaOperac = value;
    }

    /**
     * Gets the value of the tpBaixaOperac property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTpBaixaOperac() {
        return tpBaixaOperac;
    }

    /**
     * Sets the value of the tpBaixaOperac property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTpBaixaOperac(String value) {
        this.tpBaixaOperac = value;
    }

    /**
     * Gets the value of the sitBaixaOperac property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSitBaixaOperac() {
        return sitBaixaOperac;
    }

    /**
     * Sets the value of the sitBaixaOperac property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSitBaixaOperac(String value) {
        this.sitBaixaOperac = value;
    }

    /**
     * Gets the value of the dtHrSitBaixaOperac property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtHrSitBaixaOperac() {
        return dtHrSitBaixaOperac;
    }

    /**
     * Sets the value of the dtHrSitBaixaOperac property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtHrSitBaixaOperac(XMLGregorianCalendar value) {
        this.dtHrSitBaixaOperac = value;
    }

    /**
     * Gets the value of the grupoDDA0127DettBaixaOperac property.
     * 
     * @return possible object is {@link GrupoDDA0127DettBaixaOperacComplexType }
     * 
     */
    public GrupoDDA0127DettBaixaOperacComplexType getGrupoDDA0127DettBaixaOperac() {
        return grupoDDA0127DettBaixaOperac;
    }

    /**
     * Sets the value of the grupoDDA0127DettBaixaOperac property.
     * 
     * @param value allowed object is {@link GrupoDDA0127DettBaixaOperacComplexType }
     * 
     */
    public void setGrupoDDA0127DettBaixaOperac(GrupoDDA0127DettBaixaOperacComplexType value) {
        this.grupoDDA0127DettBaixaOperac = value;
    }

    /**
     * Gets the value of the grupoDDA0127CanceltBaixaOperac property.
     * 
     * @return possible object is {@link GrupoDDA0127CanceltBaixaOperacComplexType }
     * 
     */
    public GrupoDDA0127CanceltBaixaOperacComplexType getGrupoDDA0127CanceltBaixaOperac() {
        return grupoDDA0127CanceltBaixaOperac;
    }

    /**
     * Sets the value of the grupoDDA0127CanceltBaixaOperac property.
     * 
     * @param value allowed object is {@link GrupoDDA0127CanceltBaixaOperacComplexType }
     * 
     */
    public void setGrupoDDA0127CanceltBaixaOperac(GrupoDDA0127CanceltBaixaOperacComplexType value) {
        this.grupoDDA0127CanceltBaixaOperac = value;
    }

}