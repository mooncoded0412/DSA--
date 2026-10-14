package ObjectCloning;
import java.util.*;

public class Human implements Cloneable {
    int age;
    String name;
    int arr[];

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 9, 1};
    }

   /*  @Override
    public Object clone() throws CloneNotSupportedException {
        //this is shallow copy 
        return super.clone();
    }*/
   public Object clone() throws CloneNotSupportedException {

    Human twin = (Human) super.clone();//actually this is shallow copy because when we change the value of twin.arr[0] it also changes the value of h1.arr[0] because both are pointing to the same memory location.

    //this is a deep copy because we are creating a new array and copying the values of the original array to the new array. So when we change the value of twin.arr[0] it does not change the value of h1.arr[0] because both are pointing to different memory locations.

    twin.arr = new int[this.arr.length];
    for(int i = 0; i < twin.arr.length; i ++){
        twin.arr[i] = this.arr[i];
    }

    return twin;
   }
}

