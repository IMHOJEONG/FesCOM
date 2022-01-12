import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1304 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}

	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int i = 0 ; i < t ; i++){
            
            StringTokenizer stk = new StringTokenizer(br.readLine());
            
            int[] arr = new int[4];
            int result = 0;
            for(int j = 0 ; j < 4; j++){
            
                arr[j] = toInt(stk.nextToken());
                
            }    
            
            
            // arr[0] + (result * arr[2]) == arr[1] - (result * arr[3]);
            
            result = (arr[1] - arr[0]) % (arr[2] + arr[3]);
            int result2 = (arr[1] - arr[0]) / (arr[2] + arr[3]);
            
            if(result != 0){
                System.out.println(-1);
            }
            else{
                System.out.println(result2);
            }
         
            
        }
        

	}
	
}  
