package ar.com.javaintegrador.controller;

import ar.com.javaintegrador.dao.iDepartamento;
import ar.com.javaintegrador.dao.implement.DepartamentoDAOimpl;

public class UpdatePresupuestoController {
	
	public static  void main (String[] arg) throws Exception {
		
		iDepartamento depto = new DepartamentoDAOimpl();
		
		Double presupuesto = 6000d;
		Long numero = 11l;
		
		depto.updatePresupuestoDpto(presupuesto, numero);
		
	}

}
