import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_702 {
   
   public static int toInt(String msg){
       return Integer.parseInt(msg);
   }
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = toInt(br.readLine());
        
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = toInt(stk.nextToken());
        }
        int max = -1;
        int result = 1;
        for(int i = 0; i < n-1 ; i++){
            if(arr[i] < arr[i+1]){
                result++;
            }
            else {
                max = Math.max(result, max);
                result = 1;
            }
        }
        max = Math.max(result, max);
        System.out.println(max);
    
   }
	
}  
 