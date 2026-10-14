package Access;

public class Main {
    public static void main(String[] args){
    A a = new A(22, "Arshia");
    //1. access the data members
    //2. modify the data members

    int num =a.getNum(); //getter method to access the private data member
    
    System.out.println("The value of num is: "+num);

    }
}
