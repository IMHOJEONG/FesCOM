import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1627A {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int k = 0 ; k < t ; k++){
            
            StringTokenizer stk = new StringTokenizer(br.readLine());
            
            int n = toInt(stk.nextToken());
            int m = toInt(stk.nextToken()); 
            int r = toInt(stk.nextToken()); 
            int c = toInt(stk.nextToken()); 
            
            char[][] arr = new char[n][m];
            int blackCell = 0;
            for(int i = 0 ; i < n ; i++){
                
                char[] test = br.readLine().toCharArray();
                for(int j = 0 ; j < m ; j++){
                    arr[i][j] = test[j];
                    if(arr[i][j] == 'B') {
                        blackCell++;
                    }
                }
                
            }
            
            if(blackCell == 0){
                System.out.println(-1);
                continue;
            }
            
            if(arr[r-1][c-1] == 'B'){
                System.out.println(0);
                continue;
            }
            
            boolean isok = false; 
            
            for(int i = 0; i < n ; i++){
                
                if(arr[i][c-1] == 'B'){
                    isok = true;
                    break;
                }
                
            }
            if(isok){
                System.out.println(1);
                continue;
            }
            for(int j = 0 ; j < m ; j++){
                if(arr[r-1][j] == 'B'){
                    isok = true;
                    break;
                }
            }
            if(isok){
                System.out.println(1);
                continue;
            }
            
                System.out.println(2);
            
            
            
            // System.out.println(result);
            
        }
        
        

	}
	
}  
