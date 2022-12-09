import javax.swing.*;
import javax.swing.JFrame;
 
public class MyWindow {
    public static void main( String[] args ) {
        JFrame appWindow = new JFrame( "X-Window" );
        String input = "";
        while(!input.equals("1") && !input.equals("2"))
            input = JOptionPane.showInputDialog("1 for circle, 2 for rectangle");
        int number = Integer.parseInt(input);
        //String output = name + " is such a nice name!";
        //JOptionPane.showMessageDialog(null, output);
        if(number == 2) {
            MyRectangle drawRectangles = new MyRectangle();
            appWindow.add( drawRectangles );
        }
        else {
            MyCircle drawCircles = new MyCircle();
            appWindow.add( drawCircles );
        }
        
        appWindow.setSize( 320, 240 );
        appWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        appWindow.setVisible( true );
    }    
}