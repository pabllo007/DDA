//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.26 at 05:37:00 PM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.arquivos.ADDA102;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.com.sicoob.sisbr.sicoobdda.comum.negocio.util.ObjectUtil;
import br.com.sicoob.sisbr.sicoobdda.entidades.TipoMensagemDDA;
import br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.sspb.recebimento.ConteudoMsgRecebida;

/**
 * <p>
 * Java class for Grupo_ADDA102RET_TitActoComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grupo_ADDA102RET_TitActoComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumCtrlReqPart" type="{http://www.bcb.gov.br/ARQ/ADDA102.xsd}ControleIF"/>
 *         &lt;element name="ISPBPartDestinatarioPrincipal" type="{http://www.bcb.gov.br/ARQ/ADDA102.xsd}ISPB"/>
 *         &lt;element name="ISPBPartDestinatarioAdmtd" type="{http://www.bcb.gov.br/ARQ/ADDA102.xsd}ISPB"/>
 *         &lt;element name="NumIdentcTit" type="{http://www.bcb.gov.br/ARQ/ADDA102.xsd}NumIdentcTit"/>
 *         &lt;element name="NumRefAtlCadTit" type="{http://www.bcb.gov.br/ARQ/ADDA102.xsd}NumRefCad"/>
 *         &lt;element name="NumSeqAtlzCadTit" type="{http://www.bcb.gov.br/ARQ/ADDA102.xsd}NumSeqAtlzCadDDA"/>
 *         &lt;element name="NumCtrlDDA" type="{http://www.bcb.gov.br/ARQ/ADDA102.xsd}ControleIF"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grupo_ADDA102RET_TitActoComplexType", propOrder = { "numCtrlReqPart", "ispbPartDestinatarioPrincipal", "ispbPartDestinatarioAdmtd", "numIdentcTit",
        "numRefAtlCadTit", "numSeqAtlzCadTit", "numCtrlDDA" })
public class GrupoADDA102RETTitActoComplexType implements ConteudoMsgRecebida {

    @XmlElement(name = "NumCtrlReqPart", required = true)
    private String numCtrlReqPart;
    @XmlElement(name = "ISPBPartDestinatarioPrincipal", required = true)
    private String ispbPartDestinatarioPrincipal;
    @XmlElement(name = "ISPBPartDestinatarioAdmtd", required = true)
    private String ispbPartDestinatarioAdmtd;
    @XmlElement(name = "NumIdentcTit", required = true)
    private BigInteger numIdentcTit;
    @XmlElement(name = "NumRefAtlCadTit", required = true)
    private BigInteger numRefAtlCadTit;
    @XmlElement(name = "NumSeqAtlzCadTit", required = true)
    private BigInteger numSeqAtlzCadTit;
    @XmlElement(name = "NumCtrlDDA", required = true)
    private String numCtrlDDA;

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
     * Gets the value of the numSeqAtlzCadTit property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNumSeqAtlzCadTit() {
        return numSeqAtlzCadTit;
    }

    /**
     * Sets the value of the numSeqAtlzCadTit property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setNumSeqAtlzCadTit(BigInteger value) {
        this.numSeqAtlzCadTit = value;
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

    /*
     * (non-Javadoc)
     * 
     * @see br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.sspb.recebimento.ConteudoMsgRecebida#getIdMensagemOrigem()
     */
    public Long getIdMensagemOrigem() {
        if (!ObjectUtil.isEmpty(getNumCtrlReqPart())) {
            return Long.parseLong(getNumCtrlReqPart());
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.sspb.recebimento.ConteudoMsgRecebida#getCodMsg()
     */
    public String getCodMsg() {
        return TipoMensagemDDA.ADDA102RET;
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
