package com.programacionparaaprender.service;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class HolaWebService {

	public HolaWebService() {
		// TODO Auto-generated constructor stub
	}
	
	@WebMethod
	public String resultado() {
		return "Este es mi primer web service";
	}

}
