//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 09:22:20 AM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.DDA0005;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for DDA0005ComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DDA0005ComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodMsg" type="{http://www.bcb.gov.br/SPB/DDA0005.xsd}CodMsg"/>
 *         &lt;element name="NumCtrlPart" type="{http://www.bcb.gov.br/SPB/DDA0005.xsd}ControleIF"/>
 *         &lt;element name="ISPBPartRecbdrPrincipal" type="{http://www.bcb.gov.br/SPB/DDA0005.xsd}ISPB"/>
 *         &lt;element name="ISPBPartRecbdrAdmtd" type="{http://www.bcb.gov.br/SPB/DDA0005.xsd}ISPB"/>
 *         &lt;element name="TpPessoaPagdr" type="{http://www.bcb.gov.br/SPB/DDA0005.xsd}TpPessoa"/>
 *         &lt;element name="CNPJ_CPFPagdr" type="{http://www.bcb.gov.br/SPB/DDA0005.xsd}CNPJ_CPF"/>
 *         &lt;element name="NumIdentcPagdr" type="{http://www.bcb.gov.br/SPB/DDA0005.xsd}NumIdentcPagdr" minOccurs="0"/>
 *         &lt;element name="NumRefAtlCadCliPagdr" type="{http://www.bcb.gov.br/SPB/DDA0005.xsd}NumRefCad" minOccurs="0"/>
 *         &lt;element name="Grupo_DDA0005_CtCliPagdr" type="{http://www.bcb.gov.br/SPB/DDA0005.xsd}Grupo_DDA0005_CtCliPagdrComplexType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Grupo_DDA0005_AgrgdDDA" type="{http://www.bcb.gov.br/SPB/DDA0005.xsd}Grupo_DDA0005_AgrgdDDAComplexType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DDA0005ComplexType", propOrder = { "codMsg", "numCtrlPart", "ispbPartRecbdrPrincipal", "ispbPartRecbdrAdmtd", "tpPessoaPagdr", "cnpjcpfPagdr", "numIdentcPagdr",
        "numRefAtlCadCliPagdr", "grupoDDA0005CtCliPagdr", "grupoDDA0005AgrgdDDA", "dtMovto" })
public class DDA0005ComplexType {

    @XmlElement(name = "CodMsg", required = true)
    private String codMsg;
    @XmlElement(name = "NumCtrlPart", required = true)
    private String numCtrlPart;
    @XmlElement(name = "ISPBPartRecbdrPrincipal", required = true)
    private String ispbPartRecbdrPrincipal;
    @XmlElement(name = "ISPBPartRecbdrAdmtd", required = true)
    private String ispbPartRecbdrAdmtd;
    @XmlElement(name = "TpPessoaPagdr", required = true)
    private String tpPessoaPagdr;
    @XmlElement(name = "CNPJ_CPFPagdr", required = true)
    private BigInteger cnpjcpfPagdr;
    @XmlElement(name = "NumIdentcPagdr")
    private BigInteger numIdentcPagdr;
    @XmlElement(name = "NumRefAtlCadCliPagdr")
    private BigInteger numRefAtlCadCliPagdr;
    @XmlElement(name = "Grupo_DDA0005_CtCliPagdr")
    private List<GrupoDDA0005CtCliPagdrComplexType> grupoDDA0005CtCliPagdr;
    @XmlElement(name = "Grupo_DDA0005_AgrgdDDA")
    private List<GrupoDDA0005AgrgdDDAComplexType> grupoDDA0005AgrgdDDA;
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
     * Gets the value of the tpPessoaPagdr property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTpPessoaPagdr() {
        return tpPessoaPagdr;
    }

    /**
     * Sets the value of the tpPessoaPagdr property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTpPessoaPagdr(String value) {
        this.tpPessoaPagdr = value;
    }

    /**
     * Gets the value of the cnpjcpfPagdr property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getCNPJCPFPagdr() {
        return cnpjcpfPagdr;
    }

    /**
     * Sets the value of the cnpjcpfPagdr property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setCNPJCPFPagdr(BigInteger value) {
        this.cnpjcpfPagdr = value;
    }

    /**
     * Gets the value of the numIdentcPagdr property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNumIdentcPagdr() {
        return numIdentcPagdr;
    }

    /**
     * Sets the value of the numIdentcPagdr property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setNumIdentcPagdr(BigInteger value) {
        this.numIdentcPagdr = value;
    }

    /**
     * Gets the value of the numRefAtlCadCliPagdr property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNumRefAtlCadCliPagdr() {
        return numRefAtlCadCliPagdr;
    }

    /**
     * Sets the value of the numRefAtlCadCliPagdr property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setNumRefAtlCadCliPagdr(BigInteger value) {
        this.numRefAtlCadCliPagdr = value;
    }

    /**
     * Gets the value of the grupoDDA0005CtCliPagdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the grupoDDA0005CtCliPagdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGrupoDDA0005CtCliPagdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GrupoDDA0005CtCliPagdrComplexType }
     * 
     * 
     */
    public List<GrupoDDA0005CtCliPagdrComplexType> getGrupoDDA0005CtCliPagdr() {
        if (grupoDDA0005CtCliPagdr == null) {
            grupoDDA0005CtCliPagdr = new ArrayList<GrupoDDA0005CtCliPagdrComplexType>();
        }
        return this.grupoDDA0005CtCliPagdr;
    }

    /**
     * Gets the value of the grupoDDA0005AgrgdDDA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the grupoDDA0005AgrgdDDA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGrupoDDA0005AgrgdDDA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GrupoDDA0005AgrgdDDAComplexType }
     * 
     * 
     */
    public List<GrupoDDA0005AgrgdDDAComplexType> getGrupoDDA0005AgrgdDDA() {
        if (grupoDDA0005AgrgdDDA == null) {
            grupoDDA0005AgrgdDDA = new ArrayList<GrupoDDA0005AgrgdDDAComplexType>();
        }
        return this.grupoDDA0005AgrgdDDA;
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