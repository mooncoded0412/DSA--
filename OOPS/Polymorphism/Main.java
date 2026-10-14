package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        Circle c = new Circle(); 
        Square sq = new Square();
        Triangle t = new Triangle();

        s.area();
        c.area();
        sq.area();
        t.area();
    }
}
