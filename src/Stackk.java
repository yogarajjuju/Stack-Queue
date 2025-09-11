public class Stackk {
    private int data[];
    private  static final int DEFAULT_SIZE=10;

    private int top=-1;

    public Stackk() {
        this(DEFAULT_SIZE);
    }

    public Stackk(int size){
        data= new int[size];
    }

    public void push(int value ) throws Exception{
        if(isFull()){
            throw new Exception("The stack is full");
        }
        data[++top]=value;
    }

    public void pop(int value) throws Exception{
        if(isEmoty()){
            throw new Exception("The stack is empty");
        }
        data[top--]=value;
    }

    public boolean isFull(){
        return  top==data.length-1;
    }

    public boolean isEmoty(){
        return top==-1;
    }

    public static void main(String[] args) throws Exception {
        Stackk stack = new Stackk();
        stack.push(93);
        stack.push(50);
        stack.push(70);

        stack.push(54);
        stack.push(22);
        stack.push(81);
        stack.push(81);



    }
}
