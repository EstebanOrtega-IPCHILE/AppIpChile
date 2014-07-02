package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conexion {

	Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    	    public static Connection conectorBd(){
    	        try{
    	           	Class.forName("com.mysql.jdbc.Driver");
    	            Connection conn = DriverManager.getConnection("jdbc:mysql://mysql.betatest.cl:3306/android2","anbd12014","ucsaoc");
    	            System.out.println("ok");
    	            return conn;
    	        
    	        
    	        }catch(Exception e){
    	           	System.out.println("No");
    	            return null;
    	        
    	            
    	        }
    	    } 
	
}
