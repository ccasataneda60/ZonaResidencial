package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	   /**Parametros de conexion*/
	   static String bd = "ZonaResidencial";
	   static String login = "root";
	   static String password = "654321";
	   static String url = "jdbc:mysql://localhost:3306/"+bd;
	 
	   Connection connection = null;
	   /** Constructor de ConexionBD */
	   public ConexionBD() {
	      try{
	         //se obtiene el driver de para mysql
	         Class.forName("com.mysql.jdbc.Driver");
	         //se crea la conexión
	         connection = DriverManager.getConnection(url,login,password);
	 
	         if (connection!=null){
	          // System.out.println("Conexión a base de datos "+bd+" OK\n");
	         }
	      }
	      catch(SQLException e){
	        // System.out.println(e);
	      }catch(ClassNotFoundException e){
	        // System.out.println(e);
	      }catch(Exception e){
	       //  System.out.println(e);
	      }
	   }
	   
	   /**Permite retornar la conexión*/
	   public Connection getConnection(){
	      return connection;
	   }
	 
	   public void desconectar(){
	      connection = null;
	   }
	
}
