
package br.com.sistematiosergio.model;

/**
 * Classe responsavel por armazenar os valores de um usuario logado
 * 
 */
public class SessaoUsuario {
    private static Usuario usuarioLogado;

    /**
     * Metodo que salva os atributos de um usuario logado
     * @param usuario Objeto da classe usuario
     */
    public static void setUsuarioLogado(Usuario usuario) {
        usuarioLogado = usuario;
    }

    /**
     * Metodo que retorna os atributos de um usuario logado
     * @return Retorna os atributos de um usuario logado
     */
    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }
}
