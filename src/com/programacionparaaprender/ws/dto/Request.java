package com.programacionparaaprender.ws.dto;

public class Request {
    private java.lang.String apellido;

    private java.lang.String nombre;

    public Request() {
    }

    public Request(
           java.lang.String apellido,
           java.lang.String nombre) {
           this.apellido = apellido;
           this.nombre = nombre;
    }


    /**
     * Gets the apellido value for this Request.
     * 
     * @return apellido
     */
    public java.lang.String getApellido() {
        return apellido;
    }


    /**
     * Sets the apellido value for this Request.
     * 
     * @param apellido
     */
    public void setApellido(java.lang.String apellido) {
        this.apellido = apellido;
    }


    /**
     * Gets the nombre value for this Request.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Request.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }
}
