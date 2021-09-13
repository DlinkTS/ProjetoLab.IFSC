package observer;

import java.util.ArrayList;
import models.Pedido;

/**
 * Classe responsavel por gerenciar os ouvintes dos pedidos
 *
 * @author nathan
 */
public class PedidoManager {

    private ArrayList<IPedidoListener> listeners = new ArrayList<IPedidoListener>();

    /**
     * Metodo responsavel por inscrever os ouvintes
     *
     * @param listener - ouvintes
     */
    public void subscribe(IPedidoListener listener) {
        listeners.add(listener);
    }

    /**
     * Metodo responsavel por desinscrever o ouvinte
     *
     * @param listener - ouvinte
     */
    public void unsubscribe(IPedidoListener listener) {
        for (IPedidoListener item : listeners) {
            if (item == listener) {
                listeners.remove(item);
                break;
            }
        }

    }

    /**
     * Metodo responsavel pro notificar as mudanças para os ouvintes
     *
     * @param pedidos - nova lista de pedidos
     */
    public void notify(ArrayList<Pedido> pedidos) {
        for (IPedidoListener listener : listeners) {
            listener.update(pedidos);
        }
    }
}
