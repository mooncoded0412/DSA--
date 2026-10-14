package ObjectCloning;

import java.util.*;
public class Main {
    public static void main(String args[]) throws CloneNotSupportedException{
        Human h1 = new Human(20, "Muskaan");
        //Human h2 = new Human(h1);
        Human twin = (Human) h1.clone();
        //for primitives a new copy is created but for non-primitives a new copy is not created and both the objects point to the same memory location.//almost like a pure copy of the object bu not exactly becuase the non-primitives are not copied and both the objects point to the same memory location.
        System.out.println(h1.age + " " + h1.name);
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(h1.arr));
        //This is shallow copy because when we change the value of twin.arr[0] it also changes the value of h1.arr[0] because both are pointing to the same memory location.
    }
}
