public class Rectangle {
    private int x1, x2, y1, y2;
    private boolean filled;
    private static int objectCount = 0;


    public Rectangle(int x1,int  x2,int  y1,int  y2,boolean filled) {
        objectCount++;
        setX1(x1);
        setX2(x2);
        setY1(y1);
        setY2(y2);
        setFilled(filled);
    }

    public boolean isOverlapping (Rectangle b) {
        return (Math.max(Math.min(this.x2, b.x2) - Math.max(this.x1, b.x1), 0) * Math.max(Math.min(this.y2, b.y2) - Math.max(this.y1, b.y1), 0) > 0 ? true : false);
    }

    public Rectangle() {
        this(0, 0, 0, 0, false);
    }

    public int getUpperLeftX() {
        return Math.min(x1, x2);
    }

    public int getUpperLeftY() {
        return Math.min(y1, y2);
    }

    public int getWidth() { 
        return Math.abs(x1 - x2);
    }

    public int getHeight() {
        return Math.abs(y1 - y2);
    }

    public double calcArea() {
        return getWidth() * getHeight();
    }

    public static int getCount() {
        return objectCount;
    }
    
    public int getX1() {
        return x1;
    }
   
    public int getX2() {
        return x2;
    }
    
    public int getY1() {
        return y1;
    }
    
    public int getY2() {
        return y2;
    }
    
    public boolean getFilled() {
        return filled;
    }
    
    public void setX1(int x1) {
        if (x1 >= 0) {
            this.x1 = x1;
        }
        else {
            System.err.println("x1 should not be smaller then 0");
            this.x1 = 0;
        }
    }
   
    public void setX2(int x2) {
        if (x2 >= 0) {
            this.x2 = x2;
        }
        else {
            System.err.println("x2 should not be smaller then 0");
            this.x2 = 0;
        }
    }
    
    public void setY1(int y1) {
        if (y1 >= 0) {
            this.y1 = y1;
        }
        else {
            System.err.println("y1 should not be smaller then 0");
            this.y1 = 0;
        }
    }
    
    public void setY2(int y2) {
        if (y2 >= 0) {
            this.y2 = y2;
        }
        else {
            System.err.println("y2 should not be smaller then 0");
            this.y2 = 0;
        }
    } 
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    } 
    
    public String toString(int x) {
        return String.valueOf(x);
    }
}

