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


@WebServlet("/findAllDptos")
public class FinAllDptosController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		iDepartamento iDept = new DepartamentoDAOimpl();
		
		List<Departamento> deptos = new ArrayList<>();
		
		try {
			deptos = iDept.allDepartaments();
		}
		
		catch (Exception e){
			e.printStackTrace();
		}
		
		req.setAttribute("deptos", deptos);
		
		getServletContext().getRequestDispatcher("/deptoList.jsp").forward(req, res);
		
	}
	
	
	@Override
	protected void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		doGet(req, res);
		
		
	}
	
	
	
	//EN CONSOLA.
	
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
