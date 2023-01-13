package ar.com.javaintegrador.controller;

import ar.com.javaintegrador.dao.iDepartamento;
import ar.com.javaintegrador.dao.implement.DepartamentoDAOimpl;
import ar.com.javaintegrador.domain.Departamento;

public class GetDepartamentoController {

	public static void main(String[] args) {
		
		iDepartamento depDAO = new DepartamentoDAOimpl();
		Long id = 33l;
		Departamento d;
		
		try {
			d = depDAO.getDepartment(id);
		} 
		catch (Exception e) {
			d = null;
		}
		
		if(d != null) {
			System.out.println(d);
		} else {
			System.out.println("No hay ningún departamento con el id: " + id);
		}

	}

}
