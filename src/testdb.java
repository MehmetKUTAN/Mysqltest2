import java.sql.*;

public class testdb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		String userName = "java";
        String password = "java";
        String url = "jdbc:mysql://localhost:3306/denemeJava";
        try {
			Class.forName ("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection (url, userName, password);
	        System.out.println ("Database bağlantısı gerçekleştirildi");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			System.exit(1);
		}
        catch (SQLException e) {
			// TODO Auto-generated catch block
        	System.err.println(e.getMessage());
			System.exit(1);
		}
        

	}

}
