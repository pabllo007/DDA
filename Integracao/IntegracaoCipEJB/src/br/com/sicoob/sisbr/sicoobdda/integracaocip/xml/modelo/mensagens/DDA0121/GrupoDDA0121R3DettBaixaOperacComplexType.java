//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 09:22:34 AM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.DDA0121;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for Grupo_DDA0121R3_DettBaixaOperacComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grupo_DDA0121R3_DettBaixaOperacComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TpPessoaPort" type="{http://www.bcb.gov.br/SPB/DDA0121.xsd}TpPessoa" minOccurs="0"/>
 *         &lt;element name="CNPJ_CPFPort" type="{http://www.bcb.gov.br/SPB/DDA0121.xsd}CNPJ_CPF" minOccurs="0"/>
 *         &lt;element name="DtHrProcBaixaOperac" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DtProcBaixaOperac" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="VlrBaixaOperacTit" type="{http://www.bcb.gov.br/SPB/DDA0121.xsd}Valor"/>
 *         &lt;element name="NumCodBarrasBaixaOperac" type="{http://www.bcb.gov.br/SPB/DDA0121.xsd}NumCodBarras"/>
 *         &lt;element name="CanPgtoBaixaOperac" type="{http://www.bcb.gov.br/SPB/DDA0121.xsd}CanPgto" minOccurs="0"/>
 *         &lt;element name="MeioPgtoBaixaOperac" type="{http://www.bcb.gov.br/SPB/DDA0121.xsd}MeioPgto" minOccurs="0"/>
 *         &lt;element name="IndrOpContg" type="{http://www.bcb.gov.br/SPB/DDA0121.xsd}Indr" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grupo_DDA0121R3_DettBaixaOperacComplexType", propOrder = { "tpPessoaPort", "cnpjcpfPort", "dtHrProcBaixaOperac", "dtProcBaixaOperac", "vlrBaixaOperacTit",
        "numCodBarrasBaixaOperac", "canPgtoBaixaOperac", "meioPgtoBaixaOperac", "indrOpContg" })
public class GrupoDDA0121R3DettBaixaOperacComplexType {

    @XmlElement(name = "TpPessoaPort")
    private String tpPessoaPort;
    @XmlElement(name = "CNPJ_CPFPort")
    private BigInteger cnpjcpfPort;
    @XmlElement(name = "DtHrProcBaixaOperac", required = true)
    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar dtHrProcBaixaOperac;
    @XmlElement(name = "DtProcBaixaOperac", required = true)
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar dtProcBaixaOperac;
    @XmlElement(name = "VlrBaixaOperacTit", required = true)
    private BigDecimal vlrBaixaOperacTit;
    @XmlElement(name = "NumCodBarrasBaixaOperac", required = true)
    private String numCodBarrasBaixaOperac;
    @XmlElement(name = "CanPgtoBaixaOperac")
    private BigInteger canPgtoBaixaOperac;
    @XmlElement(name = "MeioPgtoBaixaOperac")
    private BigInteger meioPgtoBaixaOperac;
    @XmlElement(name = "IndrOpContg")
    private String indrOpContg;

    /**
     * Gets the value of the tpPessoaPort property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTpPessoaPort() {
        return tpPessoaPort;
    }

    /**
     * Sets the value of the tpPessoaPort property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTpPessoaPort(String value) {
        this.tpPessoaPort = value;
    }

    /**
     * Gets the value of the cnpjcpfPort property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getCNPJCPFPort() {
        return cnpjcpfPort;
    }

    /**
     * Sets the value of the cnpjcpfPort property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setCNPJCPFPort(BigInteger value) {
        this.cnpjcpfPort = value;
    }

    /**
     * Gets the value of the dtHrProcBaixaOperac property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtHrProcBaixaOperac() {
        return dtHrProcBaixaOperac;
    }

    /**
     * Sets the value of the dtHrProcBaixaOperac property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtHrProcBaixaOperac(XMLGregorianCalendar value) {
        this.dtHrProcBaixaOperac = value;
    }

    /**
     * Gets the value of the dtProcBaixaOperac property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtProcBaixaOperac() {
        return dtProcBaixaOperac;
    }

    /**
     * Sets the value of the dtProcBaixaOperac property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtProcBaixaOperac(XMLGregorianCalendar value) {
        this.dtProcBaixaOperac = value;
    }

    /**
     * Gets the value of the vlrBaixaOperacTit property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getVlrBaixaOperacTit() {
        return vlrBaixaOperacTit;
    }

    /**
     * Sets the value of the vlrBaixaOperacTit property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setVlrBaixaOperacTit(BigDecimal value) {
        this.vlrBaixaOperacTit = value;
    }

    /**
     * Gets the value of the numCodBarrasBaixaOperac property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNumCodBarrasBaixaOperac() {
        return numCodBarrasBaixaOperac;
    }

    /**
     * Sets the value of the numCodBarrasBaixaOperac property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNumCodBarrasBaixaOperac(String value) {
        this.numCodBarrasBaixaOperac = value;
    }

    /**
     * Gets the value of the canPgtoBaixaOperac property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getCanPgtoBaixaOperac() {
        return canPgtoBaixaOperac;
    }

    /**
     * Sets the value of the canPgtoBaixaOperac property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setCanPgtoBaixaOperac(BigInteger value) {
        this.canPgtoBaixaOperac = value;
    }

    /**
     * Gets the value of the meioPgtoBaixaOperac property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getMeioPgtoBaixaOperac() {
        return meioPgtoBaixaOperac;
    }

    /**
     * Sets the value of the meioPgtoBaixaOperac property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setMeioPgtoBaixaOperac(BigInteger value) {
        this.meioPgtoBaixaOperac = value;
    }

    /**
     * Gets the value of the indrOpContg property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIndrOpContg() {
        return indrOpContg;
    }

    /**
     * Sets the value of the indrOpContg property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setIndrOpContg(String value) {
        this.indrOpContg = value;
    }

}
