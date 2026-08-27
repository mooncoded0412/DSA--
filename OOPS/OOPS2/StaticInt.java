public class StaticInt {
    static int a = 4;
    static int b;
    
    //will only run once when the class is loaded into memory. It will not run again when we create an object of the class. It is used to initialize static variables. It is executed before the main method. It is executed only once when the class is loaded into memory.
    static{
        System.out.println("Iam in static block");
        b = a * 4;
    }

    public static void main(String[] args){
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);

        StaticInt.b += 3;


        StaticInt obj2 = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);
    }
}
