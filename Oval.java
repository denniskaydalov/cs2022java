public class Oval extends FillableShape{
    public Oval(int x1,int  x2,int  y1,int  y2,boolean filled) {
        setX1(x1);
        setX2(x2);
        setY1(y1);
        setY2(y2);
        setFilled(filled);
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

