import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_935 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int result = 1; 
		
		for(int i = 2 ; i <= Math.sqrt(t) ; i++){
		    
		    if(t % i == 0){
		        if(i == Math.sqrt(t)){
		            result++;
		           
		        }
		        else{
		            result+=2;
		        }
		    }
		    
		}
		System.out.println(result);
		
	}
	
} 