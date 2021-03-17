package JavaProgrammingMasterclassforSoftwareDevelopers.Point;

public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((( - x) * ( - x)) + (( - y) * ( - y)));
    }

    public double distance(int x, int y) {
        return Math.sqrt(((x - getX()) * (x - getX())) + ((y - getY()) * (y - getY())));
    }

    public double distance(Point another) {
        return Math.sqrt(((another.x - x) * (another.x - x)) +
                ((another.y - y) * (another.y - y)));
    }

    //Formula para obtener la Distancia entre dos puntos.
    //Dado A(xA, yA) y B(xB, yB)
    //d(A,B) = raíz cuadrada de ((xB-xA)*(xB-xA) + (yB-yA)*(yB-yA))
}
