
package DAO;

import Model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CadastroCliente_Dao {
    
    PreparedStatement pst;
    String sql;
   
     public void salvar(Cliente cliente) throws SQLException {
        int Codigo = 0;
        sql = "INSERT INTO cliente values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, cliente.getNome());
         pst.setString(3, cliente.getCpf());
         pst.setString(4, cliente.getRg());
         pst.setString(5, cliente.getTelefone());
        pst.setString(6, cliente.getSexo());
        pst.setDate(7, new java.sql.Date(cliente.getDataNascimento().getTime()));
        pst.setString(8, cliente.getCelular());
        pst.setString(9, cliente.getEndereço());
        pst.setInt(10, cliente.getNumero());
        pst.setString(11, cliente.getBairro());
        pst.setString(12, cliente.getCidade());
        pst.setString(13, "");
        pst.execute();
        pst.close();

    }public void Alterar(Cliente cliente) throws SQLException {

        sql = "Update cliente  set Nome =?, Cpf=?, Rg=?, Telefone=?, Sexo=?, DataNascimento=?,"
                + "Celular=?, Endereço=?, Numero=?, Bairro=?, Cidade=? where Codigo=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, cliente.getNome());
        pst.setString(2, cliente.getCpf());
        pst.setString(3, cliente.getRg());
        pst.setString(4, cliente.getTelefone());
        pst.setString(5, cliente.getSexo());
        pst.setDate(6,new java.sql.Date(cliente.getDataNascimento().getTime()));
        pst.setString(7, cliente.getCelular());
        pst.setString(8, cliente.getEndereço());
        pst.setInt(9, cliente.getNumero());
        pst.setString(10, cliente.getBairro());
        pst.setString(11, cliente.getCidade());
        pst.setInt(12, cliente.getCodigo());
        pst.execute();
        pst.close();
    }
     
     public void ExcluirCliente(int Codigo) throws SQLException
    {
        sql = " delete from cliente where Codigo=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, Codigo);
        pst.execute();
        pst.close();
    }
    public void ExcluirCliente(String cpf) throws SQLException
    {
        sql = " delete from cliente where Cpf=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, cpf);
        pst.execute();
        pst.close();
    }
    
    
    public Cliente getCadastroPorCpf(String Cpf) throws SQLException {
       Cliente cliente = null;
        sql = "Select * from cliente where Cpf=?";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, Cpf);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

            cliente = new Cliente(rs.getInt("Codigo"),rs.getString("Nome"),rs.getString("Cpf"),rs.getString("Rg"),rs.getString("Telefone"), rs.getString("Sexo"),rs.getDate("DataNascimento"), rs.getString("Celular"),
            rs.getString("Endereço"),rs.getInt("Numero"),rs.getString("Bairro"), rs.getString("Cidade"), rs.getString("Status"));
        }

        pst.close();

        return cliente;
    }
    public String validarCpfCliente(String Cpf) throws SQLException {

        String resposta = new String();
        String sql = "select Cpf from cliente where Cpf =?";

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
     public String validarNomeCliente(String Nome) throws SQLException {

        String resposta = new String();
        String sql = "select Nome from cliente where Nome =?";

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
     
      public Cliente getClienteByCodigo(int Codigo) throws SQLException {
        Cliente cliente = null;
        sql = "Select * from cliente where Codigo=?";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, Codigo);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

            cliente = new Cliente(rs.getInt("Codigo"),rs.getString("Nome"),rs.getString("Cpf"),rs.getString("Rg"),rs.getString("Telefone"), rs.getString("Sexo"),rs.getDate("DataNascimento"), rs.getString("Celular"),
            rs.getString("Endereço"),rs.getInt("Numero"),rs.getString("Bairro"), rs.getString("Cidade"), rs.getString("Status"));
        }
        pst.close();

        return cliente;
    }
       public List<Cliente> TodosClientes() throws SQLException {
        Cliente cliente;
        List<Cliente> clientes = new ArrayList<>();
        sql = "Select * from cliente order by Nome";
        Statement st;
        st = Conexao.getInstance().createStatement();
        st.executeQuery(sql);
        ResultSet rs = st.getResultSet();
        while (rs.next()) {

            cliente = new Cliente(rs.getInt("Codigo"),rs.getString("Nome"),rs.getString("Cpf"),rs.getString("Rg"),rs.getString("Telefone"), rs.getString("Sexo"),rs.getDate("DataNascimento"), rs.getString("Celular"),
            rs.getString("Endereço"),rs.getInt("Numero"),rs.getString("Bairro"), rs.getString("Cidade"), rs.getString("Status"));

            clientes.add(cliente);
        }

        st.close();

        return clientes;
    }
       public List<Cliente> TodosClientesAtivos() throws SQLException {
        Cliente cliente;
        List<Cliente> clientes = new ArrayList<>();
        sql = "Select * from cliente where Status =? order by Nome";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, "");
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

            cliente = new Cliente(rs.getInt("Codigo"),rs.getString("Nome"),rs.getString("Cpf"),rs.getString("Rg"),rs.getString("Telefone"), rs.getString("Sexo"),rs.getDate("DataNascimento"), rs.getString("Celular"),
            rs.getString("Endereço"),rs.getInt("Numero"),rs.getString("Bairro"), rs.getString("Cidade"), rs.getString("Status"));

            clientes.add(cliente);

        }

        pst.close();

        return clientes;
    }
        public List<Cliente> TodosClientesInativos() throws SQLException {
        Cliente cliente;
        List<Cliente> clientes = new ArrayList<>();
        sql = "Select * from cliente where Status = ? order by Nome";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, "Removido");
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

            cliente = new Cliente(rs.getInt("Codigo"),rs.getString("Nome"),rs.getString("Cpf"),rs.getString("Rg"),rs.getString("Telefone"), rs.getString("Sexo"),rs.getDate("DataNascimento"), rs.getString("Celular"),
            rs.getString("Endereço"),rs.getInt("Numero"),rs.getString("Bairro"), rs.getString("Cidade"), rs.getString("Status"));

            clientes.add(cliente);
        }
        pst.close();

        return clientes;
    }
        public Cliente getClientePorCpf(String cpf) throws SQLException {
        Cliente cliente = null;
        sql = "Select * from cliente where Cpf=?";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, cpf);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

            cliente = new Cliente(rs.getInt("Codigo"),rs.getString("Nome"),rs.getString("Cpf"),rs.getString("Rg"),rs.getString("Telefone"), rs.getString("Sexo"),rs.getDate("DataNascimento"), rs.getString("Celular"),
            rs.getString("Endereço"),rs.getInt("Numero"),rs.getString("Bairro"), rs.getString("Cidade"), rs.getString("Status"));
        }

        pst.close();

        return cliente;
    }
    
    
}
