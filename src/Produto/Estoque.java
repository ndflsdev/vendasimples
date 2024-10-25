package Produto;

public class Estoque {
    private String nome;
    private int codigo;
    private double valor;
    private String marca;
    private String descricao;
    private int estoque;

    public Estoque(String nome, int codigo, double valor, String marca, String descricao, int estoqueIncial) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.marca = marca;
        this.descricao = descricao;
        this.estoque = estoqueIncial;
    }

    public void atualizarEstoque(int QuantidadeVendida) {
        if (QuantidadeVendida <= this.estoque) {
            this.estoque -= QuantidadeVendida;
            System.out.println("Estoque atualizado. Estoque restante: " + this.estoque);
        } else {
            System.out.println("Estoque insuficiente");
        }

    }

    public String getNome() {
        return this.nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public double getValor() {
        return this.valor;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String toString() {
        return "Nome do Produto: " + this.nome + " Marca: " + this.marca + " Codigo: " + this.codigo + " Preço: R$" + this.valor;
    }
}