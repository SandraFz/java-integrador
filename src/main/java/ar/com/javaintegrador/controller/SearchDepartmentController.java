package ar.com.javaintegrador.controller;

import java.util.List;

import ar.com.javaintegrador.dao.iDepartamento;
import ar.com.javaintegrador.dao.implement.DepartamentoDAOimpl;
import ar.com.javaintegrador.domain.Departamento;

public class SearchDepartmentController {

	public static void main (String[] args) {
		
		iDepartamento iDep = new DepartamentoDAOimpl();
		
		String name = "Marketing";
		List<Departamento> deptos;
		
		try {
			
			deptos = iDep.searchDepartment(name);
		}
		
		catch(Exception e) {
			
			deptos = null;
		}
		
		if (deptos != null) {
			
			for(Departamento dep : deptos) {
				System.out.println(dep);
			}
			
		} else {
			
			System.out.println("No hay departamento con el nombre: " +name);
		}
		
		
		
	}
}
