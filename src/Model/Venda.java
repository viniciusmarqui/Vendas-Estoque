
package Model;


public class Venda {
    
    private int Codigo;
    private String Data;
    private String Id_Produto;
    private String Id_Funcionario;
    private String Id_Cliente;
    
    public Venda()
    {
        
    }
    
     public Venda(int Codigo, String Data, String Id_Produto,String Id_Funcionario, String Id_Cliente) {
        this.Codigo = Codigo;
        this.Data = Data;
        this.Id_Produto = Id_Produto;
        this.Id_Funcionario = Id_Funcionario;
        this.Id_Cliente = Id_Cliente;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getId_Produto() {
        return Id_Produto;
    }

    public void setId_Produto(String Id_Produto) {
        this.Id_Produto = Id_Produto;
    }

    public String getId_Funcionario() {
        return Id_Funcionario;
    }

    public void setId_Funcionario(String Id_Funcionario) {
        this.Id_Funcionario = Id_Funcionario;
    }

    public String getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(String Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }
     
     
}
