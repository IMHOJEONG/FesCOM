import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
// O(N*N) = O(1000*1000)
public class A_1553 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}

	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        // StringTokenizer stk = new StringTokenizer(br.readLine());
        
        for(int i = 0 ; i < t ; i++){
            
            int n = toInt(br.readLine());
            char[] arr = String.valueOf(n).toCharArray();
            
            int result = n/10;
            if(arr[arr.length-1] == '9'){
                result++;
            }
            
            
            System.out.println(result);
            
        }
        

	}
	
}  
