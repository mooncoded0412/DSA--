public class CustomQueue {
    protected int data[];
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        int item = data[0];
        for(int i = 1; i < data.length; i ++){
            data[i - 1] = data[i];
        }

        end --;
        return item;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }

    public void display(){
        for(int i = 0; i < end; i ++){
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.display();
        System.out.println("Peek: " + queue.peek());
        System.out.println("Removed: " + queue.remove());
        queue.display();
    }
}

