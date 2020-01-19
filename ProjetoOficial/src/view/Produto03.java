/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import dao.CarrinhoDao;
import dao.ConfirmacaoDao;
import dao.ConnectionFactory;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Carrinho;
import model.Confirmacao;
import static view.Login.data;
import static view.Login.getCodigo_pessoa;
import static view.TelaCarrinho.codigo_carrinho;
/**
 *
 * @author Dário Felipe
 */
public class Produto03 extends javax.swing.JFrame {

    int codigo = getCodigo_pessoa();
    
    Confirmacao cof = new Confirmacao();
    ConfirmacaoDao cod = new ConfirmacaoDao();
    
    Carrinho car = new Carrinho();
    CarrinhoDao cad = new CarrinhoDao();
    
    private Connection cf1;
    private PreparedStatement stmt1;
    private Statement st1;
    private ResultSet rs1;
    
    public boolean PegarCodCar(){           
        
    try{
            cf1 = new ConnectionFactory().getConexao();                   
            String sql = "SELECT codigo_carrinho FROM carrinho";
        
            stmt1 = cf1.prepareStatement(sql); 
            rs1 = stmt1.executeQuery();
            
                rs1.last();
                codigo_carrinho = rs1.getInt("codigo_carrinho");
                   
       }catch(SQLException e){
           return false;
       } 
       return false;
     }
    /**
     * Creates new form Produto03
     */
    public Produto03() {
        initComponents();
        btnExcluirCarrinho.setVisible(false);
        this.setLocationRelativeTo(null);
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblVoltar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblAdicionarCarrinho = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnExcluirCarrinho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Carrinho.png"))); // NOI18N
        jLabel4.setText("Frete Grátis");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cartao.png"))); // NOI18N
        jLabel5.setText("R$320,00  em apenas 10x R$32,00");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Boleto.png"))); // NOI18N
        jLabel6.setText("R$ 286,90");

        lblVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Setas.png"))); // NOI18N
        lblVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltarMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/G613 Wireless Mechanical Gaming.png"))); // NOI18N

        lblAdicionarCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/AdicionarCarrinho.png"))); // NOI18N
        lblAdicionarCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdicionarCarrinhoMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("G613 Wireless Mechanical Gaming");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Preço: R$320,00");

        btnExcluirCarrinho.setText("Remover");
        btnExcluirCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCarrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVoltar)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAdicionarCarrinho)
                                            .addComponent(jLabel4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel5)))
                                .addGap(55, 55, 55))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(btnExcluirCarrinho)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addContainerGap(128, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVoltar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAdicionarCarrinho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluirCarrinho)
                                .addGap(0, 11, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarMouseClicked
        // TODO add your handling code here:

        dispose();
        new InterfaceInicial().setVisible(true);
    }//GEN-LAST:event_lblVoltarMouseClicked

    private void btnExcluirCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCarrinhoActionPerformed
        // TODO add your handling code here:

    
        cad.excluir(codigo_carrinho);
        cod.excluir(codigo_carrinho);

        JOptionPane.showMessageDialog(null, "Produto retirado do Carrinho!");

        btnExcluirCarrinho.setVisible(false);
    }//GEN-LAST:event_btnExcluirCarrinhoActionPerformed

    private void lblAdicionarCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdicionarCarrinhoMouseClicked
        // TODO add your handling code here:
        
            car.setCodigo_pessoa((codigo));
            car.setCodigo_produto(Integer.parseInt("3"));
            car.setPreco_produto(Double.parseDouble("320"));
            car.setDescricao_produto(("G613 Wireless Mechanical Gaming"));
            cad.inserir(car);
            
            cof.setCodigo_pessoa((codigo));
            cof.setCodigo_produto(Integer.parseInt("3"));
            cof.setData_compra(data);
            cod.inserir(cof);
            
            PegarCodCar();
            
            JOptionPane.showMessageDialog(null, "Adicionado ao Carrinho!");
            
            btnExcluirCarrinho.setVisible(true);
    }//GEN-LAST:event_lblAdicionarCarrinhoMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Produto03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produto03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produto03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produto03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produto03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirCarrinho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAdicionarCarrinho;
    private javax.swing.JLabel lblVoltar;
    // End of variables declaration//GEN-END:variables

   private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LogoMenor.png")));
    }

}
