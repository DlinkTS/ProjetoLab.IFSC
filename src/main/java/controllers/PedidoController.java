package controllers;

import facade.ITextFacade;
import facade.Serializacao;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import models.Pedido;

/**
 * Classe responsavel por controlar todas as ações do Pedido.
 *
 * @author nathan
 */
public class PedidoController {

    private ArrayList<Pedido> pedidos;
    private Serializacao serializacao = new Serializacao();
    private int count;

    /**
     * Método responsável por criar uma nova instancia da classe
     * PedidoController
     *
     *
     */
    public PedidoController() {
        this.pedidos = serializacao.getPedidos();
        if (this.pedidos.size() > 0) {
            count = this.pedidos.get(this.pedidos.size() - 1).getId() + 1;
        } else {
            count = 0;
        }
    }

    /**
     * Metodo responsavel por retorna a lista de Pedidos
     *
     * @return ArrayList - Lista dos pedidos
     */
    public ArrayList<Pedido> getPedidos() {

        return serializacao.getPedidos();
    }

    /**
     * Metodo responsavel por adicionar um novo Pedido na lista
     *
     * @param pedido - pedido a ser adicionado na lista
     *
     */
    public void addPedido(Pedido pedido) {
        pedido.setId(count);
        this.pedidos.add(pedido);
        serializacao.salvar(this.pedidos);
        count++;
    }

    /**
     * Metodo responsavle por limpar a lista de pedidos
     */
    public void limparPedidos() {
        this.pedidos.clear();
        serializacao.salvar(new ArrayList<Pedido>());

    }

    /**
     * Metodo responsavel por remover o Pedido da lista
     *
     * @param id - identificador do pedido a ser removido
     */
    public void remove(int id) {
        Pedido pedido = null;
        for (Pedido item : this.pedidos) {
            if (item.getId() == id) {
                pedido = item;
            }
        }
        this.pedidos.remove(pedido);
        serializacao.salvar(pedidos);
    }

    /**
     * Metodo responsavel por retornar o total da venda, atravez do somatorio de
     * todos os campos total de cada Pedido na lista.
     *
     * @return double
     */
    public String getTotal() {
        double sum = 0.0;
        for (Pedido pedido : this.pedidos) {
            sum += pedido.getTotal();
        }
        
        return String.format( "%.2f", sum );
    }

    /**
     * Metodo responsavel por gerar o relatorio em PDF atravez da classe facade
     */
    public void criarRelatorioPDF() {
        ITextFacade iTextFacade = new ITextFacade();
        iTextFacade.createPdf(this.pedidos);
    }

    /**
     * Metodo responsavel por gerar o relatorio em TXT
     */
    public void criarRelatorioTXT() throws FileNotFoundException, IOException {

        String dest = ".\\src\\main\\java\\relatorio\\venda.txt";

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String dt = formatter.format(date);

        String text = "Mercadinho IFSC\n"
                + "Data: " + dt + "\n\n\n"
                + "Id " + " Nome " + " Quantidade " + " Preço un. " + " Total \n";
        double total = 0;

        for (Pedido pedido : this.pedidos) {
            text += String.valueOf(pedido.getId()) + " "
                    + pedido.getProduto().getNome() + " "
                    + String.valueOf(pedido.getQuantidade()) + " "
                    + String.valueOf(pedido.getProduto().getPreco()) + " "
                    + String.valueOf(pedido.getTotal()) + "\n";
            total += pedido.getTotal();
        }
        text += "\nTotal do pedido: " + String.valueOf(total);

        FileWriter arq = new FileWriter(dest);
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.printf(text);

        arq.close();

        System.out.println("TXT criado.");

    }

    
}
