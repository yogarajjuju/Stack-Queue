public class DynamicQueuw extends Circularqueue{
    public DynamicQueuw(){
        super();
    }
    public DynamicQueuw(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if(isFull()){
           int temp[]=new int[data.length*2];
           for(int i=0;i<data.length;i++){
               temp[i]=data[(front+i)% data.length];
           }
           data=temp;
        }


        return super.insert(item);
    }
}
