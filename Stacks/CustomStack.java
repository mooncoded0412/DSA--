public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = item; 
        return true;
    }

    public boolean isFull(){
        return ptr == data.length - 1;
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new StackException("Stack is Empty");
        }
        int removed = data[ptr];
        ptr --;
        return removed;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public int peek() throws Exception {
        if(isEmpty()) {
            throw new StackException("Stack is Empty");
        }
        return data[ptr];
    }

    public void display(){
        for(int i = ptr; i >= 0; i--){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        stack.display();
    }
}
