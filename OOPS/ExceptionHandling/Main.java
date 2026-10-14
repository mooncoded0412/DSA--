package ExceptionHandling;

import java.util.*;

public class Main {
    public static void main(String args[]){
        int a = 5;
        int b = 0;
        try{
            //divide(a, b);
            String name = "Muskaan";
            if(name.equals("Muskaan")){
                throw new MyException("My Custom Exception: Name cannot be Muskaan");
            }
        }
        //My custom exception 
        catch(MyException e){
            System.out.println("My Exception caught:" + e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally{
            System.out.println("Finally block executed");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if( b == 0 ){
            throw new ArithmeticException("Division by Zero is not allowed");
        }
        return a / b;
    }
}
