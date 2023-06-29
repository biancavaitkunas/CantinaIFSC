/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.awt.Frame;
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
public class TelaCadastroCliente extends javax.swing.JDialog {

    /**
     * Creates new form TelaCadastroEndereco
     */
    public TelaCadastroCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public JPanel getjPRodape() {
        return jPRodape;
    }

    public JPanel getjPCorpo() {
        return jPCorpo;
    }
    
    public JButton getjBCancelar() {
        return jBCancelar;
    }

    public JButton getjBNovo() {
        return jBNovo;
    }

    public JButton getjBBuscar() {
        return jBBuscar;
    }

    public JButton getjBGravar() {
        return jBGravar;
    }

    public JButton getjBSair() {
        return jBSair;
    }

    public void setjLID(JLabel jLID) {
        this.jLID = jLID;
    }

    public TelaCadastroCliente(JPanel jPCorpo, JPanel jPRodape) {
        this.jPCorpo = jPCorpo;
        this.jPRodape = jPRodape;
    }

    public TelaCadastroCliente(ButtonGroup buttonGroup1, JButton jBBuscar, JButton jBCancelar, JButton jBGravar, JButton jBNovo, JButton jBSair, JLabel jLBairro, JLabel jLCEP, JLabel jLCPF, JLabel jLCarteirinha, JLabel jLCidade, JLabel jLCliente, JLabel jLComplemento1, JLabel jLDataNascimento, JLabel jLEmail, JLabel jLID, JLabel jLLogradouro, JLabel jLMatricula, JLabel jLNome, JLabel jLRG, JLabel jLStatus, JLabel jLTelefone1, JLabel jLTelefone2, JLabel jLTitulo, JMenu jMenu1, JMenu jMenu2, JMenuBar jMenuBar1, JPanel jPCorpo, JPanel jPRodape, JPanel jPTitulo, JRadioButton jRBAtivo, JRadioButton jRBInativo, JTextField jTFBairro, JTextField jTFCEP, JTextField jTFCPF, JTextField jTFCarteirinha, JTextField jTFCidade, JTextField jTFComplemento, JTextField jTFDataNascimento, JTextField jTFEmail, JTextField jTFID, JTextField jTFLogradouro, JTextField jTFMatricula, JTextField jTFNome, JTextField jTFRG, JTextField jTFTelefone1, JTextField jTFTelefone2) {
        this.buttonGroup1 = buttonGroup1;
        this.jBBuscar = jBBuscar;
        this.jBCancelar = jBCancelar;
        this.jBGravar = jBGravar;
        this.jBNovo = jBNovo;
        this.jBSair = jBSair;
        this.jLBairro = jLBairro;
        this.jLCEP = jLCEP;
        this.jLCPF = jLCPF;
        this.jLCarteirinha = jLCarteirinha;
        this.jLCidade = jLCidade;
        this.jLCliente = jLCliente;
        this.jLComplemento1 = jLComplemento1;
        this.jLDataNascimento = jLDataNascimento;
        this.jLEmail = jLEmail;
        this.jLID = jLID;
        this.jLLogradouro = jLLogradouro;
        this.jLMatricula = jLMatricula;
        this.jLNome = jLNome;
        this.jLRG = jLRG;
        this.jLStatus = jLStatus;
        this.jLTelefone1 = jLTelefone1;
        this.jLTelefone2 = jLTelefone2;
        this.jLTitulo = jLTitulo;
        this.jMenu1 = jMenu1;
        this.jMenu2 = jMenu2;
        this.jMenuBar1 = jMenuBar1;
        this.jPCorpo = jPCorpo;
        this.jPRodape = jPRodape;
        this.jPTitulo = jPTitulo;
        this.jRBAtivo = jRBAtivo;
        this.jRBInativo = jRBInativo;
        this.jTFBairro = jTFBairro;
        this.jTFCEP = jTFCEP;
        this.jTFCPF = jTFCPF;
        this.jTFCarteirinha = jTFCarteirinha;
        this.jTFCidade = jTFCidade;
        this.jTFComplemento = jTFComplemento;
        this.jTFDataNascimento = jTFDataNascimento;
        this.jTFEmail = jTFEmail;
        this.jTFID = jTFID;
        this.jTFLogradouro = jTFLogradouro;
        this.jTFMatricula = jTFMatricula;
        this.jTFNome = jTFNome;
        this.jTFRG = jTFRG;
        this.jTFTelefone1 = jTFTelefone1;
        this.jTFTelefone2 = jTFTelefone2;
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPTitulo = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jLCliente = new javax.swing.JLabel();
        jPCorpo = new javax.swing.JPanel();
        jLCPF = new javax.swing.JLabel();
        jTFMatricula = new javax.swing.JTextField();
        jLRG = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jTFDataNascimento = new javax.swing.JTextField();
        jLDataNascimento = new javax.swing.JLabel();
        jTFTelefone2 = new javax.swing.JTextField();
        jLNome = new javax.swing.JLabel();
        jLID = new javax.swing.JLabel();
        jLTelefone1 = new javax.swing.JLabel();
        jLTelefone2 = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jLStatus = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFRG = new javax.swing.JTextField();
        jTFCPF = new javax.swing.JTextField();
        jLMatricula = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jTFTelefone1 = new javax.swing.JTextField();
        jLCEP = new javax.swing.JLabel();
        jLLogradouro = new javax.swing.JLabel();
        jLCarteirinha = new javax.swing.JLabel();
        jTFBairro = new javax.swing.JTextField();
        jTFCEP = new javax.swing.JTextField();
        jTFCidade = new javax.swing.JTextField();
        jLCidade = new javax.swing.JLabel();
        jLBairro = new javax.swing.JLabel();
        jTFLogradouro = new javax.swing.JTextField();
        jTFComplemento = new javax.swing.JTextField();
        jRBAtivo = new javax.swing.JRadioButton();
        jRBInativo = new javax.swing.JRadioButton();
        jLComplemento1 = new javax.swing.JLabel();
        jTFCarteirinha = new javax.swing.JTextField();
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

        jLCliente.setBackground(new java.awt.Color(153, 255, 153));
        jLCliente.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        jLCliente.setForeground(new java.awt.Color(51, 51, 51));
        jLCliente.setText("CLIENTE");

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
                        .addGap(298, 298, 298)
                        .addComponent(jLCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPTituloLayout.setVerticalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLCliente)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPCorpo.setBackground(new java.awt.Color(255, 255, 255));

        jLCPF.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLCPF.setText("CPF");

        jTFMatricula.setForeground(new java.awt.Color(255, 255, 255));

        jLRG.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLRG.setText("RG");

        jTFID.setForeground(new java.awt.Color(255, 255, 255));

        jTFDataNascimento.setForeground(new java.awt.Color(255, 255, 255));

        jLDataNascimento.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLDataNascimento.setText("Data de Nascimento");

        jTFTelefone2.setForeground(new java.awt.Color(255, 255, 255));
        jTFTelefone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefone2ActionPerformed(evt);
            }
        });

        jLNome.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLNome.setText("Nome");

        jLID.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLID.setText("ID");

        jLTelefone1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLTelefone1.setText("Telefone1");

        jLTelefone2.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLTelefone2.setText("Telefone 2");

        jLEmail.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLEmail.setText("E-mail");

        jLStatus.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLStatus.setText("Status");

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jTFRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRGActionPerformed(evt);
            }
        });

        jTFCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCPFActionPerformed(evt);
            }
        });

        jLMatricula.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLMatricula.setText("Matrícula");

        jTFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmailActionPerformed(evt);
            }
        });

        jTFTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefone1ActionPerformed(evt);
            }
        });

        jLCEP.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLCEP.setText("CEP");

        jLLogradouro.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLLogradouro.setText("Logradouro");

        jLCarteirinha.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLCarteirinha.setText("Carteirinha");

        jTFBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBairroActionPerformed(evt);
            }
        });

        jTFCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCEPActionPerformed(evt);
            }
        });

        jLCidade.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLCidade.setText("Cidade");

        jLBairro.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLBairro.setText("Bairro");

        jTFLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFLogradouroActionPerformed(evt);
            }
        });

        jRBAtivo.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRBAtivo);
        jRBAtivo.setText("Ativo");
        jRBAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBAtivoActionPerformed(evt);
            }
        });

        jRBInativo.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRBInativo);
        jRBInativo.setText("Inativo");
        jRBInativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBInativoActionPerformed(evt);
            }
        });

        jLComplemento1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLComplemento1.setText("Complemento");

        jTFCarteirinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCarteirinhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCorpoLayout = new javax.swing.GroupLayout(jPCorpo);
        jPCorpo.setLayout(jPCorpoLayout);
        jPCorpoLayout.setHorizontalGroup(
            jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addComponent(jTFDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPCorpoLayout.createSequentialGroup()
                                        .addComponent(jLID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(128, 128, 128)
                                        .addComponent(jLEmail))
                                    .addGroup(jPCorpoLayout.createSequentialGroup()
                                        .addGap(169, 169, 169)
                                        .addComponent(jLRG, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(114, 114, 114)
                                        .addComponent(jLCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFEmail)
                                    .addGroup(jPCorpoLayout.createSequentialGroup()
                                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLMatricula)
                                            .addComponent(jTFMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                                .addComponent(jLCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jTFCEP)))))))
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGap(507, 507, 507)
                        .addComponent(jTFCPF))
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addComponent(jLNome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCorpoLayout.createSequentialGroup()
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFLogradouro)
                                    .addGroup(jPCorpoLayout.createSequentialGroup()
                                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLComplemento1)
                                            .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFCarteirinha, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLCarteirinha))))
                                .addGap(18, 18, 18)
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPCorpoLayout.createSequentialGroup()
                                        .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 4, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCorpoLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLStatus)
                                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                                .addComponent(jRBAtivo)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRBInativo)))
                                        .addGap(2, 2, 2))))
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLDataNascimento)
                                    .addGroup(jPCorpoLayout.createSequentialGroup()
                                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLTelefone1)
                                            .addComponent(jTFTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLTelefone2)))
                                    .addGroup(jPCorpoLayout.createSequentialGroup()
                                        .addComponent(jLLogradouro)
                                        .addGap(310, 310, 310)
                                        .addComponent(jLCidade))
                                    .addGroup(jPCorpoLayout.createSequentialGroup()
                                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFRG, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLBairro)
                            .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPCorpoLayout.setVerticalGroup(
            jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCorpoLayout.createSequentialGroup()
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCorpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLRG, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLCPF, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDataNascimento)
                    .addComponent(jLID)
                    .addComponent(jLEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone1)
                    .addComponent(jLTelefone2)
                    .addComponent(jLMatricula)
                    .addComponent(jLCEP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLLogradouro)
                            .addComponent(jLCidade)
                            .addComponent(jLBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLStatus)
                            .addComponent(jLComplemento1)
                            .addComponent(jLCarteirinha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCarteirinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRBAtivo)
                        .addComponent(jRBInativo)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPRodape.setBackground(new java.awt.Color(204, 255, 204));

        jBNovo.setBackground(new java.awt.Color(204, 204, 204));
        jBNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais (1).png"))); // NOI18N
        jBNovo.setText("Novo");
        jBNovo.setActionCommand("0");
        jBNovo.setPreferredSize(new java.awt.Dimension(112, 23));
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });
        jPRodape.add(jBNovo);

        jBCancelar.setBackground(new java.awt.Color(204, 204, 204));
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/banimento.png"))); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.setActionCommand("1");
        jBCancelar.setEnabled(false);
        jBCancelar.setPreferredSize(new java.awt.Dimension(112, 23));
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        jPRodape.add(jBCancelar);

        jBGravar.setBackground(new java.awt.Color(204, 204, 204));
        jBGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/download-de-pasta (3).png"))); // NOI18N
        jBGravar.setText("Gravar");
        jBGravar.setActionCommand("1");
        jBGravar.setEnabled(false);
        jBGravar.setPreferredSize(new java.awt.Dimension(112, 23));
        jPRodape.add(jBGravar);

        jBBuscar.setBackground(new java.awt.Color(204, 204, 204));
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png"))); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.setActionCommand("0");
        jBBuscar.setPreferredSize(new java.awt.Dimension(112, 23));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        jPRodape.add(jBBuscar);

        jBSair.setBackground(new java.awt.Color(204, 204, 204));
        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jBSair.setText("Sair");
        jBSair.setActionCommand("0");
        jBSair.setPreferredSize(new java.awt.Dimension(112, 23));
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });
        jPRodape.add(jBSair);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCorpo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFTelefone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefone2ActionPerformed
    
    }//GEN-LAST:event_jTFTelefone2ActionPerformed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRGActionPerformed
    }//GEN-LAST:event_jTFRGActionPerformed

    private void jTFCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCPFActionPerformed
    }//GEN-LAST:event_jTFCPFActionPerformed

    private void jTFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmailActionPerformed
    }//GEN-LAST:event_jTFEmailActionPerformed

    private void jTFTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefone1ActionPerformed
    }//GEN-LAST:event_jTFTelefone1ActionPerformed

    private void jTFCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCEPActionPerformed
    }//GEN-LAST:event_jTFCEPActionPerformed

    private void jTFBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBairroActionPerformed
    }//GEN-LAST:event_jTFBairroActionPerformed

    private void jTFLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFLogradouroActionPerformed
    }//GEN-LAST:event_jTFLogradouroActionPerformed

    private void jRBInativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBInativoActionPerformed
    }//GEN-LAST:event_jRBInativoActionPerformed

    private void jRBAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBAtivoActionPerformed
    }//GEN-LAST:event_jRBAtivoActionPerformed

    private void jTFCarteirinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCarteirinhaActionPerformed
    }//GEN-LAST:event_jTFCarteirinhaActionPerformed

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscarActionPerformed

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
                TelaCadastroCliente dialog = new TelaCadastroCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCEP;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCarteirinha;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLComplemento1;
    private javax.swing.JLabel jLDataNascimento;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLLogradouro;
    private javax.swing.JLabel jLMatricula;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLRG;
    private javax.swing.JLabel jLStatus;
    private javax.swing.JLabel jLTelefone1;
    private javax.swing.JLabel jLTelefone2;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPCorpo;
    private javax.swing.JPanel jPRodape;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JRadioButton jRBAtivo;
    private javax.swing.JRadioButton jRBInativo;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCEP;
    private javax.swing.JTextField jTFCPF;
    private javax.swing.JTextField jTFCarteirinha;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFComplemento;
    private javax.swing.JTextField jTFDataNascimento;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFLogradouro;
    private javax.swing.JTextField jTFMatricula;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFRG;
    private javax.swing.JTextField jTFTelefone1;
    private javax.swing.JTextField jTFTelefone2;
    // End of variables declaration//GEN-END:variables
}
