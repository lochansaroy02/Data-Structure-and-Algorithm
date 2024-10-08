package DataStructureDesign;

import java.util.ArrayList;
import java.util.List;

public class StackWithInc {

     private List<Integer> stack;
     private List<Integer> increment;
     private  int maxSize;


    public StackWithInc(int n) {
        maxSize = n;
        stack = new ArrayList<>();
        increment = new ArrayList<>();


    }
    public  void push (int val){
        if(stack.size()< maxSize ){
            stack.add(val);
            increment.add(0);
        }
    }
    public  int   pop(){
        if (stack.isEmpty()){
            return -1;
        }
        int index  = stack.size()-1;
        if(index>0){
            increment.set(index-1, increment.get(index-1)+ increment.get(index));
        }
        int topVal = stack.get(index)+increment.get(index);
        stack.remove(index);
        increment.remove(index);
        return topVal;
    }



    public void increment(int k, int val){
            int index = Math.min(k, stack.size())-1;
            if(index>= 0){
                increment.set(index, increment.get(index+val));
            }

    }
}
