import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends FillableShape{
     public Rectangle(int x1,int  y1,int  x2,int  y2, Color color,boolean filled) {
        super(x1, y1, x2, y2, color, filled);
    }

     @Override
        public void draw( Graphics g ) {
            //System.out.print(getUpperLeftX());
            //System.out.print(' ');
            //System.out.print(getUpperLeftY());
            //System.out.println();
            g.setColor( getColor() );
            if(getFilled())
                g.fillRect( getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight() );
            else g.drawRect( getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight() );
        }  
}
