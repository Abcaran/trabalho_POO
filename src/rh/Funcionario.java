package rh;


public class Funcionario {
    private String nome;
    private String cpf;
    private String cep;
    private boolean alocado;

    public Funcionario() {
    }
    
    public Funcionario(String nome, String cpf, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
        this.alocado = false;
    }
    
    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private void setCep(String cep) {
        this.cep = cep;
    }
 
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCep() {
        return cep;
    }
    
    public void alocaFuncionario() {
        this.alocado = true;
    }
    
    public void desalocaFuncionario(){
        this.alocado = false;
    }
    
    public boolean isAlocado(){
        return this.alocado;
    }
}
