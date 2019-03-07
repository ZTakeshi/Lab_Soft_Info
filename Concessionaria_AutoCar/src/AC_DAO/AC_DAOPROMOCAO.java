/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AC_DAO;

import AC_CONNECTBD.ConexaoAC;
import AC_MODEL.AC_MDPROMOCAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LucasxTakeshi
 */
public class AC_DAOPROMOCAO {
    
    public void SavePromo(AC_MDPROMOCAO p){
        
        Connection con = ConexaoAC.OpenConect();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO promocao (modelo, fabricante, preco, chassi, promocao)"
                    + "VALUES(?,?,?,?,?)");
            stmt.setString(1, p.getModelo());
            stmt.setString(2, p.getFabricante());
            stmt.setFloat(3, p.getPreco());
            stmt.setString(4, p.getChassi());
            stmt.setString(5, p.getPromocao());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Promoção cadastrada com sucesso.");
            
        } catch (SQLException ex) {
         
            JOptionPane.showMessageDialog(null, "Não possível cadastrar a promoção."+ex);
        
        }finally{
            
            ConexaoAC.CloseConect(con, stmt);
            
        }
        
    }
    
      public List<AC_MDPROMOCAO> Listar(){
        
        Connection con = ConexaoAC.OpenConect();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<AC_MDPROMOCAO> Promocao = new ArrayList<>();
        
        try {
           
            stmt = con.prepareStatement("SELECT * FROM promocao");
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                
                AC_MDPROMOCAO promocao = new AC_MDPROMOCAO();
                
                promocao.setModelo(rs.getString("modelo"));
                promocao.setFabricante(rs.getString("fabricante"));
                promocao.setPreco(rs.getFloat("preco"));
                promocao.setChassi(rs.getString("chassi"));
                promocao.setPromocao(rs.getString("promocao"));
                
                Promocao.add(promocao);
                
            }
        
        } catch (SQLException ex) {
        
            Logger.getLogger(AC_DAOVEICULOS.class.getName()).log(Level.SEVERE, null, ex);
        
        }finally{
            
            ConexaoAC.CloseConect(con, stmt, rs);
            
        }
        
        return Promocao;
        
    }
    
}
