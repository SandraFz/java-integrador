package ar.com.javaintegrador.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.javaintegrador.dao.iDepartamento;
import ar.com.javaintegrador.dao.implement.DepartamentoDAOimpl;

@WebServlet("/deleteDepto")
public class DeleteDepartamentoController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		iDepartamento depto = new DepartamentoDAOimpl();
		
		Long numero = Long.parseLong(req.getParameter("deptoToDelete"));
		
		try {
			depto.deleteDepartment(numero);
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		getServletContext().getRequestDispatcher("/findAllDptos").forward(req, res);
		
	}
	
	public static void main (String[] arg) throws Exception {
		
		iDepartamento depto = new DepartamentoDAOimpl();
		
		Long numero = 30l;
		
		depto.deleteDepartment(numero);
		
	}

}
