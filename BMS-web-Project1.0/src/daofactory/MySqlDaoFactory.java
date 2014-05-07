package daofactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDaoFactory extends DaoFactory {
	
	
	
	public static Connection obtenerConexion(){
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/travelsure";			
			con = DriverManager.getConnection(url, "root", "root");

			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		
		return con;
	}

	
	
	
	

	

	

}
