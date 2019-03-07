/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AC_DAO;

import AC_CONNECTBD.ConexaoAC;
import AC_MODEL.AC_MDVENDAS;
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
public class AC_DAOVENDAS {
    private Object ConnectionFactory;
    
    public void SaveV(AC_MDVENDAS f){
        
        Connection con = ConexaoAC.OpenConect();
        PreparedStatement stmt = null;
        try {
            
            stmt = con.prepareStatement("INSERT INTO vendas (nomefunc, nomeclie, servicosadd, desconto, valortotal, "
                 + "formapag, chassi, data)VALUES(?,?,?,?,?,?,?,?)");
            stmt.setString(1, f.getNomefunc());
            stmt.setString(2, f.getNomeclie());
            stmt.setString(3, f.getServicosadd());
            stmt.setString(4, f.getDesconto());
            stmt.setDouble(5, f.getValortotal());
            stmt.setString(6, f.getFormapag());
            stmt.setString(7, f.getChassi());
            stmt.setString(8, f.getData());
        
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso.");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não possível realizar a venda."+ex);
        
        }finally{
            
            ConexaoAC.CloseConect(con, stmt);
            
        }
    
    }

       public List<AC_MDVENDAS> Listar(){
        
        Connection con = ConexaoAC.OpenConect();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<AC_MDVENDAS> Vendas = new ArrayList<>();
        
        try {
           
            stmt = con.prepareStatement("SELECT * FROM vendas");
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                
                AC_MDVENDAS venda = new AC_MDVENDAS();
                
                venda.setNomefunc(rs.getString("nomefunc"));
                venda.setNomeclie(rs.getString("nomeclie"));
                venda.setServicosadd(rs.getString("servicosadd"));
                venda.setDesconto(rs.getString("desconto"));
                venda.setValortotal(rs.getDouble("valortotal"));
                venda.setChassi(rs.getString("chassi"));
                
                Vendas.add(venda);
                
            }
        
        } catch (SQLException ex) {
        
            Logger.getLogger(AC_DAOVEICULOS.class.getName()).log(Level.SEVERE, null, ex);
        
        }finally{
            
            ConexaoAC.CloseConect(con, stmt, rs);
            
        }
        
        return Vendas;
        
    }
    
    public void delete(AC_MDVENDAS p){
    
    Connection con = ConexaoAC.OpenConect();
    PreparedStatement stmt = null;
    
        try {
            
            stmt = con.prepareStatement("DELETE FROM vendas WHERE nomefunc = ?");
            stmt.setString(1, p.getNomefunc());
             
            stmt.executeUpdate();
             
            JOptionPane.showMessageDialog(null, "Relatorio excluido com sucesso.");
            
        } catch (SQLException ex) {
            Logger.getLogger(AC_DAOVENDAS.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        
        ConexaoAC.CloseConect(con, stmt);
            
        }
    
}   
       
}
