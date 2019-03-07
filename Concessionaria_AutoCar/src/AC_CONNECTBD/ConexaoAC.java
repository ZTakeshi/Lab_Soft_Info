package AC_CONNECTBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LucasxTakeshi
 */
public class ConexaoAC {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String LINK = "jdbc:mysql://localhost/concessionariaautocar";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    
    public static Connection OpenConect(){
        
        try {
           
            Class.forName(DRIVER);
            return DriverManager.getConnection(LINK, USUARIO, SENHA);
            
        } catch (ClassNotFoundException | SQLException ex) {
            
            throw new RuntimeException("Eroo na conexão com o banco de dados.",ex);
        
        }
        
    }
    
    public static void CloseConect(Connection con){
        
            
            try {
                
                if (con != null) {
                
                    con.close();
                
                }
            } catch (SQLException ex) {
               
                Logger.getLogger(ConexaoAC.class.getName()).log(Level.SEVERE, null, ex);
            
            }
       
    }
   
    public static void CloseConect(Connection con, PreparedStatement stmt){
        
        CloseConect(con);
            
        try {
                
            if (stmt != null) {
                   
                stmt.close();
               
            }
             
        } catch (SQLException ex) {
               
            Logger.getLogger(ConexaoAC.class.getName()).log(Level.SEVERE, null, ex);
            
        }
       
    }
  
    public static void CloseConect(Connection con, PreparedStatement stmt, ResultSet rs){
        
        CloseConect(con, stmt);
            
        try {
                
            if (rs != null) {
                
                rs.close();
                
            }
             
        } catch (SQLException ex) {
               
            Logger.getLogger(ConexaoAC.class.getName()).log(Level.SEVERE, null, ex);
            
        }
       
    }    
    
}
