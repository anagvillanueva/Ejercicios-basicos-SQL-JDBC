import java.sql.*;

public class jdbcDeleteDemo {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStamt = null;
		ResultSet myRes = null;
		
		String url = "jdbc:mysql://localhost:3306/proyecto";	  
		String usuario = "platzi";
		String pass = "platzi";

		try {
			// Get a connection to database
			myConn = DriverManager.getConnection(url, usuario, pass);
			
			// Create a statement
			myStamt = myConn.createStatement();
				
			myRes = myStamt.executeQuery("select * from clientes order by ap_paterno");
			
			while (myRes.next()) {
				System.out.println(myRes.getString("primer_nombre") + ", " + myRes.getString("ap_paterno"));
			}
			System.out.println("---------------------------------");
			
			// Eliminando cliente
			System.out.println("Eliminando cliente");
			
			int rowsAffected = myStamt.executeUpdate(
					"delete from clientes " +
					"where primer_nombre='Erick' and ap_paterno='Diaz'");
			
			
				myRes = myStamt.executeQuery("select * from clientes order by ap_paterno");
					
				System.out.println("---------------------------------");
			// 5. Procesando el resultado
				while (myRes.next()) {
				System.out.println(myRes.getString("primer_nombre") + ", " + myRes.getString("ap_paterno"));
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
