package views;

import singleton.Arroz;
import singleton.Refrigerante;
import controllers.PedidoController;
import facade.ITextFacade;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import models.Pedido;
import models.Produto;
import observer.PedidoManager;
import observer.PedidosListener;
import singleton.Feijao;
import singleton.Pao;
import singleton.Sabao;

/**
 * Classe responsavel por renderizar a interface do software
 *
 * @author nathan
 */
public class PedidoView extends javax.swing.JFrame {

    private PedidoController controller;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private PedidoManager pedidoManager = new PedidoManager();
    private PedidosListener pedidosListener;

    public PedidoView() {
        controller = new PedidoController();

        produtos.add(Arroz.getInstance());
        produtos.add(Refrigerante.getInstance());
        produtos.add(Feijao.getInstance());
        produtos.add(Pao.getInstance());
        produtos.add(Sabao.getInstance());

        initComponents();

        pedidosListener = new PedidosListener();
        pedidoManager.subscribe(pedidosListener);

        carregarProdutos();
        if (controller.getPedidos().size() > 0) {
            this.carregarPedidos();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnRemover = new javax.swing.JButton();
        btnLimparPedido = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnExportarPdf = new javax.swing.JButton();
        btnExportarTxt = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemPortugues = new javax.swing.JMenuItem();
        jMenuItemIngles = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jPanel6.setLayout(new java.awt.GridBagLayout());

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        jLabel1.setText(bundle.getString("PedidoView.jLabel1.text_1")); // NOI18N
        jPanel4.add(jLabel1);

        jTextFieldQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeActionPerformed(evt);
            }
        });
        jPanel4.add(jTextFieldQuantidade);

        btnAdicionar.setText(bundle.getString("PedidoView.btnAdicionar.text_1")); // NOI18N
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdicionar);

        jLabel3.setText(bundle.getString("PedidoView.jLabel3.text_1")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.add(jPanel1, new java.awt.GridBagConstraints());

        java.util.ResourceBundle r = java.util.ResourceBundle.getBundle("Bundle");
        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                r.getString("ID"), r.getString("NOME"), r.getString("QUANTIDADE"), r.getString("PREÇO UN."), r.getString("TOTAL")
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTablePedidos);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnRemover.setText(bundle.getString("PedidoView.btnRemover.text_1")); // NOI18N
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemover);

        btnLimparPedido.setText(bundle.getString("PedidoView.btnLimparPedido.text_1")); // NOI18N
        btnLimparPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparPedidoActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimparPedido);

        jLabel2.setText(bundle.getString("PedidoView.jLabel2.text_1")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.add(jPanel3, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel6);

        jPanel7.setLayout(new java.awt.GridBagLayout());

        jLabel4.setText(bundle.getString("PedidoView.jLabel4.text_1")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 749, 0, 0);
        jPanel7.add(jLabel4, gridBagConstraints);

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 106;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 35, 0, 13);
        jPanel7.add(jTextFieldTotal, gridBagConstraints);

        getContentPane().add(jPanel7);

        java.awt.GridBagLayout jPanel5Layout = new java.awt.GridBagLayout();
        jPanel5Layout.rowHeights = new int[] {50};
        jPanel5.setLayout(jPanel5Layout);

        btnExportarPdf.setText(bundle.getString("PedidoView.btnExportarPdf.text_1")); // NOI18N
        btnExportarPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarPdfActionPerformed(evt);
            }
        });
        jPanel5.add(btnExportarPdf, new java.awt.GridBagConstraints());

        btnExportarTxt.setText(bundle.getString("PedidoView.btnExportarTxt.text_1")); // NOI18N
        btnExportarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarTxtActionPerformed(evt);
            }
        });
        jPanel5.add(btnExportarTxt, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel5);

        jMenu1.setText(bundle.getString("PedidoView.jMenu1.text")); // NOI18N

        jMenuItemPortugues.setText(bundle.getString("PedidoView.jMenuItemPortugues.text")); // NOI18N
        jMenuItemPortugues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPortuguesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemPortugues);

        jMenuItemIngles.setText(bundle.getString("PedidoView.jMenuItemIngles.text")); // NOI18N
        jMenuItemIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInglesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemIngles);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantidadeActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        this.adicionarProduto();

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnLimparPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparPedidoActionPerformed
        this.limparPedidos();
        controller.limparPedidos();

    }//GEN-LAST:event_btnLimparPedidoActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        this.removerPedido();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void btnExportarPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarPdfActionPerformed

        if (controller.getPedidos().size() == 0) {
            JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("Bundle").getString("NENHUM PEDIDO FOI ADICIONADO!"));

        } else {
            try {
                controller.criarRelatorioPDF();
                JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("Bundle").getString("RELATORIO GERADO!"));
                this.limparPedidos();
                controller.limparPedidos();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("Bundle").getString("ERRO AO GERAR O RELATORIO!"));

            }
        }


    }//GEN-LAST:event_btnExportarPdfActionPerformed

    private void btnExportarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarTxtActionPerformed
        if (controller.getPedidos().size() == 0) {
            JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("Bundle").getString("NENHUM PEDIDO FOI ADICIONADO!"));

        } else {
            try {
                controller.criarRelatorioTXT();
                JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("Bundle").getString("RELATORIO GERADO!"));
                this.limparPedidos();
                controller.limparPedidos();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("Bundle").getString("ERRO AO GERAR O RELATORIO!"));

            }
        }
    }//GEN-LAST:event_btnExportarTxtActionPerformed

    private void jMenuItemPortuguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPortuguesActionPerformed
        Locale.setDefault(new Locale("pt", "BR"));
        this.updateLang();


    }//GEN-LAST:event_jMenuItemPortuguesActionPerformed

    private void jMenuItemInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInglesActionPerformed
        Locale.setDefault(new Locale("en", "US"));
        this.updateLang();


    }//GEN-LAST:event_jMenuItemInglesActionPerformed

    private void updateLang() {
        new PedidoView().setVisible(true);
        this.dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (java.util.ResourceBundle.getBundle("Bundle").getString("NIMBUS").equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoView().setVisible(true);
            }
        });
    }

    /**
     * Metodo responsavel por carregar os produtos para a tabela jTableProdutos
     */
    private void carregarProdutos() {
        DefaultTableModel model = (DefaultTableModel) jTableProdutos.getModel();
        String[] cols = {java.util.ResourceBundle.getBundle("Bundle").getString("NOME"), java.util.ResourceBundle.getBundle("Bundle").getString("PREÇO")};

        Object[][] produtos = new Object[this.produtos.size()][2];

        for (int i = 0; i < this.produtos.size(); i++) {
            produtos[i] = new Object[]{
                this.produtos.get(i).getNome(),
                this.produtos.get(i).getPreco(),};
        }

        model.setDataVector(produtos, cols);
    }

    /**
     * Metodo responsavel limpar a tabela jTablePedidos
     */
    private void limparPedidos() {
        jTablePedidos.setModel(new DefaultTableModel(null, new String[]{java.util.ResourceBundle.getBundle("Bundle").getString("ID"), java.util.ResourceBundle.getBundle("Bundle").getString("NOME"), java.util.ResourceBundle.getBundle("Bundle").getString("QUANTIDADE"), java.util.ResourceBundle.getBundle("Bundle").getString("PREÇO UN."), java.util.ResourceBundle.getBundle("Bundle").getString("TOTAL")}));
        jTextFieldTotal.setText("");
    }

    /**
     * Metodo responsavel carregar os pedidos na tabela jTablePedidos e chamar o
     * metodo responsavel por calcular o total da venda, inserindo o resultado
     * no campo jTextFieldTotal
     */
    private void carregarPedidos() {
        pedidoManager.notify(controller.getPedidos());

        jTextFieldTotal.setText(this.controller.getTotal());

    }

    /**
     * Metodo responsavel por adicionar uma nova linha na tabela jTablePedidos
     *
     * @param rowData
     */
    public static void addRowPedidos(Object[] rowData) {
        DefaultTableModel model = (DefaultTableModel) jTablePedidos.getModel();
        model.addRow(rowData);
    }

    /**
     * Metodo responsavel por adicionar o produto selecionado, gerando um perido
     * na tabela jTablePedidos
     */
    private void adicionarProduto() {

        try {
            DefaultTableModel model = (DefaultTableModel) jTablePedidos.getModel();

            int quantidade;
            int row = jTableProdutos.getSelectedRow();
            String nome = jTableProdutos.getModel().getValueAt(row, 0).toString();

            if (jTextFieldQuantidade.getText().isEmpty()) {
                quantidade = 1;
            } else {
                quantidade = Integer.parseInt(jTextFieldQuantidade.getText());
            }

            for (Produto item : produtos) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    controller.addPedido(new Pedido(
                            item, quantidade
                    ));
                    this.limparPedidos();
                    this.carregarPedidos();
                    this.limparQuantidade();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("Bundle").getString("VALOR INVÁLIDO!"));
            this.limparQuantidade();
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("Bundle").getString("SELECIONE UM PRODUTO!"));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("Bundle").getString("UNKNOWN ERROR"));

        }

    }

    /**
     * Metodo responsavel por limpar o campo jTextFieldQuantidade
     */
    private void limparQuantidade() {
        jTextFieldQuantidade.setText("");
    }

    /**
     * Metodo responsavel por remover o pedido selecionado na tabela
     * jTablePedidos
     */
    private void removerPedido() {
        try {
            DefaultTableModel model = (DefaultTableModel) jTablePedidos.getModel();

            int row = jTablePedidos.getSelectedRow();
            int id = (int) jTablePedidos.getModel().getValueAt(row, 0);

            this.controller.remove(id);
            this.limparPedidos();
            this.carregarPedidos();

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("Bundle").getString("SELECIONE UM PRODUTO!"));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("Bundle").getString("UNKNOWN ERROR"));
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnExportarPdf;
    private javax.swing.JButton btnExportarTxt;
    private javax.swing.JButton btnLimparPedido;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemIngles;
    private javax.swing.JMenuItem jMenuItemPortugues;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable jTablePedidos;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
