//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 09:22:39 AM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.DDA0214;

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
 * Java class for DDA0214R1ComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DDA0214R1ComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodMsg" type="{http://www.bcb.gov.br/SPB/DDA0214.xsd}CodMsg"/>
 *         &lt;element name="NumCtrlPart" type="{http://www.bcb.gov.br/SPB/DDA0214.xsd}ControleIF"/>
 *         &lt;element name="ISPBPart" type="{http://www.bcb.gov.br/SPB/DDA0214.xsd}ISPB"/>
 *         &lt;element name="DtRef" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="NumCtrlDDA" type="{http://www.bcb.gov.br/SPB/DDA0214.xsd}ControleIF"/>
 *         &lt;element name="Grupo_DDA0214R1_Msg" type="{http://www.bcb.gov.br/SPB/DDA0214.xsd}Grupo_DDA0214R1_MsgComplexType" maxOccurs="200" minOccurs="0"/>
 *         &lt;element name="Grupo_DDA0214R1_Arq" type="{http://www.bcb.gov.br/SPB/DDA0214.xsd}Grupo_DDA0214R1_ArqComplexType" maxOccurs="200" minOccurs="0"/>
 *         &lt;element name="SitReqDDA" type="{http://www.bcb.gov.br/SPB/DDA0214.xsd}SitCons"/>
 *         &lt;element name="DtHrDDA" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TamArq" type="{http://www.bcb.gov.br/SPB/DDA0214.xsd}TamArq" minOccurs="0"/>
 *         &lt;element name="IdentdArq" type="{http://www.bcb.gov.br/SPB/DDA0214.xsd}IdentdArq" minOccurs="0"/>
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
@XmlType(name = "DDA0214R1ComplexType", propOrder = { "codMsg", "numCtrlPart", "ispbPart", "dtRef", "numCtrlDDA", "grupoDDA0214R1Msg", "grupoDDA0214R1Arq", "sitReqDDA", "dtHrDDA",
        "tamArq", "identdArq", "dtMovto" })
public class DDA0214R1ComplexType implements ConteudoMsgRecebida {

    @XmlElement(name = "CodMsg", required = true)
    private String codMsg;
    @XmlElement(name = "NumCtrlPart", required = true)
    private String numCtrlPart;
    @XmlElement(name = "ISPBPart", required = true)
    private String ispbPart;
    @XmlElement(name = "DtRef", required = true)
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar dtRef;
    @XmlElement(name = "NumCtrlDDA", required = true)
    private String numCtrlDDA;
    @XmlElement(name = "Grupo_DDA0214R1_Msg")
    private List<GrupoDDA0214R1MsgComplexType> grupoDDA0214R1Msg;
    @XmlElement(name = "Grupo_DDA0214R1_Arq")
    private List<GrupoDDA0214R1ArqComplexType> grupoDDA0214R1Arq;
    @XmlElement(name = "SitReqDDA", required = true)
    private BigInteger sitReqDDA;
    @XmlElement(name = "DtHrDDA", required = true)
    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar dtHrDDA;
    @XmlElement(name = "TamArq")
    private BigInteger tamArq;
    @XmlElement(name = "IdentdArq")
    private String identdArq;
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
     * Gets the value of the ispbPart property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getISPBPart() {
        return ispbPart;
    }

    /**
     * Sets the value of the ispbPart property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setISPBPart(String value) {
        this.ispbPart = value;
    }

    /**
     * Gets the value of the dtRef property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtRef() {
        return dtRef;
    }

    /**
     * Sets the value of the dtRef property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtRef(XMLGregorianCalendar value) {
        this.dtRef = value;
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
     * Gets the value of the grupoDDA0214R1Msg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the grupoDDA0214R1Msg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGrupoDDA0214R1Msg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GrupoDDA0214R1MsgComplexType }
     * 
     * 
     */
    public List<GrupoDDA0214R1MsgComplexType> getGrupoDDA0214R1Msg() {
        if (grupoDDA0214R1Msg == null) {
            grupoDDA0214R1Msg = new ArrayList<GrupoDDA0214R1MsgComplexType>();
        }
        return this.grupoDDA0214R1Msg;
    }

    /**
     * Gets the value of the grupoDDA0214R1Arq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the grupoDDA0214R1Arq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGrupoDDA0214R1Arq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GrupoDDA0214R1ArqComplexType }
     * 
     * 
     */
    public List<GrupoDDA0214R1ArqComplexType> getGrupoDDA0214R1Arq() {
        if (grupoDDA0214R1Arq == null) {
            grupoDDA0214R1Arq = new ArrayList<GrupoDDA0214R1ArqComplexType>();
        }
        return this.grupoDDA0214R1Arq;
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
     * Gets the value of the tamArq property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTamArq() {
        return tamArq;
    }

    /**
     * Sets the value of the tamArq property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setTamArq(BigInteger value) {
        this.tamArq = value;
    }

    /**
     * Gets the value of the identdArq property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIdentdArq() {
        return identdArq;
    }

    /**
     * Sets the value of the identdArq property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setIdentdArq(String value) {
        this.identdArq = value;
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

    /**
     * {@inheritDoc}
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
