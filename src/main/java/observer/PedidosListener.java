package observer;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import models.Pedido;
import views.PedidoView;

/**
 * Classe que implementa a interface IPedidoListener
 *
 * @author nathan
 */
public class PedidosListener implements IPedidoListener {

    public PedidosListener() {
    }

    /**
     * Metodo responsavel por atualizar a tanela jTablePedidos, atravez do
     * metodo PedidoView.addRowPedidos
     *
     * @param pedidos - lista dos pedidos atualizadas
     */
    @Override
    public void update(ArrayList<Pedido> pedidos) {
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }

        for (int i = 0; i < pedidos.size(); i++) {
            Object[] rowData = {
                pedidos.get(i).getId(),
                pedidos.get(i).getProduto().getNome(),
                pedidos.get(i).getQuantidade(),
                pedidos.get(i).getProduto().getPreco(),
                pedidos.get(i).getTotal()
            };
            PedidoView.addRowPedidos(rowData);
        }
    }

}
