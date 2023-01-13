
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class MyRectangle extends JPanel {
    // This method is called automatically by the JVM when the window needs to be (re)drawn.
    @Override
    public void paintComponent( Graphics g ) {
        // We MUST call the overridden paintComponent() method from JPanel first
        super.paintComponent( g );
        
        // Get the dimensions of the panel in pixels
        int panelWidth = getWidth();
        int panelHeight = getHeight();
        
        // Draw diagonal lines between opposite corners
        for(int i = 3; i < 13; ++i)
            g.drawRect( 10 * i + 5, 10 * i + 5, 10 * i, 10 * i );
        //g.drawLine( 20, 20, 0, 0 );
    }
}