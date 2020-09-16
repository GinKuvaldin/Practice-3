public class testHuman {
    public static void main (String[] arg)
    {
        System.out.println("Человек: \n");

        Head h1 = new Head();
        h1.setL("Овальное");
        h1.setHair("Блондин");
        h1.setEye("Зеленый");

        Leg l1 = new Leg();
        l1.setFeetl(50.5);
        l1.setRazmer(43.2);
        Leg l2 = new Leg();
        l2.setRazmer(43.5);
        l2.setFeetl(50.4);

        Hand ha1 = new Hand();
        ha1.setHandl(44.4);
        Hand ha2 = new Hand();
        ha2.setHandl(44.3);

        Human John = new Human();
        System.out.println(h1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(ha1);

    }
}
