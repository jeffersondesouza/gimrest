/**
 * Comentario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gim.rest.webservice.blogserver;

public class Comentario  implements java.io.Serializable {
    private br.com.gim.rest.webservice.blogserver.Artigo artigo;

    private br.com.gim.rest.webservice.blogserver.Usuario autor;

    private java.lang.Long id;

    private java.lang.String texto;

    public Comentario() {
    }

    public Comentario(
           br.com.gim.rest.webservice.blogserver.Artigo artigo,
           br.com.gim.rest.webservice.blogserver.Usuario autor,
           java.lang.Long id,
           java.lang.String texto) {
           this.artigo = artigo;
           this.autor = autor;
           this.id = id;
           this.texto = texto;
    }


    /**
     * Gets the artigo value for this Comentario.
     * 
     * @return artigo
     */
    public br.com.gim.rest.webservice.blogserver.Artigo getArtigo() {
        return artigo;
    }


    /**
     * Sets the artigo value for this Comentario.
     * 
     * @param artigo
     */
    public void setArtigo(br.com.gim.rest.webservice.blogserver.Artigo artigo) {
        this.artigo = artigo;
    }


    /**
     * Gets the autor value for this Comentario.
     * 
     * @return autor
     */
    public br.com.gim.rest.webservice.blogserver.Usuario getAutor() {
        return autor;
    }


    /**
     * Sets the autor value for this Comentario.
     * 
     * @param autor
     */
    public void setAutor(br.com.gim.rest.webservice.blogserver.Usuario autor) {
        this.autor = autor;
    }


    /**
     * Gets the id value for this Comentario.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Comentario.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the texto value for this Comentario.
     * 
     * @return texto
     */
    public java.lang.String getTexto() {
        return texto;
    }


    /**
     * Sets the texto value for this Comentario.
     * 
     * @param texto
     */
    public void setTexto(java.lang.String texto) {
        this.texto = texto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Comentario)) return false;
        Comentario other = (Comentario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.artigo==null && other.getArtigo()==null) || 
             (this.artigo!=null &&
              this.artigo.equals(other.getArtigo()))) &&
            ((this.autor==null && other.getAutor()==null) || 
             (this.autor!=null &&
              this.autor.equals(other.getAutor()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.texto==null && other.getTexto()==null) || 
             (this.texto!=null &&
              this.texto.equals(other.getTexto())));
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
        if (getArtigo() != null) {
            _hashCode += getArtigo().hashCode();
        }
        if (getAutor() != null) {
            _hashCode += getAutor().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getTexto() != null) {
            _hashCode += getTexto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Comentario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.blogserver.gim.com.br/", "comentario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "artigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.blogserver.gim.com.br/", "artigo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.blogserver.gim.com.br/", "usuario"));
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
        elemField.setFieldName("texto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "texto"));
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
