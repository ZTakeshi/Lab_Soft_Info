package AC_DAO;

import AC_CONNECTBD.ConexaoAC;
import AC_MODEL.AC_MDUSUARIO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LucasxTakeshi
 */
public class AC_DAOUSUARIO {
    
    public void save(AC_MDUSUARIO c){
        
        Connection con = ConexaoAC.OpenConect();
        PreparedStatement stmt = null;
        try {
            
            stmt = con.prepareStatement("INSERT INTO usuario (nome, email, CPF, telefone, RG, "
                 + "endereco, login, senha)VALUES(?,?,?,?,?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getCPF());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getRG());
            stmt.setString(6, c.getEndereco());
            stmt.setString(7, c.getLogin());
            stmt.setString(8, c.getSenha());
        
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não possível realizar o cadastro."+ex);
        
        }finally{
            
            ConexaoAC.CloseConect(con, stmt);
            
        }
        
        
    }
    
}
