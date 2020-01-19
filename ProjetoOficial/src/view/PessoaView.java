
package view;

//import dao.ProdutoDao;
//import model.Produto;
//import table.ProdutoTableModel;

import dao.PessoaDao;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import model.Pessoa;
import table.PessoaTableModel;


public class PessoaView extends javax.swing.JFrame {
  
    
    Pessoa pes = new Pessoa();
    PessoaDao prd = new PessoaDao();

    public PessoaView() {
        
        initComponents();
        setLocationRelativeTo(null);
        
        tbpessoa.setVisible(false);
        jScrollPane1.setVisible(false);
        jLabel4.setVisible(false);
        tfpesquisanome_pessoa.setVisible(false);
        btexcluir.setVisible(false);
        tfcodigo_pessoa.setVisible(true);
        lblCodigo.setVisible(false);
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfcodigo_pessoa = new javax.swing.JTextField();
        tfnome_pessoa = new javax.swing.JTextField();
        tfcpf_pessoa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btlimpar = new javax.swing.JButton();
        btexcluir = new javax.swing.JButton();
        btsalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfpesquisanome_pessoa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbpessoa = new javax.swing.JTable();
        tfendereco_pessoa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfemail_pessoa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblVoltar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfsenha_pessoa = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnADM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CYBER CADASTRO");

        lblCodigo.setText("Código");

        jLabel2.setText("Nome");

        tfcodigo_pessoa.setEditable(false);
        tfcodigo_pessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcodigo_pessoaActionPerformed(evt);
            }
        });

        tfcpf_pessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcpf_pessoaActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF");

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

        tfpesquisanome_pessoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfpesquisanome_pessoaKeyPressed(evt);
            }
        });

        tbpessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbpessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbpessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbpessoa);

        tfendereco_pessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfendereco_pessoaActionPerformed(evt);
            }
        });

        jLabel5.setText("Endereço");

        tfemail_pessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfemail_pessoaActionPerformed(evt);
            }
        });

        jLabel6.setText("Email");

        lblVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Setas.png"))); // NOI18N
        lblVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("CYBER TECNOLOGY");

        jLabel8.setText("Senha");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Usuário.png"))); // NOI18N

        btnADM.setText("ADM");
        btnADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(lblCodigo)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblVoltar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfemail_pessoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(tfendereco_pessoa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfcpf_pessoa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfnome_pessoa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfcodigo_pessoa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfsenha_pessoa))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfpesquisanome_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btlimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btexcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btsalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnADM)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(tfcodigo_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfnome_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfcpf_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfendereco_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfemail_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfsenha_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btlimpar)
                            .addComponent(btexcluir)
                            .addComponent(btsalvar)
                            .addComponent(btnADM))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfpesquisanome_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfcpf_pessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcpf_pessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcpf_pessoaActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        // TODO add your handling code here:
        if (tfcodigo_pessoa.getText().equals("")){
            pes.setNome_pessoa(tfnome_pessoa.getText());
            pes.setCpf_pessoa(tfcpf_pessoa.getText());
            pes.setEndereco_pessoa(tfendereco_pessoa.getText());
            pes.setEmail_pessoa(tfemail_pessoa.getText());
            pes.setSenha_pessoa(tfsenha_pessoa.getText());
            prd.inserir(pes);
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
            
        } else {
            pes.setNome_pessoa(tfnome_pessoa.getText());
            pes.setCpf_pessoa(tfcpf_pessoa.getText());
            pes.setCodigo_pessoa((Integer.parseInt(tfcodigo_pessoa.getText())));
            pes.setEndereco_pessoa(tfendereco_pessoa.getText());
            pes.setEmail_pessoa(tfemail_pessoa.getText());
            pes.setSenha_pessoa(tfsenha_pessoa.getText());
            prd.alterar(pes);
            
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");
        }
        tbpessoa.setModel(new PessoaTableModel(new PessoaDao().Listartodos()));
        tfcodigo_pessoa.setText("");
        tfnome_pessoa.setText("");
        tfcpf_pessoa.setText("");
        tfendereco_pessoa.setText("");
        tfemail_pessoa.setText("");
        tfsenha_pessoa.setText("");
        tfpesquisanome_pessoa.setText("");
    }//GEN-LAST:event_btsalvarActionPerformed

    private void tbpessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbpessoaMouseClicked
        // TODO add your handling code here:
        tfcodigo_pessoa.setText(tbpessoa.getValueAt(tbpessoa.getSelectedRow(), PessoaTableModel.COL_CODIGO_PESSOA).toString());
        tfnome_pessoa.setText(tbpessoa.getValueAt(tbpessoa.getSelectedRow(), PessoaTableModel.COL_NOME_PESSOA).toString());
        tfcpf_pessoa.setText(tbpessoa.getValueAt(tbpessoa.getSelectedRow(), PessoaTableModel.COL_CPF_PESSOA).toString());
        tfendereco_pessoa.setText(tbpessoa.getValueAt(tbpessoa.getSelectedRow(), PessoaTableModel.COL_ENDERECO_PESSOA).toString());
        tfemail_pessoa.setText(tbpessoa.getValueAt(tbpessoa.getSelectedRow(), PessoaTableModel.COL_EMAIL_PESSOA).toString());
        tfsenha_pessoa.setText(tbpessoa.getValueAt(tbpessoa.getSelectedRow(), PessoaTableModel.COL_SENHA_PESSOA).toString());
    }//GEN-LAST:event_tbpessoaMouseClicked

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        tbpessoa.setModel(new PessoaTableModel(new PessoaDao().Listartodos()));
        tfcodigo_pessoa.setText("");
        tfnome_pessoa.setText("");
        tfcpf_pessoa.setText("");
        tfendereco_pessoa.setText("");
        tfemail_pessoa.setText("");  
        tfsenha_pessoa.setText(""); 
        tfpesquisanome_pessoa.setText("");
    }//GEN-LAST:event_btlimparActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(tfcodigo_pessoa.getText());
        prd.excluir(codigo);
        tbpessoa.setModel(new PessoaTableModel(new PessoaDao().Listartodos()));
        tfcodigo_pessoa.setText("");
        tfnome_pessoa.setText("");
        tfcpf_pessoa.setText("");
        tfemail_pessoa.setText("");
        tfendereco_pessoa.setText("");
        tfsenha_pessoa.setText("");
        tfpesquisanome_pessoa.setText("");
    }//GEN-LAST:event_btexcluirActionPerformed

    private void tfpesquisanome_pessoaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfpesquisanome_pessoaKeyPressed
        String pesquisa = tfpesquisanome_pessoa.getText();
        tbpessoa.setModel(new PessoaTableModel(new PessoaDao().ListartodosDescricao(pesquisa)));
        
    }//GEN-LAST:event_tfpesquisanome_pessoaKeyPressed

    private void tfendereco_pessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfendereco_pessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfendereco_pessoaActionPerformed

    private void tfemail_pessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfemail_pessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfemail_pessoaActionPerformed

    private void lblVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarMouseClicked
        // TODO add your handling code here:

        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_lblVoltarMouseClicked

    private void tfcodigo_pessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcodigo_pessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcodigo_pessoaActionPerformed

    private void btnADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADMActionPerformed
        // TODO add your handling code here:
        
     String ADM = JOptionPane.showInputDialog("Uso dedicado a Administração");
        System.out.println(ADM);
     
     if(ADM.equals("ADM777")){
            
           btexcluir.setVisible(true);
           tbpessoa.setVisible(true);
           jScrollPane1.setVisible(true);
           jLabel4.setVisible(true);
           tfpesquisanome_pessoa.setVisible(true);
           tbpessoa.setModel(new PessoaTableModel(new PessoaDao().Listartodos()));
           btnADM.setVisible(false);
        }else{
            
            JOptionPane.showMessageDialog(null, "<html><hr>Acesso Negado!<hr></html>");
        }
    }//GEN-LAST:event_btnADMActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btnADM;
    private javax.swing.JButton btsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JTable tbpessoa;
    private javax.swing.JTextField tfcodigo_pessoa;
    private javax.swing.JTextField tfcpf_pessoa;
    private javax.swing.JTextField tfemail_pessoa;
    private javax.swing.JTextField tfendereco_pessoa;
    private javax.swing.JTextField tfnome_pessoa;
    private javax.swing.JTextField tfpesquisanome_pessoa;
    private javax.swing.JPasswordField tfsenha_pessoa;
    // End of variables declaration//GEN-END:variables

     private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LogoMenor.png")));
    }

}
