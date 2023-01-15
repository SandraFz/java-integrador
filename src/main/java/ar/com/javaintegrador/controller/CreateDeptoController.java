package ar.com.javaintegrador.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.javaintegrador.dao.iDepartamento;
import ar.com.javaintegrador.dao.implement.DepartamentoDAOimpl;
import ar.com.javaintegrador.domain.Departamento;

@WebServlet("/newDepto")
public class CreateDeptoController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		iDepartamento depto = new DepartamentoDAOimpl();
		
		Long numero = Long.parseLong(req.getParameter("numero"));
		String nombre = req.getParameter("nombre");
		Double presupuesto = Double.parseDouble(req.getParameter("presupuesto"));
		
		Departamento newDepto = new Departamento(numero, nombre, presupuesto);
		
		try {
			depto.createDepartment(newDepto);
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		getServletContext().getRequestDispatcher("/findAllDptos").forward(req, res);
		
	}
	

	public static void main (String[] arg) throws Exception {
		
		iDepartamento depto = new DepartamentoDAOimpl();
		
		Long numero = 32l;
		String nombre = "Producción";
		Double presupuesto = 500000d;
		
		Departamento d = new Departamento(numero, nombre, presupuesto);
		
		depto.createDepartment(d);
		
	}
	
}
