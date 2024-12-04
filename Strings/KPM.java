package Strings;

public class KPM {
    public static void main(String[] args) {

    }
    public static  void kpm( String s, String p){
        if(s==null || p== null || p.length() > s.length()){
            System.out.println("no match found");
        }
        int i = 0;
        while(true){
            assert s != null;
            assert p != null;
            if (!(s.charAt(i)== p.charAt(i))) break;
            i++;
        }

    }
}
