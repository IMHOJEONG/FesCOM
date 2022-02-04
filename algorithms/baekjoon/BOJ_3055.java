import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class BOJ_3055 {
    static  int sr = -1;
    static  int sc = -1;
    static  int destR = -1;
    static  int destC = -1;
    static  ArrayList<int[]> water = new ArrayList<>();
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	static void print(char[][] arr){
	    System.out.println("----------------");
	    for(int i = 0; i < arr.length ; i++){
    	    for(int j = 0; j < arr[0].length ; j++){
    	        System.out.print(arr[i][j]+" ");
    	    }
	        System.out.println();
	    }
	    
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer stk = new StringTokenizer(br.readLine());
        
        int R = toInt(stk.nextToken());
        int C = toInt(stk.nextToken());
        char[][] test = new char[R][C];
        for(int i = 0; i < R ; i++){
            char[] arr = br.readLine().toCharArray();
            for(int j = 0; j < C ; j++){
                test[i][j] = arr[j];
                if(test[i][j] == 'S'){
                    sr = i;
                    sc = j;
                }
                if(test[i][j] == 'D'){
                    destR = i;
                    destC = j;
                }
                if(test[i][j] == '*'){
                    water.add(new int[]{i,j});
                }
            }
        }
        int result = bfs(R,C,test);
        if(result == -1) {
            System.out.println("KAKTUS");
        }
        else {
            System.out.println(result);   
        }
        
	}
	
	public static int bfs(int R, int C, char[][] test) {
        
        Queue<int[]> queue = new LinkedList();
        int[][] used = new int[R][C];
        if(water.size() != 0){
            
            for(int[] check : water){
                queue.offer(new int[]{check[0], check[1]});
                used[check[0]][check[1]] = 1;
            }
        }
        queue.offer(new int[]{sr,sc});
        int time = 0;
        used[sr][sc] = 1;

        while(!queue.isEmpty()){
            
            int level = queue.size();
            //print(test);
            for(int i = 0; i < level ; i++){
                
                int[] point = queue.poll();
                
                if(test[point[0]][point[1]] == 'D') {
                    return time;
                }    
                
                for(int d = 0 ; d < 4 ; d++){
                    
                    int nr = point[0] + dr[d];
                    int nc = point[1] + dc[d];
                    
                    if(nr >= 0 && nr < R && nc >= 0 && nc < C){
                        
                        if(test[point[0]][point[1]] == '*' && 
                            used[nr][nc] == 0 && 
                            test[nr][nc] != 'D'&&
                            test[nr][nc] != 'X'
                            
                        ){
                            used[nr][nc] = 1;
                            queue.offer(new int[]{nr,nc});
                            test[nr][nc] = '*';
                        }    
                        if(test[point[0]][point[1]] == 'S' && 
                        
                            used[nr][nc] == 0 && test[nr][nc] != '*'
                            && test[nr][nc] != 'X'
                        ){
                            if(test[nr][nc] != 'D'){
                                test[nr][nc] = 'S';
                            }
                                used[nr][nc] = 1;
                                queue.offer(new int[]{nr,nc});    
                        }
                        
                        
                    }
                    
                    
                }    

                
            }
            time++;
            
            
        }
        
        return -1;
	    
	}
	
}  
 