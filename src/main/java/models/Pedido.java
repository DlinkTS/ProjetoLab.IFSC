package models;

import java.io.Serializable;

/**
 * Classe para objetos do tipo Pedido, onde serão contidos, valores e métodos
 * para o mesmo.
 *
 * @author nathan
 *
 */
public class Pedido implements Serializable {

    private int id;
    private final Produto produto;
    private final int quantidade;
    private final double total;

    /**
     * Método responsável por criar uma nova instancia da classe Pedido Há
     * atribuição do total possui um calculo, onde se multiplica a quantidade
     * pelo preço da unidade do produto
     *
     * @param produto - produto selecionado
     * @param quantidade - quantidade do produto
     *
     */
    public Pedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;

        this.total = this.produto.getPreco() * this.quantidade;

    }

    /**
     * Metodo para atribuir o id do pedido
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

        
    /**
     * Método para retorno do id do pedido
     *
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Método para retorno da instancia do Produto
     *
     * @return Produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * Método para retorno da quantidade do produto
     *
     * @return int
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Método para retorno do total do resultado da quantidade * preço da
     * unidade do produto
     *
     * @return double
     */
    public double getTotal() {
        return total;
    }

    /**
     * Método para retorno do pedido em uma String
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Pedido{" + "id:" + id + ", produto:" + produto + ", quantidade:" + quantidade + ", total:" + total + '}';
    }

}
