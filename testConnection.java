package jdbcPrueba;

import java.sql.*;

public class jdbctest {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null; 
		Statement myStatm = null; 
		ResultSet myRes = null; 
		
		try {
			//1. Conexion a base de datos 
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "platzi", "platzi");
			
			System.out.println("Genial nos conectamos");
			
			//2. Objeto statement 
			myStatm = myConn.createStatement();
			
			//3. Ejecutar consulta SQL 
			
			myRes = myStatm.executeQuery("select * from clientes");
			
			//4.Procesarlos 
			while(myRes.next()) {
				System.out.println(myRes.getString("primer_nombre"));
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
			
			System.out.println("Algo salio mal):");
		}
		
		}
	}

