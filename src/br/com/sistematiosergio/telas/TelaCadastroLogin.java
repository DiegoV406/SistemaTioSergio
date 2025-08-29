
package br.com.sistematiosergio.telas;

import Config.RoundedButton;
import Config.RoundedTextField;
import br.com.sistematiosergio.dao.Criptografia;
import br.com.sistematiosergio.dao.UsuarioDao;
import br.com.sistematiosergio.model.Usuario;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 * Tela de Cadastro de Login
 * 
 */
public final class TelaCadastroLogin extends javax.swing.JFrame {

    
    public TelaCadastroLogin() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtSetor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 53, 111));
        jLabel1.setText("Cadastro de Funcionário");

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
        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        RoundedTextField campoLogin = new RoundedTextField(20);
        campoLogin.setText(txtLogin.getText());
        campoLogin.setBounds(txtLogin.getBounds());
        campoLogin.setBackground(Color.WHITE);
        campoLogin.setForeground(Color.BLACK);
        campoLogin.setFont(txtLogin.getFont());

        // Remove o antigo e adiciona o novo
        this.remove(txtLogin);
        txtLogin = campoLogin;  // Atualiza a referência para manter o nome
        this.add(txtLogin);
        this.repaint();
        txtLogin.setBackground(new java.awt.Color(238, 238, 238));
        txtLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        RoundedTextField campoSenha = new RoundedTextField(20);
        campoSenha.setText(txtSenha.getText());
        campoSenha.setBounds(txtSenha.getBounds());
        campoSenha.setBackground(Color.WHITE);
        campoSenha.setForeground(Color.BLACK);
        campoSenha.setFont(txtSenha.getFont());

        // Remove o antigo e adiciona o novo
        this.remove(txtSenha);
        txtSenha = campoSenha;  // Atualiza a referência para manter o nome
        this.add(txtSenha);
        this.repaint();
        txtSenha.setBackground(new java.awt.Color(238, 238, 238));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtSetor.setBackground(new java.awt.Color(238, 238, 238));
        txtSetor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estoque", "Administração", "Gerência", " " }));
        txtSetor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 53, 111));
        jLabel2.setText("Nome :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(7, 53, 111));
        jLabel3.setText("Login :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(7, 53, 111));
        jLabel4.setText("Senha :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(7, 53, 111));
        jLabel5.setText("Setor :");

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

        RoundedButton botaoArredondado = new RoundedButton("Voltar", 50);
        botaoArredondado.setBackground(new Color(59, 89, 182));
        botaoArredondado.setForeground(Color.WHITE);
        botaoArredondado.setFont(new Font("Arial", Font.BOLD, 14));
        botaoArredondado.setBounds(btnVoltar.getBounds()); // mesma posição e tamanho

        this.remove(btnVoltar);  // Remove o botão antigo
        this.add(botaoArredondado); // Adiciona o novo botão
        btnVoltar = botaoArredondado; // Se quiser manter o nome
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNome)
                                .addComponent(txtLogin)
                                .addComponent(txtSenha)
                                .addComponent(txtSetor, 0, 510, Short.MAX_VALUE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(84, 84, 84)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
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
     * Botão responsavel por retorna a tela de login
     * @param evt 
     */
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        TelaLogin tl = new TelaLogin();
        tl.setTitle("Tela de Login");
        tl.setLocationRelativeTo(null);
        tl.pack();
        tl.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * Botão resposavel por cadastrar valores no banco de dados
     * @param evt 
     */
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        try {
            if (emptyFields()) {

            } else {

                Usuario usuario = new Usuario();
                UsuarioDao dao = new UsuarioDao();
               
                usuario.setNome(txtNome.getText().trim());
                usuario.setLogin(txtLogin.getText().trim());
                usuario.setSenha(Criptografia.getMD5(txtSenha.getText()));
                usuario.setSetor(txtSetor.getSelectedItem().toString());

                if (!dao.conectar()) {
                    JOptionPane.showMessageDialog(null, "Erro de conexão");
                    return;
                }

                if (dao.consultarUsuario(usuario.getNome())) {
                    JOptionPane.showMessageDialog(null, "Esse Usuario já foi cadastrado");
                } else {
                    int resposta = dao.salvar(usuario);

                    if (resposta == 1) {
                        JOptionPane.showMessageDialog(null, "Os seguintes dados foram cadastrados com sucesso: \n"
                                + "\nNome: " + txtNome.getText()
                                + "\nLogin: " + txtLogin.getText()
                                + "\nSenha: " + txtSenha.getText()
                                + "\nSetor: " + txtSetor.getSelectedItem().toString()
                        );

                        this.dispose();
                        TelaLogin tl = new TelaLogin();
                        tl.setTitle("Tela de Login");
                        tl.setLocationRelativeTo(null);
                        tl.pack();
                        tl.setVisible(true);
                        
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
     * Botão para limpar campos
     * @param evt 
     */
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
       txtNome.setText("");
       txtLogin.setText("");
       txtSenha.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroLogin().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JComboBox<String> txtSetor;
    // End of variables declaration//GEN-END:variables


    /**
     * Metodo para validar campos
     * @return Retorna a permissão para o sistema continuar
     */
    private boolean emptyFields() {
        boolean empty = true;

        if (txtNome.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "ATENÇÃO! Nome não pode ser vazio.");
        } else if (txtLogin.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "ATENÇÃO! Login não pode ser vazio.");
        } else if (txtSenha.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "ATENÇÃO! Senha não pode ser vazio.");
        
        } else {

            empty = false;
        }

        return empty;
    }
    
  
}
    
    
    
    

