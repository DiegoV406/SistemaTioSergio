
package br.com.sistematiosergio.dao;

import br.com.sistematiosergio.model.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Classe responsavel por receber os metodos que iram realizar o crud entre a classe Usuario o banco de dados
 * 
 */
public class UsuarioDao {
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
    /**
     * Metodo que conecta o sistema com o banco de dados 
     * @return Retorna false se não foi possivel conectar com o banco de dados
     */
    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistematiosergio", "root", "Campinas1*");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }

    /**
     * Metodo que desconecta do banco de dados
     */
    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {

        }
    }
    
     /**
     * Metodo que salva valores na tabela filmes do banco de dados
     * @param usuario Objeto da classe Usuario
     * @return Retorna um erro se não for possivel conectar no banco de dados para salvar 
     */
    public int salvar(Usuario usuario) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO usuario (nome, login, senha, setor) VALUES (?, ?, ?, ?)");
            st.setString(1, usuario.getNome());

            st.setString(2, usuario.getLogin());

            st.setString(3, usuario.getSenha());
            
            st.setString(4, usuario.getSetor());

            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
    
    /**
     * Metodo que procura se existe determinado nome na tabela Usuario
     * @param nome Variével do tipo String para o nome
     * @return Retorna false se o valor não for encontrado
     */
    public boolean consultarUsuario(String nome) {
        try {
            st = conn.prepareStatement("SELECT * FROM usuario WHERE nome = ?");
            st.setString(1, nome);
            rs = st.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar: " + ex.getMessage());
            return false;
        }
    }
    
    /**
     * Metodo para validar o login do usuario
     * @param usuario Objeto da classe usuario
     * @return Retorna um usuario 
     */
    public static Usuario validarUsuarioSeguro(Usuario usuario) {
        String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
        Usuario usuarioEncontrado = null;

        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistematiosergio", "root", "Campinas1*");
            PreparedStatement statement = conexao.prepareStatement(sql);

            statement.setString(1, usuario.getLogin());
            statement.setString(2, usuario.getSenha());
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                usuarioEncontrado = new Usuario();
                usuarioEncontrado.setId(rs.getInt("id"));
                usuarioEncontrado.setNome(rs.getString("nome"));
                usuarioEncontrado.setLogin(rs.getString("login"));
                usuarioEncontrado.setSenha(rs.getString("senha"));
                usuarioEncontrado.setSetor(rs.getString("setor"));
            }
        } catch (SQLException ex) {
            System.out.println("Sintaxe de comando invalida");
        }

        return usuarioEncontrado;
    }
}
