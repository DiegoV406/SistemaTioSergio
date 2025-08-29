
package Config;

import java.awt.*;
import javax.swing.*;

/**
 * Classe responsavel deixar os botões redondos
 * 
 */
public class RoundedButton extends JButton{
    private int radius;

    public RoundedButton(String text, int radius) {
        super(text);
        this.radius = radius;
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getModel().isArmed() ? getBackground().darker() : getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        super.paintComponent(g);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);

        // Cor da borda: branco
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(2)); // Espessura da borda
        g2.drawRoundRect(1, 1, getWidth() - 2, getHeight() - 2, radius, radius);

        g2.dispose();
    }

    @Override
    public boolean contains(int x, int y) {
        Shape shape = new java.awt.geom.RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), radius, radius);
        return shape.contains(x, y);
    }
}
