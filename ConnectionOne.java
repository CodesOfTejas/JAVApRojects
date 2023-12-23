package BankManagementSystem;

import java.sql.*;
/**
 *
 * @author TEJAS KATE
 */
public class ConnectionOne {
    Connection c;
    Statement s;
    public ConnectionOne(){
     
         try{
            //for register the driver we have one class called Class inside that we have one method "fprName"
            //Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","abc456");
            
            s = c.createStatement();
            
            
            
            
    }catch(Exception e){
        
            System.out.println(e);
    }
    
    }
}