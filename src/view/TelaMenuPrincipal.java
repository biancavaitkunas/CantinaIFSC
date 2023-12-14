
package view;

import controller.ControllerCadastroBairro;
import controller.ControllerCadastroCarteirinha;
import controller.ControllerCadastroCidade;
import controller.ControllerCadastroCliente;
import controller.ControllerCadastroEndereco;
import controller.ControllerCadastroFornecedor;
import controller.ControllerCadastroFuncionario;
import controller.ControllerCadastroMovimentacaoEstoque;
import controller.ControllerCadastroProduto;
import controller.ControllerVenda;

public class TelaMenuPrincipal extends javax.swing.JFrame {

    public TelaMenuPrincipal() {
        DAO.ClasseDados.getInstance();
        initComponents();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem10 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMcadastros = new javax.swing.JMenu();
        jMICliente = new javax.swing.JMenuItem();
        jMIFornecedor = new javax.swing.JMenuItem();
        jMIFuncionario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMIBairro = new javax.swing.JMenuItem();
        jMICidade = new javax.swing.JMenuItem();
        jMIEndereco = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMICarteirinha = new javax.swing.JMenuItem();
        jMIProduto = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMISair = new javax.swing.JMenuItem();
        jMMovimentos = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMRelatorios = new javax.swing.JMenu();
        jMAjuda = new javax.swing.JMenu();

        jMenuItem10.setText("jMenuItem10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Design sem nome (2).png"))); // NOI18N

        jMcadastros.setText("Cadastros");

        jMICliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMICliente.setText("Cliente");
        jMICliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIClienteActionPerformed(evt);
            }
        });
        jMcadastros.add(jMICliente);

        jMIFornecedor.setText("Fornecedor");
        jMIFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFornecedorActionPerformed(evt);
            }
        });
        jMcadastros.add(jMIFornecedor);

        jMIFuncionario.setText("Funcionário");
        jMIFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFuncionarioActionPerformed(evt);
            }
        });
        jMcadastros.add(jMIFuncionario);
        jMcadastros.add(jSeparator1);

        jMIBairro.setText("Bairro");
        jMIBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIBairroActionPerformed(evt);
            }
        });
        jMcadastros.add(jMIBairro);

        jMICidade.setText("Cidade");
        jMICidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICidadeActionPerformed(evt);
            }
        });
        jMcadastros.add(jMICidade);

        jMIEndereco.setText("Endereço");
        jMIEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEnderecoActionPerformed(evt);
            }
        });
        jMcadastros.add(jMIEndereco);
        jMcadastros.add(jSeparator2);

        jMICarteirinha.setText("Carteirinha");
        jMICarteirinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICarteirinhaActionPerformed(evt);
            }
        });
        jMcadastros.add(jMICarteirinha);

        jMIProduto.setText("Produto");
        jMIProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIProdutoActionPerformed(evt);
            }
        });
        jMcadastros.add(jMIProduto);
        jMcadastros.add(jSeparator3);

        jMISair.setText("Sair");
        jMISair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISairActionPerformed(evt);
            }
        });
        jMcadastros.add(jMISair);

        jMenuBar1.add(jMcadastros);

        jMMovimentos.setText("Movimentos");

        jMenu1.setText("Contas");

        jMenuItem11.setText("Pagar");
        jMenu1.add(jMenuItem11);

        jMenuItem12.setText("Receber");
        jMenu1.add(jMenuItem12);

        jMMovimentos.add(jMenu1);

        jMenu2.setText("Caixa");
        jMMovimentos.add(jMenu2);

        jMenuItem1.setText("Venda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMMovimentos.add(jMenuItem1);

        jMenuItem2.setText("Estoque");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMMovimentos.add(jMenuItem2);

        jMenuBar1.add(jMMovimentos);

        jMRelatorios.setText("Relatórios");
        jMenuBar1.add(jMRelatorios);

        jMAjuda.setText("Ajuda");
        jMenuBar1.add(jMAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIClienteActionPerformed
        //JOptionPane.showMessageDialog(null, "Bianca");
        TelaCadastroCliente telaCadastoCliente = new TelaCadastroCliente(null, true);
        ControllerCadastroCliente controllerCadastroCliente = new ControllerCadastroCliente(telaCadastoCliente);
        telaCadastoCliente.setVisible(true);
    }//GEN-LAST:event_jMIClienteActionPerformed

    private void jMIFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFuncionarioActionPerformed
        //JOptionPane.showMessageDialog(null, "Bianca");
        TelaCadastroFuncionario telaCadastoFuncionario = new TelaCadastroFuncionario(null, true);
        ControllerCadastroFuncionario controllerCadastroFuncionario = new ControllerCadastroFuncionario(telaCadastoFuncionario);
        telaCadastoFuncionario.setVisible(true);
    }//GEN-LAST:event_jMIFuncionarioActionPerformed

    private void jMIEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEnderecoActionPerformed
        TelaCadastroEndereco telaCadastoEndereco = new TelaCadastroEndereco(null, true);
        //ControllerCadastroEndereco controllerCadastroEndereco = new ControllerCadastroEndereco(telaCadastoEndereco);
        telaCadastoEndereco.setVisible(true);
    }//GEN-LAST:event_jMIEnderecoActionPerformed

    private void jMIBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIBairroActionPerformed
        TelaCadastroBairro telaCadastroBairro = new TelaCadastroBairro(null, true);
        ControllerCadastroBairro controllerCadastroBairro = new ControllerCadastroBairro(telaCadastroBairro);
        telaCadastroBairro.setVisible(true);
    }//GEN-LAST:event_jMIBairroActionPerformed

    private void jMIFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFornecedorActionPerformed
        TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor(null, true);
        ControllerCadastroFornecedor controllerCadastroFornecedor = new ControllerCadastroFornecedor(telaCadastroFornecedor);
        telaCadastroFornecedor.setVisible(true);
    }//GEN-LAST:event_jMIFornecedorActionPerformed

    private void jMIProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIProdutoActionPerformed
        TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto(null, true);
        ControllerCadastroProduto controllerCadastroProduto = new ControllerCadastroProduto(telaCadastroProduto);
        telaCadastroProduto.setVisible(true);
    }//GEN-LAST:event_jMIProdutoActionPerformed

    private void jMICarteirinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICarteirinhaActionPerformed
        TelaCadastroCarteirinha telaCadastroCarteirinha = new TelaCadastroCarteirinha(null, true);
        ControllerCadastroCarteirinha controllerCadastroCarteirinha = new ControllerCadastroCarteirinha(telaCadastroCarteirinha);
        telaCadastroCarteirinha.setVisible(true);
    }//GEN-LAST:event_jMICarteirinhaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaCadastroVenda telaVenda = new TelaCadastroVenda(null, true);
        ControllerVenda controllerCadastroVenda = new ControllerVenda(telaVenda);
        telaVenda.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMICidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICidadeActionPerformed
        TelaCadastroCidade telaCadastroCidade = new TelaCadastroCidade(null, true);
        ControllerCadastroCidade controllerCadastroCidade = new ControllerCadastroCidade(telaCadastroCidade);
        telaCadastroCidade.setVisible(true);
    }//GEN-LAST:event_jMICidadeActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaCadastroMovimentacaoEstoque telaCadastroMovimentacaoEstoque = new TelaCadastroMovimentacaoEstoque(null, true);
        ControllerCadastroMovimentacaoEstoque controllerCadastroMovimentacaoEstoque = new ControllerCadastroMovimentacaoEstoque(telaCadastroMovimentacaoEstoque);
        telaCadastroMovimentacaoEstoque.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMISairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISairActionPerformed
        dispose();
    }//GEN-LAST:event_jMISairActionPerformed

   
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
            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMAjuda;
    private javax.swing.JMenuItem jMIBairro;
    private javax.swing.JMenuItem jMICarteirinha;
    private javax.swing.JMenuItem jMICidade;
    private javax.swing.JMenuItem jMICliente;
    private javax.swing.JMenuItem jMIEndereco;
    private javax.swing.JMenuItem jMIFornecedor;
    private javax.swing.JMenuItem jMIFuncionario;
    private javax.swing.JMenuItem jMIProduto;
    private javax.swing.JMenuItem jMISair;
    private javax.swing.JMenu jMMovimentos;
    private javax.swing.JMenu jMRelatorios;
    private javax.swing.JMenu jMcadastros;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
