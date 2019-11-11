/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.CadastroCliente_Dao;
import Model.Cliente;
import Util.ValidaCPF;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class View_Cliente extends javax.swing.JFrame {

    
    CadastroCliente_Dao cDao;
    Cliente cliente;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    DefaultTableModel modelo = new DefaultTableModel();

    List<Cliente> clientes;
    String cpf2;
    String cli2;
    String cpf = "";
    String cli = "";

    public View_Cliente() {
        initComponents();
        Tabela.setRowSorter(new TableRowSorter(modelo));
        cliente = new Cliente();
        cDao = new CadastroCliente_Dao();
        clientes = new ArrayList<>();

        this.setVisible(true);
        Campos(false, false, false, false, false, false, false, false, false, false, false);
        Botao(true, false, false, true);
        campos(false, false, false, false, false, true, false, false, false, true, false, false);
        botao(true, false, false, true, true, true);
        AtualizarTabela();
    }

    public void Limpar() {
        TextNome.setText("");
        TextEnd.setText("");
        TextTelefone.setText("");
        TextCelular.setText("");
        TextCidade.setText("");
        TextCpf.setText("");
        TextRg.setText("");
        TextDatNasc.setText("");
        TextSexo.setSelectedIndex(0);
        TextNum.setText("");
        TextBairro.setText("");
    }

    /*public void Salvar() {

        DefaultTableModel DtmCadastro = (DefaultTableModel) Tabela.getModel();
        Object[] dados = {TextNome.getText(), TextCpf.getText(), TextRg.getText(), TextTelefone.getText()};

        if (DtmCadastro.getRowCount() < 5) {
            DtmCadastro.addRow(dados);
        } else {
            DtmCadastro.removeRow(0);
            DtmCadastro.addRow(dados);
        }
    }*/
    public void Campos(boolean Tn, boolean Ten, boolean TT, boolean TCe, boolean TC, boolean TCpf, boolean Rg, boolean TDt, boolean Ts, boolean Tnu, boolean Tba) {
        TextNome.setEnabled(Tn);
        TextEnd.setEnabled(Ten);
        TextTelefone.setEnabled(TT);
        TextCelular.setEnabled(TCe);
        TextCidade.setEnabled(TC);
        TextCpf.setEnabled(TCpf);
        TextRg.setEnabled(Rg);
        TextDatNasc.setEnabled(TDt);
        TextSexo.setEnabled(Ts);
        TextNum.setEnabled(Tnu);
        TextBairro.setEnabled(Tba);

    }

    public void Botao(boolean Bn, boolean Bl, boolean Bs, boolean Be) {
        ButtonNovo.setEnabled(Bn);
        ButtonLimpar.setEnabled(Bl);
        ButtonSalvar.setEnabled(Bs);
        ButtonSair.setEnabled(Be);
    }

     public void botao(boolean Be, boolean BEx, boolean Ba, boolean Bsa, boolean BPC, boolean BP) {

        ButtonSair.setEnabled(Be);
        ButtonExcluir.setEnabled(BEx);
        ButtonAtivar.setEnabled(Ba);
        ButtonSalvarAlt.setEnabled(Bsa);
        ButtonPesqCod.setEnabled(BPC);
        ButtonPesqCpf.setEnabled(BP);
    }
    
     public void campos(boolean Tn, boolean Ten, boolean TT, boolean TCe, boolean TC, boolean TCpf, boolean Rg, boolean TDt, boolean Ts, boolean Tco, boolean Tnu, boolean Tba) {
        TextNome.setEnabled(Tn);
        TextEnd.setEnabled(Ten);
        TextTelefone.setEnabled(TT);
        TextCelular.setEnabled(TCe);
        TextCidade.setEnabled(TC);
        TextCpf.setEnabled(TCpf);
        TextRg.setEnabled(Rg);
        TextDatNasc.setEnabled(TDt);
        TextSexo.setEnabled(Ts);
        TextCodigo.setEnabled(Tco);
        TextNum.setEnabled(Tnu);
        TextBairro.setEnabled(Tba);

    }
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonPesqCpf = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ButtonNovo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        TextRg = new javax.swing.JTextField();
        TextCpf = new javax.swing.JFormattedTextField();
        TextSexo = new javax.swing.JComboBox<>();
        TextTelefone = new javax.swing.JFormattedTextField();
        TextCelular = new javax.swing.JFormattedTextField();
        TextDatNasc = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TextEnd = new javax.swing.JTextField();
        TextNum = new javax.swing.JTextField();
        TextBairro = new javax.swing.JTextField();
        TextCidade = new javax.swing.JTextField();
        ButtonSalvar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        ButtonSair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        TextCodigo = new javax.swing.JTextField();
        ButtonPesqCod = new javax.swing.JButton();
        TextCpf1 = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        ButtonPesqCpf1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        ButtonExcluir = new javax.swing.JButton();
        ButtonAtivar = new javax.swing.JButton();
        ButtonSalvarAlt = new javax.swing.JButton();

        ButtonPesqCpf.setText("Pesquisar");
        ButtonPesqCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesqCpfActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro de Cliente");

        ButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/page_add.png"))); // NOI18N
        ButtonNovo.setText("Novo");
        ButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNovoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        jLabel2.setText("Nome");

        jLabel3.setText("Sexo");

        jLabel4.setText("Data Nascimento");

        jLabel5.setText("RG");

        jLabel6.setText("CPF / CNPJ");

        jLabel7.setText("Telefone");

        jLabel8.setText("Celular");

        try {
            TextCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        TextSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Feminino", "Masculino", "Indefinido" }));

        try {
            TextTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            TextCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            TextDatNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(TextNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(TextSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addComponent(TextRg, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextDatNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(TextCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TextDatNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(TextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(TextCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados de Endereço"));

        jLabel9.setText("Endereço");

        jLabel10.setText("Numero");

        jLabel11.setText("Bairro");

        jLabel12.setText("Cidade");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextEnd)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextNum, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(TextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(TextEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TextNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(TextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disk.png"))); // NOI18N
        ButtonSalvar.setText("Salvar");
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });

        ButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bullet_delete.png"))); // NOI18N
        ButtonLimpar.setText("Limpar Dados");
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });

        ButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/door_in.png"))); // NOI18N
        ButtonSair.setText("Sair");
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta de Cliente"));

        jLabel13.setText("Código");

        ButtonPesqCod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/zoom.png"))); // NOI18N
        ButtonPesqCod.setText("Pesquisar");
        ButtonPesqCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesqCodActionPerformed(evt);
            }
        });

        try {
            TextCpf1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel14.setText("CPF");

        ButtonPesqCpf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/zoom.png"))); // NOI18N
        ButtonPesqCpf1.setText("Pesquisar");
        ButtonPesqCpf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesqCpf1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonPesqCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPesqCod)
                    .addComponent(jLabel14)
                    .addComponent(TextCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPesqCpf1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "RG", "Fone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        ButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        ButtonExcluir.setText("Excluir");
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });

        ButtonAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tick.png"))); // NOI18N
        ButtonAtivar.setText("Ativar Opção");
        ButtonAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAtivarActionPerformed(evt);
            }
        });

        ButtonSalvarAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disk.png"))); // NOI18N
        ButtonSalvarAlt.setText("Salvar Alteração");
        ButtonSalvarAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarAltActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(203, 203, 203)
                .addComponent(ButtonNovo)
                .addGap(17, 17, 17))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonSair)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonExcluir)
                        .addGap(22, 22, 22)
                        .addComponent(ButtonAtivar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonSalvarAlt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonNovo)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSair)
                    .addComponent(ButtonLimpar)
                    .addComponent(ButtonSalvar)
                    .addComponent(ButtonExcluir)
                    .addComponent(ButtonAtivar)
                    .addComponent(ButtonSalvarAlt))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        try {
            if (TextNome.getText().isEmpty() || TextEnd.getText().isEmpty() || TextTelefone.getText().isEmpty()
                    || TextCidade.getText().isEmpty() || TextCpf.getText().isEmpty() || TextRg.getText().isEmpty()
                    || TextDatNasc.getText().isEmpty() || TextSexo.getSelectedItem().equals("")
                    || TextNum.getText().isEmpty() || TextBairro.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos campos devem ser preenchidos");
            } else {
                if (new ValidaCPF().validaCPF(TextCpf.getText()) == false) {
                    JOptionPane.showMessageDialog(null, "O CPF digitado é Inválido");
                } else {
                    if (sdf.parse(TextDatNasc.getText()).equals(new Date()) || sdf.parse(TextDatNasc.getText()).after(new Date())) {
                        JOptionPane.showMessageDialog(null, "A data de nascimento não pode ser igual ou depois da data de hoje");
                    } else {
                        if (cDao.validarCpfCliente(TextCpf.getText()).equals(TextCpf.getText())) {
                            JOptionPane.showMessageDialog(null, "O CPF já possui um usuário cadastrado");
                        } else {
                            if (cDao.validarNomeCliente(TextNome.getText()).equals(TextNome.getText())) {
                                JOptionPane.showMessageDialog(null, "Já existe um usuário com este nome");
                            } else {
                                cliente = new Cliente();
                                cliente.setNome(TextNome.getText());
                                cliente.setCpf(TextCpf.getText());
                                cliente.setRg(TextRg.getText());
                                cliente.setTelefone(TextTelefone.getText());
                                cliente.setSexo(TextSexo.getSelectedItem().toString());
                                cliente.setDataNascimento(sdf.parse(TextDatNasc.getText()));
                                cliente.setCelular(TextCelular.getText());
                                cliente.setEndereço(TextEnd.getText());
                                cliente.setNumero(parseInt(TextNum.getText()));
                                cliente.setBairro(TextBairro.getText());
                                cliente.setCidade(TextCidade.getText());

                                cDao.salvar(cliente);

                                Limpar();
                                JOptionPane.showMessageDialog(null, "Gravado Com sucesso");
                                Campos(false, false, false, false, false, true, false, false, false, false, false);
                                Botao(true, false, false, true);
                            }
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "A data informada é inválida");
            e.printStackTrace();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO!");
            ex.printStackTrace();
        }

    }//GEN-LAST:event_ButtonSalvarActionPerformed

    public void AtualizarTabela() {
        cliente = new Cliente();
        try {
            clientes = cDao.TodosClientesAtivos();
            String dados[][] = new String[clientes.size()][5];
            int i = 0;
            for (Cliente u : clientes) {
                dados[i][0] = String.valueOf(u.getCodigo());
                dados[i][1] = u.getNome();
                dados[i][2] = u.getCpf();
                dados[i][3] = u.getRg();
                dados[i][4] = u.getTelefone();
                i++;
            }
            String tituloColuna[] = {"Código", "Nome", "Cpf", "Rg", "Telefone"};
            modelo.setDataVector(dados, tituloColuna);
            Tabela.setModel(modelo);
            Tabela.updateUI();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public int validarAltCpf() {
        int vc = 0;
        if (cpf2.equals(TextCpf.getText())) {

            vc = 0;
        } else {
            vc = 1;
        }
        return vc;
    }
        public int validarAltCli() {
        int vc = 0;
        if (cli2.equals(TextNome.getText())) {
            JOptionPane.showMessageDialog(null, "Já existe um cliente com este nome");
        } else {
            vc = 1;
        }
        return vc;
    }
    
    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja realmente Sair?");
        if (i == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_ButtonSairActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que Deseja Limpar?");
        if (i == 0) {
            Limpar();
            Campos(false, false, false, false, false, false, false, false, false, false, false);
            Botao(true, false, false, true);
        }
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void ButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNovoActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que Deseja Realizar Novo Cadastro?");
        if (i == 0) {
            Campos(true, true, true, true, true, true, true, true, true, true, true);
            Botao(false, true, true, true);
        }
    }//GEN-LAST:event_ButtonNovoActionPerformed

    private void ButtonPesqCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesqCodActionPerformed
        try {
            if (TextCodigo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite o Codigo para ser pesquisado");
            } else {
                cliente = cDao.getClienteByCodigo(Integer.parseInt(TextCodigo.getText()));
            }

            if (cliente == null) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            } else {
                TextNome.setText(cliente.getNome());
                TextCpf.setText(cliente.getCpf());
                TextRg.setText(cliente.getRg());
                TextTelefone.setText(cliente.getTelefone());
                TextSexo.setSelectedItem(cliente.getSexo());
                TextDatNasc.setText(sdf.format(cliente.getDataNascimento()));
                TextCelular.setText(cliente.getCelular());
                TextEnd.setText(cliente.getEndereço());
                TextNum.setText(String.valueOf(cliente.getNumero()));
                TextBairro.setText(cliente.getBairro());
                TextCidade.setText(cliente.getCidade());

                cpf = cliente.getCpf();
                cli = cliente.getNome();
                campos(false, false, false, false, false, false, false, false, false, true, false, false);
                botao(true, true, true, true, true, true);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ButtonPesqCodActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked

        JOptionPane.showConfirmDialog(null, "Deseja selecionar a linha?");
        Tabela.getModel();
        try {
            cliente = cDao.getClienteByCodigo(Integer.parseInt(modelo.getValueAt(Tabela.getSelectedRow(), 0).toString()));
            if (cliente == null) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            } else {
                TextNome.setText(cliente.getNome());
                TextCpf.setText(cliente.getCpf());
                TextRg.setText(cliente.getRg());
                TextTelefone.setText(cliente.getTelefone());
                TextSexo.setSelectedItem(cliente.getSexo());
                TextDatNasc.setText(sdf.format(cliente.getDataNascimento()));
                TextCelular.setText(cliente.getCelular());
                TextEnd.setText(cliente.getEndereço());
                TextNum.setText(String.valueOf(cliente.getNumero()));
                TextBairro.setText(cliente.getBairro());
                TextCidade.setText(cliente.getCidade());

                cpf = cliente.getCpf();
                cli = cliente.getNome();
                campos(false, false, false, false, false, false, false, false, false, true, false, false);
                botao(true, true, true, true, true, true);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_TabelaMouseClicked

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed

        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que Deseja Excluir?");
        if (TextCodigo.getText() != "") {
            try {
                cDao.ExcluirCliente(Integer.parseInt(TextCodigo.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(View_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            if (TextCpf.getText() != "") {
                try {
                    cDao.ExcluirCliente(TextCpf.getText());
                } catch (SQLException ex) {
                    Logger.getLogger(View_Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        AtualizarTabela();
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void ButtonAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAtivarActionPerformed

        int i = JOptionPane.showConfirmDialog(null, "Você deseja realmente atualizar os dados?");
        if (i == 0) {
            campos(true, true, true, true, true, false, true, true, true, false, true, true);
            botao(true, true, false, true, true, true);
        }
    }//GEN-LAST:event_ButtonAtivarActionPerformed

    private void ButtonSalvarAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarAltActionPerformed

        int i = JOptionPane.showConfirmDialog(null, "voce deseja realmente alterar o Cadastro?");
        try {
            if (TextNome.getText().isEmpty() || TextEnd.getText().isEmpty() || TextTelefone.getText().isEmpty()
                || TextCidade.getText().isEmpty() || TextRg.getText().isEmpty()
                || TextDatNasc.getText().isEmpty() || TextSexo.getSelectedItem().equals("")
                || TextNum.getText().isEmpty() || TextBairro.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos campos devem ser preenchidos");
            } else {
                if (sdf.parse(TextDatNasc.getText()).equals(new Date()) || sdf.parse(TextDatNasc.getText()).after(new Date())) {
                    JOptionPane.showMessageDialog(null, "A data de nascimento não pode ser igual ou depois da data de hoje");
                } else {

                    if (i == 0) {
                        cliente.setNome(TextNome.getText());
                        cliente.setCpf(TextCpf.getText());
                        cliente.setRg(TextRg.getText());
                        cliente.setTelefone(TextTelefone.getText());
                        cliente.setEndereço(TextEnd.getText());
                        cliente.setCelular(TextCelular.getText());
                        cliente.setCidade(TextCidade.getText());
                        cliente.setDataNascimento(sdf.parse(TextDatNasc.getText()));
                        cliente.setSexo(TextSexo.getItemAt(TextSexo.getSelectedIndex()));
                        cliente.setNumero(Integer.parseInt(TextNum.getText()));
                        cliente.setBairro(TextBairro.getText());

                        cDao.Alterar(cliente);
                        AtualizarTabela();
                        JOptionPane.showMessageDialog(null, "Cadastro Alterado com Sucesso");
                        Limpar();
                        campos(false, false, false, false, false, true, false, false, false, true, false, false);
                        botao(true, false, false, true, true, true);
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ButtonSalvarAltActionPerformed

    private void ButtonPesqCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesqCpfActionPerformed
        try {
            cliente = cDao.getClientePorCpf(TextCpf.getText());
            if (cliente == null) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            } else {
                TextNome.setText(cliente.getNome());
                TextEnd.setText(cliente.getEndereço());
                TextTelefone.setText(cliente.getTelefone());
                TextCelular.setText(cliente.getCelular());
                TextCidade.setText(cliente.getCidade());
                TextCpf.setText(cliente.getCpf());
                TextRg.setText(cliente.getRg());
                TextDatNasc.setText(sdf.format(cliente.getDataNascimento()));
                TextSexo.setSelectedItem(cliente.getSexo());
                TextCodigo.setText(Integer.toString(cliente.getCodigo()));
                TextNum.setText(Integer.toString(cliente.getNumero()));
                TextBairro.setText(cliente.getBairro());

                campos(false, false, false, false, false, false, false, false, false, true, false, false);
                botao(true, false, false, true, true, true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ButtonPesqCpfActionPerformed

    private void ButtonPesqCpf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesqCpf1ActionPerformed
        try {
            cliente = cDao.getClientePorCpf(TextCpf.getText());
            if (cliente == null) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            } else {
                TextNome.setText(cliente.getNome());
                TextEnd.setText(cliente.getEndereço());
                TextTelefone.setText(cliente.getTelefone());
                TextCelular.setText(cliente.getCelular());
                TextCidade.setText(cliente.getCidade());
                TextCpf.setText(cliente.getCpf());
                TextRg.setText(cliente.getRg());
                TextDatNasc.setText(sdf.format(cliente.getDataNascimento()));
                TextSexo.setSelectedItem(cliente.getSexo());
                TextCodigo.setText(Integer.toString(cliente.getCodigo()));
                TextNum.setText(Integer.toString(cliente.getNumero()));
                TextBairro.setText(cliente.getBairro());

                campos(false, false, false, false, false, false, false, false, false, true, false, false);
                botao(true, false, false, true, true, true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ButtonPesqCpf1ActionPerformed

        public int validarCli() {
        int vc = 0;
        if (cli2.equals(TextNome.getText())) {
            JOptionPane.showMessageDialog(null, "Já existe um cliente com este nome");
        } else {
            vc = 1;
        }
        return vc;
    }

        public int validarCpf() {
        int vc = 0;
        if (cpf2.equals(TextCpf.getText())) {

            vc = 0;
        } else {
            vc = 1;
        }
        return vc;
    }

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
            java.util.logging.Logger.getLogger(View_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAtivar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonNovo;
    private javax.swing.JButton ButtonPesqCod;
    private javax.swing.JButton ButtonPesqCpf;
    private javax.swing.JButton ButtonPesqCpf1;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JButton ButtonSalvarAlt;
    private javax.swing.JTable Tabela;
    private javax.swing.JTextField TextBairro;
    private javax.swing.JFormattedTextField TextCelular;
    private javax.swing.JTextField TextCidade;
    private javax.swing.JTextField TextCodigo;
    private javax.swing.JFormattedTextField TextCpf;
    private javax.swing.JFormattedTextField TextCpf1;
    private javax.swing.JFormattedTextField TextDatNasc;
    private javax.swing.JTextField TextEnd;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextNum;
    private javax.swing.JTextField TextRg;
    private javax.swing.JComboBox<String> TextSexo;
    private javax.swing.JFormattedTextField TextTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
