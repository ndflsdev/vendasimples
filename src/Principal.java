
import Produto.*;
import Venda.Venda;

public class Principal {
    public static void main(String[] args) {
        Estoque motorolag10 = new Estoque(" Motorola g10 ", 1, 1000.0, "Motorola", "64GB", 15);
        Estoque iphone13 = new Estoque(" Iphone 13 ", 2, 4500.0, "Apple", "128GB", 7);
        Estoque samsungs21 = new Estoque(" Samsung S21  ", 3, 1521.99, "Samsung", "64GB", 8);
        new Estoque(" Samsung Galaxy Pocket ", 1, 599.0, "Samsung", "32GB", 2);
        Estoque g15 = new Estoque(" Motorola G15 ", 4, 1299.0, "Motorola", "128GB", 10);
        Venda venda1 = new Venda("Dinheiro", 3, motorolag10);
        venda1.emitirCupom();
        new Venda("Cartão de Credito 10x", 1, iphone13);
        venda1.emitirCupom();
        new Venda("PIX", 15, samsungs21);
        venda1.emitirCupom();
        new Venda("Dinheiro", 3, g15);
        venda1.emitirCupom();
    }
}
