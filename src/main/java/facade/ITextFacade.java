package facade;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;

import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import models.Pedido;

/**
 * Classe facade responsavel por implementar a interface IIText e abstrair a
 * biblioteca ITextPDF.
 *
 * @author nathan
 */
public class ITextFacade implements IIText {

    /**
     * Metodo responsavel por gerar o relatorio em pdf, recebendo a lista de
     * pedidos
     *
     * @param pedidos - lista dos pedidos
     */
    @Override
    public void createPdf(ArrayList<Pedido> pedidos) {
        try {
            double total = 0;

            String dest = ".\\src\\main\\java\\relatorio\\venda.pdf";
            PdfWriter writer = new PdfWriter(dest);

            PdfDocument pdf = new PdfDocument(writer);

            Document doc = new Document(pdf);

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            String dt = formatter.format(date);

            String text = "Mercadinho IFSC\n"
                    + "Data: " + dt;

            float[] pointColumnWidths = {150F, 150F, 150F, 150F, 150F};
            Table table = new Table(pointColumnWidths);

            table.addCell(new Cell().add("Id"));
            table.addCell(new Cell().add("Nome"));
            table.addCell(new Cell().add("Quantidade"));
            table.addCell(new Cell().add("Preço un."));
            table.addCell(new Cell().add("Total"));

            for (Pedido pedido : pedidos) {
                table.addCell(new Cell().add(String.valueOf(pedido.getId())));
                table.addCell(new Cell().add(pedido.getProduto().getNome()));
                table.addCell(new Cell().add(String.valueOf(pedido.getQuantidade())));
                table.addCell(new Cell().add(String.valueOf(pedido.getProduto().getPreco())));
                table.addCell(new Cell().add(String.valueOf(pedido.getTotal())));

                total += pedido.getTotal();
            }

            doc.add(new Paragraph(text));
            doc.add(table);
            doc.add(new Paragraph("Total do pedido: " + String.valueOf(total)));

            doc.close();
            System.out.println("PDF criado.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
