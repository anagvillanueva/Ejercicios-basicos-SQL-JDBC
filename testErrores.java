import java.sql.*; // Importamos para poder interactuar con la BD 


public class jdbcTest {

	public static void main(String[] args) throws SQLException {

		// Declaracion de mis 3 variables 
		Connection myConn = null;
		Statement myStamt = null;
		ResultSet myRes = null;
		
    // Guardando mi información de conexión en 3 variables 
		 String url = "jdbc:mysql://localhost:3306/proyecto";
		 String usuario = "platzi";
		 String pass = "platzi";
		
		try {
			// 1. Conexion a nuestra base de datos, pasando 3 argumentos BD/usuario/contraseña
			myConn = DriverManager.getConnection(url, usuario , pass);
			
			System.out.println("Genial, nos hemos conectado\n");
			
			// 2. Crear una declaracion objeto
			myStamt = myConn.createStatement();
			
			// 3. Ejecutar consulta SQL
			myRes = myStamt.executeQuery("select * from clientes");
			
			// 4. Procesar los resultados 
			while (myRes.next()) {
				System.out.println(myRes.getString("primer_nombre"));
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
			
			System.out.println("Algo salio mal): \n");
		}
		
		finally {
			//Cerramos los objetos para liberar los recursos
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
