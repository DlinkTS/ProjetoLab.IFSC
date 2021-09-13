package singleton;

import models.Produto;

/**
 * Classe para retornar a instancia do Produto referente ao Pao
 *
 * @author nathan
 */
public class Pao {

    /**
     * Atributo estático responsavel por armazenar a instancia do Produto
     * referente ao Pao
     */
    private static Produto instance;

    /**
     * Metódo responsavel por retornar ou instanciar o Produto referente ao
     * Pao
     *
     * @return Produto
     */
    public static Produto getInstance() {
        if (Pao.instance == null) {
            Pao.instance = new Produto("Pao 550g", 5.90);
        }
        return Pao.instance;
    }
}
