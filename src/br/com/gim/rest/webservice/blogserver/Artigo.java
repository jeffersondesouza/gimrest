/**
 * Artigo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gim.rest.webservice.blogserver;

public class Artigo  implements java.io.Serializable {
    private java.util.Calendar dataPublicacao;

    private java.lang.Long id;

    private boolean publico;

    private java.lang.String texto;

    private java.lang.String titulo;

    public Artigo() {
    }

    public Artigo(
           java.util.Calendar dataPublicacao,
           java.lang.Long id,
           boolean publico,
           java.lang.String texto,
           java.lang.String titulo) {
           this.dataPublicacao = dataPublicacao;
           this.id = id;
           this.publico = publico;
           this.texto = texto;
           this.titulo = titulo;
    }


    /**
     * Gets the dataPublicacao value for this Artigo.
     * 
     * @return dataPublicacao
     */
    public java.util.Calendar getDataPublicacao() {
        return dataPublicacao;
    }


    /**
     * Sets the dataPublicacao value for this Artigo.
     * 
     * @param dataPublicacao
     */
    public void setDataPublicacao(java.util.Calendar dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }


    /**
     * Gets the id value for this Artigo.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Artigo.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the publico value for this Artigo.
     * 
     * @return publico
     */
    public boolean isPublico() {
        return publico;
    }


    /**
     * Sets the publico value for this Artigo.
     * 
     * @param publico
     */
    public void setPublico(boolean publico) {
        this.publico = publico;
    }


    /**
     * Gets the texto value for this Artigo.
     * 
     * @return texto
     */
    public java.lang.String getTexto() {
        return texto;
    }


    /**
     * Sets the texto value for this Artigo.
     * 
     * @param texto
     */
    public void setTexto(java.lang.String texto) {
        this.texto = texto;
    }


    /**
     * Gets the titulo value for this Artigo.
     * 
     * @return titulo
     */
    public java.lang.String getTitulo() {
        return titulo;
    }


    /**
     * Sets the titulo value for this Artigo.
     * 
     * @param titulo
     */
    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Artigo)) return false;
        Artigo other = (Artigo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataPublicacao==null && other.getDataPublicacao()==null) || 
             (this.dataPublicacao!=null &&
              this.dataPublicacao.equals(other.getDataPublicacao()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.publico == other.isPublico() &&
            ((this.texto==null && other.getTexto()==null) || 
             (this.texto!=null &&
              this.texto.equals(other.getTexto()))) &&
            ((this.titulo==null && other.getTitulo()==null) || 
             (this.titulo!=null &&
              this.titulo.equals(other.getTitulo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDataPublicacao() != null) {
            _hashCode += getDataPublicacao().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += (isPublico() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTexto() != null) {
            _hashCode += getTexto().hashCode();
        }
        if (getTitulo() != null) {
            _hashCode += getTitulo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Artigo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.blogserver.gim.com.br/", "artigo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPublicacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataPublicacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("texto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "texto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titulo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
