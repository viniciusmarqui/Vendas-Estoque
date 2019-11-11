
package DAO;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexao implements Serializable
{
    //private static Conexao conexao = null;
    private static Connection connection;
    private String usuario;
    private String senha;
    private String url;
    
    public Conexao() {
        usuario = "root";
        senha = "";
        url = "jdbc:mysql://localhost:3306/mecanica";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar com o banco de dados\n"
                    + "Entre em contato com o desenvolvedor!", "Sistema - Erro de conexão com banco de dados",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public static Connection getInstance() {
        Object conexao = null;
        if (connection == null) {
            synchronized (Conexao.class) {
                conexao = new Conexao();
            }
        }
        return connection;
    }

    public static void closeInstance() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
