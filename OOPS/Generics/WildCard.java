package Generics;

//T should either be Number or its subclasses 
public class WildCard<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private static int size = 0;//also working as index value

    public WildCard(){
        this.data = new Object[DEFAULT_SIZE];
    }

    /*public void getList(List<? extends Number> list){
        //do something

        //here you can only pass Number or its subclasses like Integer, Double, Float etc. but you cannot pass String or any other class which is not a subclass of Number.
    } */

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
        WildCard<Integer> list = new WildCard<>();
        list.add(45);

        //Wildcard<Number> list = new WildCard<>();//this will also work because Integer is a subclass of Number.
        
        for(int i = 0; i < 14; i ++){
            list.add(2 * i);
        }

        System.out.println(list);
    }
}

