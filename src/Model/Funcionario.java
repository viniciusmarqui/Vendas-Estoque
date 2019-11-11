
package Model;

public class Funcionario 
{
    private String Nome;
    private String Setor;
    private int Codigo;
    private String Cpf;
    private String Status;
    
    public Funcionario(String Nome, String Setor, int Codigo, String Cpf, String Status)
    {
        this.Nome = Nome;
        this.Setor = Setor;
        this.Codigo = Codigo;
        this.Cpf = Cpf;
        this.Status = Status;
        
    }

    
    public Funcionario()
    {
        
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSetor() {
        return Setor;
    }

    public void setSetor(String Setor) {
        this.Setor = Setor;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
}
