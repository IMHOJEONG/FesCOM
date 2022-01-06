import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_268 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int result = 0; 
		int[][] arr = new int[t][2];
		for(int i = 0 ; i < t ; i++){
		    StringTokenizer stk = new StringTokenizer(br.readLine());
		    arr[i][0] = Integer.parseInt(stk.nextToken());
		    arr[i][1] = Integer.parseInt(stk.nextToken());
		}
		
		for(int i = 0; i < t ; i++) {
		    int host_home = arr[i][0];
		    int host_away = arr[i][1];
		    for(int j = 0; j < t ; j++){
		        if(i != j){
		            
		            int guest_home = arr[j][0]; 
		            int guest_away = arr[j][1]; 
		            
		            if(host_home == guest_away){
		                result++;
		            }
		        }
		    }
		} 
		
		System.out.println(result);
		
	}
	
} 
