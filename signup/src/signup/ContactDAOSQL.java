package signup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ContactDAOSQL {
	private static final String USERNAME = "aminos";
	private static final String PASSWORD = "1234";
	private static final String CONN_STRING = "jdbc:mysql://localhost:3306/users";
	
	
	public void addContact() {
		Connection conn = null;
		
		try {
			conn = (Connection) DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			System.out.println("Connected");
			
			String query = "INSERT INTO contacts_tbl (contact_name,contact_lastname,"
					+ "contact_phoneNume, contact_email) "
					+ " VALUES('Contact.contact_name','Contact.contact_lastname','Contact.contact_phoneNume','Contact.contact_email');";
			Statement st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while (rs.next())
	        {
	          int id = rs.getInt("contactID");
	          String firstName = rs.getString("contact_name");
	          String lastName = rs.getString("contact_lastname");
	          int phoneNum = rs.getInt("contact_phoneNume");
	          String emailAdd = rs.getString("contact_email");

	          // print the results
	          System.out.format("%s, %s, %s, %s, %s\n", id, firstName, lastName, phoneNum, emailAdd);
	        }
	        st.close();
		}catch (SQLException e){
		    System.err.println(e);
	}
}
	
	public void removeContact() {
		Connection conn = null;
		try {
			conn = (Connection) DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			String query = "DELETE FROM contacts_tbl WHERE contact_name = 'Contact.contact_name';";
			Statement st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while (rs.next())
	        {
	          int id = rs.getInt("contactID");
	          String firstName = rs.getString("contact_name");
	          String lastName = rs.getString("contact_lastname");
	          int phoneNum = rs.getInt("contact_phoneNume");
	          String emailAdd = rs.getString("contact_email");

	          // print the results
	          System.out.format("%s, %s, %s, %s, %s\n", id, firstName, lastName, phoneNum, emailAdd);
	        }
	        st.close();
			
		}catch (SQLException e){
		    System.err.println(e);
	}
	
}
	
	public void updateContact() {
		Connection conn = null;
		try {
			conn = (Connection) DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			String query = "UPDATE contacts_tbl SET "
					+ "contact_name = 'Contact.contact_name',contact_lastname='Contact.contact_lastname'"
					+ "contact_phoneNume = 'Contact.contact_phoneNume'"
					+ "contact_email = 'Contact.contact_email';";
			Statement st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while (rs.next())
	        {
	          int id = rs.getInt("contactID");
	          String firstName = rs.getString("contact_name");
	          String lastName = rs.getString("contact_lastname");
	          int phoneNum = rs.getInt("contact_phoneNume");
	          String emailAdd = rs.getString("contact_email");

	          // print the results
	          System.out.format("%s, %s, %s, %s, %s\n", id, firstName, lastName, phoneNum, emailAdd);
	        }
	        st.close();
	        
		}catch (SQLException e){
		    System.err.println(e);
	}
	
	}
	
	public void printContacts(){
		Connection conn = null;
	    
	    try {
	      //  Class.forName("com.mysql.jdbc.Driver");
	        conn = (Connection) DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
	        System.out.println("Connected");
	        
	        
	        String query = "SELECT * FROM contacts_tbl";

	        // create the java statement
	        Statement st = (Statement) conn.createStatement();
	        
	        // execute the query, and get a java resultset
	        ResultSet rs = st.executeQuery(query);
	        
	        // iterate through the java resultset
	        while (rs.next())
	        {
	          int id = rs.getInt("contactID");
	          String firstName = rs.getString("contact_name");
	          String lastName = rs.getString("contact_lastname");
	          int phoneNum = rs.getInt("contact_phoneNume");
	          String emailAdd = rs.getString("contact_email");

	          // print the results
	          System.out.format("%s, %s, %s, %s, %s\n", id, firstName, lastName, phoneNum, emailAdd);
	        }
	        st.close();
	        
	    }catch (SQLException e){
	    System.err.println(e);
	    }		
	}
	
}