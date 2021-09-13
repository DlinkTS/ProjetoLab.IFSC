/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.ArrayList;
import models.Pedido;

/**
 * Interface responsavel por definir o que será implementado na classe facade
 *
 * @author nathan
 */
public interface ISerializacao {
    public void salvar(ArrayList<Pedido> pedidos);
    public ArrayList<Pedido> getPedidos();
}
