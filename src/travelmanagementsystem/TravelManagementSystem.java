/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package travelmanagementsystem;

/**
 *
 * @author kaksh
 */
import java.sql.*;
public class TravelManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{  
Class.forName("com.mysql.jdbc.Driver");  
//here sonoo is database name, root is username and password
            try (java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem","root","Amk@2000")) {
                //here sonoo is database name, root is username and password
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from abc");
                while(rs.next())
                    System.out.println(rs.getInt(1));  
            }
}catch(Exception e){ System.out.println(e);}  
    }
    
}
