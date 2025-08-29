
package br.com.sistematiosergio.model;



import java.util.Date;



/**
 * Classe que recebe os atributos de um Produto
 * 
 */
public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private double valor;
    private Date data;
    private String fornecedor;

    public Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    @Override
    public String toString() {
        return this.nome ;
    }
    
    
}
