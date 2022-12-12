import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    // We'll use a shared array to store 10 Line objects
    private Shape[] lines = new Shape[10];
    
    // Constructor instantiates an array of 10 Random Line objects
    public DrawPanel() {
        // We'll use the Random class to simplify picking random integers
        Random randomNumber = new Random();   
        setBackground( Color.WHITE );
        
        // Create 10 Line objects with random coordinates and colours
        for ( int count = 0; count < lines.length; count++ ) {
            // generate random coordinates
            int x1 = randomNumber.nextInt( 300 );
            int y1 = randomNumber.nextInt( 300 );
            int x2 = randomNumber.nextInt( 300 );
            int y2 = randomNumber.nextInt( 300 );
            int obj = randomNumber.nextInt(3);
            int filled = randomNumber.nextInt(2);
            
            // generate a random color
            Color color = new Color( randomNumber.nextInt( 256 ), 
                                    randomNumber.nextInt( 256 ), randomNumber.nextInt( 256 ) );
            
            // add the line to the array of lines to be displayed
            switch(obj) {
                case 0:
                    lines[ count ] = new Line( x1, y1, x2, y2, color );
                    break;
                case 1:
                    lines[ count ] = new Oval( x1, y1, x2, y2, color, (filled == 1 ? true : false) );
                    break;
                case 2:
                    lines[ count ] = new Rectangle( x1, y1, x2, y2, color, (filled == 1 ? true : false) );
                    break;
            }
        } 
    } 
    
    // This method is called automatically by the JVM when the window needs to be (re)drawn.
    @Override
    public void paintComponent( Graphics g ) {
        super.paintComponent( g );
        
        // Call the draw() method for each Line object in the array
        for ( Shape line : lines )
            line.draw( g );
    } 
} 