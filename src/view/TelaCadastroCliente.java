package view;

import java.awt.Frame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class TelaCadastroCliente extends javax.swing.JDialog {

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

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public JLabel getjLCEP() {
        return jLCEP;
    }

    public JLabel getjLCPF() {
        return jLCPF;
    }

    public JTextField getjTFRg() {
        return jTFRg;
    }

    public JLabel getjLCliente() {
        return jLCliente;
    }

    public JLabel getjLComplemento1() {
        return jLComplemento1;
    }

    public JLabel getjLDataNascimento() {
        return jLDataNascimento;
    }

    public JLabel getjLEmail() {
        return jLEmail;
    }

    public JLabel getjLID() {
        return jLID;
    }


    public JLabel getjLMatricula() {
        return jLMatricula;
    }

    public JLabel getjLNome() {
        return jLNome;
    }

    public JLabel getjLRG() {
        return jLRG;
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

    public JLabel getjLTitulo() {
        return jLTitulo;
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

    public JComboBox<String> getjCBCep() {
        return jCBCep;
    }

    public JTextField getjTFCPF() {
        return jTFCPF;
    }


    public JTextField getjTFComplemento() {
        return jTFComplemento;
    }

    public JTextField getjTFDataNascimento() {
        return jTFDataNascimento;
    }

    public JTextField getjTFEmail() {
        return jTFEmail;
    }

    public JTextField getjTFID() {
        return jTFID;
    }


    public JTextField getjTFMatricula() {
        return jTFMatricula;
    }

    public JTextField getjTFNome() {
        return jTFNome;
    }

    public JTextField getjTFRG() {
        return jTFRg;
    }

    public JTextField getjTFTelefone1() {
        return jTFTelefone1;
    }

    public JTextField getjTFTelefone2() {
        return jTFTelefone2;
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
        this.jLCEP = jLCEP;
        this.jLCPF = jLCPF;
        this.jLCliente = jLCliente;
        this.jLComplemento1 = jLComplemento1;
        this.jLDataNascimento = jLDataNascimento;
        this.jLEmail = jLEmail;
        this.jLID = jLID;
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
        this.jTFCPF = jTFCPF;
        this.jTFComplemento = jTFComplemento;
        this.jTFDataNascimento = jTFDataNascimento;
        this.jTFEmail = jTFEmail;
        this.jTFID = jTFID;
        this.jTFMatricula = jTFMatricula;
        this.jTFNome = jTFNome;
        this.jTFRg = jTFRG;
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
        jLRG = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jLDataNascimento = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLID = new javax.swing.JLabel();
        jLTelefone1 = new javax.swing.JLabel();
        jLTelefone2 = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jLStatus = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFRg = new javax.swing.JTextField();
        jTFCPF = new javax.swing.JTextField();
        jLMatricula = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jTFTelefone1 = new javax.swing.JTextField();
        jLCEP = new javax.swing.JLabel();
        jTFComplemento = new javax.swing.JTextField();
        jRBAtivo = new javax.swing.JRadioButton();
        jRBInativo = new javax.swing.JRadioButton();
        jLComplemento1 = new javax.swing.JLabel();
        jTFDataNascimento = new javax.swing.JTextField();
        jTFTelefone2 = new javax.swing.JTextField();
        jTFMatricula = new javax.swing.JTextField();
        jCBCep = new javax.swing.JComboBox<>();
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

        jLRG.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLRG.setText("RG");

        jTFID.setForeground(new java.awt.Color(255, 255, 255));

        jLDataNascimento.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLDataNascimento.setText("Data de Nascimento");

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

        jTFRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRgActionPerformed(evt);
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

        jTFDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDataNascimentoActionPerformed(evt);
            }
        });

        jTFTelefone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefone2ActionPerformed(evt);
            }
        });

        jTFMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMatriculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCorpoLayout = new javax.swing.GroupLayout(jPCorpo);
        jPCorpo.setLayout(jPCorpoLayout);
        jPCorpoLayout.setHorizontalGroup(
            jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCorpoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTFDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addComponent(jLID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLDataNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFID, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jTFMatricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNome)
                                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLEmail))
                                .addGap(18, 18, 18)
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLRG, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addGap(342, 342, 342)
                                .addComponent(jCBCep, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPCorpoLayout.createSequentialGroup()
                                    .addGap(164, 164, 164)
                                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLTelefone2)
                                    .addComponent(jTFTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLStatus)))
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addComponent(jLMatricula)
                                .addGap(109, 109, 109)
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLTelefone1)
                                    .addComponent(jTFTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFRg)
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addComponent(jLCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLComplemento1)
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRBAtivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRBInativo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCorpoLayout.setVerticalGroup(
            jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCorpoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLID)
                        .addComponent(jLNome))
                    .addComponent(jLCPF, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDataNascimento)
                    .addComponent(jLEmail)
                    .addComponent(jLRG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCEP, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLMatricula)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCorpoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTelefone1)
                            .addComponent(jLTelefone2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLComplemento1)
                    .addComponent(jLStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBAtivo)
                    .addComponent(jRBInativo))
                .addContainerGap(36, Short.MAX_VALUE))
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
                .addComponent(jPRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRgActionPerformed
    }//GEN-LAST:event_jTFRgActionPerformed

    private void jTFCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCPFActionPerformed
    }//GEN-LAST:event_jTFCPFActionPerformed

    private void jTFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmailActionPerformed
    }//GEN-LAST:event_jTFEmailActionPerformed

    private void jTFTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefone1ActionPerformed
    }//GEN-LAST:event_jTFTelefone1ActionPerformed

    private void jRBInativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBInativoActionPerformed
    }//GEN-LAST:event_jRBInativoActionPerformed

    private void jRBAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBAtivoActionPerformed
    }//GEN-LAST:event_jRBAtivoActionPerformed

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

    private void jTFDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDataNascimentoActionPerformed

    private void jTFTelefone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefone2ActionPerformed

    private void jTFMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMatriculaActionPerformed

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
    private javax.swing.JComboBox<String> jCBCep;
    private javax.swing.JLabel jLCEP;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLComplemento1;
    private javax.swing.JLabel jLDataNascimento;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLID;
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
    private javax.swing.JTextField jTFCPF;
    private javax.swing.JTextField jTFComplemento;
    private javax.swing.JTextField jTFDataNascimento;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFMatricula;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFRg;
    private javax.swing.JTextField jTFTelefone1;
    private javax.swing.JTextField jTFTelefone2;
    // End of variables declaration//GEN-END:variables
}
