package ar.com.javaintegrador.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
	
	public static Connection conectDB() {
		String hosts = "127.0.0.1"; //localhost
		String port = "3306";
		String password = "";
		String username = "root";
		String dbName = "sql_desafio";
		String url = "jdbc:mysql://" +hosts +":" +port +"/" +dbName +"?serverTimeZone=UTC&useSSL=false";
		Connection connection;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
		}
		catch(Exception e){
			connection = null;
		}
		return connection;
	}
	
	public static void main(String[] args) {
		
		Connection con = AdministradorDeConexiones.conectDB();
		if(con != null) {
			System.out.println("Conexion OK");
		} else {
			System.out.println("Conexión fail");
		}
	}

}
