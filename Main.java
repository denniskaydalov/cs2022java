public class Main {  
    
    public static void main(String[] input){
        Rectangle rect = new Rectangle();
        rect.setX1(1);
        rect.setX2(-2);
        rect.setFilled(true);
        System.out.println("rect - X1: " + rect.getX1());
        System.out.println("rect - X2: " + rect.getX2());
        System.out.println("rect - Y1: " + rect.getY1());
        System.out.println("rect - Y2: " + rect.getY2());
        System.out.println("rect - Filled: " +rect.getFilled());
        System.out.println("rect - count: " + rect.getCount());
        System.out.println("rect - upper left x: " + rect.getUpperLeftX());
        System.out.println("rect - upper left y: " + rect.getUpperLeftY());
        System.out.println("rect - width: " + rect.getWidth());
        System.out.println("rect - height: " + rect.getHeight());
        System.out.println("rect - area: " + rect.calcArea());

        Rectangle rect1 = new Rectangle(1, 2, 3, -1, true);
        System.out.println("\nrect1 - X1: " + rect1.getX1());
        System.out.println("rect1 - X2: " + rect1.getX2());
        System.out.println("rect1 - Y1: " + rect1.getY1());
        System.out.println("rect1 - Y2: " + rect1.getY2());
        System.out.println("rect1 - Filled: " +rect1.getFilled());
        System.out.println("rect1 - count: " + rect1.getCount());
        System.out.println("rect1 - upper left x: " + rect1.getUpperLeftX());
        System.out.println("rect1 - upper left y: " + rect1.getUpperLeftY());
        System.out.println("rect1 - width: " + rect1.getWidth());
        System.out.println("rect1 - height: " + rect1.getHeight());
        System.out.println("rect1 - area: " + rect1.calcArea());
        System.out.println("rect1 - overlapping with rect: " + rect1.isOverlapping(rect));

        Oval oval = new Oval(1, 2, 3, -1, true);
        System.out.println("\noval - X1: " + oval.getX1());
        System.out.println("oval - X2: " + oval.getX2());
        System.out.println("oval - Y1: " + oval.getY1());
        System.out.println("oval - Y2: " + oval.getY2());
        System.out.println("oval - Filled: " +oval.getFilled());
        System.out.println("oval - upper left x: " + oval.getUpperLeftX());
        System.out.println("oval - upper left y: " + oval.getUpperLeftY());
        System.out.println("oval - width: " + oval.getWidth());
        System.out.println("oval - height: " + oval.getHeight());
        System.out.println("oval - area: " + oval.calcArea());
        System.out.println("oval - isCircle: " + oval.isCircle());
    }                                                                                                                                                                                                      
}
