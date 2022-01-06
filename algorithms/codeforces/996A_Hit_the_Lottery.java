import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_996 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = toInt(br.readLine());
		int[] arr = {100,20,10,5,1};
		int result = 0; 
		
		for(int i = 0; i < arr.length ; i++){
		    
		    result += (n) / arr[i];
		    n = (n) % arr[i];
		   
		}
		System.out.println(result);
		
	}
	
} 