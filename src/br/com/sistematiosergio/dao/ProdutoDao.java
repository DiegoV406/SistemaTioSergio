
package br.com.sistematiosergio.dao;

import br.com.sistematiosergio.model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que recebe os metodos para fazer o crud da classe Produto
 * 
 */
public class ProdutoDao {
    
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
     * Metodo que salva valores na tabela produto do banco de dados
     * @param produto Objeto da classe Produto
     * @return Retorna um erro se não for possivel conectar no banco de dados para salvar 
     */
    public int salvar(Produto produto) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO produto (nome, quantidade, valor, data, fornecedor) VALUES (?, ?, ?, ?, ?)");
            st.setString(1, produto.getNome());

            st.setInt(2, produto.getQuantidade());

            st.setDouble(3, produto.getValor());
            
            java.sql.Date dataSQL = new java.sql.Date(produto.getData().getTime());
            st.setDate(4, dataSQL);
            
            st.setString(5, produto.getFornecedor());

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
    public List<Produto> getProduto() {
        String sql = "SELECT * FROM produto ";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            List<Produto> listaProduto = new ArrayList<>();

            while (rs.next()) {
                Produto produto = new Produto();
                
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setValor(rs.getDouble("valor"));
                produto.setData(rs.getDate("data"));
                produto.setFornecedor(rs.getString("fornecedor"));

                listaProduto.add(produto);
            }
            return listaProduto;

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar listar os produtos");
            return new ArrayList<>();
        }
    }
    /**
     * Metodo responsavel por excluir um valor do banco de dados pelo id
     * @param id Id do objeto a ser excluido
     * @return Retorna erro se não foi possivel excluir
     */
    public boolean excluir(int id) {
        try {
            st = conn.prepareStatement("DELETE FROM produto WHERE id = ?");
            st.setInt(1, id);
            int rowsAffected = st.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir produto: " + ex.getMessage());
            return false;
        }
    }
    
    /**
     * Metodo responsavel por buscar o valor do produto pelo nome
     * @param nomeSelecionado Nome do produto a ser buscado
     * @return Retorna o valor do produto
     */
     public static double buscarValorPorNome(String nomeSelecionado) {
        ProdutoDao produtoDao = new ProdutoDao();
        List<Produto> lista = produtoDao.getProduto();
        for (Produto p : lista) {
            if (p.getNome().equals(nomeSelecionado)) {
                return p.getValor();
            }
        }
        return -1;
    }

     /**
      * Metodo responsavel por buscar a quantidade do produto pelo nome
      * @param nomeSelecionado Nome do produto a ser buscado
      * @return Retorna a quantidade do produto
      */
    public static int buscarQuantidadePorNome(String nomeSelecionado) {
        ProdutoDao produtoDao = new ProdutoDao();
        List<Produto> lista = produtoDao.getProduto();
        for (Produto p : lista) {
            if (p.getNome().equals(nomeSelecionado)) {
                return p.getQuantidade();
            }
        }
        return -1;
    }
    
    /**
     * Metodo responsavel por atualizar a quantidade do produto no banco de dados
     * @param idProduto Id do produto a ser atualizado
     * @param novaQuantidade Novo valor 
     */
    public void atualizarQuantidade(int idProduto, int novaQuantidade) {
    try {
        PreparedStatement stmt = conn.prepareStatement("UPDATE produto SET quantidade = ? WHERE id = ?");
        stmt.setInt(1, novaQuantidade);
        stmt.setInt(2, idProduto);
        stmt.executeUpdate();
        stmt.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar estoque: " + e.getMessage());
    }
}

}
