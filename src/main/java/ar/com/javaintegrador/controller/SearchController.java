package ar.com.javaintegrador.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.javaintegrador.dao.iDepartamento;
import ar.com.javaintegrador.dao.implement.DepartamentoDAOimpl;
import ar.com.javaintegrador.domain.Departamento;

@WebServlet("/search")
public class SearchController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		iDepartamento depto = new DepartamentoDAOimpl();
		
		String nombre = req.getParameter("nombre");
		
		List<Departamento> deptos;
		
		try {
			deptos = depto.searchDepartment(nombre);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		req.setAttribute("deptos", deptos);
		
		getServletContext().getRequestDispatcher("/deptoList.jsp").forward(req, res);
		
		
	}

	
	
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
