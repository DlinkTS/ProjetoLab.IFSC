/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import models.Produto;

/**
 * Classe para retornar a instancia do Produto referente ao Feijao
 *
 * @author nathan
 */
public class Feijao {

    /**
     * Atributo estático responsavel por armazenar a instancia do Produto
     * referente ao Feijao
     */
    private static Produto instance;

    /**
     * Metódo responsavel por retornar ou instanciar o Produto referente ao
     * Feijao
     *
     * @return Produto
     */
    public static Produto getInstance() {
        if (Feijao.instance == null) {
            Feijao.instance = new Produto("Feijão 1Kg", 10.90);
        }
        return Feijao.instance;
    }
}
