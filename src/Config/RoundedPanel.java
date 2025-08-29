
package Config;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

/**
 * Classe responsavel por deixar Jpanel redondos
 * 
 */
public class RoundedPanel extends JPanel {
    private int cornerRadius = 20; // Raio dos cantos

    public RoundedPanel() {
        setOpaque(false); // Deixa o fundo transparente para permitir cantos arredondados
    }

    public RoundedPanel(int radius) {
        this.cornerRadius = radius;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g.create();

       
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());

        g2.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius));
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2));
        g2.draw(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius));

        g2.dispose();
        super.paintComponent(g);
    }
}
