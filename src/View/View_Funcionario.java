/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.CadastroFuncionario_Dao;
import Model.Funcionario;
import Util.ValidaCPF;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Bruna Borges.R
 */
public class View_Funcionario extends javax.swing.JFrame {

   
    CadastroFuncionario_Dao cDao;
    Funcionario funcionario;
    String cpf = "";
    String fun = "";
    String cpf2;
    String fun2;
    DefaultTableModel modelo = new DefaultTableModel();
    List<Funcionario> funcionarios;
    public View_Funcionario() {
        funcionario = new Funcionario();
        cDao = new CadastroFuncionario_Dao();
        
        initComponents();
        Table.setRowSorter(new TableRowSorter(modelo));
        this.setVisible(true);
        Campos(false, false, false, false);
        Botao(true, false, false, true);
        funcionarios = new ArrayList<>();
        campos(false, false, true, true);
        botao(true, true, false, false, false, true);
        AtualizarTabela();
    }

   

    public void Botao(boolean Bn, boolean Bl, boolean Bs, boolean Be) {
        ButtonNovo.setEnabled(Bn);
        ButtonLimpar.setEnabled(Bl);
        ButtonSalvar.setEnabled(Bs);
        ButtonSair.setEnabled(Be);
    }
    
    
    public void Campos(boolean Tn, boolean Tse, boolean Tc, boolean TCpf) {
        TextNome.setEnabled(Tn);
        TextSetor.setEnabled(Tse);
        TextCodigo.setEnabled(Tc);
        TextCpf.setEnabled(TCpf);

    }

    public void Limpar() {
        TextNome.setText("");
        TextSetor.setSelectedItem("");
        TextCodigo.setText("");
        TextCpf.setText("");

    }
    
    public void campos(boolean Tn, boolean Tse, boolean Tc, boolean TCpf) {
        TextNome.setEnabled(Tn);
        TextSetor.setEnabled(Tse);
        TextCodigo.setEnabled(Tc);
        TextCpf.setEnabled(TCpf);

    }
    
    public void botao(boolean BPI, boolean BPC, boolean BE, boolean BA, boolean Bs, boolean Be) {
        ButtonPesquisarCod.setEnabled(BPI);
        ButtonPesquisar.setEnabled(BPC);
        ButtonExcluir.setEnabled(BE);
        ButtonAtivar.setEnabled(BA);
        ButtonSalvarAlt.setEnabled(Bs);
        ButtonSair.setEnabled(Be);
    }
    
    public void AtualizarTabela() {
        funcionario = new Funcionario();
        try {
            funcionarios = cDao.TodosFuncionariosAtivos();
            String dados[][] = new String[funcionarios.size()][4];
            int i = 0;
            for (Funcionario u : funcionarios) {
                dados[i][0] = String.valueOf(u.getCodigo());
                dados[i][1] = u.getNome();
                dados[i][2] = u.getCpf();
                dados[i][3] = u.getSetor();
                i++;
            }
            String tituloColuna[] = {"Código", "Nome", "CPF", "Setor"};
            modelo.setDataVector(dados, tituloColuna);
            Table.setModel(modelo);
            Table.updateUI();
        } catch (SQLException ex) {
            ex.printStackTrace();
            ex.getMessage();
        }
    }
    
      public int validarAltFun() {
        int vc = 0;
        if (fun2.equals(TextNome.getText())) {
            JOptionPane.showMessageDialog(null, "Já existe um funcionario com este nome");
        } else {
            vc = 1;
        }
        return vc;
    }
    
     public int validarAltCpf() {
        int vc = 0;
        if (cpf2.equals(TextCpf.getText())) {
            JOptionPane.showMessageDialog(null, "Já existe um Cpf com este nome");
            vc = 0;
        } else {
            vc = 1;
        }
        return vc;
        }

    

    public int validarFun() {
        int vc = 0;
        if (fun2.equals(TextNome.getText())) {
            JOptionPane.showMessageDialog(null, "Já existe um funcionario com este nome");
        } else {
            vc = 1;
        }
        return vc;
    }

    public int validarCpf() {
        int vc = 0;
        if (cpf2.equals(TextCpf.getText())) {
            JOptionPane.showMessageDialog(null, "Já existe um Cpf com este nome");
            vc = 0;
        } else {
            vc = 1;
        }
        return vc;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ButtonNovo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        TextCodigo = new javax.swing.JTextField();
        TextCpf = new javax.swing.JFormattedTextField();
        TextSetor = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        ButtonLimpar = new javax.swing.JButton();
        ButtonSair = new javax.swing.JButton();
        ButtonSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        ButtonAtivar = new javax.swing.JButton();
        ButtonSalvarAlt = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ButtonPesquisarCod = new javax.swing.JButton();
        TextCpf1 = new javax.swing.JFormattedTextField();
        ButtonPesquisar = new javax.swing.JButton();
        TextCodigo1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro de Funcionário");

        ButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/page_add.png"))); // NOI18N
        ButtonNovo.setText("Novo");
        ButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNovoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        jLabel2.setText("Nome");

        jLabel3.setText("Tipo Funcionário");

        jLabel4.setText("Código");

        jLabel5.setText("CPF");

        try {
            TextCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        TextSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " ", "Funcionário", "Gerente" }));

        jLabel8.setText("Status");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " ", "Ativo", "Inativo" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 38, Short.MAX_VALUE))
        );

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

        ButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disk.png"))); // NOI18N
        ButtonSalvar.setText("Salvar");
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Setor"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

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

        ButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        ButtonExcluir.setText("Excluir");
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados de Pesquisas"));

        ButtonPesquisarCod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/zoom.png"))); // NOI18N
        ButtonPesquisarCod.setText("Pesquisar");
        ButtonPesquisarCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesquisarCodActionPerformed(evt);
            }
        });

        try {
            TextCpf1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/zoom.png"))); // NOI18N
        ButtonPesquisar.setText("Pesquisar");
        ButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesquisarActionPerformed(evt);
            }
        });

        jLabel6.setText("Código");

        jLabel7.setText("CPF");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(ButtonPesquisarCod, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonPesquisar)
                    .addComponent(TextCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonPesquisarCod)
                    .addComponent(TextCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(155, 155, 155)
                        .addComponent(ButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonExcluir)
                        .addGap(274, 274, 274))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonAtivar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonSalvarAlt)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonNovo)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAtivar)
                    .addComponent(ButtonSalvarAlt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSair)
                    .addComponent(ButtonLimpar)
                    .addComponent(ButtonSalvar)
                    .addComponent(ButtonExcluir))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            Campos(true, true, false, true);
            Botao(false, true, true, true);
        }
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed

        try {
            if (TextNome.getText().isEmpty() || TextSetor.getSelectedItem().equals(0) || TextCpf.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos os Campos precisa ser preenchido");
            } else {
                if (new ValidaCPF().validaCPF(TextCpf.getText())) {
                    funcionario = new Funcionario();
                    funcionario.setNome(TextNome.getText());
                    funcionario.setSetor(TextSetor.getSelectedItem().toString());
                    funcionario.setCpf(TextCpf.getText());

                    cDao.Salvar(funcionario);
//
                    JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
                    Limpar();
                    Campos(false, false, false, true);
                    Botao(true,false, false, true);
                } else {
                    JOptionPane.showMessageDialog(null, "O CPF digitado é Inválido");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNovoActionPerformed
       
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que Deseja Realizar Novo Cadastro?");
        if (i == 0) {
            Campos(true, true, false, true);
            Botao(false, true, true, true);
            Limpar();
        }
    }//GEN-LAST:event_ButtonNovoActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        JOptionPane.showConfirmDialog(null, "Deseja selecionar a linha?");
        Table.getModel();
        try {
            funcionario = cDao.getFuncionariobyCodigo(Integer.parseInt(modelo.getValueAt(Table.getSelectedRow(), 0).toString()));
            if (funcionario == null) {
                JOptionPane.showMessageDialog(null, "Funcionario não encontrado");
            } else {
                TextNome.setText(funcionario.getNome());
                TextCpf.setText(funcionario.getCpf());
                TextSetor.setSelectedItem(funcionario.getSetor());

                cpf = funcionario.getCpf();
                fun = funcionario.getNome();
                campos(true, true, false, false);
                botao(false, false, true, true, true, true);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_TableMouseClicked

    private void ButtonAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAtivarActionPerformed

        int i = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar os campos?!");

        if (i == 0) {
            Campos(true, true, true, true);
            /*Campos(true, true, true, true);
            funcionario = new Funcionario();
            funcionario.setCodigo(Integer.parseInt(TextCodigo.getText()));
            funcionario.setNome(TextNome.getText());
            funcionario.setSetor(TextSetor.getText());
            funcionario.setCpf(TextCpf.getText());
            Campos(false, false, true, true);
            Botao(true, true, false, false, false, true); */
        }
    }//GEN-LAST:event_ButtonAtivarActionPerformed

    private void ButtonSalvarAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarAltActionPerformed

        int i = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar os campos?!");
        if (i == 0) {
            try {
                if (TextNome.getText().isEmpty() || TextCpf.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
                } else {

                    funcionario.setCodigo(Integer.parseInt(TextCodigo.getText()));
                    funcionario.setNome(TextNome.getText());
                    funcionario.setCpf(TextCpf.getText());
                    funcionario.setSetor(TextSetor.getSelectedItem().toString());

                    cDao.Alterar(funcionario);

                    AtualizarTabela();
                    JOptionPane.showMessageDialog(null, "Campos alterados com sucesso!");
                    Limpar();
                    campos(false, false, true, true);
                    botao(true, true, false, false, false, true);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro!");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_ButtonSalvarAltActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Deseja Realmente Excluir?!");
        if (i == 0) {
            try {
                if (TextCodigo.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Pesquise o funcionario a ser excluido");
                } else {
                    cDao.ExcluirFuncionario(Integer.parseInt(TextCodigo.getText()));
                    Limpar();
                    campos(false, false, true, true);
                    botao(true, true, false, false, false, true);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Removido com Sucesso");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void ButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesquisarActionPerformed

        try {
            if (TextCodigo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite o número do Codigo: ");
            } else {
                funcionario = cDao.getFuncionariobyCodigo(Integer.parseInt(TextCodigo.getText()));

                if (funcionario == null) {
                    JOptionPane.showMessageDialog(null, "Funcionario não encontrado");
                } else {
                    TextNome.setText(funcionario.getNome());
                    TextCpf.setText(funcionario.getCpf());
                    TextSetor.setSelectedItem(funcionario.getSetor());
                    campos(false, false, true, true);
                    botao(true, true, true, true, true, true);
                    cpf = funcionario.getCpf();
                    fun = funcionario.getNome();

                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ButtonPesquisarActionPerformed

    private void ButtonPesquisarCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesquisarCodActionPerformed

        try {
            funcionario = cDao.getPesquisaPorCpf(TextCpf.getText());
            if (funcionario == null) {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
            } else {
                TextNome.setText(funcionario.getNome());
                TextCpf.setText(funcionario.getCpf());
                TextSetor.setSelectedItem(funcionario.getSetor());
                TextCodigo.setText(Integer.toString(funcionario.getCodigo()));
                campos(false, false, true, true);
                botao(true, true, true, true, true, true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ButtonPesquisarCodActionPerformed

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
            java.util.logging.Logger.getLogger(View_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAtivar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonNovo;
    private javax.swing.JButton ButtonPesquisar;
    private javax.swing.JButton ButtonPesquisarCod;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JButton ButtonSalvarAlt;
    private javax.swing.JTable Table;
    private javax.swing.JTextField TextCodigo;
    private javax.swing.JTextField TextCodigo1;
    private javax.swing.JFormattedTextField TextCpf;
    private javax.swing.JFormattedTextField TextCpf1;
    private javax.swing.JTextField TextNome;
    private javax.swing.JComboBox<String> TextSetor;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
