/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AC_DAO;

import AC_CONNECTBD.ConexaoAC;
import AC_MODEL.AC_MDVEICULOS;
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
public class AC_DAOVEICULOS {
    
    public void SaveCar(AC_MDVEICULOS v){
        
        Connection con = ConexaoAC.OpenConect();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO veiculos (modelo, fabricante, cor, ano, preco, chassi)"
                    + "VALUES(?,?,?,?,?,?)");
            stmt.setString(1, v.getModelo());
            stmt.setString(2, v.getFabricante());
            stmt.setString(3, v.getCor());
            stmt.setInt(4, v.getAno());
            stmt.setDouble(5, v.getPreco());
            stmt.setString(6, v.getChassi());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Veículo cadastro com sucesso.");
            
        } catch (SQLException ex) {
         
            JOptionPane.showMessageDialog(null, "Não possível realizar o cadastro do veículo."+ex);
        
        }finally{
            
            ConexaoAC.CloseConect(con, stmt);
            
        }
        
    }
    
    public List<AC_MDVEICULOS> Listar(){
        
        Connection con = ConexaoAC.OpenConect();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<AC_MDVEICULOS> Veiculos = new ArrayList<>();
        
        try {
           
            stmt = con.prepareStatement("SELECT * FROM veiculos");
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                
                AC_MDVEICULOS veiculo = new AC_MDVEICULOS();
                
                veiculo.setIdveiculos(rs.getInt("idveiculos"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setFabricante(rs.getString("fabricante"));
                veiculo.setCor(rs.getString("cor"));
                veiculo.setAno(rs.getInt("ano"));
                veiculo.setPreco(rs.getDouble("preco"));
                veiculo.setChassi(rs.getString("chassi"));
                
                Veiculos.add(veiculo);
                
            }
        
        } catch (SQLException ex) {
        
            Logger.getLogger(AC_DAOVEICULOS.class.getName()).log(Level.SEVERE, null, ex);
        
        }finally{
            
            ConexaoAC.CloseConect(con, stmt, rs);
            
        }
        
        return Veiculos;
        
    }
    
    public List<AC_MDVEICULOS> BuscarModelo(String mode){
        
        Connection con = ConexaoAC.OpenConect();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<AC_MDVEICULOS> Veiculos = new ArrayList<>();
        
        try {
           
            stmt = con.prepareStatement("SELECT * FROM veiculos WHERE modelo LIKE ?");
            stmt.setString(1, "%"+mode+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                
                AC_MDVEICULOS veiculo = new AC_MDVEICULOS();
                
                veiculo.setIdveiculos(rs.getInt("idveiculos"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setFabricante(rs.getString("fabricante"));
                veiculo.setCor(rs.getString("cor"));
                veiculo.setAno(rs.getInt("ano"));
                veiculo.setPreco(rs.getDouble("preco"));
                veiculo.setChassi(rs.getString("chassi"));
                
                Veiculos.add(veiculo);
                
            }
        
        } catch (SQLException ex) {
        
            Logger.getLogger(AC_DAOVEICULOS.class.getName()).log(Level.SEVERE, null, ex);
        
        }finally{
            
            ConexaoAC.CloseConect(con, stmt, rs);
            
        }
        
        return Veiculos;
        
    }
    
    
    public void Alterar(AC_MDVEICULOS v){
        
        Connection con = ConexaoAC.OpenConect();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE veiculos SET modelo = ?, fabricante = ?, cor = ?, ano = ?, preco = ?, chassi = ? WHERE idveiculos = ?");
            stmt.setString(1, v.getModelo());
            stmt.setString(2, v.getFabricante());
            stmt.setString(3, v.getCor());
            stmt.setInt(4, v.getAno());
            stmt.setDouble(5, v.getPreco());
            stmt.setString(6, v.getChassi());
            stmt.setInt(7, v.getIdveiculos());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso.");
            
        } catch (SQLException ex) {
         
            JOptionPane.showMessageDialog(null, "Não possível realizar a alteração."+ex);
        
        }finally{
            
            ConexaoAC.CloseConect(con, stmt);
            
        }
        
    }
    
     public void delete(AC_MDVEICULOS d){
    
    Connection con = ConexaoAC.OpenConect();
    PreparedStatement stmt = null;
    
        try {
            
            stmt = con.prepareStatement("DELETE FROM veiculos WHERE modelo = ?");
            stmt.setString(1, d.getModelo());
             
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(AC_DAOVENDAS.class.getName()).log(Level.SEVERE, null, ex);
        
        }finally{
        
        ConexaoAC.CloseConect(con, stmt);
            
        }
    
}   
    
}
