/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author bianc
 */
public class TelaCadastroProduto extends javax.swing.JDialog {

    /**
     * Creates new form TelaCadastroEndereco
     */
    public TelaCadastroProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public JButton getjBBuscar() {
        return jBBuscar;
    }

    public JButton getjBCancelar() {
        return jBCancelar;
    }

    public JButton getjBGravar() {
        return jBGravar;
    }

    public JButton getjBNovo() {
        return jBNovo;
    }

    public JButton getjBSair() {
        return jBSair;
    }

    public JTextField getjTFCodigoBarra() {
        return jTFCodigoBarra;
    }

    public JTextField getjTFID() {
        return jTFID;
    }

    public JTextField getjTFNome() {
        return jTFNome;
    }

    public void setjBBuscar(JButton jBBuscar) {
        this.jBBuscar = jBBuscar;
    }

    public void setjBCancelar(JButton jBCancelar) {
        this.jBCancelar = jBCancelar;
    }

    public void setjBGravar(JButton jBGravar) {
        this.jBGravar = jBGravar;
    }

    public void setjBNovo(JButton jBNovo) {
        this.jBNovo = jBNovo;
    }

    public void setjBSair(JButton jBSair) {
        this.jBSair = jBSair;
    }

    public void setjTFCodigoBarra(JTextField jTFCodigoBarra) {
        this.jTFCodigoBarra = jTFCodigoBarra;
    }

    public void setjTFID(JTextField jTFID) {
        this.jTFID = jTFID;
    }

    public void setjTFNome(JTextField jTFNome) {
        this.jTFNome = jTFNome;
    }

    public JPanel getjPCorpo() {
        return jPCorpo;
    }

    public JPanel getjPRodape() {
        return jPRodape;
    }

    public void setjPCorpo(JPanel jPCorpo) {
        this.jPCorpo = jPCorpo;
    }

    public void setjPRodape(JPanel jPRodape) {
        this.jPRodape = jPRodape;
    }
    
    

    public TelaCadastroProduto(ButtonGroup buttonGroup1, JButton jBBuscar, JButton jBCancelar, JButton jBGravar, JButton jBNovo, JButton jBSair, JLabel jLCodigoBarra, JLabel jLID, JLabel jLNumero, JLabel jLProduto, JLabel jLStatus, JLabel jLTitulo, JMenu jMenu1, JMenu jMenu2, JMenuBar jMenuBar1, JPanel jPCorpo, JPanel jPRodape, JPanel jPTitulo, JRadioButton jRBAtivo, JRadioButton jRBInativo, JTextField jTFCodigoBarra, JTextField jTFID, JTextField jTFNome) {
        this.buttonGroup1 = buttonGroup1;
        this.jBBuscar = jBBuscar;
        this.jBCancelar = jBCancelar;
        this.jBGravar = jBGravar;
        this.jBNovo = jBNovo;
        this.jBSair = jBSair;
        this.jLCodigoBarra = jLCodigoBarra;
        this.jLID = jLID;
        this.jLNumero = jLNumero;
        this.jLProduto = jLProduto;
        this.jLStatus = jLStatus;
        this.jLTitulo = jLTitulo;
        this.jMenu1 = jMenu1;
        this.jMenu2 = jMenu2;
        this.jMenuBar1 = jMenuBar1;
        this.jPCorpo = jPCorpo;
        this.jPRodape = jPRodape;
        this.jPTitulo = jPTitulo;
        this.jRBAtivo = jRBAtivo;
        this.jRBInativo = jRBInativo;
        this.jTFCodigoBarra = jTFCodigoBarra;
        this.jTFID = jTFID;
        this.jTFNome = jTFNome;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPTitulo = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jLProduto = new javax.swing.JLabel();
        jPCorpo = new javax.swing.JPanel();
        jLID = new javax.swing.JLabel();
        jTFCodigoBarra = new javax.swing.JTextField();
        jLNumero = new javax.swing.JLabel();
        jLCodigoBarra = new javax.swing.JLabel();
        jLStatus = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFID = new javax.swing.JTextField();
        jRBAtivo = new javax.swing.JRadioButton();
        jRBInativo = new javax.swing.JRadioButton();
        jPRodape = new javax.swing.JPanel();
        jBNovo = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBGravar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPTitulo.setBackground(new java.awt.Color(204, 255, 204));
        jPTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLTitulo.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(60, 63, 65));
        jLTitulo.setText("CADASTRO");

        jLProduto.setBackground(new java.awt.Color(153, 255, 153));
        jLProduto.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        jLProduto.setForeground(new java.awt.Color(51, 51, 51));
        jLProduto.setText("PRODUTO");

        javax.swing.GroupLayout jPTituloLayout = new javax.swing.GroupLayout(jPTitulo);
        jPTitulo.setLayout(jPTituloLayout);
        jPTituloLayout.setHorizontalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloLayout.createSequentialGroup()
                .addGroup(jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPTituloLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLTitulo))
                    .addGroup(jPTituloLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLProduto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPTituloLayout.setVerticalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLProduto)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPCorpo.setBackground(new java.awt.Color(255, 255, 255));

        jLID.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLID.setText("ID");

        jTFCodigoBarra.setForeground(new java.awt.Color(255, 255, 255));
        jTFCodigoBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodigoBarraActionPerformed(evt);
            }
        });

        jLNumero.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLNumero.setText("Nome");

        jLCodigoBarra.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLCodigoBarra.setText("Código de Barra");

        jLStatus.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLStatus.setText("Status");

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jTFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIDActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBAtivo);
        jRBAtivo.setText("Ativo");
        jRBAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBAtivoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBInativo);
        jRBInativo.setText("Inativo");
        jRBInativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBInativoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCorpoLayout = new javax.swing.GroupLayout(jPCorpo);
        jPCorpo.setLayout(jPCorpoLayout);
        jPCorpoLayout.setHorizontalGroup(
            jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCorpoLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCorpoLayout.createSequentialGroup()
                        .addComponent(jLCodigoBarra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLStatus)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCorpoLayout.createSequentialGroup()
                        .addComponent(jTFCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jRBAtivo)
                        .addGap(18, 18, 18)
                        .addComponent(jRBInativo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPCorpoLayout.setVerticalGroup(
            jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCorpoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNumero)
                    .addComponent(jLID))
                .addGap(6, 6, 6)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigoBarra)
                    .addComponent(jLStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBAtivo)
                    .addComponent(jRBInativo))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPRodape.setBackground(new java.awt.Color(204, 255, 204));

        jBNovo.setBackground(new java.awt.Color(255, 255, 255));
        jBNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais (1).png"))); // NOI18N
        jBNovo.setText("Novo");
        jBNovo.setActionCommand("0");
        jBNovo.setPreferredSize(new java.awt.Dimension(115, 23));
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/banimento.png"))); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.setActionCommand("1");
        jBCancelar.setPreferredSize(new java.awt.Dimension(115, 23));

        jBGravar.setBackground(new java.awt.Color(255, 255, 255));
        jBGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/download-de-pasta (3).png"))); // NOI18N
        jBGravar.setText("Gravar");
        jBGravar.setActionCommand("1");
        jBGravar.setPreferredSize(new java.awt.Dimension(115, 23));

        jBBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png"))); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.setActionCommand("0");
        jBBuscar.setPreferredSize(new java.awt.Dimension(115, 23));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBSair.setBackground(new java.awt.Color(255, 255, 255));
        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jBSair.setText("Sair");
        jBSair.setActionCommand("0");
        jBSair.setPreferredSize(new java.awt.Dimension(115, 23));
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPRodapeLayout = new javax.swing.GroupLayout(jPRodape);
        jPRodape.setLayout(jPRodapeLayout);
        jPRodapeLayout.setHorizontalGroup(
            jPRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPRodapeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jBGravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPRodapeLayout.setVerticalGroup(
            jPRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
            .addGroup(jPRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPRodapeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBGravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCorpo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPRodape, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSairActionPerformed

    private void jRBInativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBInativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBInativoActionPerformed

    private void jRBAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBAtivoActionPerformed

    private void jTFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIDActionPerformed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFCodigoBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodigoBarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodigoBarraActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastroProduto dialog = new TelaCadastroProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLCodigoBarra;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLProduto;
    private javax.swing.JLabel jLStatus;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPCorpo;
    private javax.swing.JPanel jPRodape;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JRadioButton jRBAtivo;
    private javax.swing.JRadioButton jRBInativo;
    private javax.swing.JTextField jTFCodigoBarra;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFNome;
    // End of variables declaration//GEN-END:variables
}