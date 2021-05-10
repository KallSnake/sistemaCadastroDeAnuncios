package view;

import controller.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import model.*;

public class FrmCadastrar extends javax.swing.JFrame {
    
    ConexaoDB conectaAnuncio = new ConexaoDB();
    controller.ControllerCadastrarAnuncio controlCadastrarAnuncio = new ControllerCadastrarAnuncio();
    model.ModelCadastrarAnuncio mCadastrarAnuncio = new ModelCadastrarAnuncio();
    int flag = 0;
    
    public FrmCadastrar() {
  
        initComponents();
        
        // ABILITANDO/DESABILITANDO OS CAMPOS
        txtNomeAnuncio.setEnabled(!true);
        txtCliente.setEnabled(!true);
        jDateInicio.setEnabled(!true);
        jDateTermino.setEnabled(!true);
        txtInvestimento.setEnabled(!true);
        txtCod.setEnabled(false);
        txtPesquisar.setEnabled(!false);

        // ABILITANDO/DESABILITANDO OS BOTÕES APÓS CLICAR NO BOTÃO
        btnAdicionar.setEnabled(!false);
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(!true);
        btnDeletar.setEnabled(false);
        btnPesquisar.setEnabled(!false); 
        
        preencherTabelaAnuncio("SELECT * FROM ANUNCIO ORDER BY COD_ANUNCIO");
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAnuncio = new javax.swing.JTable();
        txtCod = new javax.swing.JTextField();
        txtNomeAnuncio = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtPesquisar = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        txtInvestimento = new javax.swing.JTextField();
        jDateTermino = new com.toedter.calendar.JDateChooser();
        jDateInicio = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("TelaCadastrar"); // NOI18N
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cliente:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome do anúncio:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Data de Início:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Data de Término:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Investimento por dia em R$:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Código do anúncio:");

        btnAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnAdicionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jTableAnuncio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableAnuncio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAnuncioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAnuncio);

        txtPesquisar.setToolTipText("Informe o nome do cliente para pesquisar");
        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtInvestimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInvestimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel4)
                                        .addGap(12, 12, 12)
                                        .addComponent(jDateTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNomeAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(588, 588, 588)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInvestimento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(txtInvestimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeletar)
                            .addComponent(btnAlterar)
                            .addComponent(btnAdicionar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(btnCancelar))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(938, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
       
        // BOTÃO DELETAR
        int resposta;

        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir!");

        if (resposta == JOptionPane.YES_OPTION) {

            mCadastrarAnuncio.setCod_anuncio(Integer.parseInt(txtCod.getText()));

            controlCadastrarAnuncio.excluir(mCadastrarAnuncio);

            // ABILITANDO/DESABILITANDO OS BOTÕES APÓS EXLUIR
            btnAdicionar.setEnabled(true);
            btnAlterar.setEnabled(!true);
            btnSalvar.setEnabled(false);
            btnDeletar.setEnabled(!true);
            btnCancelar.setEnabled(false);
            btnPesquisar.setEnabled(true);

            // LIMPANDO OS CAMPOS APÓS EXLCUIR
            txtNomeAnuncio.setText("");
            txtCliente.setText("");
            jDateInicio.setDate(null);
            jDateTermino.setDate(null);
            txtInvestimento.setText("");
            txtCod.setText("");
            txtPesquisar.setText("");

            // ABILITANDO/DESABILITANDO OS CAMPOS APÓS EXCLUIR
            txtNomeAnuncio.setEnabled(false);
            txtCliente.setEnabled(false);
            jDateInicio.setEnabled(false);
            jDateTermino.setEnabled(false);
            txtInvestimento.setEnabled(false);
            txtCod.setEnabled(false);
            txtPesquisar.setEnabled(true);

            preencherTabelaAnuncio("SELECT * FROM ANUNCIO ORDER BY COD_ANUNCIO");
            
        } else {

            // ABILITANDO/DESABILITANDO OS BOTÕES APÓS CLICAR EM "NÃO" EXLUIR
            btnAdicionar.setEnabled(true);
            btnAlterar.setEnabled(!true);
            btnSalvar.setEnabled(false);
            btnDeletar.setEnabled(!true);
            btnCancelar.setEnabled(false);
            btnPesquisar.setEnabled(true);

            // DESABILITANDO OS CAMPOS APÓS CLICAR EM "NÃO" EXCLUIR
            txtNomeAnuncio.setEnabled(false);
            txtCliente.setEnabled(false);
            jDateInicio.setEnabled(false);
            jDateTermino.setEnabled(false);
            txtInvestimento.setEnabled(false);
            txtCod.setEnabled(false);
            txtPesquisar.setEnabled(true);

            // LIMPANDO OS CAMPOS APÓS CLICAR EM "NÃO" EXLCUIR
            txtNomeAnuncio.setText("");
            txtCliente.setText("");
            jDateInicio.setDate(null);
            jDateTermino.setDate(null);
            txtInvestimento.setText("");
            txtCod.setText("");
            txtPesquisar.setText("");

            preencherTabelaAnuncio("SELECT * FROM ANUNCIO ORDER BY COD_ANUNCIO");
            
        }
        
        preencherTabelaAnuncio("SELECT * FROM ANUNCIO ORDER BY COD_ANUNCIO");
        
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed

    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        // BOTÃO ALTERAR
        
        flag = 2;

        // ABILITANDO/DESABILITANDO OS CAMPOS
        txtNomeAnuncio.setEnabled(true);
        txtCliente.setEnabled(true);
        jDateInicio.setEnabled(true);
        jDateTermino.setEnabled(true);
        txtInvestimento.setEnabled(true);
        txtCod.setEnabled(false);
        txtPesquisar.setEnabled(false);

        // ABILITANDO/DESABILITANDO OS BOTÕES APÓS CLICAR NO BOTÃO
        btnAdicionar.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnDeletar.setEnabled(false);
        btnPesquisar.setEnabled(false);
        
        preencherTabelaAnuncio("SELECT * FROM ANUNCIO ORDER BY COD_ANUNCIO");
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        
        // BOTÃO ADICIONAR
                
        flag = 1;
        
        // LIMPANDO OS CAMPOS APÓS CLICAR
        txtNomeAnuncio.setText("");
        txtCliente.setText("");
        jDateInicio.setDate(null);
        jDateTermino.setDate(null);
        txtInvestimento.setText("");
        txtPesquisar.setText("");
        txtCod.setText("");
        
        // COLOCANDO FOCO NO CAMPO
        txtNomeAnuncio.requestFocusInWindow();
        
        // ABILITANDO OS CAMPOS 
        txtNomeAnuncio.setEnabled(true);
        txtCliente.setEnabled(true);
        jDateInicio.setEnabled(true);
        jDateTermino.setEnabled(true);
        txtInvestimento.setEnabled(true);
        txtPesquisar.setEnabled(false);
        txtCod.setEnabled(false);
        
        // ABILITANDO/DESABILITANDO OS BOTÕES APÓS CLICAR NO BOTÃO
        btnAdicionar.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnDeletar.setEnabled(false);
        btnPesquisar.setEnabled(false);

        preencherTabelaAnuncio("SELECT * FROM ANUNCIO ORDER BY COD_ANUNCIO");
        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        // BOTÂO SALVAR ALTERAÇÕES
        
         // VALIDANDO OS CAMPOS ANTES DE SALVAR
        if ( txtNomeAnuncio.getText().isEmpty() 
                || txtNomeAnuncio.getText().length() < 3 ) {
            
            JOptionPane.showMessageDialog(rootPane, "Informe o nome do anúncio!");
            txtNomeAnuncio.requestFocusInWindow();
            return;
        }
        
        if ( txtCliente.getText().isEmpty() 
                || txtCliente.getText().length() < 3 ) {
            
            JOptionPane.showMessageDialog(rootPane, "Informe o nome do cliente!");
            txtCliente.requestFocusInWindow();
            return;
        }
        
        if ( txtInvestimento.getText().isEmpty() 
                || txtInvestimento.getText().length() < 1
                || txtInvestimento.getText().length() > 7
                || txtInvestimento.getText().equals("0")
                || txtInvestimento.getText().equals("00")
                || txtInvestimento.getText().equals("000")
                || txtInvestimento.getText().equals("0000")
                || txtInvestimento.getText().equals("00000")
                || txtInvestimento.getText().equals("000000")
                || txtInvestimento.getText().equals("0000000") ) {
            
            JOptionPane.showMessageDialog(rootPane, "Informe um valor válido para investimento!");
            txtInvestimento.requestFocusInWindow();
            return;
        }

        if ( jDateInicio.getCalendar().after(jDateTermino.getCalendar())
                || jDateInicio.getCalendar() == null
                || jDateTermino.getCalendar() == null 
                || ( jDateInicio.getCalendar() == null && jDateTermino.getCalendar() == null ) ) {
        
            JOptionPane.showMessageDialog(rootPane, "Informe uma data válida para inicio e fim do anúncio!");
            
        } else {

            if ( flag == 1 ) {

                // SALVANDO OS DADOS NA BASE DE DADOS
                mCadastrarAnuncio.setNome_anuncio(txtNomeAnuncio.getText());
                mCadastrarAnuncio.setNome_cliente(txtCliente.getText());
                mCadastrarAnuncio.setData_inicio(jDateInicio.getCalendar());
                mCadastrarAnuncio.setData_termino(jDateTermino.getCalendar());
                mCadastrarAnuncio.setInvestimento_dia(Float.parseFloat(txtInvestimento.getText()));

                controlCadastrarAnuncio.salvar(mCadastrarAnuncio);
                
                // ABILITANDO/DESABILITANDO OS BOTÕES APÓS SALVAR
                btnAdicionar.setEnabled(true);
                btnAlterar.setEnabled(!true);
                btnSalvar.setEnabled(false);
                btnDeletar.setEnabled(!true);
                btnPesquisar.setEnabled(true);

                // DESABILITANDO OS CAMPOS APÓS SALVAR
                txtNomeAnuncio.setEnabled(false);
                txtCliente.setEnabled(false);
                jDateInicio.setEnabled(false);
                jDateTermino.setEnabled(false);
                txtInvestimento.setEnabled(false);
                txtCod.setEnabled(false);
                
                // ABILITANDO CAMPO DE PESQUISA
                txtPesquisar.setEnabled(true);

                // LIMPANDO OS CAMPOS APÓS SALVAR
                txtNomeAnuncio.setText("");
                txtCliente.setText("");
                jDateInicio.setDate(null);
                jDateTermino.setDate(null);
                txtInvestimento.setText("");
                txtPesquisar.setText("");
                txtCod.setText("");
                
                preencherTabelaAnuncio("SELECT * FROM ANUNCIO ORDER BY COD_ANUNCIO");
                
            } else {

                if ( flag == 2 ) {

                    // DESABILITANDO O CAMPO PESQUISA
                    txtPesquisar.setEnabled(false);
                    btnPesquisar.setEnabled(false);

                    // SETANDO OS DADOS PARA EDITAR NA BASE DE DADOS
                    mCadastrarAnuncio.setNome_anuncio(txtNomeAnuncio.getText());
                    mCadastrarAnuncio.setNome_cliente(txtCliente.getText());
                    mCadastrarAnuncio.setData_inicio(jDateInicio.getCalendar());
                    mCadastrarAnuncio.setData_termino(jDateTermino.getCalendar());
                    mCadastrarAnuncio.setInvestimento_dia(Float.parseFloat(txtInvestimento.getText())); 
                    mCadastrarAnuncio.setCod_anuncio(Integer.parseInt(txtCod.getText()));
                    

                    controlCadastrarAnuncio.editar(mCadastrarAnuncio);
                    

                    // ABILITANDO/DESABILITANDO OS BOTÕES APÓS EDITAR
                    btnAdicionar.setEnabled(true);
                    btnAlterar.setEnabled(!true);
                    btnSalvar.setEnabled(false);
                    btnDeletar.setEnabled(!true);
                    btnPesquisar.setEnabled(true);

                    // ABILITANDO/DESABILITANDO OS CAMPOS APÓS EDITAR
                    txtNomeAnuncio.setEnabled(false);
                    txtCliente.setEnabled(false);
                    jDateInicio.setEnabled(false);
                    jDateTermino.setEnabled(false);
                    txtInvestimento.setEnabled(false);
                    txtCod.setEnabled(false);
                    txtPesquisar.setEnabled(true);

                    // LIMPANDO OS CAMPOS APÓS EDITAR
                    txtNomeAnuncio.setText("");
                    txtCliente.setText("");
                    jDateInicio.setDate(null);
                    jDateTermino.setDate(null);
                    txtInvestimento.setText("");
                    txtPesquisar.setText("");
                    txtCod.setText("");

                    
                    preencherTabelaAnuncio("SELECT * FROM ANUNCIO ORDER BY COD_ANUNCIO");
                    
                }

            }

        }

        preencherTabelaAnuncio("SELECT * FROM ANUNCIO ORDER BY COD_ANUNCIO");
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        // BOTÃO PESQUISAR
        if (txtPesquisar.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(rootPane, "Informe o nome do cliente para pesquisar!");
            txtPesquisar.requestFocusInWindow();
            
            preencherTabelaAnuncio("SELECT * FROM ANUNCIO ORDER BY COD_ANUNCIO");

        } else if ( !txtPesquisar.getText().isEmpty() ) {
            
            // ABILITANDO/DESABILITANDO OS BOTÕES ANTES DE PESQUISAR
            btnAdicionar.setEnabled(true);
            btnAlterar.setEnabled(!true);
            btnDeletar.setEnabled(!true);
            btnCancelar.setEnabled(true);

            mCadastrarAnuncio.setPesquisa(txtPesquisar.getText());

            ModelCadastrarAnuncio mCadastrarAn = controlCadastrarAnuncio.buscarCliente(this.mCadastrarAnuncio);
            
            preencherTabelaAnuncio("SELECT * FROM ANUNCIO WHERE NOME_CLIENTE LIKE '%" + mCadastrarAn.getPesquisa() + "%'");

            txtPesquisar.setText("");

            // ABILITANDO/DESABILITANDO OS BOTÕES APÓS PESQUISAR
            btnAdicionar.setEnabled(true);
            btnAlterar.setEnabled(!true);
            btnSalvar.setEnabled(false);
            btnDeletar.setEnabled(!true);
            btnCancelar.setEnabled(!false);
            btnPesquisar.setEnabled(true);

            // DESABILITANDO OS CAMPOS APÓS PESQUISAR
            txtNomeAnuncio.setEnabled(false);
            txtCliente.setEnabled(false);
            jDateInicio.setEnabled(false);
            jDateTermino.setEnabled(false);
            txtInvestimento.setEnabled(false);
            txtCod.setEnabled(false);
            txtPesquisar.setEnabled(true);

            // LIMPANDO OS CAMPOS APÓS PESQUISAR
            txtCod.setText("");
            txtNomeAnuncio.setText("");
            txtCliente.setText("");
            // jDateInicio.setDate(null);
            // jDateTermino.setDate(null);
            txtInvestimento.setText("");
            txtPesquisar.setText("");
            
        } else if ( mCadastrarAnuncio.getPesquisa().equals("")) {
            
            preencherTabelaAnuncio("SELECT * FROM ANUNCIO ORDER BY COD_ANUNCIO");
            
        }
                
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        // BOTÃO CANCELAR
        
        // LIMPANDO OS CAMPOS
        txtNomeAnuncio.setText("");
        txtCliente.setText("");
        jDateInicio.setDate(null);
        jDateTermino.setDate(null);
        txtInvestimento.setText("");
        txtPesquisar.setText("");
        txtCod.setText("");     
        
        // ABILITANDO/DESABILITANDO OS CAMPOS
        txtNomeAnuncio.setEnabled(!true);
        txtCliente.setEnabled(!true);
        jDateInicio.setEnabled(!true);
        jDateTermino.setEnabled(!true);
        txtInvestimento.setEnabled(!true);
        txtCod.setEnabled(false);
        txtPesquisar.setEnabled(!false);

        // ABILITANDO/DESABILITANDO OS BOTÕES APÓS CLICAR NO BOTÃO
        btnAdicionar.setEnabled(!false);
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(!true);
        btnDeletar.setEnabled(false);
        btnPesquisar.setEnabled(!false);
        
        preencherTabelaAnuncio("SELECT * FROM ANUNCIO ORDER BY COD_ANUNCIO");
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtInvestimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInvestimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInvestimentoActionPerformed

    private void jTableAnuncioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAnuncioMouseClicked
                
        // EVENTO NA TABELA QUE AO CLICAR SELECIONA O ITEM
        String nome_cliente = "" + jTableAnuncio.getValueAt(jTableAnuncio.getSelectedRow(), 2);

        // JOptionPane.showMessageDialog(rootPane, nome_cliente);
        
        // ABILITANDO/DESABILITANDO OS CAMPOS ANTES DE PESQUISAR
        btnAdicionar.setEnabled(true);
        btnAlterar.setEnabled(!true);
        btnDeletar.setEnabled(!true);
        btnCancelar.setEnabled(true);

        mCadastrarAnuncio.setPesquisa(txtPesquisar.getText());

        // ABILITANDO/DESABILITANDO OS BOTÕES APÓS SELECIONAR ITEM NA TABELA
        btnAdicionar.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnDeletar.setEnabled(true);
        btnCancelar.setEnabled(!false);
        btnPesquisar.setEnabled(true);

        // DESABILITANDO OS CAMPOS APÓS SELECIONAR ITEM NA TABELA
        txtNomeAnuncio.setEnabled(false);
        txtCliente.setEnabled(false);
        jDateInicio.setEnabled(false);
        jDateTermino.setEnabled(false);
        txtInvestimento.setEnabled(false);
        txtCod.setEnabled(false);
        txtPesquisar.setEnabled(true);
        
        // LIMPANDO OS CAMPOS APÓS CLICAR
        txtCod.setText("");
        txtNomeAnuncio.setText("");
        txtCliente.setText("");
        jDateInicio.setDate(null);
        jDateTermino.setDate(null);
        txtInvestimento.setText("");
        txtPesquisar.setText("");
        
        try {
            
            conectaAnuncio.conexao();

            conectaAnuncio.executaSQL("SELECT * FROM ANUNCIO WHERE NOME_CLIENTE = '" + nome_cliente + "'");
        
       
            conectaAnuncio.rs.first();

            txtCod.setText(String.valueOf(conectaAnuncio.rs.getInt("COD_ANUNCIO")));
            txtNomeAnuncio.setText(conectaAnuncio.rs.getString("NOME_ANUNCIO"));
            txtCliente.setText(conectaAnuncio.rs.getString("NOME_CLIENTE"));
            jDateInicio.setDate(conectaAnuncio.rs.getDate("DATA_INICIO"));
            jDateTermino.setDate(conectaAnuncio.rs.getDate("DATA_TERMINO"));
            txtInvestimento.setText(String.valueOf(conectaAnuncio.rs.getFloat("INVESTIMENTO_DIA")));
            
            conectaAnuncio.desconecta();

        } catch (SQLException ex) {

            // JOptionPane.showMessageDialog(rootPane, "Erro ao seleciona os dados!");
            // JOptionPane.showMessageDialog(rootPane, "Erro ao seleciona os dados! \n ERRO: " + ex);
 
        }
        
    }//GEN-LAST:event_jTableAnuncioMouseClicked

    
    public void preencherTabelaAnuncio(String SQL) {
        
        ArrayList dados = new ArrayList();
        
        String[] Colunas = new String[] {"Codigo","Nome do Anuncio", "Nome do Cliente","Data Inicio","Data Termino","Investimento por Dia" };
        
        conectaAnuncio.conexao();
        
        conectaAnuncio.executaSQL(SQL);
        
        
        try {
            
            conectaAnuncio.rs.first();  
            
            do {
                
                dados.add(new Object[]{conectaAnuncio.rs.getInt("COD_ANUNCIO"), 
                    conectaAnuncio.rs.getString("NOME_ANUNCIO"),
                    conectaAnuncio.rs.getString("NOME_CLIENTE"), 
                    conectaAnuncio.rs.getDate("DATA_INICIO"), 
                    conectaAnuncio.rs.getDate("DATA_TERMINO"),
                    "R$ " + conectaAnuncio.rs.getFloat("INVESTIMENTO_DIA") });
            
               }while(conectaAnuncio.rs.next());
            
        } catch (SQLException e) {

            // JOptionPane.showMessageDialog(rootPane, "Erro ao preencher lista!");
            // JOptionPane.showMessageDialog(rootPane, "Erro ao preencher lista! \n ERRO: " + e);

        }
        
        
        ModelTabela mTabelaAnuncio = new ModelTabela(dados, Colunas);
        
        jTableAnuncio.setModel(mTabelaAnuncio);
        jTableAnuncio.getColumnModel().getColumn(0).setPreferredWidth(81);
        jTableAnuncio.getColumnModel().getColumn(0).setResizable(false);
        jTableAnuncio.getColumnModel().getColumn(1).setPreferredWidth(225);
        jTableAnuncio.getColumnModel().getColumn(1).setResizable(false);
        jTableAnuncio.getColumnModel().getColumn(2).setPreferredWidth(225);
        jTableAnuncio.getColumnModel().getColumn(2).setResizable(false);
        jTableAnuncio.getColumnModel().getColumn(3).setPreferredWidth(125);
        jTableAnuncio.getColumnModel().getColumn(3).setResizable(false);
        jTableAnuncio.getColumnModel().getColumn(4).setPreferredWidth(125);
        jTableAnuncio.getColumnModel().getColumn(4).setResizable(false);
        jTableAnuncio.getColumnModel().getColumn(5).setPreferredWidth(133);
        jTableAnuncio.getColumnModel().getColumn(5).setResizable(false);
        jTableAnuncio.getTableHeader().setReorderingAllowed(false);
        jTableAnuncio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableAnuncio.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // conectaAnuncio.desconecta();
        
    }
    
    
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
            java.util.logging.Logger.getLogger(FrmCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private com.toedter.calendar.JDateChooser jDateInicio;
    private com.toedter.calendar.JDateChooser jDateTermino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAnuncio;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtInvestimento;
    private javax.swing.JTextField txtNomeAnuncio;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}