package Generics;

import java.util.ArrayList;
public class CustomA {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private static int size = 0;//also working as index value

    public CustomA(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size ++] = num;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public void resize(){
        int temp[] = new int[data.length * 2];

        //copy the current items i the new array 
        for(int i = 0; i < data.length; i ++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
        int removed = data[-- size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    public String toString(){
        return "CustomA{" +
                "data=" + java.util.Arrays.toString(data) + ", size=" + size + "}";
    }

    public static void main(String[] args){
       // ArrayList List = new ArrayList<>();
       CustomA list = new CustomA();
       //list.add(3);
       //list.add(5);
       //list.add(9);

       System.out.println(list);
        
       for(int i = 0; i < 14; i ++){
        list.add(2 * i);
       }

       System.out.println(list);
    }    
}
