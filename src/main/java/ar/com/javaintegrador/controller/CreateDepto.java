package ar.com.javaintegrador.controller;

import ar.com.javaintegrador.dao.iDepartamento;
import ar.com.javaintegrador.dao.implement.DepartamentoDAOimpl;
import ar.com.javaintegrador.domain.Departamento;

public class CreateDepto{

	public static void main (String[] arg) throws Exception {
		
		iDepartamento depto = new DepartamentoDAOimpl();
		
		Long numero = 32l;
		String nombre = "Producción";
		Double presupuesto = 500000d;
		
		Departamento d = new Departamento(numero, nombre, presupuesto);
		
		depto.createDepartment(d);
		
	}
	
}
