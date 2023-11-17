package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaCadastroFornecedor extends javax.swing.JDialog {

    public TelaCadastroFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public JPanel getjPRodape() {
        return jPRodape;
    }

    public JComboBox<String> getjCBCep() {
        return jCBCep;
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

    public TelaCadastroFornecedor(JPanel jPCorpo, JPanel jPRodape) {
        this.jPCorpo = jPCorpo;
        this.jPRodape = jPRodape;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public JLabel getjLCEP() {
        return jLCEP;
    }

    public JLabel getjLCNPJ() {
        return jLCNPJ;
    }

    public JLabel getjLComplemento() {
        return jLComplemento;
    }

    public JLabel getjLEmail() {
        return jLEmail;
    }

    public JLabel getjLID() {
        return jLID;
    }

    public JLabel getjLInscricaoEstadual() {
        return jLInscricaoEstadual;
    }

    public JLabel getjLNome() {
        return jLNome;
    }

    public JLabel getjLRazaoSocial() {
        return jLRazaoSocial;
    }

    public JLabel getjLStatus() {
        return jLStatus;
    }

    public JLabel getjLTelefone1() {
        return jLTelefone1;
    }

    public JLabel getjLTelefone2() {
        return jLTelefone2;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JMenu getjMenu1() {
        return jMenu1;
    }

    public JMenu getjMenu2() {
        return jMenu2;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
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

    public JTextField getjTFCNPJ() {
        return jTFCNPJ;
    }

    public JTextField getjTFComplemento() {
        return jTFComplemento;
    }

    public JTextField getjTFEmail() {
        return jTFEmail;
    }

    public JTextField getjTFID() {
        return jTFID;
    }

    public JTextField getjTFInscricaoEstadual() {
        return jTFInscricaoEstadual;
    }

    public JTextField getjTFNome() {
        return jTFNome;
    }

    public JTextField getjTFRazaoSocial() {
        return jTFRazaoSocial;
    }

    public JTextField getjTFTelefone1() {
        return jTFTelefone1;
    }

    public JTextField getjTFTelefone2() {
        return jTFTelefone2;
    }
    

    public TelaCadastroFornecedor(ButtonGroup buttonGroup1, JButton jBBuscar, JButton jBCancelar, JButton jBGravar, JButton jBNovo, JButton jBSair, JLabel jLBairro, JLabel jLCEP, JLabel jLCNPJ, JLabel jLCidade, JLabel jLComplemento, JLabel jLEmail, JLabel jLID, JLabel jLInscricaoEstadual, JLabel jLLogradouro, JLabel jLNome, JLabel jLRazaoSocial, JLabel jLStatus, JLabel jLTelefone1, JLabel jLTelefone2, JLabel jLabel1, JLabel jLabel2, JMenu jMenu1, JMenu jMenu2, JMenuBar jMenuBar1, JPanel jPCorpo, JPanel jPRodape, JPanel jPTitulo, JRadioButton jRBAtivo, JRadioButton jRBInativo, JTextField jTFBairro, JTextField jTFCNPJ, JTextField jTFCidade, JTextField jTFComplemento, JTextField jTFEmail, JTextField jTFID, JTextField jTFInscricaoEstadual, JTextField jTFLogradouro, JTextField jTFNome, JTextField jTFRazaoSocial, JTextField jTFTelefone1, JTextField jTFTelefone2, JTextField jTextField7) {
        this.buttonGroup1 = buttonGroup1;
        this.jBBuscar = jBBuscar;
        this.jBCancelar = jBCancelar;
        this.jBGravar = jBGravar;
        this.jBNovo = jBNovo;
        this.jBSair = jBSair;
        this.jLCEP = jLCEP;
        this.jLCNPJ = jLCNPJ;
        this.jLComplemento = jLComplemento;
        this.jLEmail = jLEmail;
        this.jLID = jLID;
        this.jLInscricaoEstadual = jLInscricaoEstadual;
        this.jLNome = jLNome;
        this.jLRazaoSocial = jLRazaoSocial;
        this.jLStatus = jLStatus;
        this.jLTelefone1 = jLTelefone1;
        this.jLTelefone2 = jLTelefone2;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jMenu1 = jMenu1;
        this.jMenu2 = jMenu2;
        this.jMenuBar1 = jMenuBar1;
        this.jPCorpo = jPCorpo;
        this.jPRodape = jPRodape;
        this.jPTitulo = jPTitulo;
        this.jRBAtivo = jRBAtivo;
        this.jRBInativo = jRBInativo;
        this.jTFCNPJ = jTFCNPJ;
        this.jTFComplemento = jTFComplemento;
        this.jTFEmail = jTFEmail;
        this.jTFID = jTFID;
        this.jTFInscricaoEstadual = jTFInscricaoEstadual;
        this.jTFNome = jTFNome;
        this.jTFRazaoSocial = jTFRazaoSocial;
        this.jTFTelefone1 = jTFTelefone1;
        this.jTFTelefone2 = jTFTelefone2;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPCorpo = new javax.swing.JPanel();
        jLCNPJ = new javax.swing.JLabel();
        jLInscricaoEstadual = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLID = new javax.swing.JLabel();
        jLTelefone1 = new javax.swing.JLabel();
        jLTelefone2 = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jLStatus = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFRazaoSocial = new javax.swing.JTextField();
        jLRazaoSocial = new javax.swing.JLabel();
        jTFCNPJ = new javax.swing.JTextField();
        jLCEP = new javax.swing.JLabel();
        jLComplemento = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jTFComplemento = new javax.swing.JTextField();
        jRBAtivo = new javax.swing.JRadioButton();
        jRBInativo = new javax.swing.JRadioButton();
        jTFInscricaoEstadual = new javax.swing.JTextField();
        jCBCep = new javax.swing.JComboBox<>();
        jTFEmail = new javax.swing.JTextField();
        jTFTelefone1 = new javax.swing.JTextField();
        jTFTelefone2 = new javax.swing.JTextField();
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

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 63, 65));
        jLabel1.setText("CADASTRO");

        jLabel2.setBackground(new java.awt.Color(153, 255, 153));
        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("FORNECEDOR");

        javax.swing.GroupLayout jPTituloLayout = new javax.swing.GroupLayout(jPTitulo);
        jPTitulo.setLayout(jPTituloLayout);
        jPTituloLayout.setHorizontalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTituloLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(292, 292, 292))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTituloLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(315, 315, 315))))
        );
        jPTituloLayout.setVerticalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPCorpo.setBackground(new java.awt.Color(255, 255, 255));

        jLCNPJ.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLCNPJ.setText("CNPJ");

        jLInscricaoEstadual.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLInscricaoEstadual.setText("Inscrição Estadual");

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

        jTFRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRazaoSocialActionPerformed(evt);
            }
        });

        jLRazaoSocial.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLRazaoSocial.setText("Razão Social");

        jTFCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCNPJActionPerformed(evt);
            }
        });

        jLCEP.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLCEP.setText("CEP");

        jLComplemento.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLComplemento.setText("Complemento");

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

        jTFInscricaoEstadual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFInscricaoEstadualActionPerformed(evt);
            }
        });

        jTFTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefone1ActionPerformed(evt);
            }
        });

        jTFTelefone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefone2ActionPerformed(evt);
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
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLInscricaoEstadual))
                        .addGap(18, 18, 18)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNome)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLRazaoSocial))
                        .addGap(18, 18, 18)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addComponent(jLEmail)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 10, Short.MAX_VALUE))))
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addComponent(jRBAtivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRBInativo))
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPCorpoLayout.createSequentialGroup()
                                            .addComponent(jTFInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTFRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPCorpoLayout.createSequentialGroup()
                                            .addComponent(jLCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(112, 112, 112))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPCorpoLayout.createSequentialGroup()
                                            .addComponent(jLStatus)
                                            .addGap(18, 18, 18)))
                                    .addGroup(jPCorpoLayout.createSequentialGroup()
                                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                                .addComponent(jLTelefone1)
                                                .addGap(109, 109, 109))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCorpoLayout.createSequentialGroup()
                                                .addComponent(jTFTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLTelefone2)
                                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                                .addComponent(jTFTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jCBCep, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLComplemento)
                                    .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPCorpoLayout.setVerticalGroup(
            jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCorpoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLID)
                    .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLCNPJ, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLNome)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLInscricaoEstadual)
                    .addComponent(jLRazaoSocial)
                    .addComponent(jLEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone1)
                    .addComponent(jLTelefone2)
                    .addComponent(jLCEP)
                    .addComponent(jLComplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLStatus)
                .addGap(10, 10, 10)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBAtivo)
                    .addComponent(jRBInativo))
                .addGap(0, 30, Short.MAX_VALUE))
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
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPRodapeLayout.createSequentialGroup()
                    .addGap(0, 15, Short.MAX_VALUE)
                    .addGroup(jPRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBGravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 16, Short.MAX_VALUE)))
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
                    .addComponent(jPRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRazaoSocialActionPerformed

    private void jTFCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCNPJActionPerformed

    private void jTFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIDActionPerformed

    private void jRBAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBAtivoActionPerformed

    private void jRBInativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBInativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBInativoActionPerformed

    private void jTFInscricaoEstadualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFInscricaoEstadualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFInscricaoEstadualActionPerformed

    private void jTFTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefone1ActionPerformed

    private void jTFTelefone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefone2ActionPerformed

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
                TelaCadastroFornecedor dialog = new TelaCadastroFornecedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jCBCep;
    private javax.swing.JLabel jLCEP;
    private javax.swing.JLabel jLCNPJ;
    private javax.swing.JLabel jLComplemento;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLInscricaoEstadual;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLRazaoSocial;
    private javax.swing.JLabel jLStatus;
    private javax.swing.JLabel jLTelefone1;
    private javax.swing.JLabel jLTelefone2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPCorpo;
    private javax.swing.JPanel jPRodape;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JRadioButton jRBAtivo;
    private javax.swing.JRadioButton jRBInativo;
    private javax.swing.JTextField jTFCNPJ;
    private javax.swing.JTextField jTFComplemento;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFInscricaoEstadual;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFRazaoSocial;
    private javax.swing.JTextField jTFTelefone1;
    private javax.swing.JTextField jTFTelefone2;
    // End of variables declaration//GEN-END:variables
}
