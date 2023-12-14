/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
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
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author bianc
 */
public class TelaCadastroVenda extends javax.swing.JDialog {

    /**
     * Creates new form TelaCadastroEndereco
     */
    public TelaCadastroVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public JTextField getjTFCodBarras() {
        return jTFCodBarras;
    }

    public void setjTFCodBarras(JTextField jTFCodBarras) {
        this.jTFCodBarras = jTFCodBarras;
    }
    
    

    public JTextField getjTFCodItem() {
        return jTFCodItem;
    }

    public void setjTFCodItem(JTextField jTFCodItem) {
        this.jTFCodItem = jTFCodItem;
    }

    public JLabel getjLNovoItem() {
        return jLNovoItem;
    }

    public void setjLNovoItem(JLabel jLNovoItem) {
        this.jLNovoItem = jLNovoItem;
    }

    public JLabel getjLObservacao() {
        return jLObservacao;
    }

    public void setjLObservacao(JLabel jLObservacao) {
        this.jLObservacao = jLObservacao;
    }

    public JLabel getjLPreco() {
        return jLPreco;
    }

    public void setjLPreco(JLabel jLPreco) {
        this.jLPreco = jLPreco;
    }

    public JLabel getjLQtd() {
        return jLQtd;
    }

    public void setjLQtd(JLabel jLQtd) {
        this.jLQtd = jLQtd;
    }
    
    

    public JPanel getjPRodape() {
        return jPRodape;
    }

    public JComboBox<String> getjCBTipoDesconto() {
        return jCBTipoDesconto;
    }

    public void setjCBTipoDesconto(JComboBox<String> jCBTipoDesconto) {
        this.jCBTipoDesconto = jCBTipoDesconto;
    }

    public JTextField getjTFCodCarteirinha() {
        return jTFCodCarteirinha;
    }

    public void setjTFCodCarteirinha(JTextField jTFCodCarteirinha) {
        this.jTFCodCarteirinha = jTFCodCarteirinha;
    }

    public JFormattedTextField getjFTFValorTotal() {
        return jFTFValorTotal;
    }

    public void setjFTFValorTotal(JFormattedTextField jFTFValorTotal) {
        this.jFTFValorTotal = jFTFValorTotal;
    }
    
    
    
    
    public void setjPRodape(JPanel jPRodape) {
        this.jPRodape = jPRodape;
    }

    public JButton getjBFinalizarVenda() {
        return jBFinalizarVenda;
    }

    public void setjBFinalizarVenda(JButton jBFinalizarVenda) {
        this.jBFinalizarVenda = jBFinalizarVenda;
    }

    public JTextField getjTFIdFuncionario() {
        return jTFIdFuncionario;
    }

    public void setjTFIdFuncionario(JTextField jTFIdFuncionario) {
        this.jTFIdFuncionario = jTFIdFuncionario;
    }
    

    public JTextField getjTFObservacao() {
        return jTFObservacao;
    }

    public void setjTFObservacao(JTextField jTFObservacao) {
        this.jTFObservacao = jTFObservacao;
    }
    

    public JPanel getjPCorpo() {
        return jPCorpo;
    }

    public JButton getjBAdicionar() {
        return jBAdicionar;
    }

    public JButton getjBBuscaCarteirinha() {
        return jBBuscaCarteirinha;
    }

    public void setjBBuscaCarteirinha(JButton jBBuscaCarteirinha) {
        this.jBBuscaCarteirinha = jBBuscaCarteirinha;
    }

    public JButton getjBCadastraCarteirinha() {
        return jBCadastraCarteirinha;
    }

    public void setjBCadastraCarteirinha(JButton jBCadastraCarteirinha) {
        this.jBCadastraCarteirinha = jBCadastraCarteirinha;
    }
    
    

    public void setjBAdicionar(JButton jBAdicionar) {
        this.jBAdicionar = jBAdicionar;
    }    

    public void setjPCorpo(JPanel jPCorpo) {
        this.jPCorpo = jPCorpo;
    }
    

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JButton getjBBuscaCliente() {
        return jBBuscaCarteirinha;
    }

    public void setjBBuscaCliente(JButton jBBuscaCliente) {
        this.jBBuscaCarteirinha = jBBuscaCliente;
    }

    public JButton getjBBuscaFuncionario() {
        return jBBuscaFuncionario;
    }

    public void setjBBuscaFuncionario(JButton jBBuscaFuncionario) {
        this.jBBuscaFuncionario = jBBuscaFuncionario;
    }

    public JButton getjBBuscaItem() {
        return jBBuscaItem;
    }

    public void setjBBuscaItem(JButton jBBuscaItem) {
        this.jBBuscaItem = jBBuscaItem;
    }


    public JButton getjBCadastraCliente() {
        return jBCadastraCarteirinha;
    }

    public void setjBCadastraCliente(JButton jBCadastraCliente) {
        this.jBCadastraCarteirinha = jBCadastraCliente;
    }

    public JButton getjBCadastraFuncionario() {
        return jBCadastraFuncionario;
    }

    public void setjBCadastraFuncionario(JButton jBCadastraFuncionario) {
        this.jBCadastraFuncionario = jBCadastraFuncionario;
    }

    public JButton getjBCadastraItem() {
        return jBCadastraItem;
    }

    public void setjBCadastraItem(JButton jBCadastraItem) {
        this.jBCadastraItem = jBCadastraItem;
    }

    public JButton getjBCancelar() {
        return jBCancelar;
    }

    public void setjBCancelar(JButton jBCancelar) {
        this.jBCancelar = jBCancelar;
    }

    public JButton getjBGravar() {
        return jBFinalizarVenda;
    }

    public void setjBGravar(JButton jBGravar) {
        this.jBFinalizarVenda = jBGravar;
    }

    public JButton getjBNovo() {
        return jBNovo;
    }

    public void setjBNovo(JButton jBNovo) {
        this.jBNovo = jBNovo;
    }

    public JButton getjBSair() {
        return jBSair;
    }

    public void setjBSair(JButton jBSair) {
        this.jBSair = jBSair;
    }

    public JComboBox<String> getjComboBox1() {
        return jCBTipoDesconto;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jCBTipoDesconto = jComboBox1;
    }

    public JFormattedTextField getjFTFData() {
        return jFTFData;
    }

    public JRadioButton getjRBAtivo() {
        return jRBAtivo;
    }
  

    public void setjRBAtivo(JRadioButton jRBAtivo) {
        this.jRBAtivo = jRBAtivo;
    }

    public JRadioButton getjRBInativo() {
        return jRBInativo;
    }

    public void setjRBInativo(JRadioButton jRBInativo) {
        this.jRBInativo = jRBInativo;
    }
    
    

    public void setjFTFData(JFormattedTextField jFTFData) {
        this.jFTFData = jFTFData;
    }

    public JLabel getjLData() {
        return jLCarteirinha;
    }

    public void setjLData(JLabel jLData) {
        this.jLCarteirinha = jLData;
    }

    public JLabel getjLDesconto() {
        return jLDesconto;
    }

    public void setjLDesconto(JLabel jLDesconto) {
        this.jLDesconto = jLDesconto;
    }

    public JLabel getjLID() {
        return jLID;
    }

    public JLabel getjLCarteirinha() {
        return jLCarteirinha;
    }

    public void setjLCarteirinha(JLabel jLCarteirinha) {
        this.jLCarteirinha = jLCarteirinha;
    }
    
    

    public void setjLID(JLabel jLID) {
        this.jLID = jLID;
    }

    public JLabel getjLFuncionario() {
        return jLFuncionario;
    }

    public void setjLNotaFiscal(JLabel jLNotaFiscal) {
        this.jLFuncionario = jLNotaFiscal;
    }

    public JLabel getjLStatus() {
        return jLStatus;
    }

    public void setjLStatus(JLabel jLStatus) {
        this.jLStatus = jLStatus;
    }

    public JLabel getjLTipoDesconto() {
        return jLTipoDesconto;
    }

    public void setjLTipoDesconto(JLabel jLTipoDesconto) {
        this.jLTipoDesconto = jLTipoDesconto;
    }

    public JLabel getjLTipoDesconto1() {
        return jLNovoItem;
    }

    public void setjLTipoDesconto1(JLabel jLTipoDesconto1) {
        this.jLNovoItem = jLTipoDesconto1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JMenu getjMenu1() {
        return jMenu1;
    }

    public void setjMenu1(JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }

    public JMenu getjMenu2() {
        return jMenu2;
    }

    public void setjMenu2(JMenu jMenu2) {
        this.jMenu2 = jMenu2;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    
    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPCorpo;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPCorpo = jPanel2;
    }

    public JTextField getjTFNomeCliente() {
        return jTFNomeCliente;
    }

    public void setjTFNomeCliente(JTextField jTFNomeCliente) {
        this.jTFNomeCliente = jTFNomeCliente;
    }
   

    public JPanel getjPanel3() {
        return jPRodape;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPRodape = jPanel3;
    }

    public JRadioButton getjRadioButton1() {
        return jRBAtivo;
    }

    public void setjRadioButton1(JRadioButton jRadioButton1) {
        this.jRBAtivo = jRadioButton1;
    }

    public JRadioButton getjRadioButton2() {
        return jRBInativo;
    }

    public void setjRadioButton2(JRadioButton jRadioButton2) {
        this.jRBInativo = jRadioButton2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextField getjTFDesconto() {
        return jTFDesconto;
    }

    public void setjTFDesconto(JTextField jTFDesconto) {
        this.jTFDesconto = jTFDesconto;
    }

    public JTextField getjTFFornecedor() {
        return jTFNomeCliente;
    }

    public void setjTFFornecedor(JTextField jTFFornecedor) {
        this.jTFNomeCliente = jTFFornecedor;
    }

    public JTextField getjTFID() {
        return jTFID;
    }

    public void setjTFID(JTextField jTFID) {
        this.jTFID = jTFID;
    }

    public JTextField getjTFNotaFiscal() {
        return jTFNomeCliente;
    }

    public void setjTFNotaFiscal(JTextField jTFNotaFiscal) {
        this.jTFNomeCliente = jTFNotaFiscal;
    }

    public JTable getjTable1() {
        return jTItens;
    }

    public void setjTable1(JTable jTable1) {
        this.jTItens = jTable1;
    }

    public JTextField getjTFNomeFuncionario() {
        return jTFNomeFuncionario;
    }

    public void setjTFNomeFuncionario(JTextField jTFNomeFuncionario) {
        this.jTFNomeFuncionario = jTFNomeFuncionario;
    }

    public JSpinner getjSQuantidade() {
        return jSQuantidade;
    }

    public void setjSQuantidade(JSpinner jSQuantidade) {
        this.jSQuantidade = jSQuantidade;
    }

    public JTextField getjTFValorUnitario() {
        return jTFValorUnitario;
    }

    public void setjTFValorUnitario(JTextField jTFValorUnitario) {
        this.jTFValorUnitario = jTFValorUnitario;
    }

    public JFormattedTextField getjFTFValorUnitario() {
        return jFTFValorTotal;
    }

    public void setjFTFValorUnitario(JFormattedTextField jFTFValorUnitario) {
        this.jFTFValorTotal = jFTFValorUnitario;
    }

    public JTextField getjTFNomeItem() {
        return jTFNomeItem;
    }

    public void setjTFNomeItem(JTextField jTFNomeItem) {
        this.jTFNomeItem = jTFNomeItem;
    }

    

    public JTable getjTItens() {
        return jTItens;
    }

    public void setjTItens(JTable jTItens) {
        this.jTItens = jTItens;
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPCorpo = new javax.swing.JPanel();
        jLFuncionario = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLID = new javax.swing.JLabel();
        jLDesconto = new javax.swing.JLabel();
        jLCarteirinha = new javax.swing.JLabel();
        jLTipoDesconto = new javax.swing.JLabel();
        jLStatus = new javax.swing.JLabel();
        jTFNomeCliente = new javax.swing.JTextField();
        jTFDesconto = new javax.swing.JTextField();
        jRBAtivo = new javax.swing.JRadioButton();
        jRBInativo = new javax.swing.JRadioButton();
        jCBTipoDesconto = new javax.swing.JComboBox<>();
        jFTFData = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTItens = new javax.swing.JTable();
        jLNovoItem = new javax.swing.JLabel();
        jBBuscaItem = new javax.swing.JButton();
        jBCadastraItem = new javax.swing.JButton();
        jBBuscaFuncionario = new javax.swing.JButton();
        jBCadastraFuncionario = new javax.swing.JButton();
        jBBuscaCarteirinha = new javax.swing.JButton();
        jBCadastraCarteirinha = new javax.swing.JButton();
        jTFNomeFuncionario = new javax.swing.JTextField();
        jBAdicionar = new javax.swing.JButton();
        jLTipoDesconto2 = new javax.swing.JLabel();
        jLQtd = new javax.swing.JLabel();
        jTFValorUnitario = new javax.swing.JTextField();
        jSQuantidade = new javax.swing.JSpinner();
        jLPreco = new javax.swing.JLabel();
        jTFNomeItem = new javax.swing.JTextField();
        jTFObservacao = new javax.swing.JTextField();
        jLObservacao = new javax.swing.JLabel();
        jTFIdFuncionario = new javax.swing.JTextField();
        jTFCodCarteirinha = new javax.swing.JTextField();
        jTFCodItem = new javax.swing.JTextField();
        jLCarteirinha1 = new javax.swing.JLabel();
        jTFCodBarras = new javax.swing.JTextField();
        jFTFValorTotal = new javax.swing.JFormattedTextField();
        jBNovo = new javax.swing.JButton();
        jPRodape = new javax.swing.JPanel();
        jBCancelar = new javax.swing.JButton();
        jBFinalizarVenda = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 63, 65));
        jLabel1.setText("VENDA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(475, 475, 475))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPCorpo.setBackground(new java.awt.Color(255, 255, 255));

        jLFuncionario.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLFuncionario.setForeground(new java.awt.Color(51, 51, 51));
        jLFuncionario.setText("Funcionário");

        jTFID.setForeground(new java.awt.Color(255, 255, 255));
        jTFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIDActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Data");

        jLID.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLID.setForeground(new java.awt.Color(51, 51, 51));
        jLID.setText("ID");

        jLDesconto.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLDesconto.setForeground(new java.awt.Color(51, 51, 51));
        jLDesconto.setText("Desconto");

        jLCarteirinha.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLCarteirinha.setForeground(new java.awt.Color(51, 51, 51));
        jLCarteirinha.setText("Carteirinha");

        jLTipoDesconto.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLTipoDesconto.setForeground(new java.awt.Color(51, 51, 51));
        jLTipoDesconto.setText("Tipo do Desconto");

        jLStatus.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLStatus.setForeground(new java.awt.Color(51, 51, 51));
        jLStatus.setText("Status");

        jTFNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeClienteActionPerformed(evt);
            }
        });

        jTFDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDescontoActionPerformed(evt);
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

        jCBTipoDesconto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simples", "Por Quantidade", "Compra Combinada" }));

        try {
            jFTFData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFDataActionPerformed(evt);
            }
        });

        jTItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ));
        jScrollPane1.setViewportView(jTItens);

        jLNovoItem.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLNovoItem.setForeground(new java.awt.Color(51, 51, 51));
        jLNovoItem.setText("Novo Item");

        jBBuscaItem.setText("...");
        jBBuscaItem.setActionCommand("0");
        jBBuscaItem.setPreferredSize(new java.awt.Dimension(35, 22));
        jBBuscaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscaItemActionPerformed(evt);
            }
        });

        jBCadastraItem.setText("+");
        jBCadastraItem.setPreferredSize(new java.awt.Dimension(35, 22));
        jBCadastraItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastraItemActionPerformed(evt);
            }
        });

        jBBuscaFuncionario.setText("...");
        jBBuscaFuncionario.setActionCommand("0");
        jBBuscaFuncionario.setPreferredSize(new java.awt.Dimension(35, 22));
        jBBuscaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscaFuncionarioActionPerformed(evt);
            }
        });

        jBCadastraFuncionario.setText("+");
        jBCadastraFuncionario.setPreferredSize(new java.awt.Dimension(35, 22));
        jBCadastraFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastraFuncionarioActionPerformed(evt);
            }
        });

        jBBuscaCarteirinha.setText("...");
        jBBuscaCarteirinha.setActionCommand("0");
        jBBuscaCarteirinha.setPreferredSize(new java.awt.Dimension(35, 22));
        jBBuscaCarteirinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscaCarteirinhaActionPerformed(evt);
            }
        });

        jBCadastraCarteirinha.setText("+");
        jBCadastraCarteirinha.setPreferredSize(new java.awt.Dimension(35, 22));
        jBCadastraCarteirinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastraCarteirinhaActionPerformed(evt);
            }
        });

        jTFNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeFuncionarioActionPerformed(evt);
            }
        });

        jBAdicionar.setText("Adicionar");
        jBAdicionar.setPreferredSize(new java.awt.Dimension(35, 22));
        jBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarActionPerformed(evt);
            }
        });

        jLTipoDesconto2.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLTipoDesconto2.setText("VALOR TOTAL:");

        jLQtd.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLQtd.setForeground(new java.awt.Color(51, 51, 51));
        jLQtd.setText("Qtd.");

        jTFValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFValorUnitarioActionPerformed(evt);
            }
        });

        jLPreco.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLPreco.setForeground(new java.awt.Color(51, 51, 51));
        jLPreco.setText("R$");

        jTFNomeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeItemActionPerformed(evt);
            }
        });

        jTFObservacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFObservacaoActionPerformed(evt);
            }
        });

        jLObservacao.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLObservacao.setForeground(new java.awt.Color(51, 51, 51));
        jLObservacao.setText("Observação");

        jTFIdFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIdFuncionarioActionPerformed(evt);
            }
        });

        jTFCodCarteirinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodCarteirinhaActionPerformed(evt);
            }
        });

        jTFCodItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodItemActionPerformed(evt);
            }
        });

        jLCarteirinha1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLCarteirinha1.setForeground(new java.awt.Color(51, 51, 51));
        jLCarteirinha1.setText("Cód. Barra");

        jTFCodBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodBarrasActionPerformed(evt);
            }
        });

        jBNovo.setBackground(new java.awt.Color(255, 255, 255));
        jBNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais (1).png"))); // NOI18N
        jBNovo.setActionCommand("0");
        jBNovo.setPreferredSize(new java.awt.Dimension(115, 23));
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCorpoLayout = new javax.swing.GroupLayout(jPCorpo);
        jPCorpo.setLayout(jPCorpoLayout);
        jPCorpoLayout.setHorizontalGroup(
            jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCorpoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addComponent(jTFCodItem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTFNomeItem, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBBuscaItem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBCadastraItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addComponent(jLNovoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLID))
                                .addGap(18, 18, 18)
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPCorpoLayout.createSequentialGroup()
                                        .addComponent(jTFIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTFNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addComponent(jBBuscaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBCadastraFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addComponent(jSQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLCarteirinha, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addComponent(jTFCodCarteirinha, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCorpoLayout.createSequentialGroup()
                                .addComponent(jTFCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBBuscaCarteirinha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBCadastraCarteirinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLCarteirinha1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFObservacao)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPCorpoLayout.createSequentialGroup()
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLDesconto)
                                    .addComponent(jTFDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLTipoDesconto)
                                    .addComponent(jCBTipoDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPCorpoLayout.createSequentialGroup()
                                        .addComponent(jRBAtivo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRBInativo)))
                                .addGap(47, 47, 47)
                                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFTFData, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGap(80, 80, 80)
                        .addComponent(jLTipoDesconto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTFValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCorpoLayout.setVerticalGroup(
            jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCorpoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLID)
                    .addComponent(jLFuncionario)
                    .addComponent(jLCarteirinha)
                    .addComponent(jLCarteirinha1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCorpoLayout.createSequentialGroup()
                        .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBCadastraFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscaCarteirinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBCadastraCarteirinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCodCarteirinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLPreco)
                        .addComponent(jLQtd)
                        .addComponent(jLNovoItem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNomeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCadastraItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDesconto)
                    .addComponent(jLTipoDesconto)
                    .addComponent(jLStatus)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBTipoDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBAtivo)
                    .addComponent(jRBInativo)
                    .addComponent(jFTFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLObservacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLTipoDesconto2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFTFValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTFObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPRodape.setBackground(new java.awt.Color(204, 255, 204));

        jBCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/banimento.png"))); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.setActionCommand("1");
        jBCancelar.setPreferredSize(new java.awt.Dimension(115, 23));

        jBFinalizarVenda.setBackground(new java.awt.Color(255, 255, 255));
        jBFinalizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/download-de-pasta (3).png"))); // NOI18N
        jBFinalizarVenda.setText("Finalizar Venda");
        jBFinalizarVenda.setActionCommand("0");
        jBFinalizarVenda.setPreferredSize(new java.awt.Dimension(115, 23));
        jBFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFinalizarVendaActionPerformed(evt);
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
            .addGroup(jPRodapeLayout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jBFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPRodapeLayout.setVerticalGroup(
            jPRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRodapeLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPRodape, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSairActionPerformed

    private void jTFNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeClienteActionPerformed

    private void jTFDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDescontoActionPerformed

    private void jRBAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBAtivoActionPerformed

    private void jRBInativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBInativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBInativoActionPerformed

    private void jTFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIDActionPerformed

    private void jFTFDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFDataActionPerformed

    private void jBBuscaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscaItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscaItemActionPerformed

    private void jBCadastraItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastraItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCadastraItemActionPerformed

    private void jBBuscaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscaFuncionarioActionPerformed

    private void jBCadastraFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastraFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCadastraFuncionarioActionPerformed

    private void jBBuscaCarteirinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscaCarteirinhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscaCarteirinhaActionPerformed

    private void jBCadastraCarteirinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastraCarteirinhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCadastraCarteirinhaActionPerformed

    private void jTFNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeFuncionarioActionPerformed

    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAdicionarActionPerformed

    private void jTFValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFValorUnitarioActionPerformed

    private void jTFNomeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeItemActionPerformed

    private void jTFObservacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFObservacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFObservacaoActionPerformed

    private void jTFIdFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIdFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIdFuncionarioActionPerformed

    private void jTFCodCarteirinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodCarteirinhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodCarteirinhaActionPerformed

    private void jTFCodItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodItemActionPerformed

    private void jTFCodBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodBarrasActionPerformed

    private void jBFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFinalizarVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBFinalizarVendaActionPerformed

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
                TelaCadastroCompra dialog = new TelaCadastroCompra(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JButton jBBuscaCarteirinha;
    private javax.swing.JButton jBBuscaFuncionario;
    private javax.swing.JButton jBBuscaItem;
    private javax.swing.JButton jBCadastraCarteirinha;
    private javax.swing.JButton jBCadastraFuncionario;
    private javax.swing.JButton jBCadastraItem;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBFinalizarVenda;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBSair;
    private javax.swing.JComboBox<String> jCBTipoDesconto;
    private javax.swing.JFormattedTextField jFTFData;
    private javax.swing.JFormattedTextField jFTFValorTotal;
    private javax.swing.JLabel jLCarteirinha;
    private javax.swing.JLabel jLCarteirinha1;
    private javax.swing.JLabel jLDesconto;
    private javax.swing.JLabel jLFuncionario;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLNovoItem;
    private javax.swing.JLabel jLObservacao;
    private javax.swing.JLabel jLPreco;
    private javax.swing.JLabel jLQtd;
    private javax.swing.JLabel jLStatus;
    private javax.swing.JLabel jLTipoDesconto;
    private javax.swing.JLabel jLTipoDesconto2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPCorpo;
    private javax.swing.JPanel jPRodape;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBAtivo;
    private javax.swing.JRadioButton jRBInativo;
    private javax.swing.JSpinner jSQuantidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodBarras;
    private javax.swing.JTextField jTFCodCarteirinha;
    private javax.swing.JTextField jTFCodItem;
    private javax.swing.JTextField jTFDesconto;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFIdFuncionario;
    private javax.swing.JTextField jTFNomeCliente;
    private javax.swing.JTextField jTFNomeFuncionario;
    private javax.swing.JTextField jTFNomeItem;
    private javax.swing.JTextField jTFObservacao;
    private javax.swing.JTextField jTFValorUnitario;
    private javax.swing.JTable jTItens;
    // End of variables declaration//GEN-END:variables
}
