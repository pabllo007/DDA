//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.05 at 03:37:34 PM BRT 
//

package br.com.sicoob.sisbr.sicoobdda.integracaocip.xml.modelo.mensagens.sspb.envio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "MQEnvio")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MQEnvio", propOrder = { "header", "msgSPB" })
public class MQEnvio {

    @XmlElement(name = "Header", required = true)
    private HeaderEnvio header;
    @XmlElement(name = "MsgSPB", required = true)
    private MsgSPBEnvio msgSPB;

    /**
     * @return the header
     */
    public HeaderEnvio getHeader() {
        return header;
    }

    /**
     * @param header the header to set
     */
    public void setHeader(HeaderEnvio header) {
        this.header = header;
    }

    /**
     * @return the msgSPB
     */
    public MsgSPBEnvio getMsgSPB() {
        return msgSPB;
    }

    /**
     * @param msgSPB the msgSPB to set
     */
    public void setMsgSPB(MsgSPBEnvio msgSPB) {
        this.msgSPB = msgSPB;
    }

}
