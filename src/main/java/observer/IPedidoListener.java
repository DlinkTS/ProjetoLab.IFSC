package observer;

import java.util.ArrayList;
import models.Pedido;

/**
 * Interface responsavel por definir os metodos a serem implementados
 * @author nathan
 */
public interface IPedidoListener {
    void update(ArrayList<Pedido> pedidos);
}
