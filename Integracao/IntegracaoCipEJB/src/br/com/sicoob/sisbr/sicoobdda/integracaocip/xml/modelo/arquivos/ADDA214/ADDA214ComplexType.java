//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.12 at 02:22:11 PM BRST 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.arquivos.ADDA214;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ADDA214ComplexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADDA214ComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ISPBPart" type="{http://www.bcb.gov.br/ARQ/ADDA214.xsd}ISPB"/>
 *         &lt;element name="NumCtrlDDA" type="{http://www.bcb.gov.br/ARQ/ADDA214.xsd}ControleIF"/>
 *         &lt;element name="DtRef" type="{http://www.bcb.gov.br/ARQ/ADDA214.xsd}Data"/>
 *         &lt;element name="Grupo_ADDA214_Msg" type="{http://www.bcb.gov.br/ARQ/ADDA214.xsd}Grupo_ADDA214_MsgComplexType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Grupo_ADDA214_Arq" type="{http://www.bcb.gov.br/ARQ/ADDA214.xsd}Grupo_ADDA214_ArqComplexType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DtHrDDA" type="{http://www.bcb.gov.br/ARQ/ADDA214.xsd}DataHora"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADDA214ComplexType", propOrder = { "ispbPart", "numCtrlDDA", "dtRef", "grupoADDA214Msg", "grupoADDA214Arq", "dtHrDDA" })
public class ADDA214ComplexType {

    @XmlElement(name = "ISPBPart", required = true)
    private String ispbPart;
    @XmlElement(name = "NumCtrlDDA", required = true)
    private String numCtrlDDA;
    @XmlElement(name = "DtRef", required = true)
    private XMLGregorianCalendar dtRef;
    @XmlElement(name = "Grupo_ADDA214_Msg")
    private List<GrupoADDA214MsgComplexType> grupoADDA214Msg;
    @XmlElement(name = "Grupo_ADDA214_Arq")
    private List<GrupoADDA214ArqComplexType> grupoADDA214Arq;
    @XmlElement(name = "DtHrDDA", required = true)
    private XMLGregorianCalendar dtHrDDA;

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
     * Gets the value of the grupoADDA214Msg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the grupoADDA214Msg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGrupoADDA214Msg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GrupoADDA214MsgComplexType }
     * 
     * 
     */
    public List<GrupoADDA214MsgComplexType> getGrupoADDA214Msg() {
        if (grupoADDA214Msg == null) {
            grupoADDA214Msg = new ArrayList<GrupoADDA214MsgComplexType>();
        }
        return this.grupoADDA214Msg;
    }

    /**
     * Gets the value of the grupoADDA214Arq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the grupoADDA214Arq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGrupoADDA214Arq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GrupoADDA214ArqComplexType }
     * 
     * 
     */
    public List<GrupoADDA214ArqComplexType> getGrupoADDA214Arq() {
        if (grupoADDA214Arq == null) {
            grupoADDA214Arq = new ArrayList<GrupoADDA214ArqComplexType>();
        }
        return this.grupoADDA214Arq;
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

}