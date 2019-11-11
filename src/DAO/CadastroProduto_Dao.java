
package DAO;

import Model.Cliente;
import Model.Funcionario;
import Model.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CadastroProduto_Dao 
{
    PreparedStatement pst;
    String sql;
   
     public void Salvar(Produto produto) throws SQLException {
        int Codigo = 0;
        sql = "INSERT INTO `produto` (`Codigo`, `Descricao`, `Valor`, `Fabricante`, `Quantidade`, `Status`) VALUES (?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, produto.getDescricao());
        pst.setFloat(3, (float) produto.getValor());
        pst.setString(4, produto.getFabricante());
        pst.setInt(5, produto.getQuantidade());
        pst.setString(6, "");
        pst.execute();
        pst.close();

    }
     public void ExcluirProduto(int Codigo) throws SQLException
    {
        sql = " delete from produto where Codigo=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, Codigo);
        pst.execute();
        pst.close();
    }
    
    
      public void Alterar( Produto Pro) throws SQLException {
        sql = "Update produto set Descricao =?, Valor=?, Fabricante=?, Quantidade=? where Codigo=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, Pro.getDescricao());
        pst.setDouble(2, Pro.getValor());
        pst.setString(3, Pro.getFabricante());
        pst.setInt(4, Pro.getQuantidade());
        pst.setInt(5, Pro.getCodigo());
        pst.execute();
        pst.close();
    }
      public Produto getProdutobyCodigo(int Codigo) throws SQLException {
        Produto produto = null;
        sql = "Select * from produto WHERE Codigo=?";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, Codigo);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

            produto = new Produto(rs.getInt("Codigo"),rs.getString("Descricao"), (float) rs.getDouble("Valor"), rs.getString("Fabricante"), rs.getInt("Quantidade"),rs.getString("Status"));

        }

        pst.close();

        return produto;
    }
      public List<Produto> TodosProdutosAtivos() throws SQLException {
        Produto produto;
        List<Produto> produtos = new ArrayList<>();
        sql = "Select * from produto order by codigo";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
//        pst.setString(1, "");
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
    
            produto = new Produto(rs.getInt("Codigo"),rs.getString("Descricao"),rs.getFloat("Valor"),rs.getString("Fabricante"),rs.getInt("Quantidade"),rs.getString("Status"));
            
            produtos.add(produto);
        }

        pst.close();

        return produtos;
    }
           public List<Produto> TodosProdutos() throws SQLException {
        Produto produto;
        List<Produto> produtos = new ArrayList<>();
        sql = "Select * from produto order by Nome";
        Statement st;
        st = Conexao.getInstance().createStatement();
        st.executeQuery(sql);
        ResultSet rs = st.getResultSet();
        while (rs.next()) {

            produto = new Produto(rs.getInt("Codigo"),rs.getString("Descricao"),rs.getFloat("Valor"),rs.getString("Fabricante"),rs.getInt("Quantidade"),rs.getString("Status"));

            produtos.add(produto);
        }

        st.close();

        return produtos;
    }
       public List<Produto> TodosProdutosInativos() throws SQLException {
        Produto produto;
        List<Produto> produtos = new ArrayList<>();
        sql = "Select * from produto where Status =? order by Nome";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, "Removido");
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {

             produto = new Produto(rs.getInt("Codigo"),rs.getString("Descricao"),rs.getFloat("Valor"),rs.getString("Fabricante"),rs.getInt("Quantidade"),rs.getString("Status"));

            produtos.add(produto);
        }
        pst.close();

        return produtos;
    }
      
}
