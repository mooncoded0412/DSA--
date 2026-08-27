public class Human{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Hello");
        //System.out.println(this.age);// we cannot use this keyword in static method because static method is associated with class and not with object. So, it does not have any object to refer to. So, we cannot use this keyword in static method
    }

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        // does not make sense to use thus keyword for static variable because static variable is not associated with any object also this is the convention to use class name to access static variable 
        Human.population += 1;

        Human.message();
    }

    
}