package ar.com.javaintegrador.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.javaintegrador.dao.iDepartamento;
import ar.com.javaintegrador.dao.implement.DepartamentoDAOimpl;
import ar.com.javaintegrador.domain.Departamento;


@WebServlet("/updateDepto")
public class UpdateDepartamentController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		iDepartamento depto = new DepartamentoDAOimpl();
		
		String number = req.getParameter("number");
		Departamento deptoToEdit = null;
		
		try {
			
			deptoToEdit = depto.getDepartment(Long.parseLong(number));
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		req.setAttribute("depto", deptoToEdit);
		
		getServletContext().getRequestDispatcher("/deptoEdit.jsp").forward(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		iDepartamento deptoDao = new DepartamentoDAOimpl();
		
		Long numero = Long.parseLong(req.getParameter("numero"));
		String nombre = req.getParameter("nombre");
		String presupuesto = req.getParameter("presupuesto");
		
		Departamento deptoEditado = new Departamento(numero, nombre, Double.parseDouble(presupuesto));
		
		try {
			deptoDao.updateDepartment(deptoEditado, numero);
		}
		
		catch (Exception e){
			
			e.printStackTrace();
					}
		
		getServletContext().getRequestDispatcher("/findAllDptos").forward(req, res);
		
		
	}
	

	/*public static void main (String[] arg) throws Exception{
		
		iDepartamento depto = new DepartamentoDAOimpl();
		
		Long numero = 31l;
		String nombre = "Marketing";
		Double presupuesto = 80000d;
		
		Departamento updateDepto = new Departamento(numero, nombre, presupuesto);
		
		depto.updateDepartment(updateDepto, numero);
	}*/
}
