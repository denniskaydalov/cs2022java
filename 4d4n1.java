import javax.swing.JFrame;

public class Main {
    public static void main( String[] args ) {
        //JFrame appWindow = new JFrame( "Wonderful Window!" );
        MoneyTextField appWindow = new MoneyTextField();
        
        appWindow.setSize( 960, 540 );
        appWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        appWindow.setVisible( true );
    }    
}
