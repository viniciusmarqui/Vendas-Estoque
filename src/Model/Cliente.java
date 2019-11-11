

package Model;

import java.util.Date;


public class Cliente 
{
    private int Codigo;
    private String Nome;
    private String Cpf;
    private String Rg;
    private String Telefone;
    private String Sexo;
    private Date DataNascimento;
    private String Celular;
    private String Endereço;
    private int Numero;
    private String Bairro;
    private String Cidade;
    private String Status;
    
    public Cliente (int Codigo,String Nome, String Cpf, String Rg,String Telefone, String Sexo, Date DataNascimento, String Celular,
            String Endereço, int Numero, String Bairro, String Cidade, String Status)
    {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Rg = Rg;
        this.Telefone = Telefone;
        this.Sexo = Sexo;
        this.DataNascimento = DataNascimento;
        this.Celular = Celular;
        this.Endereço = Endereço;
        this.Numero = Numero;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Status = Status;
    }

    
    
    public Cliente()
    {
        
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
}
