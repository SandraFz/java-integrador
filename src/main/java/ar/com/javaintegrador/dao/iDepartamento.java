 package ar.com.javaintegrador.dao;

import java.util.List;
import ar.com.javaintegrador.domain.Departamento;

public interface iDepartamento {

	//Crea un departamento
	public void createDepartment(Departamento newDepto) throws Exception;
	
	//Busca y devuelve un departamento por el id
	public Departamento getDepartment (Long id) throws Exception;

	//Busca y devuelve un departamento por el nombre
	public List<Departamento> searchDepartment (String name) throws Exception;
	
	//Devuelve la lista completa de departamentos
	public List<Departamento> allDepartaments () throws Exception;
	
	//Actualiza un departamento
	public void updateDepartment (Departamento depto, Long number) throws Exception;
	
	//Actualiza solo el presupuesto del departamento
	public void updatePresupuestoDpto (Double presupuesto, Long numero) throws Exception;
	
	// Update Delete
	public void deleteDepartment (Long id) throws Exception;
}
