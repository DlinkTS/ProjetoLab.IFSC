package models;

import java.io.Serializable;

/**
 * Classe para objetos do tipo Produto, onde serão contidos, valores e métodos
 * para o mesmo.
 *
 * @author nathan
 *
 */
public class Produto implements Serializable{

    private final String nome;
    private final double preco;

    /**
     * Método responsável por criar uma nova instancia da classe Produto
     *
     * @param nome - nome do produto
     * @param preco - preço do produto
     */
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * Método para retorno do nome do produto
     *
     * @return String
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para retorno do preço do produto
     *
     * @return double
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Método para retorno do produto em uma String
     *
     * @return String
     */
    @Override
    public String toString() {
        return "{" + "nome:" + nome + ", preco:" + preco + '}';
    }

}
