
package sistematiosergio;

import br.com.sistematiosergio.telas.TelaLogin;

/**
 * Tela Main do sistema
 * 
 */
public class SistemaTioSergio {

   
    public static void main(String[] args) {
        TelaLogin tl = new TelaLogin();
        tl.setTitle("Tela de Login");
        tl.setLocationRelativeTo(null);
        tl.pack();
        tl.setVisible(true);
    }
    
}
