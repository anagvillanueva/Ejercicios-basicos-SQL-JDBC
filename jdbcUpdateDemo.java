import java.sql.*;


public class jdbcUpdateDemo {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStamt = null;
		ResultSet myRes = null;
		
		String url = "jdbc:mysql://localhost:3306/proyecto";	  
		String usuario = "platzi";
		String pass = "platzi";

		try {
			// 1. Establecer conexion a la base de datos 
			myConn = DriverManager.getConnection(url, usuario, pass);
			
			// 2. Crear la declaracion de objeto Statement
			myStamt = myConn.createStatement();
	
			// UPDATE 
			System.out.println("\nEjecutando cambios en cliente: \n");
			
			int rowsAffected = myStamt.executeUpdate(
					"update clientes " +
					"set email='maria_gut@platzi.com' " + 
					"where primer_nombre='Maria' and ap_paterno='Gutierrez'");
		
			// 4. Verificando obteniendo la lista 
			myRes = myStamt.executeQuery("select * from clientes order by ap_paterno");
			
			// 5. Procesando el resultado imprimiendo apellido y email 
			while (myRes.next()) {
				System.out.println(myRes.getString("ap_paterno") + ", " + myRes.getString("email"));
			}
		
	}
	catch (Exception exc) {
		exc.printStackTrace();
		
	}
	finally {
		if (myRes != null) {
			myRes.close();
		}
		
		if (myStamt != null) {
			myStamt.close();
		}
		
		if (myConn != null) {
			myConn.close();
		}
	}
}

}
