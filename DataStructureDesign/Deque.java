package DataStructureDesign;
//Double ended queue
public class Deque{
    private int [] deq;
    private int front;
    private int rear;
    private int count;
    private int capacity;
    public Deque(int k) {
       capacity =  k;
       deq = new int[k];
       front = 0;
       rear = k-1;
       count = 0;


    }

    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        front = (front -1 + capacity)% capacity; //decrement
        deq[front] = value;
        count++;
        return true;

    }

    public boolean insertLast(int value) {
            if(isFull()){
                return false;
            }
            rear = (rear+1)% capacity; //increment
            deq[rear] = value;
            count++;
            return true;

    }

    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        front = (front+1)%capacity;
        count--;
        return true;
    }

    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        rear  = (rear -1+ capacity)%capacity;
        count--;
        return true;
    }


    public int getFront() {
        if(isEmpty()){
            return  -1;
        }
        return deq[front];
    }

    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return  deq[rear];
    }

    public boolean isEmpty() {
        return count ==0;

    }

    public boolean isFull() {
        return count == capacity;
    }

}
