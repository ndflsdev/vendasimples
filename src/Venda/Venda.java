
package Venda;

import Produto.Estoque;

public class Venda {
    private String formaDePagamento;
    private int quantidadeVendida;
    private Estoque produto;
    private Estoque valor;
    private Estoque codigo;

    public Venda(String formaDePagamento, int quantidadeVendida, Estoque estoque) {
        this.formaDePagamento = formaDePagamento;
        this.quantidadeVendida = quantidadeVendida;
        this.produto = estoque;
    }

    public int getQuantidadeVendida() {
        return this.quantidadeVendida;
    }

    public String getFormaDePagamento() {
        return this.formaDePagamento;
    }

    public void emitirCupom() {
        if (this.produto == null) {
            System.out.println("Erro: Produto não vinculado à venda.");
        } else {
            double valorTotal = this.produto.getValor() + (double)this.quantidadeVendida;
            System.out.println("   ");
            System.out.println("   ");
            System.out.println("*********CUPOM FISCAL**********");
            System.out.println("Produto: " + this.produto.getNome());
            System.out.println("Codigo: " + this.produto.getCodigo());
            System.out.println("Valor: R$" + this.produto.getValor());
            System.out.println("Quantidade: " + this.quantidadeVendida);
            System.out.println("Forma de Pagamento: " + this.formaDePagamento);
            System.out.println("*********CUPOM FISCAL**********");
            System.out.println("   ");
            System.out.println("   ");
            System.out.println("   ");

            this.produto.atualizarEstoque(this.quantidadeVendida);
        }
    }
}
