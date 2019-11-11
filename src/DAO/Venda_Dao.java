package DAO;

import Model.Venda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Venda_Dao {

    public void salvar(Venda venda) throws SQLException {
        PreparedStatement pst;
        String sql;

        sql = "INSERT INTO venda set Codigo = ?, Data = ?, Id_Produto = ? , Id_Funcionario = ?,  Id_Cliente = ?";
        pst = Conexao.getInstance().prepareStatement(sql);

        pst.setInt(1, '1');
        pst.setString(2, venda.getData());
        pst.setString(3, venda.getId_Produto());
        pst.setString(4, venda.getId_Funcionario());
        pst.setString(5, venda.getId_Cliente());

        pst.execute();
        pst.close();
    }

    public List<Venda> listaTodos() throws SQLException {
        PreparedStatement pst;
        String sql;
        List<Venda> listavenda = new ArrayList<>();

        sql = "select  *from venda ";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            listavenda.add(new Venda(
                    rs.getInt("Codigo"),
                    rs.getString("Data"),
                    rs.getString("Id_Produto"),
                     rs.getString("Id_Funcionario"),
                    rs.getString("Id_Cliente")));
        }

        pst.close();
        return listavenda;
    }

}
