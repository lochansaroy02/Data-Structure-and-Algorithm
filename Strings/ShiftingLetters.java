package Strings;

public class ShiftingLetters {
    public static void main(String[] args) {
        int [][] shifts = {{0,1,0},{1,2,1},{0,2,1}};
        String s = "ace";
        System.out.println(shifting(s, shifts));
    }

    public static String shifting( String s , int [][] shifts){

        StringBuilder ans = new StringBuilder();


        for( int [] arr : shifts){
            int start = arr[0];
            int end = arr[1];
            int direction = arr[2];


            for (int i = start ; i <= end;i++ ){
                char ch = s.charAt(i);
               if(direction== 0){
                   ans.append((char)(ch+ch%26));

               }else {
                   ans.append((char) (ch-ch%26));
               }

            }
        }

        return  ans.toString();
    }
}
