package Collections;
import java.util.List;
import java.util.Vector;

public class Vectors {
    //vector synchronization : only one thread can access a file at one time. 
    //in Arraylist multiple threads can access the ArrayList object at a time not in Vector 
    //A vector implements the List interface 
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(56);

        System.err.println(vector);

    }
}
