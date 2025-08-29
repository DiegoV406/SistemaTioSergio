
package br.com.sistematiosergio.telas;

import Config.RoundedButton;
import Config.RoundedTextField;
import br.com.sistematiosergio.dao.Criptografia;
import br.com.sistematiosergio.dao.UsuarioDao;
import br.com.sistematiosergio.model.SessaoUsuario;
import br.com.sistematiosergio.model.Usuario;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 * Tela de login
 * 
 */
public final class TelaLogin extends javax.swing.JFrame {

    
    public TelaLogin() {
        initComponents();
        
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(7, 53, 111));

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
        btnCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html>Não Possui<br> acesso ?</html>"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>Clique abaixo para criar<br> sua conta</html>");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo_auto_peças.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(61, 61, 61))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel7)
                .addGap(54, 54, 54)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

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
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 53, 111));
        jLabel1.setText("Faça login para sua conta");

        RoundedButton botaoArredondado1 = new RoundedButton("Entrar", 50);
        botaoArredondado1.setBackground(new Color(59, 89, 182));
        botaoArredondado1.setForeground(Color.WHITE);
        botaoArredondado1.setFont(new Font("Arial", Font.BOLD, 14));
        botaoArredondado1.setBounds(btnEntrar.getBounds()); // mesma posição e tamanho

        this.remove(btnEntrar);  // Remove o botão antigo
        this.add(botaoArredondado1); // Adiciona o novo botão
        btnEntrar = botaoArredondado1; // Se quiser manter o nome
        btnEntrar.setBackground(new java.awt.Color(7, 53, 111));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        RoundedButton botaoArredondado2 = new RoundedButton("Apagar", 50);
        botaoArredondado2.setBackground(new Color(59, 89, 182));
        botaoArredondado2.setForeground(Color.WHITE);
        botaoArredondado2.setFont(new Font("Arial", Font.BOLD, 14));
        botaoArredondado2.setBounds(btnApagar.getBounds()); // mesma posição e tamanho

        this.remove(btnApagar);  // Remove o botão antigo
        this.add(botaoArredondado2); // Adiciona o novo botão
        btnApagar = botaoArredondado2; // Se quiser manter o nome
        btnApagar.setBackground(new java.awt.Color(7, 53, 111));
        btnApagar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnApagar.setForeground(new java.awt.Color(255, 255, 255));
        btnApagar.setText("Apagar");
        btnApagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(7, 53, 111));
        jLabel4.setText("Login");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(7, 53, 111));
        jLabel6.setText("Senha");

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
        txtLogin.setForeground(new java.awt.Color(0, 0, 0));
        txtLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtLogin)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
     * Botão responsavel por levar para tela de cadastro de usuario
     * @param evt 
     */
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        this.dispose();
        TelaCadastroLogin cd = new TelaCadastroLogin();
        cd.setTitle("Tela de Cadastro");
        cd.setLocationRelativeTo(null);
        cd.pack();
        cd.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    /**
     * Botão responsavel por realizar o login
     * @param evt 
     */
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try {
            if (emptyFields()) {

            } else {
                Usuario usuario = new Usuario();

                usuario.setLogin(txtLogin.getText());
                usuario.setSenha(Criptografia.getMD5(txtSenha.getText()));

                usuario = UsuarioDao.validarUsuarioSeguro(usuario);

                if (usuario != null) {

                    SessaoUsuario.setUsuarioLogado(usuario);

                    String setor = usuario.getSetor();
                    String nome = usuario.getNome();

                    if (setor.equalsIgnoreCase("Gerência")) {
                        JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome + ". Sua permissão é de Gerente");
                    } else if (setor.equalsIgnoreCase("Estoque")) {
                        JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome + ". Sua permissão é de Estoquista");
                    } else if (setor.equalsIgnoreCase("Administração")) {
                        JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome + ". Sua permissão é de Administração");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ops, " + nome + "\nParece que você não tem permissão para acessar o sistema :(");
                        return;
                    }

                    this.dispose();
                    TelaMenu tM = new TelaMenu();
                    tM.configurarPermissaoEstoque(usuario.getSetor());
                    tM.configurarPermissaoAdministração(usuario.getSetor());
                    tM.setTitle("Tela de Listagem");
                    tM.setLocationRelativeTo(null);
                    tM.pack();
                    tM.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Erro de autenticação! Verifique se os dados estão corretos.");
                }
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    /**
     * Botão responsavel por limpar campos
     * @param evt 
     */
    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
       txtLogin.setText("");
       txtSenha.setText("");
    }//GEN-LAST:event_btnApagarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables


    /**
     * Metodo para validar campos
     * @return Retorna a permissão para o sistema continuar
     */
    private boolean emptyFields() {
        boolean empty = true;

        if (txtLogin.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "ATENÇÃO! Login não pode ser vazio.");
        
        } else if (txtSenha.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "ATENÇÃO! Senha não pode ser vazio.");
        
        } else {

            empty = false;
        }

        return empty;
    }
    
    
    
}
