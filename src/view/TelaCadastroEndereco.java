
package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaCadastroEndereco extends javax.swing.JDialog {

    public TelaCadastroEndereco(java.awt.Frame parent, boolean modal) {
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

    public JButton getjBSair() {
        return jBSair;
    }

    public JTextField getjTFBairro() {
        return jTFLogradouro;
    }

    public JTextField getjTFCidade() {
        return jTFCidade;
    }

    public JTextField getjTFLogradouro() {
        return jTFLogradouro;
    }

    public JTextField getjTFID() {
        return jTFID;
    }

    public void setjTFID(JTextField jTFId) {
        this.jTFID = jTFID;
    }

    public JPanel getjPRodape() {
        return jPRodape;
    }

    public JPanel getjPCorpo() {
        return jPCorpo;
    }

    public JButton getjBNovo() {
        return jBNovo;
    }

    public void setjLLogradouro(JLabel jLLogradouro) {
        this.jLLogradouro = jLLogradouro;
    }

    public void setjTFLogradouro(JTextField jTFLogradouro) {
        this.jTFLogradouro = jTFLogradouro;
    }

    public void setjTFCEP(JFormattedTextField jFTFCEP) {
        this.jTFCEP = jFTFCEP;
    }

    public void setjTFBairro(JTextField jTFBairro) {
        this.jTFLogradouro = jTFBairro;
    }

    public void setjTFCidade(JTextField jTFCidade) {
        this.jTFCidade = jTFCidade;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public JComboBox<String> getjCBUF() {
        return jCBUF;
    }

    public JLabel getjLBairro() {
        return jLBairro;
    }

    public JLabel getjLCEP() {
        return jLCEP;
    }

    public JLabel getjLCidade() {
        return jLCidade;
    }

    public JLabel getjLEndereco() {
        return jLEndereco;
    }

    public JLabel getjLID() {
        return jLID;
    }

    public JLabel getjLLogradouro() {
        return jLLogradouro;
    }

    public JLabel getjLStatus() {
        return jLStatus;
    }

    public JLabel getjLTitulo() {
        return jLTitulo;
    }

    public JLabel getjLUF() {
        return jLUF;
    }

    public JPanel getjPTitulo() {
        return jPTitulo;
    }

    public JRadioButton getjRBAtivo() {
        return jRBAtivo;
    }

    public JRadioButton getjRBInativo() {
        return jRBInativo;
    }
    
    

    public TelaCadastroEndereco(ButtonGroup buttonGroup1, JButton jBBuscar, JButton jBCancelar, JButton jBGravar, JButton jBNovo, JButton jBSair, JComboBox<String> jCBUF, JFormattedTextField jFTFCEP, JLabel jLBairro, JLabel jLCEP, JLabel jLCidade, JLabel jLEndereco, JLabel jLID, JLabel jLLogradouro, JLabel jLStatus, JLabel jLTitulo, JLabel jLUF, JPanel jPCorpo, JPanel jPRodape, JPanel jPTitulo, JRadioButton jRBAtivo, JRadioButton jRBInativo, JTextField jTFBairro, JTextField jTFCidade, JTextField jTFID, JTextField jTFLogradouro) {
        this.buttonGroup1 = buttonGroup1;
        this.jBBuscar = jBBuscar;
        this.jBCancelar = jBCancelar;
        this.jBGravar = jBGravar;
        this.jBNovo = jBNovo;
        this.jBSair = jBSair;
        this.jCBUF = jCBUF;
        this.jTFCEP = jFTFCEP;
        this.jLBairro = jLBairro;
        this.jLCEP = jLCEP;
        this.jLCidade = jLCidade;
        this.jLEndereco = jLEndereco;
        this.jLID = jLID;
        this.jLLogradouro = jLLogradouro;
        this.jLStatus = jLStatus;
        this.jLTitulo = jLTitulo;
        this.jLUF = jLUF;
        this.jPCorpo = jPCorpo;
        this.jPRodape = jPRodape;
        this.jPTitulo = jPTitulo;
        this.jRBAtivo = jRBAtivo;
        this.jRBInativo = jRBInativo;
        this.jTFLogradouro = jTFBairro;
        this.jTFCidade = jTFCidade;
        this.jTFID = jTFID;
        this.jTFLogradouro = jTFLogradouro;
    }

    public JTextField getjTFBairro1() {
        return jTFBairro1;
    }

    public JTextField getjTFCEP() {
        return jTFCEP;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPTitulo = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jLEndereco = new javax.swing.JLabel();
        jPCorpo = new javax.swing.JPanel();
        jLID = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jLCEP = new javax.swing.JLabel();
        jLLogradouro = new javax.swing.JLabel();
        jLStatus = new javax.swing.JLabel();
        jLCidade = new javax.swing.JLabel();
        jLBairro = new javax.swing.JLabel();
        jTFLogradouro = new javax.swing.JTextField();
        jLUF = new javax.swing.JLabel();
        jCBUF = new javax.swing.JComboBox<>();
        jRBAtivo = new javax.swing.JRadioButton();
        jRBInativo = new javax.swing.JRadioButton();
        jTFCidade = new javax.swing.JTextField();
        jTFBairro1 = new javax.swing.JTextField();
        jTFCEP = new javax.swing.JTextField();
        jPRodape = new javax.swing.JPanel();
        jBNovo = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBGravar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPTitulo.setBackground(new java.awt.Color(204, 255, 204));
        jPTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLTitulo.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(60, 63, 65));
        jLTitulo.setText("CADASTRO");

        jLEndereco.setBackground(new java.awt.Color(153, 255, 153));
        jLEndereco.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        jLEndereco.setForeground(new java.awt.Color(51, 51, 51));
        jLEndereco.setText("ENDEREÇO");

        javax.swing.GroupLayout jPTituloLayout = new javax.swing.GroupLayout(jPTitulo);
        jPTitulo.setLayout(jPTituloLayout);
        jPTituloLayout.setHorizontalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLTitulo)
                .addContainerGap(241, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLEndereco)
                .addGap(270, 270, 270))
        );
        jPTituloLayout.setVerticalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLEndereco)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 636, -1));

        jPCorpo.setBackground(new java.awt.Color(255, 255, 255));

        jLID.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLID.setText("ID");

        jTFID.setForeground(new java.awt.Color(255, 255, 255));
        jTFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIDActionPerformed(evt);
            }
        });

        jLCEP.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLCEP.setText("CEP");

        jLLogradouro.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLLogradouro.setText("Logradouro");

        jLStatus.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLStatus.setText("Status");

        jLCidade.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLCidade.setText("Cidade");

        jLBairro.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLBairro.setText("Bairro");

        jTFLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFLogradouroActionPerformed(evt);
            }
        });

        jLUF.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLUF.setText("UF");

        jCBUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        jCBUF.setSelectedIndex(-1);

        buttonGroup1.add(jRBAtivo);
        jRBAtivo.setText("Ativo");

        buttonGroup1.add(jRBInativo);
        jRBInativo.setText("Inativo");
        jRBInativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBInativoActionPerformed(evt);
            }
        });

        jTFCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCidadeActionPerformed(evt);
            }
        });

        jTFBairro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBairro1ActionPerformed(evt);
            }
        });

        jTFCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCEPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCorpoLayout = new javax.swing.GroupLayout(jPCorpo);
        jPCorpo.setLayout(jPCorpoLayout);
        jPCorpoLayout.setHorizontalGroup(
            jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCorpoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addComponent(jRBAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRBInativo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLStatus)))
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLUF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCidade)
                            .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPCorpoLayout.setVerticalGroup(
            jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCorpoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLID)
                    .addComponent(jLCEP)
                    .addComponent(jLUF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCidade)
                    .addComponent(jLBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLogradouro)
                    .addComponent(jLStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBAtivo)
                    .addComponent(jRBInativo)
                    .addComponent(jTFLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(jPCorpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 90, 650, 293));

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
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBGravar.setBackground(new java.awt.Color(255, 255, 255));
        jBGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/download-de-pasta (3).png"))); // NOI18N
        jBGravar.setText("Gravar");
        jBGravar.setActionCommand("1");
        jBGravar.setPreferredSize(new java.awt.Dimension(115, 23));
        jBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravarActionPerformed(evt);
            }
        });

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
            .addGap(0, 636, Short.MAX_VALUE)
            .addGroup(jPRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPRodapeLayout.createSequentialGroup()
                    .addGap(0, 20, Short.MAX_VALUE)
                    .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jBGravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 21, Short.MAX_VALUE)))
        );
        jPRodapeLayout.setVerticalGroup(
            jPRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
            .addGroup(jPRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPRodapeLayout.createSequentialGroup()
                    .addGap(0, 9, Short.MAX_VALUE)
                    .addGroup(jPRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBGravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        getContentPane().add(jPRodape, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 388, 636, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed

    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed

    }//GEN-LAST:event_jBSairActionPerformed

    private void jTFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIDActionPerformed
    
    }//GEN-LAST:event_jTFIDActionPerformed

    private void jTFLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFLogradouroActionPerformed

    }//GEN-LAST:event_jTFLogradouroActionPerformed

    private void jRBInativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBInativoActionPerformed
    }//GEN-LAST:event_jRBInativoActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed

    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed
    }//GEN-LAST:event_jBGravarActionPerformed

    private void jTFCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCidadeActionPerformed

    private void jTFBairro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBairro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBairro1ActionPerformed

    private void jTFCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCEPActionPerformed

    
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
                TelaCadastroEndereco dialog = new TelaCadastroEndereco(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jCBUF;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCEP;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLEndereco;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLLogradouro;
    private javax.swing.JLabel jLStatus;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLUF;
    private javax.swing.JPanel jPCorpo;
    private javax.swing.JPanel jPRodape;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JRadioButton jRBAtivo;
    private javax.swing.JRadioButton jRBInativo;
    private javax.swing.JTextField jTFBairro1;
    private javax.swing.JTextField jTFCEP;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFLogradouro;
    // End of variables declaration//GEN-END:variables
}
