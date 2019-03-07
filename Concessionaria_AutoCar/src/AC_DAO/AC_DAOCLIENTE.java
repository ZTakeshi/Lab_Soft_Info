/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AC_DAO;

import AC_CONNECTBD.ConexaoAC;
import AC_MODEL.AC_MDCLIENTE;
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
public class AC_DAOCLIENTE {
    
    public void SaveC(AC_MDCLIENTE a){
        
        Connection con = ConexaoAC.OpenConect();
        PreparedStatement stmt = null;
        try {
            
            stmt = con.prepareStatement("INSERT INTO cliente (nome, email, cpf, telefone, rg, "
                 + "cidade, estado, cnh)VALUES(?,?,?,?,?,?,?,?)");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getEmail());
            stmt.setString(3, a.getCpf());
            stmt.setString(4, a.getTelefone());
            stmt.setString(5, a.getRg());
            stmt.setString(6, a.getCidade());
            stmt.setString(7, a.getEstado());
            stmt.setString(8, a.getCnh());
        
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não possível realizar o cadastro."+ex);
        
        }finally{
            
            ConexaoAC.CloseConect(con, stmt);
            
        }
        
        
    }
    
       public List<AC_MDCLIENTE> Mostrar(){
        
        Connection con = ConexaoAC.OpenConect();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<AC_MDCLIENTE> Clientes = new ArrayList<>();
        
        try {
           
            stmt = con.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                
                AC_MDCLIENTE cliente = new AC_MDCLIENTE();
                
                cliente.setIdcliente(rs.getInt("idcliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setRg(rs.getString("rg"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setCnh(rs.getString("cnh"));
                
                
                Clientes.add(cliente);
                
            }
        
        } catch (SQLException ex) {
        
            Logger.getLogger(AC_DAOVEICULOS.class.getName()).log(Level.SEVERE, null, ex);
        
        }finally{
            
            ConexaoAC.CloseConect(con, stmt, rs);
            
        }
        
        return Clientes;
        
    }
    
    public List<AC_MDCLIENTE> BuscarCliente(String nome){
        
        Connection con = ConexaoAC.OpenConect();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<AC_MDCLIENTE> Cliente = new ArrayList<>();
        
        try {
           
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                
                AC_MDCLIENTE cliente = new AC_MDCLIENTE();
                
                cliente.setIdcliente(rs.getInt("idcliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setRg(rs.getString("rg"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setCnh(rs.getString("cnh"));
                
                Cliente.add(cliente);
                
            }
        
        } catch (SQLException ex) {
        
            Logger.getLogger(AC_DAOVEICULOS.class.getName()).log(Level.SEVERE, null, ex);
        
        }finally{
            
            ConexaoAC.CloseConect(con, stmt, rs);
            
        }
        
        return Cliente;
        
    }   
     
       public void AlterarCliente(AC_MDCLIENTE c){
        
        Connection con = ConexaoAC.OpenConect();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE cliente SET nome = ?, estado = ?, cpf = ?, telefone = ?, rg = ?, cidade = ?, estado = ?, cnh = ? WHERE idcliente = ?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getCpf());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getRg());
            stmt.setString(6, c.getCidade());
            stmt.setString(7, c.getEstado());
            stmt.setString(8, c.getCnh());
            stmt.setInt(9, c.getIdcliente());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados alterado com sucesso.");
            
        } catch (SQLException ex) {
         
            JOptionPane.showMessageDialog(null, "Não possível realizar a alteração."+ex);
        
        }finally{
            
            ConexaoAC.CloseConect(con, stmt);
            
        }
        
    } 
    
}
