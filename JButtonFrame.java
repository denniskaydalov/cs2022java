import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
 
public class JButtonFrame extends JFrame {
    // These JButton references are declared as instance variables (rather than
    // local variables) so that they can be directly accessed by the inner class.
    private JButton crossButton;
    private JButton checkButton;
    private JLabel studentsLabel;
    private int students;
    private int passed;
    
    public JButtonFrame() {
        // Call the parent JFrame constructor to set the title, and switch to FlowLayout
        super( "JButton Demo" );
        setLayout( new FlowLayout() );
        
        // Create a JButton with text on it
        // Create a ButtonEventListener object
        ActionListener eventListener = new ButtonEventListener();
        
        // Followed by a JButton with an image on it
        ImageIcon checkIcon = new ImageIcon( "checkbox.png" );
        Image checkImage = checkIcon.getImage(); //transform 
        Image newCheckImage = checkImage.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        checkIcon = new ImageIcon(newCheckImage);  // transform it back
        checkButton = new JButton( checkIcon );
        // Use the same ButtonEventListener object for this button too
        checkButton.addActionListener( eventListener );
        
        ImageIcon crossIcon = new ImageIcon( "x.png" );
        Image crossImage = crossIcon.getImage(); //transform 
        Image newCrossImage = crossImage.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        crossIcon = new ImageIcon(newCrossImage);  // transform it back
        crossButton = new JButton( crossIcon );
        // Use the same ButtonEventListener object for this button too
        crossButton.addActionListener( eventListener );
    
        
        add( checkButton );  
      
        studentsLabel = new JLabel( "Out of 0 students, 0 have passed." );
        add( studentsLabel );
        
        add( crossButton );  
    }  
    
    // Here is the inner class for event handling
    class ButtonEventListener implements ActionListener {
        // The ActionListener interface requires that we override the actionPerformed() method.
        // This method will be called automatically whenever a button event occurs.
        @Override 
        public void actionPerformed( ActionEvent e ) {
            // The ActionEvent getSource() method returns a reference to the button widget that was clicked
            // This allows us to use one event listener for more than one JButton, if desired.
            if ( e.getSource() == checkButton ) {
                //JOptionPane.showMessageDialog( null, "You clicked the CHECK JButton.", "Event!", JOptionPane.INFORMATION_MESSAGE );
                students++;
                passed++;
                studentsLabel.setText("Out of " + students + " students, " + passed + " have passed.");
            }
            else {
                //JOptionPane.showMessageDialog( null, "You clicked the CROSS JButton.", "Event!", JOptionPane.INFORMATION_MESSAGE );    
                students++;
                studentsLabel.setText("Out of " + students + " students, " + passed + " have passed.");
            }
        }
    }
}