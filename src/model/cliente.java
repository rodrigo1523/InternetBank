package model;

public class cliente {

    private String nome;
    private String cpf;
    private conta conta;

    public cliente(String nome, String cpf, conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public model.conta getConta() {
        return conta;
    }

    public void setConta(model.conta conta) {
        this.conta = conta;
    }

    public void fecharConta(){

    }

           public String toString(){
            return "Cliente{" + "nome='" + nome + '\'' +
                    ",cpf ='" + cpf + '\'' +
                    ", conta=" + conta + '}';

    }
}
