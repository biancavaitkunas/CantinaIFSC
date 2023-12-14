
package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class TelaCadastroFuncionario extends javax.swing.JDialog {

    /**
     * Creates new form TelaCadastroEndereco
     */
    public TelaCadastroFuncionario(java.awt.Frame parent, boolean modal) {
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

    public JTextField getjTFComplementoEndereco() {
        return jTFComplementoEndereco;
    }

    public JTextField getjTFRg() {
        return jTFRg;
    }
    

    public JButton getjBNovo() {
        return jBNovo;
    }

    public JButton getjBSair() {
        return jBSair;
    }

    public JPanel getjPCorpo() {
        return jPCorpo;
    }

    public JPanel getjPRodape() {
        return jPRodape;
    }

    public JLabel getjLID() {
        return jLID;
    }
    
    public JTextField getjTFEmail() {
        return jTFEmail;
    }

    public JTextField getjTFID() {
        return jTFID;
    }

    public JTextField getjTFSenha() {
        return jTFSenha;
    }

    public JTextField getjTFTelefone1() {
        return jTFTelefone1;
    }

    public JTextField getjTFTelefone2() {
        return jTFUsuario;
    }

    public JTextField getjTFUsuario() {
        return jTFUsuario;
    }

    public JTextField getjTextField14() {
        return jTFComplementoEndereco;
    }

    public JTextField getjTextField5() {
        return jTFNome;
    }

    public JTextField getjTextField6() {
        return jTFRg;
    }

    public JFormattedTextField getjFTFCPF() {
        return jFTFCPF;
    }

    public void setjFTFCPF(JFormattedTextField jFTFCPF) {
        this.jFTFCPF = jFTFCPF;
    }

    public JTextField getjTFTelefone3() {
        return jTFTelefone3;
    }

    public void setjTFTelefone3(JTextField jTFTelefone3) {
        this.jTFTelefone3 = jTFTelefone3;
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

    public void setjPCorpo(JPanel jPCorpo) {
        this.jPCorpo = jPCorpo;
    }

    public void setjPRodape(JPanel jPRodape) {
        this.jPRodape = jPRodape;
    }

    public void setjTFEmail(JTextField jTFEmail) {
        this.jTFEmail = jTFEmail;
    }

    public void setjTFID(JTextField jTFID) {
        this.jTFID = jTFID;
    }

    public void setjTFSenha(JTextField jTFSenha) {
        this.jTFSenha = jTFSenha;
    }

    public void setjTFTelefone1(JTextField jTFTelefone1) {
        this.jTFTelefone1 = jTFTelefone1;
    }

    public void setjTFTelefone2(JTextField jTFTelefone2) {
        this.jTFUsuario = jTFTelefone2;
    }

    public void setjTFUsuario(JTextField jTFUsuario) {
        this.jTFUsuario = jTFUsuario;
    }

    public JTextField getjTFNome() {
        return jTFNome;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public JLabel getjLNome() {
        return jLNome;
    }

    public JLabel getjLRG() {
        return jLRG;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }
    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public JLabel getjLabel8() {
        return jLID;
    }

    public JLabel getjLabel9() {
        return jLabel9;
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

    public JRadioButton getjRadioButton1() {
        return jRadioButton1;
    }

    public JRadioButton getjRadioButton2() {
        return jRadioButton2;
    }

    

    public TelaCadastroFuncionario(JButton jBBuscar, JButton jBCancelar, JButton jBGravar, JButton jBNovo, JButton jBSair, JPanel jPCorpo, JPanel jPRodape, JTextField jTFBairro, JTextField jTFCEP, JTextField jTFCidade, JTextField jTFEmail, JTextField jTFID, JTextField jTFLogradouro, JTextField jTFSenha, JTextField jTFTelefone1, JTextField jTFTelefone2, JTextField jTFUsuario, JTextField jTextField14, JTextField jTextField5, JTextField jTextField6, JTextField jTextField7) {
        this.jBBuscar = jBBuscar;
        this.jBCancelar = jBCancelar;
        this.jBGravar = jBGravar;
        this.jBNovo = jBNovo;
        this.jBSair = jBSair;
        this.jPCorpo = jPCorpo;
        this.jPRodape = jPRodape;
        this.jTFEmail = jTFEmail;
        this.jTFID = jTFID;
        this.jTFSenha = jTFSenha;
        this.jTFTelefone1 = jTFTelefone1;
        this.jTFUsuario = jTFTelefone2;
        this.jTFUsuario = jTFUsuario;
        this.jTFComplementoEndereco = jTextField14;
        this.jTFNome = jTextField5;
        this.jTFRg = jTextField6;
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
        jLabel3 = new javax.swing.JLabel();
        jTFSenha = new javax.swing.JTextField();
        jLRG = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLID = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFRg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jTFID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTFComplementoEndereco = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTFTelefone1 = new javax.swing.JTextField();
        jTFUsuario = new javax.swing.JTextField();
        jTFTelefone3 = new javax.swing.JTextField();
        jFTFCPF = new javax.swing.JFormattedTextField();
        jFTFCep = new javax.swing.JFormattedTextField();
        jBBuscaEndereco = new javax.swing.JButton();
        jBCadastraEndereco = new javax.swing.JButton();
        jLCEP4 = new javax.swing.JLabel();
        jTFUf = new javax.swing.JTextField();
        jLCEP1 = new javax.swing.JLabel();
        jTFBairro = new javax.swing.JTextField();
        jLCEP2 = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
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
        jLabel2.setText("FUNCIONÁRIO");

        javax.swing.GroupLayout jPTituloLayout = new javax.swing.GroupLayout(jPTitulo);
        jPTitulo.setLayout(jPTituloLayout);
        jPTituloLayout.setHorizontalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(330, 330, 330))
            .addGroup(jPTituloLayout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel3.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLabel3.setText("CPF");

        jTFSenha.setForeground(new java.awt.Color(255, 255, 255));

        jLRG.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLRG.setText("RG");

        jLabel6.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLabel6.setText("Usuário");

        jLNome.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLNome.setText("Nome");

        jLID.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLID.setText("ID");

        jLabel9.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLabel9.setText("Telefone1");

        jLabel10.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLabel10.setText("Telefone 2");

        jLabel11.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLabel11.setText("E-mail");

        jLabel12.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLabel12.setText("Status");

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jTFRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRgActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLabel5.setText("Senha");

        jTFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmailActionPerformed(evt);
            }
        });

        jTFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIDActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLabel13.setText("CEP");

        jLabel16.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLabel16.setText("Complemento");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Ativo");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Inativo");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jTFTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefone1ActionPerformed(evt);
            }
        });

        jTFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUsuarioActionPerformed(evt);
            }
        });

        jTFTelefone3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefone3ActionPerformed(evt);
            }
        });

        try {
            jFTFCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jBBuscaEndereco.setText("...");
        jBBuscaEndereco.setActionCommand("0");
        jBBuscaEndereco.setPreferredSize(new java.awt.Dimension(35, 22));
        jBBuscaEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscaEnderecoActionPerformed(evt);
            }
        });

        jBCadastraEndereco.setText("+");
        jBCadastraEndereco.setPreferredSize(new java.awt.Dimension(35, 22));
        jBCadastraEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastraEnderecoActionPerformed(evt);
            }
        });

        jLCEP4.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLCEP4.setText("UF");

        jLCEP1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLCEP1.setText("Bairro");

        jLCEP2.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLCEP2.setText("Cidade");

        javax.swing.GroupLayout jPCorpoLayout = new javax.swing.GroupLayout(jPCorpo);
        jPCorpo.setLayout(jPCorpoLayout);
        jPCorpoLayout.setHorizontalGroup(
            jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCorpoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCorpoLayout.createSequentialGroup()
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel16)
                            .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jFTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscaEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCadastraEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTFComplementoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPCorpoLayout.createSequentialGroup()
                            .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPCorpoLayout.createSequentialGroup()
                                    .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLNome)))
                                .addGroup(jPCorpoLayout.createSequentialGroup()
                                    .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPCorpoLayout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(103, 103, 103))
                                        .addGroup(jPCorpoLayout.createSequentialGroup()
                                            .addComponent(jTFTelefone1)
                                            .addGap(17, 17, 17)))
                                    .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPCorpoLayout.createSequentialGroup()
                                            .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(jTFTelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(19, 19, 19)
                                            .addComponent(jLabel11))
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(45, 45, 45)
                                    .addComponent(jLCEP4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPCorpoLayout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPCorpoLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jFTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPCorpoLayout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(jLCEP1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jTFEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(28, 28, 28)
                                .addComponent(jRadioButton2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLRG, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFRg, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTFUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jLCEP2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCidade))
                        .addContainerGap(74, Short.MAX_VALUE))))
        );
        jPCorpoLayout.setVerticalGroup(
            jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCorpoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLID)
                    .addComponent(jLNome)
                    .addComponent(jLabel3)
                    .addComponent(jLRG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFTelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLCEP4)))
                    .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLCEP1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLCEP2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscaEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCadastraEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFComplementoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(45, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRgActionPerformed

    private void jTFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEmailActionPerformed

    private void jTFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIDActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTFTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefone1ActionPerformed

    private void jTFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUsuarioActionPerformed

    private void jTFTelefone3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefone3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefone3ActionPerformed

    private void jBBuscaEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscaEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscaEnderecoActionPerformed

    private void jBCadastraEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastraEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCadastraEnderecoActionPerformed

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
                TelaCadastroFuncionario dialog = new TelaCadastroFuncionario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBBuscaEndereco;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCadastraEndereco;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBSair;
    private javax.swing.JFormattedTextField jFTFCPF;
    private javax.swing.JFormattedTextField jFTFCep;
    private javax.swing.JLabel jLCEP1;
    private javax.swing.JLabel jLCEP2;
    private javax.swing.JLabel jLCEP4;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLRG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPCorpo;
    private javax.swing.JPanel jPRodape;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFComplementoEndereco;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFRg;
    private javax.swing.JTextField jTFSenha;
    private javax.swing.JTextField jTFTelefone1;
    private javax.swing.JTextField jTFTelefone3;
    private javax.swing.JTextField jTFUf;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
