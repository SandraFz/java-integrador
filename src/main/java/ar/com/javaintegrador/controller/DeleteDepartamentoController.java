package ar.com.javaintegrador.controller;

import ar.com.javaintegrador.dao.iDepartamento;
import ar.com.javaintegrador.dao.implement.DepartamentoDAOimpl;

public class DeleteDepartamentoController {
	
	public static void main (String[] arg) throws Exception {
		
		iDepartamento depto = new DepartamentoDAOimpl();
		
		Long numero = 30l;
		
		depto.deleteDepartment(numero);
		
	}

}
