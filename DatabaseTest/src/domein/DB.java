package domein;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/imdb?user=root&password=root");
			PreparedStatement st = con.prepareStatement("Select * from persons;");
			ResultSet rs = st.executeQuery();
			System.out.println(st);
			
			while (rs.next()) {
		        // ... do something with result set
				System.out.printf("%s, %S, %s %n",rs.getString(1), rs.getString(2), rs.getString(3));
		      }
			
			 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//jdbc:mysql://127.0.0.1:3306/?user=root
		//root@127.0.0.1:3306
	}

}
