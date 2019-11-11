
package Model;

public class Produto 
{
    private int Codigo;
    private String Descricao;
    private float Valor;
    private String Fabricante;
    private int Quantidade;
    private String Status;
    
    public Produto(int Codigo, String Descricao, float Valor, String Fabricante, int Quantidade, String Status)
    {
        this.Codigo = Codigo;
        this.Descricao = Descricao;
        this.Valor = Valor;
        this.Fabricante = Fabricante;
        this.Quantidade = Quantidade;
        this.Status = Status;
        
    }
    public Produto()
    {
        
    }



    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
    
}
