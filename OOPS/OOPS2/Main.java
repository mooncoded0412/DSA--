public class Main {
    public static void main(String[] args){
        Human h1 = new Human(22, "Muskaan", 100000, false);
        Human h2 = new Human(22, "Arshia", 100000, false);

        System.out.println(h1.age);

        //access, modify , whatever you wanna do with static variable using class name 👍

        //what is static ? 
        //static variable is a variable which is associated with class and not with object. So, if you create multiple objects of a class, all the objects will share the same static variable.

        //why public void static main ?
        //public - so that it can be accessed from anywhere 
        //void - because it does not return anything 
        //static - because it can be called without creating an object of the class. It is associated with class and not with object.
        //main - because it is the entry point of the program. It is the method which is called when the program is run.
        System.out.println(Human.population);

        //greet();
        //greet is not static method so it cannot be called from static method main. It can be called from non-static method only. So, we need to create an object of the class to call the greet method.
    }
    
    //static method can be called without creating an object of the class. It is associated with class not with object. So, it can be called from static method main. It can be called from non-static method also.
    static void fun(){
        System.out.println("fun");
        //greet(); we cannot call no-static method from static method. It can be called from non-static method only. so, we need to create an object of the class to call the greet method.

        Main obj = new Main();
        obj.greet();//we can call non-static method from static method by creating an object of the class and then calling the method using the object.
    }

    void greet(){
        System.out.println("greet");
        fun();// we can call static method from non-static method.It can be called from static method also. It can be called from non-static method also.
    }
    
}
