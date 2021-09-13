package singleton;

import models.Produto;

/**
 * Classe para retornar a instancia do Produto referente ao Arroz
 *
 * @author nathan
 *
 */
public class Arroz {

    /**
     * Atributo estático responsavel por armazenar a instancia do Produto
     * referente ao Arroz
     */
    private static Produto instance;

    /**
     * Metódo responsavel por retornar ou instanciar o Produto referente ao
     * Arroz
     *
     * @return Produto
     */
    public static Produto getInstance() {
        if (Arroz.instance == null) {
            Arroz.instance = new Produto("Arroz 5Kg", 19.90);
        }
        return Arroz.instance;
    }
}
