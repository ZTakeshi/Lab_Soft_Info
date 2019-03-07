/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AC_DAO;

import AC_CONNECTBD.ConexaoAC;
import AC_MODEL.AC_MDCOMISSAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LucasxTakeshi
 */
public class AC_DAOCOMISSAO {
    
    public void SaveCom(AC_MDCOMISSAO c){
        
        Connection con = ConexaoAC.OpenConect();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO comissao (funcionario, chassi, desconto, valor, comissao)"
                    + "VALUES(?,?,?,?,?)");
            stmt.setString(1, c.getFuncionario());
            stmt.setString(2, c.getChassi());
            stmt.setString(3, c.getDesconto());
            stmt.setFloat(4, c.getValor());
            stmt.setFloat(5, c.getComissao());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Comissão realizada.");
            
        } catch (SQLException ex) {
         
            JOptionPane.showMessageDialog(null, "Não possível estabelecer uma comissão."+ex);
        
        }finally{
            
            ConexaoAC.CloseConect(con, stmt);
            
        }
        
    }
    
     public void delete(AC_MDCOMISSAO d){
    
    Connection con = ConexaoAC.OpenConect();
    PreparedStatement stmt = null;
    
        try {
            
            stmt = con.prepareStatement("DELETE FROM comissao WHERE funcionario = ?");
            stmt.setString(1, d.getFuncionario());
             
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(AC_DAOVENDAS.class.getName()).log(Level.SEVERE, null, ex);
        
        }finally{
        
        ConexaoAC.CloseConect(con, stmt);
            
        }
    
}   
    
}
