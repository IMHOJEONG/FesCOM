import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1623 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < t ; i++){
		    
		    StringTokenizer stk = new StringTokenizer(br.readLine());
		    
		    int n = toInt(stk.nextToken());
		    int m = toInt(stk.nextToken());
		    int rb = toInt(stk.nextToken())-1;
		    int cb = toInt(stk.nextToken())-1;
		    int rd = toInt(stk.nextToken())-1;
		    int cd = toInt(stk.nextToken())-1;
		    
		    int[][] arr = new int[n][m];
		    int dr = 1;
		    int dc = 1;
		    arr[rd][cd] = -1;
		    int count = 0; 
		    while(arr[rd][cd] == -1){
		        
		        for(int k = 0; k < n ; k++){
		            arr[k][cb] = 1;
		        }
		        for(int k = 0; k < m ; k++){
		            arr[rb][k] = 1;
		        }
		        
		        if(arr[rd][cd] != -1){
		            break;
		        }
		        
		        int nextR = rb + dr;
		        int nextC = cb + dc;
		        
		        if(nextR < 0 || nextR >= n){
		            nextR = rb + (-1) * dr;
		            dr = (-1) * dr;
		        }
		        if(nextC < 0 || nextC >= m){
		            nextC = cb + (-1) * dc;
		            dc = (-1) * dc;
		        }
	       
	            rb = nextR;
	            cb = nextC;    
		       
                //System.out.println(rb+","+cb);
		        count++;
		    }
		    System.out.println(count);
		    
		    
		    
		}
		
	}
	
} 