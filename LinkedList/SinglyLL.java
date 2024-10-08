package LinkedList;

import java.util.Stack;

public class SinglyLL {


    private Node head;
    private Node tail;
    public int size;

    public SinglyLL(){
        this.size=0;
    }
    private class Node{
        private int data;
        private  Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insertFirst( int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        tail.next = node;
        node = tail;
        if(head==null){
            head = tail;
        }
        size++;


    }



    public void insertAnywhere( int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index ==size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
    }


    public void display( ){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data +" --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void spiralMatrix2( SinglyLL list , int row, int col) {
        int [][] ans = new int[row][col];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = -1;
            }
        }
        int top = 0;
        int down = row- 1;
        int left = 0;
        int right = col - 1;
        int dir = 0;
        Node temp = head;

        while (temp!=null) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    ans[top][i] = temp.data;
                   temp= temp.next;
                }
                top++;
            }
            if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    ans[i][right] = temp.data;
                    temp= temp.next;
                }
                right--;
            }
            if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    ans[down][i] = temp.data;
                    temp= temp.next;
                }
                down--;
            }
            if (dir == 3) {
                for (int i = down; i >= top; i--) {
                    ans[i][left] = temp.data;
                    temp= temp.next;
                }
                left++;
            }
            dir = (dir + 1) % 4;


        }
        for (int[] an : ans) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(an[j] + " ");
            }
            System.out.println();
        }

    }


    public   void insertGCD (SinglyLL list ){
        Node temp = head;
        int index = 1;
        if(temp.next==null || temp==null){
            return;

        }

        while(temp.next!=null && temp!=null){
            int a = temp.data;
            int b = temp.next.data;
            int c = getGCD(a,b);
            insertAnywhere(c,index);
            index+=2;
            temp=temp.next.next;
        }
    }


    public int getGCD ( int a, int b){
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);

    }

    public void rotate( SinglyLL list ){
        Node temp = head;
        while (temp.next.next !=null){
            temp = temp.next;
        }
        temp.next = head;
        temp = null;
        list.display();

    }

    public Node deleteNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node temp = head;

        if (index == 0) {
            Node deletedNode = head;
            head = head.next;
            size--;

            if (size == 0) {
                tail = null;
            }
            return deletedNode;
        }

        // Traverse to the node just before the node to be deleted
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        // Now temp is the node just before the one to delete
        Node nodeToDelete = temp.next;

        // If the node to delete is the tail, adjust the tail
        if (nodeToDelete == tail) {
            tail = temp;
        }

        // Skip the node to be deleted
        temp.next = nodeToDelete.next;
        size--;

        return nodeToDelete;
    }
    public void twinSum(){

        int max = Integer.MIN_VALUE;
        Node temp = head;
        Stack<Integer>  st = new Stack<>();
        int i = 0;
        while(i<(size/2)){
            st.push(temp.data);
            temp = temp.next;
            i++;
        }
           while(temp!=null && !st.isEmpty()){
               int val = st.peek();
               st.pop();
               int sum = val+temp.data;
                if(sum> max){
                    max = sum;
                }
               temp = temp.next;
           }
//        return max;


    }



}
