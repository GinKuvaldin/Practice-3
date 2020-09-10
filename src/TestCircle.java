public class TestCircle
{
    public static void main(String[] args) {
        Circle o1 = new Circle();
        o1.printCircle();
        Circle o2 = new Circle(1,-1,14);
        o2.printCircle();
        System.out.println("Площадь круга o2: "+o2.squareCircle());
        o1.zoomCircle(14);
        if(o1.equalsCircle(o2)) {
            System.out.println("Круги o2 и o1 имеют равную площадь");
        } else {
            System.out.println("Круги o2 и o1 имеют различную площадь");
        }
    }
}
