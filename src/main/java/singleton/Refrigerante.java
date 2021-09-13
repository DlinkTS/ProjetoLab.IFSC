package singleton;

import models.Produto;

/**
 * Classe para retornar a instancia do Produto referente ao Refrigerante
 *
 * @author nathan
 *
 */
public class Refrigerante {

    /**
     * Atributo estático responsavel por armazenar a instancia do Produto
     * referente ao Refrigerante
     */
    private static Produto instance;

    /**
     * Metódo responsavel por retornar ou instanciar o Produto referente ao
     * Refrigerante
     *
     * @return Produto
     */
    public static Produto getInstance() {
        if (Refrigerante.instance == null) {
            Refrigerante.instance = new Produto("Refrigerante 2L", 4.99);
        }
        return Refrigerante.instance;
    }
}
