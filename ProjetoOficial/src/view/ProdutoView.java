
package view;

import dao.ConnectionFactory;
import dao.ProdutoDao;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Produto;
import table.ProdutoTableModel;


public class ProdutoView extends javax.swing.JFrame {
 
    
    Produto pro = new Produto();
    ProdutoDao prd = new ProdutoDao();
    
 
    public ProdutoView() {
        initComponents();
        setLocationRelativeTo(null);
        tbproduto.setModel(new ProdutoTableModel(new ProdutoDao().Listartodos()));
        tfcodigo.setVisible(true);
        lblCodigo.setVisible(false);
        setIcon();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfcodigo = new javax.swing.JTextField();
        tfdescricao = new javax.swing.JTextField();
        tfpreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btlimpar = new javax.swing.JButton();
        btexcluir = new javax.swing.JButton();
        btsalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfpesquisadescricao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbproduto = new javax.swing.JTable();
        lblVoltar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblCodigo.setText("Código");

        jLabel2.setText("Descrição");

        tfcodigo.setEditable(false);
        tfcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcodigoActionPerformed(evt);
            }
        });

        tfpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfprecoActionPerformed(evt);
            }
        });

        jLabel3.setText("Preço");

        btlimpar.setText("Limpar");
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });

        btexcluir.setText("Excluir");
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });

        btsalvar.setText("Salvar");
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });

        jLabel4.setText("Pesquisar");

        tfpesquisadescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfpesquisadescricaoKeyPressed(evt);
            }
        });

        tbproduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbproduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbprodutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbproduto);

        lblVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Setas.png"))); // NOI18N
        lblVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("CYBER TECNOLOGY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(lblCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(tfpreco)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btlimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btexcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btsalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfpesquisadescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblVoltar)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel7)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addComponent(lblVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlimpar)
                    .addComponent(btexcluir)
                    .addComponent(btsalvar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfpesquisadescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfprecoActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        // TODO add your handling code here:
        if (tfcodigo.getText().equals("")){
            pro.setDescricao_produto(tfdescricao.getText());
            pro.setPreco_produto(Double.parseDouble(tfpreco.getText()));
            prd.inserir(pro);
            
            JOptionPane.showMessageDialog(null, "Inserido com Sucesso!");
        } else{
            pro.setDescricao_produto(tfdescricao.getText());
            pro.setPreco_produto(Double.parseDouble(tfpreco.getText()));
            pro.setCodigo_produto((Integer.parseInt(tfcodigo.getText())));
            prd.alterar (pro);
            
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");
        }
        
        tbproduto.setModel(new ProdutoTableModel(new ProdutoDao().Listartodos()));
        tfcodigo.setText("");
        tfdescricao.setText("");
        tfpreco.setText("");
        tfpesquisadescricao.setText("");
    }//GEN-LAST:event_btsalvarActionPerformed

    private void tbprodutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbprodutoMouseClicked
        // TODO add your handling code here:
        tfcodigo.setText(tbproduto.getValueAt(tbproduto.getSelectedRow(), ProdutoTableModel.COL_CODIGO_PRODUTO).toString());
        tfdescricao.setText(tbproduto.getValueAt(tbproduto.getSelectedRow(), ProdutoTableModel.COL_DESCRICAO_PRODUTO).toString());
        tfpreco.setText(tbproduto.getValueAt(tbproduto.getSelectedRow(), ProdutoTableModel.COL_PRECO_PRODUTO).toString());
    }//GEN-LAST:event_tbprodutoMouseClicked

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        tbproduto.setModel(new ProdutoTableModel(new ProdutoDao().Listartodos()));
        tfcodigo.setText("");
        tfdescricao.setText("");
        tfpreco.setText("");
        tfpesquisadescricao.setText("");
    }//GEN-LAST:event_btlimparActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(tfcodigo.getText());
        prd.excluir(codigo);
        tbproduto.setModel(new ProdutoTableModel(new ProdutoDao().Listartodos()));
        tfcodigo.setText("");
        tfdescricao.setText("");
        tfpreco.setText("");
        tfpesquisadescricao.setText("");
    }//GEN-LAST:event_btexcluirActionPerformed

    private void tfpesquisadescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfpesquisadescricaoKeyPressed
        String pesquisa = tfpesquisadescricao.getText();
        tbproduto.setModel(new ProdutoTableModel(new ProdutoDao().ListartodosDescricao(pesquisa)));
        
    }//GEN-LAST:event_tfpesquisadescricaoKeyPressed

    private void lblVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarMouseClicked
        // TODO add your handling code here:

        dispose();
        new InterfaceInicial().setVisible(true);
    }//GEN-LAST:event_lblVoltarMouseClicked

    private void tfcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcodigoActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btsalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JTable tbproduto;
    private javax.swing.JTextField tfcodigo;
    private javax.swing.JTextField tfdescricao;
    private javax.swing.JTextField tfpesquisadescricao;
    private javax.swing.JTextField tfpreco;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LogoMenor.png")));
    }
}
