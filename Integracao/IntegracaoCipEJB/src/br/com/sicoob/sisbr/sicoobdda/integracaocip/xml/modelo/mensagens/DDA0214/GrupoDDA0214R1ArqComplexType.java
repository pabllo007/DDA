//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 09:22:39 AM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.DDA0214;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for Grupo_DDA0214R1_ArqComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grupo_DDA0214R1_ArqComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NomArq" type="{http://www.bcb.gov.br/SPB/DDA0214.xsd}Nome"/>
 *         &lt;element name="QtdRegArq" type="{http://www.bcb.gov.br/SPB/DDA0214.xsd}Qtd" minOccurs="0"/>
 *         &lt;element name="QtdRegActo" type="{http://www.bcb.gov.br/SPB/DDA0214.xsd}Qtd" minOccurs="0"/>
 *         &lt;element name="QtdRegRejd" type="{http://www.bcb.gov.br/SPB/DDA0214.xsd}Qtd" minOccurs="0"/>
 *         &lt;element name="DtHrArq" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grupo_DDA0214R1_ArqComplexType", propOrder = { "nomArq", "qtdRegArq", "qtdRegActo", "qtdRegRejd", "dtHrArq" })
public class GrupoDDA0214R1ArqComplexType {

    @XmlElement(name = "NomArq", required = true)
    private String nomArq;
    @XmlElement(name = "QtdRegArq")
    private BigInteger qtdRegArq;
    @XmlElement(name = "QtdRegActo")
    private BigInteger qtdRegActo;
    @XmlElement(name = "QtdRegRejd")
    private BigInteger qtdRegRejd;
    @XmlElement(name = "DtHrArq", required = true)
    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar dtHrArq;

    /**
     * Gets the value of the nomArq property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNomArq() {
        return nomArq;
    }

    /**
     * Sets the value of the nomArq property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNomArq(String value) {
        this.nomArq = value;
    }

    /**
     * Gets the value of the qtdRegArq property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getQtdRegArq() {
        return qtdRegArq;
    }

    /**
     * Sets the value of the qtdRegArq property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setQtdRegArq(BigInteger value) {
        this.qtdRegArq = value;
    }

    /**
     * Gets the value of the qtdRegActo property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getQtdRegActo() {
        return qtdRegActo;
    }

    /**
     * Sets the value of the qtdRegActo property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setQtdRegActo(BigInteger value) {
        this.qtdRegActo = value;
    }

    /**
     * Gets the value of the qtdRegRejd property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getQtdRegRejd() {
        return qtdRegRejd;
    }

    /**
     * Sets the value of the qtdRegRejd property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setQtdRegRejd(BigInteger value) {
        this.qtdRegRejd = value;
    }

    /**
     * Gets the value of the dtHrArq property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDtHrArq() {
        return dtHrArq;
    }

    /**
     * Sets the value of the dtHrArq property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDtHrArq(XMLGregorianCalendar value) {
        this.dtHrArq = value;
    }

}