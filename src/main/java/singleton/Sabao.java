package singleton;

import models.Produto;

/**
 * Classe para retornar a instancia do Produto referente ao Sabao
 *
 * @author nathan
 */
public class Sabao {

    /**
     * Atributo estático responsavel por armazenar a instancia do Produto
     * referente ao Sabao
     */
    private static Produto instance;

    /**
     * Metódo responsavel por retornar ou instanciar o Produto referente ao
     * Sabao
     *
     * @return Produto
     */
    public static Produto getInstance() {
        if (Sabao.instance == null) {
            Sabao.instance = new Produto("Sabão 1Kg", 7.59);
        }
        return Sabao.instance;
    }
}
