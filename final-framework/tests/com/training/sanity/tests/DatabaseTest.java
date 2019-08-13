package com.training.sanity.tests;
import org.testng.annotations.Test;
import  java.sql.Connection;        
import  java.sql.Statement;        
import  java.sql.ResultSet;        
import  java.sql.DriverManager;

public class DatabaseTest {
	@Test
    public void databaseDetails() {
        try {
            // step1 load the driver class
            Class.forName("com.mysql.jdbc.Driver");
            // step2 create the connection object
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/unoform","root","root");
            // step3 create the statement object
            Statement stmt = con.createStatement();
            // step4 execute query
            ResultSet rs = stmt.executeQuery(("select * from login"));
            // While Loop to iterate through all data and print results        
            while (rs.next()){
                        String userName = rs.getString(1);       //we can use more values based on scenario, parameters given                                 
                        String passWord = rs.getString(2);                                                   
                        System. out.println(userName+"  "+passWord);        
                }    
            // closing DB Connection        
              con.close();
        }catch(Exception e) {
            e.printStackTrace();
            // closing DB Connection        
        }
    }

}
