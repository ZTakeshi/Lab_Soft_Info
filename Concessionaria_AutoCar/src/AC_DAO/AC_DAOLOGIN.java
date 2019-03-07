/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AC_DAO;

import AC_CONNECTBD.ConexaoAC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LucasxTakeshi
 */
public class AC_DAOLOGIN {
    
    public boolean VerificarLogin(String login, String senha){
        
        Connection con = ConexaoAC.OpenConect();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        boolean Verifica = false;
        
        try {  
            
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                Verifica = true;
                
            }
        
        }catch (SQLException ex) {
        
            Logger.getLogger(AC_DAOUSUARIO.class.getName()).log(Level.SEVERE, null, ex);
        
        }finally{
            
            ConexaoAC.CloseConect(con, stmt, rs);
            
        }
        
        return Verifica;
        
    }
    
}
