/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import models.Pedido;

/**
 * Classe facade responsavel por abstrair a serialização
 *
 * @author nathan
 */
public class Serializacao implements ISerializacao {

    /**
     * Metodo responsavel por salvar a serialização da lista de pedidos
     *
     * @param pedidos - lista dos pedidos
     */
    @Override
    public void salvar(ArrayList<Pedido> pedidos) {
        String dest = ".\\src\\main\\java\\serializacao\\pedidos.dat";
        try {
            FileOutputStream output = new FileOutputStream(dest);
            ObjectOutputStream objput = new ObjectOutputStream(output);
            objput.writeObject(pedidos);
            output.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Metodo responsavel por retornar a lista de pedidos serializada
     *
     * @return ArrayList lista de pedidos
     */
    @Override
    public ArrayList<Pedido> getPedidos() {
        String dest = ".\\src\\main\\java\\serializacao\\pedidos.dat";

        try {
            FileInputStream input = new FileInputStream(dest);
            ObjectInputStream objinput = new ObjectInputStream(input);
            ArrayList<Pedido> pedidos = (ArrayList<Pedido>) objinput.readObject();
            objinput.close();
            return pedidos;
        } catch (Exception e) {
            System.out.println(e);
            return new ArrayList<Pedido>();
        }
    }

}
