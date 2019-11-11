
package DAO;

import Model.Login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login_Dao {
    
    PreparedStatement pst;
    String sql;
    
    public boolean autenticar(Login login) throws SQLException, NullPointerException
    {
        sql = "Select * from login where Usuario =?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, login.getUsuario());
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        Login checkLogin = null;
        while (rs.next()) {

            checkLogin = new Login(rs.getString("Usuario"), rs.getString("Senha"));
        }

        pst.close();
        
        boolean resultado = false;
       
        if (checkLogin.getSenha().equals(login.getSenha())) {
            resultado = true;
        }
        return resultado;
    }
    
    
}

