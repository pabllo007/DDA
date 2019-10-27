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

/**
 * <p>
 * Java class for Grupo_ADDA102_BenfcrioFinlComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grupo_ADDA102_BenfcrioFinlComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TpPessoaBenfcrioFinl" type="{http://www.bcb.gov.br/ARQ/ADDA102.xsd}TpPessoa"/>
 *         &lt;element name="CNPJ_CPFBenfcrioFinl" type="{http://www.bcb.gov.br/ARQ/ADDA102.xsd}CNPJ_CPF"/>
 *         &lt;element name="Nom_RzSocBenfcrioFinl" type="{http://www.bcb.gov.br/ARQ/ADDA102.xsd}Nom_RzSoc" minOccurs="0"/>
 *         &lt;element name="NomFantsBenfcrioFinl" type="{http://www.bcb.gov.br/ARQ/ADDA102.xsd}Nome" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grupo_ADDA102_BenfcrioFinlComplexType", propOrder = { "tpPessoaBenfcrioFinl", "cnpjcpfBenfcrioFinl", "nomRzSocBenfcrioFinl", "nomFantsBenfcrioFinl" })
public class GrupoADDA102BenfcrioFinlComplexType {

    @XmlElement(name = "TpPessoaBenfcrioFinl", required = true)
    private String tpPessoaBenfcrioFinl;
    @XmlElement(name = "CNPJ_CPFBenfcrioFinl", required = true)
    private BigInteger cnpjcpfBenfcrioFinl;
    @XmlElement(name = "Nom_RzSocBenfcrioFinl")
    private String nomRzSocBenfcrioFinl;
    @XmlElement(name = "NomFantsBenfcrioFinl")
    private String nomFantsBenfcrioFinl;

    /**
     * Gets the value of the tpPessoaBenfcrioFinl property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTpPessoaBenfcrioFinl() {
        return tpPessoaBenfcrioFinl;
    }

    /**
     * Sets the value of the tpPessoaBenfcrioFinl property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTpPessoaBenfcrioFinl(String value) {
        this.tpPessoaBenfcrioFinl = value;
    }

    /**
     * Gets the value of the cnpjcpfBenfcrioFinl property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getCNPJCPFBenfcrioFinl() {
        return cnpjcpfBenfcrioFinl;
    }

    /**
     * Sets the value of the cnpjcpfBenfcrioFinl property.
     * 
     * @param value allowed object is {@link BigInteger }
     * 
     */
    public void setCNPJCPFBenfcrioFinl(BigInteger value) {
        this.cnpjcpfBenfcrioFinl = value;
    }

    /**
     * Gets the value of the nomRzSocBenfcrioFinl property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNomRzSocBenfcrioFinl() {
        return nomRzSocBenfcrioFinl;
    }

    /**
     * Sets the value of the nomRzSocBenfcrioFinl property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNomRzSocBenfcrioFinl(String value) {
        this.nomRzSocBenfcrioFinl = value;
    }

    /**
     * Gets the value of the nomFantsBenfcrioFinl property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNomFantsBenfcrioFinl() {
        return nomFantsBenfcrioFinl;
    }

    /**
     * Sets the value of the nomFantsBenfcrioFinl property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNomFantsBenfcrioFinl(String value) {
        this.nomFantsBenfcrioFinl = value;
    }

}
