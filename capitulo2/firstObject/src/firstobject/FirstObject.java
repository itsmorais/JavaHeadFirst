

package firstobject;

import java.util.Scanner;

public class FirstObject {
        
    
        
       public static void main(String[] args){
           DatabaseConnection db = new DatabaseConnection();
           db.getConexaoMySQL();
           System.out.println( db.statusConnection());
          
          
    }}
      
          
    
    
