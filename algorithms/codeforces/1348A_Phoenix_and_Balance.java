import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1348 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = toInt(br.readLine());
		
		for(int i = 0 ; i < t ; i++){
		    
		    int n = toInt(br.readLine());
		    
    		int[] arr = new int[n];
    		
    		for(int j = 0 ; j < n ; j++){
    		    arr[j] = (int) Math.pow(2,j+1);
    		}
    		
    		int result = arr[n-1];
    		
    		int count = n/2 - 1;
    		
    		for(int j = 0 ; j < count ; j++){
    		       result+=arr[j]; 
    		}
    		
    		int resultSmall = 0;
    		
    		for(int j = count ; j < n-1 ; j++){
    		       resultSmall+=arr[j]; 
    		}
    		
		    System.out.println(result-resultSmall);
    		
		}
		
		
	}
	
} 