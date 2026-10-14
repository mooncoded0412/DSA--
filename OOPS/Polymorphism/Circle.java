package Polymorphism;

public class Circle extends Shapes{

    // this will run when obj of circle is created
    // hence it is overriding the parent method
    @Override // this is called annotation, it is used to check if the method is overridden or not
    void area(){
        System.out.println("Area is 3.14*r*r");
    }
}
