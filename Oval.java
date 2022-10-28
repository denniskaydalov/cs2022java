public class Oval extends FillableShape{
    private static int ovalCount = 0;

    public Oval(int x1,int  x2,int  y1,int  y2,boolean filled) {
        super(x1, x2, y1, y2, filled);
        ovalCount++;
    }

    public static int getOvalCount() {
        return ovalCount;
    }

    public Oval() {
        this(0, 0, 0, 0, false);
    }

    public boolean isCircle() {
        return (getWidth() == getHeight() ? true : false);
    }

    public double calcArea() {
            return Math.PI * getWidth() * getHeight();
    }
}

