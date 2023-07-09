package com.programacionparaaprender.ws;

import com.programacionparaaprender.ws.dto.Response;
import com.programacionparaaprender.ws.dto.Request;

public class WebEjemplo {
    public String bienvenida() {
    	return "bienvenido a la web";
    }
    public Response ejemploRequest(Request request){
    	Response response = new Response();
    	response.setNombre(request.getNombre());
    	response.setApellido(request.getApellido());
    	return response;
    }
}
