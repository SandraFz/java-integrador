package ar.com.javaintegrador.controller;

import ar.com.javaintegrador.dao.iDepartamento;
import ar.com.javaintegrador.dao.implement.DepartamentoDAOimpl;
import ar.com.javaintegrador.domain.Departamento;

public class UpdateDepartamentController {

	public static void main (String[] arg) throws Exception{
		
		iDepartamento depto = new DepartamentoDAOimpl();
		
		Long numero = 31l;
		String nombre = "Marketing";
		Double presupuesto = 5000d;
		
		Departamento updateDepto = new Departamento(numero, nombre, presupuesto);
		
		depto.updateDepartment(updateDepto, numero);
	}
}
