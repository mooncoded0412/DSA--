package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
       List<Integer> list = new ArrayList<>();
       List<Integer> list2 = new LinkedList<>();

       list.add(34);
       list2.add(65);
       list2.add(89);

       System.out.println(list2);
    }
}
