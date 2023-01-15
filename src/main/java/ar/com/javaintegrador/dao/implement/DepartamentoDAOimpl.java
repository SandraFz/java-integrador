package ar.com.javaintegrador.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ar.com.javaintegrador.dao.iDepartamento;
import ar.com.javaintegrador.db.AdministradorDeConexiones;
import ar.com.javaintegrador.domain.Departamento;

public class DepartamentoDAOimpl implements iDepartamento {

	Departamento deptoById;
	
	@Override
	//Crea un nuevo departamento con las variables que le pasamos
	public void createDepartment(Departamento newDepto) throws Exception {
		
		Connection connection = AdministradorDeConexiones.conectDB();
		
		String sql = "INSERT INTO `Departamento`(numero, nombre, presupuesto) VALUES(?,?,?)";
		
		PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		
		statement.setLong(1, newDepto.getNumero() );
		statement.setString(2, newDepto.getNombre());
		statement.setDouble(3, newDepto.getPresupuesto());
		
		statement.execute();
		
		ResultSet result = statement.getGeneratedKeys();
		
	}
	

	@Override
	//Devuelve el departamento con el id que le pasamos.
	public Departamento getDepartment(Long id) throws Exception {
		// Creo la conexión
		Connection connection = AdministradorDeConexiones.conectDB();
		
		//Declaro la sentencia y la guardo en una variable
		String sql = "SELECT * FROM Departamento WHERE numero = " + id;
		
		//Preparo el statemento
		Statement statement = connection.createStatement();
		
		//Ejecuto y guardo en el result
		ResultSet resultset = statement.executeQuery(sql);
		
		//Verifico resultado
		if (resultset.next()) {
			//Obtengo el dato de cada campo y guardo en variables
			
			Long numero = resultset.getLong("numero");
			String nombre = resultset.getString("nombre");
			Double presupuesto = resultset.getDouble("presupuesto");
			
			//deptoById = new Departamento(numero, nombre, presupuesto);
			
			//return deptoById;
			return new Departamento(numero, nombre, presupuesto);
		} //else {
		cerrar(connection);
		return null;//}
	}

	@Override
	//Devuelve una lista de departamento que coinciden con el nombre que le pasamos.
	public List<Departamento> searchDepartment(String name) throws Exception {
		
		Connection connection = AdministradorDeConexiones.conectDB();
		
		String sql = "SELECT * FROM Departamento WHERE nombre = ?";
		//String sql1 = "SELECT * FROM Departamento WHERE nombre LIKE " + name +"%";
		
		Statement statement = connection.createStatement();
		
		ResultSet resultset = statement.executeQuery(sql);
		
		List<Departamento> listDpt = new ArrayList<Departamento>();
		
		while(resultset.next()) {
			
			Long numero = resultset.getLong("numero");
			String nombre = resultset.getString("nombre");
			Double presupuesto = resultset.getDouble("presupuesto");
			
			Departamento deptoByName = new Departamento (numero, nombre, presupuesto);
			listDpt.add(deptoByName);
			
			return listDpt;
			
		}
		
		return null;
	}

	@Override
	//Devuelve la lista de los primeros 10 departamentos
	public List<Departamento> allDepartaments() throws Exception {

		Connection connection = AdministradorDeConexiones.conectDB();
		
		Statement statement = connection.createStatement();
		
		String sql = "SELECT * FROM Departamento LIMIT 10";
		
		ResultSet resultset = statement.executeQuery(sql);
		
		List<Departamento> depList = new ArrayList<Departamento>();
		
		while (resultset.next()) {
			
			Long numero = resultset.getLong("numero");
			String nombre = resultset.getString("nombre");
			Double presupuesto = resultset.getDouble("presupuesto");
			
			Departamento newDepItem = new Departamento(numero, nombre, presupuesto);
			
			depList.add(newDepItem);
			
		}
		
		return depList;
	}

	@Override
	//Actualiza los datos del departamento que le pasamos.
	/*public void updateDepartment(Departamento depto, Long number) throws Exception {

		Connection connection = AdministradorDeConexiones.conectDB();
		
		String sql = "UPDATE Departamento SET nombre = ?, presupuesto = ? WHERE numero = ?";
		
		PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		
		statement.setString(1, depto.getNombre());
		statement.setDouble(2, depto.getPresupuesto());
		statement.setLong(3, number);
		
		statement.execute();
		
	}*/
	
	public void updateDepartment(Departamento depto, Long numero) throws Exception {

		Connection connection = AdministradorDeConexiones.conectDB();
		
		String sql = "UPDATE Departamento SET nombre = ?, presupuesto = ? WHERE numero = ?";
		
		PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		
		statement.setString(1, depto.getNombre());
		statement.setDouble(2, depto.getPresupuesto());
		statement.setLong(3, numero);
		
		statement.execute();
		
	}

	@Override
	public void updatePresupuestoDpto(Double presupuesto, Long numero) throws Exception {
		
		Connection connection = AdministradorDeConexiones.conectDB();
		
		String sql = "UPDATE Departamento SET presupuesto = ? WHERE numero = " + numero;
		
		PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		
		statement.setDouble(1, presupuesto);
		
		statement.execute();
		
	}

	@Override
	public void deleteDepartment(Long id) throws Exception {
		
		Connection connection = AdministradorDeConexiones.conectDB();
		
		String sql = "DELETE FROM Departamento WHERE numero = " + id;
		
		Statement statement = connection.createStatement();
		
		statement.execute(sql);
	}
	
	public void cerrar(Connection connection) throws Exception {
		connection.close();
	}
	

}
