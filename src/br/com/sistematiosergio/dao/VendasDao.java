
package br.com.sistematiosergio.dao;

import br.com.sistematiosergio.model.Vendas;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que recebe os metodos da classe Vendas
 * 
 */
public class VendasDao {
    
    private static final List<Vendas> listaVendas = new ArrayList<>();

    /**
     * Metodo resposavel por adicionar objetos em uma lista
     * @param vendas Objeto da classe vendas
     */
    public static void adicionar(Vendas vendas) {
        listaVendas.add(vendas);
    }

    /**
     * Metodo responsavel por listar os objetos de uma lista
     * @return Retorna uma lista
     */
    public static List<Vendas> listar() {
        return listaVendas;
    }
}
