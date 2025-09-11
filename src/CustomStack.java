public class CustomStack {
    protected int [] data;
    private  static final int  DEFAULT_SIZE=10;

    int pointer=-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }
    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty Stack");
        }
//        int removed = data[pointer];
//        pointer--;
//        return  removed;
        return data[pointer--];

    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty Stack");
        }
        return data[pointer];

    }







    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }





        data[++pointer]=item;
        return true;
    }

    public boolean isFull() {

        return pointer== data.length-1;//pointer is at last index
    }
    public boolean isEmpty() {

        return pointer== -1;
    }
}
