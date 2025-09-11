public class Q {

    private int data[];
    private static  final int DEFAULT_SIZE=10;
    int end=-1;

    public Q() {
        this(DEFAULT_SIZE);
    }
    public Q(int size){
        data= new int[size];
    }

    public boolean insert (int item) throws  Exception{
        if(isFull()){
            throw new Exception("The queue is full");
        }
        data[++end]=item;
        return true;
    }

    public int remove(int item) throws Exception{
        if(isEmpty()){
            throw new Exception("The queue is empty");
        }
        int removed =data[0];
        for(int i=1;i<=end;i++){
            data[i-1]=data[i];
        }
        return removed;
    }



    public boolean isEmpty(){
        return end==-1;
    }

    public boolean isFull(){
        return end== data.length-1;
    }

    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+ " -> ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        Q queue = new Q();
        queue.insert(20);
        queue.insert(50);
        queue.insert(26);
        queue.insert(57);
        queue.insert(17);
        queue.insert(14);
        queue.display();
        queue.remove(20);
        queue.display();

    }
}
