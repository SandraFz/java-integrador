package ar.com.javaintegrador.controller;

import java.util.List;

import ar.com.javaintegrador.dao.iDepartamento;
import ar.com.javaintegrador.dao.implement.DepartamentoDAOimpl;
import ar.com.javaintegrador.domain.Departamento;

public class GetAllDptosController {
	
	public static void main (String[] arg) {
		
		iDepartamento iDept = new DepartamentoDAOimpl();
		
		List<Departamento> deptos;
		
		try {
			
			deptos = iDept.allDepartaments();
		}
		
		catch(Exception e) {
			
			deptos = null;
		}
		
		if(deptos != null) {
			
			for(Departamento d : deptos) {
				
				System.out.println(d);
			}
			
		} else {
			
			System.out.println("No hay ningún departamento");
			
		}
		
	}

}
