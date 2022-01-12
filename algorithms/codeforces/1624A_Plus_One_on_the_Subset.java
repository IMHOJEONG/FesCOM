import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1624 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}

	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int i = 0 ; i < t ; i++){
            
            int n = toInt(br.readLine());
            StringTokenizer stk = new StringTokenizer(br.readLine());
            
            int[] arr = new int[n];
            int result = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            
            for(int j = 0 ; j < n; j++){
            
                arr[j] = toInt(stk.nextToken());
                
            }   
            
            for(int j = 0 ; j < n; j++){
            
                if(min > arr[j]){
                    min = arr[j];
                }
                if(max < arr[j]){
                    max = arr[j];
                }
                
            }   
            
            System.out.println(max-min);
            
            
            
            
            
            

         
            
        }
        

	}
	
}  
