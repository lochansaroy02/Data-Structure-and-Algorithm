package Strings;


import java.sql.SQLOutput;
import java.util.*;

public class SentenceSimilarity {
    public static void main(String[] args) {
        System.out.println(areSentenceSimilarUsingDeque("my name is ", "my lochan"));
    }

    public  static  boolean areSentenceSimilar(String s1, String s2){
        if(s2.length()> s1.length()){
            String temp = s1;
            s1 = s2;
           s2= temp;
        }
        List<String > st1 =  new ArrayList<>();
        List<String > st2 =  new ArrayList<>();

        st1 = Arrays.asList(s1.split(" "));
        st2 = Arrays.asList(s2.split(" "));


        int i = 0, j = st1.size()-1;
        int k = 0, l = st2.size()-1;

        while( k < st2.size() && i < st1.size() && st2.get(k).equals(st1.get(i))){
            i++;
            k++;
        }

        while (l >= k && st2.get(l).equals(st1.get(j))) {
            j--;
            l--;
        }

        return l<k;
    }

    public static  boolean areSentenceSimilarUsingDeque(String s1, String s2){
        if(s2.length()> s1.length()){
            String temp = s1;
            s1 = s2;
            s2= temp;
        }

        Deque<String> deq1 = new LinkedList<>(Arrays.asList(s1.split(" ")));
        Deque<String> deq2 = new LinkedList<>(Arrays.asList(s2.split(" ")));


        while( !deq1.isEmpty() && !deq2.isEmpty() && deq1.peekFirst().equals(deq1.peekFirst())){
            deq1.pollFirst();
            deq2.pollFirst();
        }

        while( !deq1.isEmpty() && !deq2.isEmpty() && deq1.peekLast().equals(deq1.peekLast())){
            deq1.pollLast();
            deq2.pollLast();
        }
        return deq2.isEmpty();
    }
}
