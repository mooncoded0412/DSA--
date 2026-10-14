package Generics;

public class CustomGenericA<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private static int size = 0;//also working as index value

    public CustomGenericA(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size ++] = num;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public void resize(){
        Object temp[] = new Object[data.length * 2];

        //copy the current items i the new array 
        for(int i = 0; i < data.length; i ++){
            temp[i] = data[i];
        }
        data = temp;
    }
    
    @SuppressWarnings("unchecked")
    public T remove(){
        T removed = (T) (data[-- size]);
        return removed;
    }
    
    @SuppressWarnings("unchecked")
    public T get(int index){
        return (T) data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    public String toString(){
        return "CustomGenericA{" +
                "data=" + java.util.Arrays.toString(data) + ", size=" + size + "}";
    }

    public static void main(String[] args){
        CustomGenericA<Integer> list = new CustomGenericA<>();
        list.add(45);
        
        for(int i = 0; i < 14; i ++){
            list.add(2 * i);
        }

        System.out.println(list);
    }
}
