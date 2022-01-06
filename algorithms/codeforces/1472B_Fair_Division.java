import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class B_1472 {
 
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
    		
    		StringTokenizer stk = new StringTokenizer(br.readLine());
    		int result =0;
    		int[] person = new int[2];
    		for(int j = 0 ; j < n ;j++){
    		    arr[j] = toInt(stk.nextToken());
    		}
    		Arrays.sort(arr);
    		int index = 0;
    		for(int j = n-1; j >= 0 ;j--){
    		    if(person[0] > person[1]){
    		        person[1] += arr[j];
    		    }
    		    else{
        		    person[0] += arr[j];
    		    }
    		}
    		
		    System.out.println(person[0]==person[1]?"YES":"NO");
    		
		}
		
		
	}
	
}  