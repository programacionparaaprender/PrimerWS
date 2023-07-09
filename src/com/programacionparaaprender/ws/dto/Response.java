package com.programacionparaaprender.ws.dto;

public class Response {
    private java.lang.String apellido;

    private java.lang.String nombre;

    public Response() {
    }

    public Response(
           java.lang.String apellido,
           java.lang.String nombre) {
           this.apellido = apellido;
           this.nombre = nombre;
    }


    /**
     * Gets the apellido value for this Response.
     * 
     * @return apellido
     */
    public java.lang.String getApellido() {
        return apellido;
    }


    /**
     * Sets the apellido value for this Response.
     * 
     * @param apellido
     */
    public void setApellido(java.lang.String apellido) {
        this.apellido = apellido;
    }


    /**
     * Gets the nombre value for this Response.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Response.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }
}
