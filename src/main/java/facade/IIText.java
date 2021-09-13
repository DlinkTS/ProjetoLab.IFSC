package facade;

import java.util.ArrayList;
import models.Pedido;

/**
 * Interface responsavel por definir o que será implementado na classe facade
 * @author nathan
 */
public interface IIText {
    public void createPdf(ArrayList<Pedido> pedidos);
}
