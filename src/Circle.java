public class Circle {
    public double x;
    public double y;
    public double r;

    public void printCircle() {
        System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
    }
    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
    }
    public void zoomCircle(double r) {
        this.r = this.r * r;
    }
    public Circle() {
        x = 0.0;
        y = 0.0;
        r = 1.0;
    }
    public Circle(double a, double b, double s) {
        x = a;
        y = b;
        r = s;
    }
    // площадь круга
    public double squareCircle() {
        double s = Math.PI * r * r;
        return s;
    }
    // метод проверяющий равны ли окружности по площадям
    public boolean equalsCircle(Circle cir) {
        if(this.squareCircle() == cir.squareCircle()) {
            return true;
        } else {
            return false;
        }
    }
}


