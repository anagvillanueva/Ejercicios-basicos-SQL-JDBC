import java.sql.*;


public class jdbcInsertDemo {

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

			// 3. Insertando un nuevo registro de cliente
			System.out.println("Insertando un nuevo registro\n");
			
			int rowsAffected = myStamt.executeUpdate(
				"insert into clientes " +
				"(primer_nombre, ap_paterno, ap_materno, email, saldo) " + 
				"values " + 
				"('Ana', 'Almaraz', 'Moran', 'anna.m@platzi.com', 2000.00)");
			
			// 4. Verificando obteniendo la lista 
			myRes = myStamt.executeQuery("select * from clientes order by ap_paterno");
			
			// 5. Procesando el resultado imprimiendo apellido y nombre
			while (myRes.next()) {
				System.out.println(myRes.getString("ap_paterno") + ", " + myRes.getString("primer_nombre"));
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
