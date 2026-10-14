package Access;

public class A {
    private int num;
    String name;
    int[] arr;
    
    //to retrieve the value of num we need to create a getter method
    public int getNum(){
        return num;
    }
   
    //to modify the value of num we need to create a setter method 
    public void setNum(int num){
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
