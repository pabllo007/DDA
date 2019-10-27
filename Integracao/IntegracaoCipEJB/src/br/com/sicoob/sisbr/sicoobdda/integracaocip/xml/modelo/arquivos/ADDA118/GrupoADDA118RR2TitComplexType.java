//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.26 at 05:37:06 PM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.arquivos.ADDA118;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.sicoob.sisbr.sicoobdda.comum.negocio.util.ObjectUtil;
import br.com.sicoob.sisbr.sicoobdda.entidades.TipoMensagemDDA;
import br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.sspb.recebimento.ConteudoMsgRecebida;

/**
 * <p>
 * Java class for Grupo_ADDA118RR2_TitComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grupo_ADDA118RR2_TitComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ISPBPartRecbdrPrincipal" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}ISPB"/>
 *         &lt;element name="ISPBPartRecbdrAdmtd" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}ISPB"/>
 *         &lt;element name="NumIdentcTit" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}NumIdentcTit"/>
 *         &lt;element name="NumRefAtlCadTit" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}NumRefCad"/>
 *         &lt;element name="NumIdentcBaixaEft" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}NumIdentcTit"/>
 *         &lt;element name="NumSeqAtlzBaixaEft" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}NumSeqAtlzCadDDA"/>
 *         &lt;element name="NumCtrlDDA" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}ControleIF"/>
 *         &lt;element name="TpBaixaEft" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}TpBaixaEft"/>
 *         &lt;element name="ISPBPartRecbdrBaixaEft" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}ISPB" minOccurs="0"/>
 *         &lt;element name="CodPartRecbdrBaixaEft" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}CodIF" minOccurs="0"/>
 *         &lt;element name="DtHrProcBaixaEft" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}DataHora" minOccurs="0"/>
 *         &lt;element name="DtProcBaixaEft" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}Data" minOccurs="0"/>
 *         &lt;element name="VlrBaixaEftTit" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}Valor" minOccurs="0"/>
 *         &lt;element name="NumCodBarrasBaixaEft" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}NumCodBarras" minOccurs="0"/>
 *         &lt;element name="CanPgto" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}CanPgto" minOccurs="0"/>
 *         &lt;element name="MeioPgto" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}MeioPgto" minOccurs="0"/>
 *         &lt;element name="NumIdentcBaixaOperac" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}NumIdentcTit" minOccurs="0"/>
 *         &lt;element name="DtHrSitBaixaEft" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}DataHora"/>
 *         &lt;element name="QtdPgtoParclRegtd" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}QtdParcl" minOccurs="0"/>
 *         &lt;element name="VlrSldTotAtlPgtoTit" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}Valor" minOccurs="0"/>
 *         &lt;element name="SitTitPgto" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}SitTitPgto"/>
 *         &lt;element name="SitTit" type="{http://www.bcb.gov.br/ARQ/ADDA118.xsd}SitTit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grupo_ADDA118RR2_TitComplexType", propOrder = { "ispbPartRecbdrPrincipal", "ispbPartRecbdrAdmtd", "numIdentcTit", "numRefAtlCadTit", "numIdentcBaixaEft",
        "numSeqAtlzBaixaEft", "numCtrlDDA", "tpBaixaEft", "ispbPartRecbdrBaixaEft", "codPartRecbdrBaixaEft", "dtHrProcBaixaEft", "dtProcBaixaEft", "vlrBaixaEftTit",
        "numCodBarrasBaixaEft", "canPgto", "meioPgto", "numIdentcBaixaOperac", "dtHrSitBaixaEft", "qtdPgtoParclRegtd", "vlrSldTotAtlPgtoTit", "sitTitPgto", "sitTit" })
public class GrupoADDA118RR2TitComplexType implements ConteudoMsgRecebida {

    @XmlElement(name = "ISPBPartRecbdrPrincipal", required = true)
    private String ispbPartRecbdrPrincipal;
    @XmlElement(name = "ISPBPartRecbdrAdmtd", required = true)
    private String ispbPartRecbdrAdmtd;
    @XmlElement(name = "NumIdentcTit", required = true)
    private BigInteger numIdentcTit;
    @XmlElement(name = "NumRefAtlCadTit", required = true)
    private BigInteger numRefAtlCadTit;
    @XmlElement(name = "NumIdentcBaixaEft", required = true)
    private BigInteger numIdentcBaixaEft;
    @XmlElement(name = "NumSeqAtlzBaixaEft", required = true)
    private BigInteger numSeqAtlzBaixaEft;
    @XmlElement(name = "NumCtrlDDA", required = true)
    private String numCtrlDDA;
    @XmlElement(name = "TpBaixaEft", required = true)
    private String tpBaixaEft;
    @XmlElement(name = "ISPBPartRecbdrBaixaEft")
    private String ispbPartRecbdrBaixaEft;
    @XmlElement(name = "CodPartRecbdrBaixaEft")
    private String codPartRecbdrBaixaEft;
    @XmlElement(name = "DtHrProcBaixaEft")
    private XMLGregorianCalendar dtHrProcBaixaEft;
    @XmlElement(name = "DtProcBaixaEft")
    private XMLGregorianCalendar dtProcBaixaEft;
    @XmlElement(name = "VlrBaixaEftTit")
    private BigDecimal vlrBaixaEftTit;
    @XmlElement(name = "NumCodBarrasBaixaEft")
    private String numCodBarrasBaixaEft;
    @XmlElement(name = "CanPgto")
    private BigInteger canPgto;
    @XmlElement(name = "MeioPgto")
    private BigInteger meioPgto;
    @XmlElement(name = "NumIdentcBaixaOperac")
    private BigInteger numIdentcBaixaOperac;
    @XmlElement(name = "DtHrSitBaixaEft", required = true)
    private XMLGregorianCalendar dtHrSitBaixaEft;
    @XmlElement(name = "QtdPgtoParclRegtd")
    private BigInteger qtdPgtoParclRegtd;
    @XmlElement(name = "VlrSldTotAtlPgtoTit")
    private BigDecimal vlrSldTotAtlPgtoTit;
    @XmlElement(name = "SitTitPgto", required = true)
    private String sitTitPgto;
    @XmlElement(name = "SitTit", required = true)
    private String sitTit;

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
     * Gets the value of the numRefAtlCadTit property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNumRefAtlCadTit() {
        return numRefAtlCadTit;
    }

    /**
     * Sets the value of the numRefAtlCadTit property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setNumRefAtlCadTit(BigInteger value) {
        this.numRefAtlCadTit = value;
    }

    /**
     * Gets the value of the numIdentcBaixaEft property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNumIdentcBaixaEft() {
        return numIdentcBaixaEft;
    }

    /**
     * Sets the value of the numIdentcBaixaEft property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setNumIdentcBaixaEft(BigInteger value) {
        this.numIdentcBaixaEft = value;
    }

    /**
     * Gets the value of the numSeqAtlzBaixaEft property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNumSeqAtlzBaixaEft() {
        return numSeqAtlzBaixaEft;
    }

    /**
     * Sets the value of the numSeqAtlzBaixaEft property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setNumSeqAtlzBaixaEft(BigInteger value) {
        this.numSeqAtlzBaixaEft = value;
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
     * Gets the value of the tpBaixaEft property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTpBaixaEft() {
        return tpBaixaEft;
    }

    /**
     * Sets the value of the tpBaixaEft property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTpBaixaEft(String value) {
        this.tpBaixaEft = value;
    }

    /**
     * Gets the value of the ispbPartRecbdrBaixaEft property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getISPBPartRecbdrBaixaEft() {
        return ispbPartRecbdrBaixaEft;
    }

    /**
     * Sets the value of the ispbPartRecbdrBaixaEft property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setISPBPartRecbdrBaixaEft(String value) {
        this.ispbPartRecbdrBaixaEft = value;
    }

    /**
     * Gets the value of the codPartRecbdrBaixaEft property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCodPartRecbdrBaixaEft() {
        return codPartRecbdrBaixaEft;
    }

    /**
     * Sets the value of the codPartRecbdrBaixaEft property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCodPartRecbdrBaixaEft(String value) {
        this.codPartRecbdrBaixaEft = value;
    }

    /**
     * Gets the value of the dtHrProcBaixaEft property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtHrProcBaixaEft() {
        return dtHrProcBaixaEft;
    }

    /**
     * Sets the value of the dtHrProcBaixaEft property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtHrProcBaixaEft(XMLGregorianCalendar value) {
        this.dtHrProcBaixaEft = value;
    }

    /**
     * Gets the value of the dtProcBaixaEft property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtProcBaixaEft() {
        return dtProcBaixaEft;
    }

    /**
     * Sets the value of the dtProcBaixaEft property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtProcBaixaEft(XMLGregorianCalendar value) {
        this.dtProcBaixaEft = value;
    }

    /**
     * Gets the value of the vlrBaixaEftTit property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getVlrBaixaEftTit() {
        return vlrBaixaEftTit;
    }

    /**
     * Sets the value of the vlrBaixaEftTit property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setVlrBaixaEftTit(BigDecimal value) {
        this.vlrBaixaEftTit = value;
    }

    /**
     * Gets the value of the numCodBarrasBaixaEft property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNumCodBarrasBaixaEft() {
        return numCodBarrasBaixaEft;
    }

    /**
     * Sets the value of the numCodBarrasBaixaEft property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNumCodBarrasBaixaEft(String value) {
        this.numCodBarrasBaixaEft = value;
    }

    /**
     * Gets the value of the canPgto property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getCanPgto() {
        return canPgto;
    }

    /**
     * Sets the value of the canPgto property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setCanPgto(BigInteger value) {
        this.canPgto = value;
    }

    /**
     * Gets the value of the meioPgto property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getMeioPgto() {
        return meioPgto;
    }

    /**
     * Sets the value of the meioPgto property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setMeioPgto(BigInteger value) {
        this.meioPgto = value;
    }

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
     * Gets the value of the dtHrSitBaixaEft property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtHrSitBaixaEft() {
        return dtHrSitBaixaEft;
    }

    /**
     * Sets the value of the dtHrSitBaixaEft property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtHrSitBaixaEft(XMLGregorianCalendar value) {
        this.dtHrSitBaixaEft = value;
    }

    /**
     * Gets the value of the qtdPgtoParclRegtd property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getQtdPgtoParclRegtd() {
        return qtdPgtoParclRegtd;
    }

    /**
     * Sets the value of the qtdPgtoParclRegtd property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setQtdPgtoParclRegtd(BigInteger value) {
        this.qtdPgtoParclRegtd = value;
    }

    /**
     * Gets the value of the vlrSldTotAtlPgtoTit property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getVlrSldTotAtlPgtoTit() {
        return vlrSldTotAtlPgtoTit;
    }

    /**
     * Sets the value of the vlrSldTotAtlPgtoTit property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setVlrSldTotAtlPgtoTit(BigDecimal value) {
        this.vlrSldTotAtlPgtoTit = value;
    }

    /**
     * Gets the value of the sitTitPgto property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSitTitPgto() {
        return sitTitPgto;
    }

    /**
     * Sets the value of the sitTitPgto property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSitTitPgto(String value) {
        this.sitTitPgto = value;
    }

    /**
     * Gets the value of the sitTit property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSitTit() {
        return sitTit;
    }

    /**
     * Sets the value of the sitTit property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSitTit(String value) {
        this.sitTit = value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.sspb.recebimento.ConteudoMsgRecebida#getIdMensagemOrigem()
     */
    public Long getIdMensagemOrigem() {
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.sspb.recebimento.ConteudoMsgRecebida#getCodMsg()
     */
    public String getCodMsg() {
        return TipoMensagemDDA.ADDA118RR2;
    }

    /**
     * {@inheritDoc}
     * 
     * @see br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.sspb.recebimento.ConteudoMsgRecebida#getNumIdent()
     */
    public Long getNumIdent() {
        if (!ObjectUtil.isEmpty(getNumIdentcTit())) {
            return getNumIdentcTit().longValue();
        }
        return null;
    }

}
