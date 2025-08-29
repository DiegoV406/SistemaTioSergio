
package br.com.sistematiosergio.telas;

import Config.RoundedButton;
import Config.RoundedTextField;
import br.com.sistematiosergio.dao.FornecedorDao;
import br.com.sistematiosergio.model.Fornecedor;
import br.com.sistematiosergio.model.SessaoUsuario;
import br.com.sistematiosergio.model.Usuario;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 * Tela fornecedor
 * 
 */
public class TelaFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form TelaFornecedor
     */
    public TelaFornecedor() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        RoundedButton botaoArredondado = new RoundedButton("Cadastrar", 50);
        botaoArredondado.setBackground(new Color(59, 89, 182));
        botaoArredondado.setForeground(Color.WHITE);
        botaoArredondado.setFont(new Font("Arial", Font.BOLD, 14));
        botaoArredondado.setBounds(btnVoltar.getBounds()); // mesma posição e tamanho

        this.remove(btnVoltar);  // Remove o botão antigo
        this.add(botaoArredondado); // Adiciona o novo botão
        btnVoltar = botaoArredondado; // Se quiser manter o nome

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 53, 111));
        jLabel1.setText("Cadastro de Fornecedor");

        RoundedTextField campoNome = new RoundedTextField(20);
        campoNome.setText(txtNome.getText());
        campoNome.setBounds(txtNome.getBounds());
        campoNome.setBackground(Color.WHITE);
        campoNome.setForeground(Color.BLACK);
        campoNome.setFont(txtNome.getFont());

        // Remove o antigo e adiciona o novo
        this.remove(txtNome);
        txtNome = campoNome;  // Atualiza a referência para manter o nome
        this.add(txtNome);
        this.repaint();
        txtNome.setBackground(new java.awt.Color(238, 238, 238));
        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        RoundedTextField campoCnpj = new RoundedTextField(20);
        campoCnpj.setText(txtCnpj.getText());
        campoCnpj.setBounds(txtCnpj.getBounds());
        campoCnpj.setBackground(Color.WHITE);
        campoCnpj.setForeground(Color.BLACK);
        campoCnpj.setFont(txtCnpj.getFont());

        // Remove o antigo e adiciona o novo
        this.remove(txtCnpj);
        txtCnpj = campoCnpj;  // Atualiza a referência para manter o nome
        this.add(txtCnpj);
        this.repaint();
        txtCnpj.setBackground(new java.awt.Color(238, 238, 238));
        txtCnpj.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCnpj.setForeground(new java.awt.Color(0, 0, 0));
        txtCnpj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        RoundedTextField campoData = new RoundedTextField(20);
        campoData.setText(txtData.getText());
        campoData.setBounds(txtData.getBounds());
        campoData.setBackground(Color.WHITE);
        campoData.setForeground(Color.BLACK);
        campoData.setFont(txtData.getFont());

        // Remove o antigo e adiciona o novo
        this.remove(txtData);
        txtData = campoData;  // Atualiza a referência para manter o nome
        this.add(txtData);
        this.repaint();
        txtData.setBackground(new java.awt.Color(238, 238, 238));
        txtData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtData.setForeground(new java.awt.Color(0, 0, 0));
        txtData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 53, 111));
        jLabel2.setText("Nome :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(7, 53, 111));
        jLabel3.setText("CNPJ :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(7, 53, 111));
        jLabel4.setText("Data :");

        RoundedButton botaoArredondado3 = new RoundedButton("Cadastrar", 50);
        botaoArredondado3.setBackground(new Color(59, 89, 182));
        botaoArredondado3.setForeground(Color.WHITE);
        botaoArredondado3.setFont(new Font("Arial", Font.BOLD, 14));
        botaoArredondado3.setBounds(btnCadastrar.getBounds()); // mesma posição e tamanho

        this.remove(btnCadastrar);  // Remove o botão antigo
        this.add(botaoArredondado3); // Adiciona o novo botão
        btnCadastrar = botaoArredondado3; // Se quiser manter o nome
        btnCadastrar.setBackground(new java.awt.Color(7, 53, 111));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        RoundedButton botaoArredondado2 = new RoundedButton("Limpar", 50);
        botaoArredondado2.setBackground(new Color(59, 89, 182));
        botaoArredondado2.setForeground(Color.WHITE);
        botaoArredondado2.setFont(new Font("Arial", Font.BOLD, 14));
        botaoArredondado2.setBounds(btnLimpar.getBounds()); // mesma posição e tamanho

        this.remove(btnLimpar);  // Remove o botão antigo
        this.add(botaoArredondado2); // Adiciona o novo botão
        btnLimpar = botaoArredondado2; // Se quiser manter o nome
        btnLimpar.setBackground(new java.awt.Color(94, 180, 251));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(94, 180, 251));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNome)
                        .addComponent(txtCnpj)
                        .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(288, 288, 288))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botão responsavel por retorna a tela de Menu
     * @param evt 
     */
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Usuario usuario = SessaoUsuario.getUsuarioLogado();
        if (usuario != null) {
            String setor = usuario.getSetor();
            this.dispose();
            TelaMenu tM = new TelaMenu();
            tM.configurarPermissaoEstoque(setor);
            tM.configurarPermissaoAdministração(setor);
            tM.setTitle("Menu");
            tM.setLocationRelativeTo(null);
            tM.pack();
            tM.setVisible(true);
        }
       
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * Botão responsavel por limpar campos
     * @param evt 
     */
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        txtCnpj.setText("");
        txtData.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    /**
     * Botão resposavel por cadastrar valores no banco de dados
     * @param evt 
     */
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            if (emptyFields()) {

            } else {

                Fornecedor fornecedor = new Fornecedor();
                FornecedorDao dao = new FornecedorDao();
                
                fornecedor.setNome(txtNome.getText());
                fornecedor.setCnpj(txtCnpj.getText());

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date dataConvertida = formato.parse(txtData.getText().trim());
                fornecedor.setData(dataConvertida);

                if (!dao.conectar()) {
                    JOptionPane.showMessageDialog(null, "Erro de conexão");
                    
                } else {
                    int resposta = dao.salvar(fornecedor);

                    if (resposta == 1) {
                        JOptionPane.showMessageDialog(null, "Os seguintes dados foram cadastrados com sucesso: \n"
                                + "\nNome: " + txtNome.getText()
                                + "\nCNPJ: " + txtCnpj.getText()
                                + "\nData: " + txtData.getText()
                        );

                        txtNome.setText("");
                        txtCnpj.setText("");
                        txtData.setText("");
                        txtNome.requestFocus();

                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao tentar inserir dados");
                    }
                    dao.desconectar();
                }

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables


    /**
     * Metodo para validar campos
     * @return Retorna a permissão para o sistema continuar
     */
    private boolean emptyFields() {
    boolean empty = true;
    String nome = txtNome.getText().trim();
    String cnpj = txtCnpj.getText().trim();
    String data = txtData.getText().trim();

   
    if (nome.isEmpty()) {
        JOptionPane.showMessageDialog(null, "ATENÇÃO! Nome não pode ser vazio.");
    }
    
    else if (cnpj.isEmpty() || !cnpj.matches("\\d{14}")) {
        JOptionPane.showMessageDialog(null, "ATENÇÃO! CNPJ deve conter exatamente 14 números.");
    }
    
    else if (data.isEmpty() || !data.matches("\\d{2}/\\d{2}/\\d{4}") ) {
        JOptionPane.showMessageDialog(null, "ATENÇÃO! Data deve estar no formato dd/mm/aaaa .");
    }
    else {
        empty = false; 
    }

    return empty;
}
    
    
    
}
