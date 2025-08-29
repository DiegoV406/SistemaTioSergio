
package Config;

import javax.swing.*;
import java.awt.*;

/**
 * Classe responsavel por deixar Jtextfield redondos
 * 
 */
public class RoundedTextField extends JTextField{
    
    private int arcWidth = 20;  // Largura da borda arredondada
    private int arcHeight = 20; // Altura da borda arredondada

    public RoundedTextField(int columns) {
        super(columns);
        setOpaque(false); // Para poder pintar o fundo personalizado
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        // Suavização de bordas
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Cor de fundo
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, arcWidth, arcHeight);

        super.paintComponent(g);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Cor da borda
        g2.setColor(Color.GRAY);
        g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, arcWidth, arcHeight);
        g2.dispose();
    }
    
}
