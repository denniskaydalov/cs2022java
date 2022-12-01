public class Rectangle extends FillableShape{
    private static int rectangleCount = 0;

    public Rectangle(int x1,int  x2,int  y1,int  y2,boolean filled) {
        super(x1, x2, y1, y2, filled);
        rectangleCount++;
    }

    public static int getRectangleCount() {
        return rectangleCount;
    }


    public Rectangle() {
        this(0, 0, 0, 0, false);
    }

    public boolean isOverlapping (Rectangle b) {
        return (Math.max(Math.min(getX2(), b.getX2()) - Math.max(getX1(), b.getX1()), 0) * Math.max(Math.min(getY2(), b.getY2()) - Math.max(getY1(), b.getY1()), 0) > 0 ? true : false);
    }

    public double calcArea() {
        return getWidth() * getHeight();
    }
}

