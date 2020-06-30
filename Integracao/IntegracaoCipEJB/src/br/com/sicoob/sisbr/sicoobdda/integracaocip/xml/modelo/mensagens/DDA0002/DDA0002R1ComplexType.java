//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 09:22:19 AM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.DDA0002;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.sicoob.sisbr.sicoobdda.comum.negocio.util.ObjectUtil;
import br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.sspb.recebimento.ConteudoMsgRecebida;

/**
 * <p>
 * Java class for DDA0002R1ComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DDA0002R1ComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodMsg" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}CodMsg"/>
 *         &lt;element name="NumCtrlPart" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}ControleIF"/>
 *         &lt;element name="ISPBPartPrincipal" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}ISPB"/>
 *         &lt;element name="ISPBPartAdmtd" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}ISPB"/>
 *         &lt;element name="NumCtrlDDA" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}ControleIF"/>
 *         &lt;element name="Grupo_DDA0002R1_Pagdr" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}Grupo_DDA0002R1_PagdrComplexType" maxOccurs="200" minOccurs="0"/>
 *         &lt;element name="IndrInfAdcl" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}Indr" minOccurs="0"/>
 *         &lt;element name="SitReqDDA" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}SitCons" minOccurs="0"/>
 *         &lt;element name="Grupo_DDA0002R1_DettArq" type="{http://www.bcb.gov.br/SPB/DDA0002.xsd}Grupo_DDA0002R1_DettArqComplexType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DtHrDDA" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
@XmlType(name = "DDA0002R1ComplexType", propOrder = { "codMsg", "numCtrlPart", "ispbPartPrincipal", "ispbPartAdmtd", "numCtrlDDA", "grupoDDA0002R1Pagdr", "indrInfAdcl",
        "sitReqDDA", "grupoDDA0002R1DettArq", "dtHrDDA", "dtMovto" })
public class DDA0002R1ComplexType implements ConteudoMsgRecebida {

    @XmlElement(name = "CodMsg", required = true)
    private String codMsg;
    @XmlElement(name = "NumCtrlPart", required = true)
    private String numCtrlPart;
    @XmlElement(name = "ISPBPartPrincipal", required = true)
    private String ispbPartPrincipal;
    @XmlElement(name = "ISPBPartAdmtd", required = true)
    private String ispbPartAdmtd;
    @XmlElement(name = "NumCtrlDDA", required = true)
    private String numCtrlDDA;
    @XmlElement(name = "Grupo_DDA0002R1_Pagdr")
    private List<GrupoDDA0002R1PagdrComplexType> grupoDDA0002R1Pagdr;
    @XmlElement(name = "IndrInfAdcl")
    private String indrInfAdcl;
    @XmlElement(name = "SitReqDDA")
    private BigInteger sitReqDDA;
    @XmlElement(name = "Grupo_DDA0002R1_DettArq")
    private List<GrupoDDA0002R1DettArqComplexType> grupoDDA0002R1DettArq;
    @XmlElement(name = "DtHrDDA", required = true)
    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar dtHrDDA;
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
     * Gets the value of the grupoDDA0002R1Pagdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the grupoDDA0002R1Pagdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGrupoDDA0002R1Pagdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GrupoDDA0002R1PagdrComplexType }
     * 
     * 
     */
    public List<GrupoDDA0002R1PagdrComplexType> getGrupoDDA0002R1Pagdr() {
        if (grupoDDA0002R1Pagdr == null) {
            grupoDDA0002R1Pagdr = new ArrayList<GrupoDDA0002R1PagdrComplexType>();
        }
        return this.grupoDDA0002R1Pagdr;
    }

    /**
     * Gets the value of the indrInfAdcl property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIndrInfAdcl() {
        return indrInfAdcl;
    }

    /**
     * Sets the value of the indrInfAdcl property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setIndrInfAdcl(String value) {
        this.indrInfAdcl = value;
    }

    /**
     * Gets the value of the sitReqDDA property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getSitReqDDA() {
        return sitReqDDA;
    }

    /**
     * Sets the value of the sitReqDDA property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setSitReqDDA(BigInteger value) {
        this.sitReqDDA = value;
    }

    /**
     * Gets the value of the grupoDDA0002R1DettArq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the grupoDDA0002R1DettArq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGrupoDDA0002R1DettArq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GrupoDDA0002R1DettArqComplexType }
     * 
     * 
     */
    public List<GrupoDDA0002R1DettArqComplexType> getGrupoDDA0002R1DettArq() {
        if (grupoDDA0002R1DettArq == null) {
            grupoDDA0002R1DettArq = new ArrayList<GrupoDDA0002R1DettArqComplexType>();
        }
        return this.grupoDDA0002R1DettArq;
    }

    /**
     * Gets the value of the dtHrDDA property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtHrDDA() {
        return dtHrDDA;
    }

    /**
     * Sets the value of the dtHrDDA property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtHrDDA(XMLGregorianCalendar value) {
        this.dtHrDDA = value;
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

    /*
     * (non-Javadoc)
     * 
     * @see br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.sspb.recebimento.ConteudoMsgRecebida#getIdMensagemOrigem()
     */
    public Long getIdMensagemOrigem() {
        if (!ObjectUtil.isEmpty(getNumCtrlPart())) {
            return Long.parseLong(getNumCtrlPart());
        }
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.sspb.recebimento.ConteudoMsgRecebida#getNumIdent()
     */
    public Long getNumIdent() {
        return null;
    }
}