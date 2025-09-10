public class DynamicStack  extends CustomStack{

    public DynamicStack() {
        super(); // It will call CustomStack;
    }
    public DynamicStack(int size ) {
        super(); // It will call CustomStack(int size);
    }

    @Override
    public boolean push(int item) {

        // this one takes care of it been full
       if(this.isFull()){
           //Double the array size
           int temp[]= new int[data.length*2];


           // Copy all the previous items in the previous array;
           for (int i = 0; i < data.length; i++) {
               temp[i]=data[i];
               
           }

           data = temp;

       }
       // At this point we know that the array is not full;

        // insert item
        return super.push(item);


    }
}
