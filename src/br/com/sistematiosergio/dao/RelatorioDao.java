
package br.com.sistematiosergio.dao;



import br.com.sistematiosergio.model.Relatorio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que recebe os metodos para fazer o crud da classe Relatorio
 * 
 */
public class RelatorioDao {
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
     * * Metodo para salvar arquivos no bancos de dados
     * @param relatorio Objeto da classe relatorio
     * @return Retorna erro se não foi possivel conectar ao banco de dados
     */
    public int salvar(Relatorio relatorio ) {
        int status;
        try {
            
            st = conn.prepareStatement("INSERT INTO relatorio (nomeVendedor, valorVenda, data) VALUES (?, ?, ?)");
            st.setString(1, relatorio.getNomeVendedor());
            
            st.setDouble(2, relatorio.getValorVenda());

            java.sql.Date dataSQL = new java.sql.Date(relatorio.getDataVenda().getTime());
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
    public List<Relatorio> getRelatorio() {
        String sql = "SELECT * FROM relatorio ";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            List<Relatorio> listaRelatorio = new ArrayList<>();

            while (rs.next()) {
                Relatorio relatorio = new Relatorio();
                
                relatorio.setId(rs.getInt("id"));
                relatorio.setNomeVendedor(rs.getString("nomeVendedor"));
                relatorio.setValorVenda(rs.getDouble("valorVenda"));
                relatorio.setDataVenda(rs.getDate("data"));
                

                listaRelatorio.add(relatorio);
            }
            return listaRelatorio;

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar listar os produtos");
            return new ArrayList<>();
        }
    }
}
