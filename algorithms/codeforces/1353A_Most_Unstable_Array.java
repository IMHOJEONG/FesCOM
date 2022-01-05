import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1353 {
 
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
		   
		    if(n == 1){
		        System.out.println(0);
		        continue;
		    }
		    if(n == 2){
		        System.out.println(m);
		        continue;
		    }
		    
		    System.out.println(m*2);
		    
		    
		}
		
	}
	
} 