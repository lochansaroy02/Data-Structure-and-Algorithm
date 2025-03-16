package Arrays.Matrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathWithObstacleElimination {


    public static void main(String[] args) {

    }
    private  static  final int [][] directions = {{-1,0 }, {1,0}, {0,-1}, {0,1}};

    public  static  int bfs ( int [][] grid , int k){

        int m = grid.length;
        int n = grid[0].length;

        Queue<int [] > que  = new LinkedList<>();
        boolean [][][] visited  =  new boolean[m][n][k+1];

        que.offer(new int [] {0,0,k});
        visited[0][0][k] = true;
        int steps = 0;

        while(!que.isEmpty()){
            int size = que.size();

            for (int s = 0; s <  size; s++) {
                int [] temp = que.poll();

                int curr_i = temp[0];
                int curr_j = temp[1];
                int obs = temp[2];
                // destination point
                if(curr_i == m-1 && curr_j == n-1){
                    return steps;
                }

                for(int [] dir: directions){
                    int new_i = curr_i+dir[0];
                    int new_j = curr_j+ dir[1];


                    if( new_i < 0 ||new_i >= m || new_j < 0 || new_j >= n){
                        continue;
                    }


                    if(grid[new_i][new_j] == 0 && !visited[new_i][new_j][obs]){
                        que.offer(new int[] {new_i, new_j , obs});
                        visited[new_i][new_j][obs] = true;
                    } else if (grid[new_i][new_j] == 1 && obs > 0 &&  !visited[new_i][new_j][obs] ) {
                        que.offer(new int[]{new_i, new_j, obs - 1});
                        visited[new_i][new_j][obs - 1] = true;
                    }
                }
            }
            steps++;
        }

        return  -1;
    }
}
