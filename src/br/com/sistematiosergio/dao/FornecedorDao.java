
package br.com.sistematiosergio.dao;

import br.com.sistematiosergio.model.Fornecedor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que recebe os metodos para fazer o crud da classe Fornecedor
 * 
 */
public class FornecedorDao {
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
    /**
     * Metodo para conectar ao banco de dados
     * @return Retorna falso se não foi possivel conectar ao banco de dados
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
     * Metodo para desconectar do banco de dados
     */
    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {

        }
    }
    
    /**
     * Metodo para salvar arquivos no bancos de dados
     * @param fornecedor Objeto da classe Fornecedor
     * @return Retorna erro se não foi possivel conectar ao banco de dados
     */
    public int salvar(Fornecedor fornecedor) {
        int status;
        try {
            
            st = conn.prepareStatement("INSERT INTO fornecedor (nome, cnpj, data) VALUES (?, ?, ?)");
            st.setString(1, fornecedor.getNome());
            
            st.setString(2, fornecedor.getCnpj());

            java.sql.Date dataSQL = new java.sql.Date(fornecedor.getData().getTime());
            st.setDate(3, dataSQL);

            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
    
    /**
     * Metodo para buscar valores no banco de dados
     * @return Retorna uma lista 
     */
    public List<Fornecedor> getFornecedor() {
        String sql = "SELECT * FROM fornecedor";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            List<Fornecedor> listaFornecedor = new ArrayList<>();

            while (rs.next()) { 
                Fornecedor fornecedor = new Fornecedor();

                fornecedor.setId(rs.getInt("id"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setData(rs.getDate("data"));

                listaFornecedor.add(fornecedor);
            }
            return listaFornecedor;

            
        } catch (Exception e) {
            return null;
        }
    }
    
}
