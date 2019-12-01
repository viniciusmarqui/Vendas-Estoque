/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.CadastroProduto_Dao;
import Model.Produto;
import static java.lang.Integer.parseInt;
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
public class View_Produto extends javax.swing.JFrame {

   
    DefaultTableModel modelo = new DefaultTableModel();
    List<Produto> produtos;
    Produto pro;
    CadastroProduto_Dao cDao;
    Produto produto;
            
    public View_Produto() {
        
        pro = new Produto();
        cDao = new CadastroProduto_Dao();
        initComponents();
        TablePro.setRowSorter(new TableRowSorter(modelo));

        produtos = new ArrayList<>();
        this.setVisible(true);
        Campos(false, false, false, false, false);
        Botao(true, false, false, true);
        
        campos(false, false, false, false, false,false,false, false);
        botao(true, false, false, false, true);
        AtualizarTabela();
    }

  
    public void Limpar() {
        TextCodigoPro.setText("");
        TextDescricao.setText("");
        TextValor.setText("");
        TextFabricante.setText("");
        TextQuantidade.setText("");
        TextMarca.setText("");
        TextCompra.setText("");
        TextStatus.setSelectedItem("");
    }
    
    

    public void Campos(boolean Tc, boolean Td, boolean Tv, boolean Tf, boolean Tq) {
        TextCodigoPro.setEnabled(Tc);
        TextDescricao.setEnabled(Td);
        TextValor.setEnabled(Tv);
        TextFabricante.setEnabled(Tf);
        TextQuantidade.setEnabled(Tq);

    }
    
    public void Botao(boolean Bn, boolean Bl, boolean Bs, boolean Be) {
        ButtonNovo.setEnabled(Bn);
        ButtonLimpar.setEnabled(Bl);
        ButtonSalvar.setEnabled(Bs);
        ButtonSair.setEnabled(Be);
    }
    
    public void campos(boolean Tc, boolean Td, boolean Tv, boolean Tf, boolean Tq, boolean TM, boolean TC, boolean TS) {
        TextCodigoPro.setEnabled(Tc);
        TextDescricao.setEnabled(Td);
        TextValor.setEnabled(Tv);
        TextFabricante.setEnabled(Tf);
        TextQuantidade.setEnabled(Tq);
        TextMarca.setEnabled(TM);
        TextCompra.setEnabled(TC);
        TextStatus.setEnabled(TS);

    }
    
     public void botao(boolean BP, boolean BE, boolean BA, boolean BsA, boolean Be) {
        ButtonPesq.setEnabled(BP);
        ButtonExcluir.setEnabled(BE);
        ButtonAtivar.setEnabled(BA);
        ButtonSalvarAlt.setEnabled(BsA);
        ButtonSair.setEnabled(Be);
    }
    
    public void AtualizarTabela() {
        produto = new Produto();
        try {
            produtos = cDao.TodosProdutosAtivos();
            String dados[][] = new String[produtos.size()][5];
            int i = 0;
            for (Produto u : produtos) {
                dados[i][0] = String.valueOf(u.getCodigo());
                dados[i][1] = u.getDescricao();
                dados[i][4] = String.valueOf(u.getValor());
                dados[i][2] = u.getFabricante();
                dados[i][3] = String.valueOf(u.getQntestoque());
                i++;
            }
            String tituloColuna[] = {"Codproduto", "descricao", "Fabricante", "Qntestoque", "Valor"};
            modelo.setDataVector(dados, tituloColuna);
            TablePro.setModel(modelo);
            TablePro.updateUI();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
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
        jLabel6 = new javax.swing.JLabel();
        TextCodigoPro = new javax.swing.JTextField();
        TextDescricao = new javax.swing.JTextField();
        TextValor = new javax.swing.JTextField();
        TextFabricante = new javax.swing.JTextField();
        TextQuantidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TextCompra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TextMarca = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TextStatus = new javax.swing.JComboBox<>();
        ButtonLimpar = new javax.swing.JButton();
        ButtonSalvar = new javax.swing.JButton();
        ButtonSair = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TextCodigo1 = new javax.swing.JTextField();
        ButtonPesq = new javax.swing.JButton();
        ButtonAtivar = new javax.swing.JButton();
        ButtonSalvarAlt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePro = new javax.swing.JTable();
        ButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro de Produto");

        ButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/page_add.png"))); // NOI18N
        ButtonNovo.setText("Novo");
        ButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNovoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Produto"));

        jLabel2.setText("Código do Produto");

        jLabel3.setText("Descrição do Produto");

        jLabel4.setText("Valor");

        jLabel5.setText("Fabricante");

        jLabel6.setText("Quantidade");

        jLabel8.setText("Preço de Compra");

        jLabel9.setText("Marca");

        TextMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextMarcaActionPerformed(evt);
            }
        });

        jLabel10.setText("Status");

        TextStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ativo", "Inativo" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TextFabricante, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextDescricao)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TextValor, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(TextCodigoPro))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(TextCodigoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(TextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(TextStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(TextCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bullet_delete.png"))); // NOI18N
        ButtonLimpar.setText("Limpar Dados");
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });

        ButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disk.png"))); // NOI18N
        ButtonSalvar.setText("Salvar");
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });

        ButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/door_in.png"))); // NOI18N
        ButtonSair.setText("Sair");
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });

        jLabel7.setText("Código do Produto");

        ButtonPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/zoom.png"))); // NOI18N
        ButtonPesq.setText("Pesquisar");
        ButtonPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesqActionPerformed(evt);
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

        TablePro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descricao", "Valor", "Fabricante", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablePro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablePro);

        ButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        ButtonExcluir.setText("Excluir");
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonLimpar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonExcluir))
                            .addComponent(ButtonPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonAtivar)
                .addGap(18, 18, 18)
                .addComponent(ButtonSalvarAlt)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ButtonNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAtivar)
                    .addComponent(ButtonSalvarAlt))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ButtonPesq))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonLimpar)
                    .addComponent(ButtonSalvar)
                    .addComponent(ButtonSair)
                    .addComponent(ButtonExcluir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            if (TextDescricao.getText().isEmpty() || TextValor.getText().isEmpty() || TextFabricante.getText().isEmpty() || TextQuantidade.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos os Campos precisa ser preenchidos!");
            } else {
                pro = new Produto();
                pro.setDescricao(TextDescricao.getText());
                pro.setValor(Float.parseFloat(TextValor.getText()));
                pro.setFabricante(TextFabricante.getText());
                pro.setQntestoque(parseInt(TextQuantidade.getText()));

                cDao.Salvar(pro);

                Limpar();
                JOptionPane.showMessageDialog(null, "Gravado Com sucesso");
                Campos(false, false, false, false, false);
                Botao(true, false, false, true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO!");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
       

        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que Deseja Limpar?");
        if (i == 0) {
            Limpar();
            Campos(false, true, true, true, true);
            Botao(true, false, false, true);
        }
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
       
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja realmente Sair?");
        if (i == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_ButtonSairActionPerformed

    private void ButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNovoActionPerformed
       
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que Deseja Realizar Novo Cadastro?");
        if (i == 0) {
            Campos(false, true, true, true, true);
            Botao(false, true, true, true);
            Limpar();
        }
    }//GEN-LAST:event_ButtonNovoActionPerformed

    private void ButtonPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesqActionPerformed

        try {
            if (TextCodigoPro.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite o número do Codigo: ");
            } else {
                produto = cDao.getProdutobyCodigo(Integer.parseInt(TextCodigoPro.getText()));
            }
            if (produto == null) {
                JOptionPane.showMessageDialog(null, "Produto não encontrado");
            } else {
                TextDescricao.setText(produto.getDescricao());
                TextValor.setText(Integer.toString((int) produto.getValor()));
                TextFabricante.setText(produto.getFabricante());
                TextQuantidade.setText(Integer.toString((int) produto.getQntestoque()));
                campos(true, false, false, false, false,false,false,false);
                botao(true, true, true, true, true);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ButtonPesqActionPerformed

    private void ButtonAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAtivarActionPerformed

        int i = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar os campos?!");

        if (i == 0) {
            produto = new Produto();
            produto.setCodigo(Integer.parseInt(TextCodigoPro.getText()));
            produto.setDescricao(TextDescricao.getText());
            produto.setValor(Float.parseFloat(TextValor.getText()));
            produto.setFabricante(TextFabricante.getText());
            produto.setQntestoque(parseInt(TextQuantidade.getText()));
            campos(true, true, true, true, true,true,true,true);
            botao(true, true, true, true, true);
        }
    }//GEN-LAST:event_ButtonAtivarActionPerformed

    private void ButtonSalvarAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarAltActionPerformed

        try {
            if (TextDescricao.getText().isEmpty() || TextValor.getText().isEmpty()|| TextFabricante.getText().isEmpty() || TextQuantidade.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
            } else {
                produto = new Produto();
                // produto.setCodigo(Integer.parseInt(TextCodigo.getText()));
                produto.setDescricao(TextDescricao.getText());
                produto.setValor(Float.parseFloat(TextValor.getText()));
                produto.setFabricante(TextFabricante.getText());
                produto.setQntestoque(parseInt(TextQuantidade.getText()));

                cDao.Alterar(produto);
                AtualizarTabela();
                JOptionPane.showMessageDialog(null, "Campos alterados com sucesso!");
                Limpar();

                campos(true, false, false, false, false,false,false,false);
                botao(true, false, false, false, true);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro!");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ButtonSalvarAltActionPerformed

    private void TableProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProMouseClicked
        JOptionPane.showConfirmDialog(null, "Deseja selecionar a linha?");
        TablePro.getModel();
        try {
            produto = cDao.getProdutobyCodigo(Integer.parseInt(modelo.getValueAt(TablePro.getSelectedRow(), 0).toString()));
            if (produto == null) {
                JOptionPane.showMessageDialog(null, "Produto não encontrado");
            } else {
                TextDescricao.setText(produto.getDescricao());
                TextFabricante.setText(produto.getFabricante());
                TextQuantidade.setText(String.valueOf(produto.getQntestoque()));
                TextValor.setText(String.valueOf(produto.getValor()));

                campos(false, true, true, true, true,true,true,true);
                botao(false, true, true, true, true);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_TableProMouseClicked

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Deseja Realmente Excluir?!");
        if (i == 0) {
            try {
                if (TextCodigoPro.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Pesquise o produto a ser excluido");
                } else {
                    cDao.ExcluirProduto(Integer.parseInt(TextCodigoPro.getText()));
                    Limpar();
                    campos(true, false, false, false, false,false,false,false);
                    botao(true, false, false, false, true);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Removido com Sucesso");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void TextMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextMarcaActionPerformed

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
            java.util.logging.Logger.getLogger(View_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAtivar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonNovo;
    private javax.swing.JButton ButtonPesq;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JButton ButtonSalvarAlt;
    private javax.swing.JTable TablePro;
    private javax.swing.JTextField TextCodigo1;
    private javax.swing.JTextField TextCodigoPro;
    private javax.swing.JTextField TextCompra;
    private javax.swing.JTextField TextDescricao;
    private javax.swing.JTextField TextFabricante;
    private javax.swing.JTextField TextMarca;
    private javax.swing.JTextField TextQuantidade;
    private javax.swing.JComboBox<String> TextStatus;
    private javax.swing.JTextField TextValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
