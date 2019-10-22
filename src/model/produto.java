package model;

public class produto {

    private String nome;
    private Double preco;

    public produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco(Double preco) {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
  }

    @Override
    public String toString() {
        return "produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
