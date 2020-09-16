public class Human {
    String name;
    Head t;
    Leg l1;
    Leg l2;
    Hand h1;
    Hand h2;

    public String toString()
    {
        String s ="Форма лица " +t.l + '\n'+"Цвет волос "+t.hair+ '\n'+"Цвет глаз "+ t.eye;
        return s;
    }


    Human() {
        t = new Head();
    }
}
