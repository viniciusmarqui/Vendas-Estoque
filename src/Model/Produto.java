
package Model;

public class Produto 
{
    private int Codigo;
    private String Descricao;
    private String marca;
    private float qntestoque;
    private float precovenda;
    private float Valor;
    private String Fabricante;
    private String Status;
    
    public Produto(int Codigo, String Descricao, String Marca,float qntestoque, float precovenda, float Valor, String Fabricante,  String Status)
    {
        this.Codigo = Codigo;
        this.Descricao = Descricao;
        this.marca = Marca;
        this.qntestoque = qntestoque;
        this.precovenda = precovenda;
        this.Valor = Valor;
        this.Fabricante = Fabricante;
        this.Status = Status;
        
    }

    public float getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(float precovenda) {
        this.precovenda = precovenda;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getQntestoque() {
        return qntestoque;
    }

    public void setQntestoque(float qntestoque) {
        this.qntestoque = qntestoque;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
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

    
}
