
package DAO;

import Model.Cliente;
import Model.Funcionario;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CadastroFuncionario_Dao implements Serializable
{
   PreparedStatement pst;
    String sql;
   
     public void Salvar(Funcionario funcionario) throws SQLException {
        int Codigo = 0;
        sql = "INSERT INTO funcionario(Nome, Setor, Cpf, Status) VALUES(?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, funcionario.getNome());
        pst.setString(2, funcionario.getSetor());
        pst.setString(3, funcionario.getCpf());
        pst.setString(4, "ativo");
        pst.execute();
        pst.close();

    }
     public void ExcluirFuncionario(int Codigo) throws SQLException
    {
        sql = " delete from funcionario where Codigo=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, Codigo);
        pst.execute();
        pst.close();
    }
    
    
    
    public Funcionario getPesquisaPorCpf(String Cpf) throws SQLException {
       Funcionario funcionario = null;
        sql = "Select * from funcionario where Cpf=?";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, Cpf);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

            funcionario = new Funcionario(rs.getString("Nome"), rs.getString("Setor"),rs.getInt("Codigo"),rs.getString("Cpf"), rs.getString("Status"));
        }

        pst.close();

        return funcionario;
    }
    public String validarCpfFuncionario(String Cpf) throws SQLException {

        String resposta = new String();
        String sql = "select Cpf from funcionario where Cpf =?";

        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, Cpf);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

           resposta = rs.getString("Cpf");

        }
        rs.close();
        pst.close();

        return resposta;
    }
     public String validarNomeFuncionario(String Nome) throws SQLException {

        String resposta = new String();
        String sql = "select Nome from funcionario where Nome =?";

        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, Nome);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

            resposta = rs.getString("Nome");

        }
        rs.close();
        pst.close();

        return resposta;
    }
      public void Alterar( Funcionario Fun) throws SQLException {
        sql = "Update funcionario set Nome =?, Setor=?, Cpf=? where Codigo=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, Fun.getNome());
        pst.setString(2, Fun.getSetor()); 
        pst.setString(3, Fun.getCpf());
        pst.setInt(4, Fun.getCodigo());
        pst.execute();
        pst.close();
    }
      public Funcionario getFuncionariobyCodigo(int Codigo) throws SQLException {
        Funcionario funcionario = null;
        sql = "Select * from funcionario where Codigo=?";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, Codigo);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

            funcionario = new Funcionario(rs.getString("Nome"), rs.getString("Setor"),rs.getInt("Codigo"), rs.getString("Cpf"), rs.getString("Status"));

        }

        pst.close();

        return funcionario;
    }
      public Funcionario getFuncionarioPorCpf(String Cpf) throws SQLException {
        Funcionario funcionario = null;
        sql = "Select * from funcionario where Cpf=?";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, Cpf);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

            funcionario = new Funcionario(rs.getString("Nome"), rs.getString("Setor"),rs.getInt("Codigo"),rs.getString("Cpf"), rs.getString("Status"));
        }

        pst.close();

        return funcionario;
    }
      public List<Funcionario> TodosFuncionariosAtivos() throws SQLException {
        Funcionario funcionario;
        List<Funcionario> funcionarios = new ArrayList<>();
        sql = "Select * from funcionario order by Nome";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        //pst.setString(1, "");
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
    
            funcionario = new Funcionario( rs.getString("Nome"), rs.getString("Setor"),rs.getInt("Codigo"), rs.getString("Cpf"), rs.getString("Status"));

            funcionarios.add(funcionario);
        }

        pst.close();

        return funcionarios;
    }
    
       public List<Funcionario> TodosFuncionarios() throws SQLException {
        Funcionario funcionario;
        List<Funcionario> funcionarios = new ArrayList<>();
        sql = "Select * from funcionario order by Nome";
        Statement st;
        st = Conexao.getInstance().createStatement();
        st.executeQuery(sql);
        ResultSet rs = st.getResultSet();
        while (rs.next()) {

            funcionario = new Funcionario(rs.getString("Nome"), rs.getString("Setor"), rs.getInt("Codigo"), rs.getString("Cpf"), rs.getString("Status"));

            funcionarios.add(funcionario);
        }

        st.close();

        return funcionarios;
    }
       public List<Funcionario> TodosFuncionariosInativos() throws SQLException {
        Funcionario funcionario;
        List<Funcionario> funcionarios = new ArrayList<>();
        sql = "Select * from funcionario where Status = ? order by Nome";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, "Removido");
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

             funcionario = new Funcionario(rs.getString("Nome"), rs.getString("Setor"), rs.getInt("Codigo"), rs.getString("Cpf"), rs.getString("Status"));

            funcionarios.add(funcionario);
        }
        pst.close();

        return funcionarios;
    }
}
