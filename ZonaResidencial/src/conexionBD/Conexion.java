package conexionBD;

import java.sql.*;

public class Conexion {
	static String bd = "administradores";
	static String login = "root";
	static String password = "1234567";
	static String url = "jdbc:mysql://localhost:3306/" + bd;
	Connection connection = null;

	public Conexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			if (connection != null) {
				System.out.println("Conexión a base de datos " + bd + " OK\n");
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public void desconectar() {
		connection = null;
	}
}