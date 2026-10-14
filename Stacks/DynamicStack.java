public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super(); // calls CustomStack() default size constructor
    }

    public DynamicStack(int size){
        super(size); // calls CustomStack(int size) constructor
    }

    @Override 
    public boolean push(int item){ 
        // This takes care of array being full by doubling its size
        if(this.isFull()){
            int temp[] = new int[data.length * 2];

            //copy all previous items in new data array
            for(int i = 0; i < data.length; i ++){
                temp[i] = data[i];
            }

            data = temp;

        }

        return super.push(item);
    }

    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        stack.display();
    }
}
