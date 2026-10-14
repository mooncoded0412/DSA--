package Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaF {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       for(int i = 0; i < 5; i ++){
        list.add(i + 1);
       }

       //paramters and body of the method is written in same line using lambda expression
       //list.forEach((item) -> System.out.println(item * 2)); //lambda expression

       Consumer<Integer> fun = (item) -> System.out.println(item * 2); //lambda expression
       list.forEach(fun);

       Operation sum = (a, b) -> a + b;
       Operation mul = (a, b) -> a * b;
       Operation sub = (a, b) -> a - b;


    }

    //this is a method that takes 2 integers and returns their sum
    interface Sum{
        int sum(int a, int b);
    }

    interface Operation{
        int Operation(int a, int b);
    }

}
