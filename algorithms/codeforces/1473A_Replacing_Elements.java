import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1473 {
   
   
   public static int toInt(String msg){
       return Integer.parseInt(msg);
   }
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int i = 0; i < t ; i++){
            
            StringTokenizer stk = new StringTokenizer(br.readLine());
            
            int n = toInt(stk.nextToken());
            
            int d = toInt(stk.nextToken());
            
            stk = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int j = 0; j < n ; j++){
                arr[j] = toInt(stk.nextToken());
            }
            
            
            Arrays.sort(arr);
            
            if(arr[arr.length-1] <= d){
                System.out.println("YES");
                continue;
            }
            
            int min = arr[0] + arr[1];
            
            if(min > d){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
            
        }
        
        
   }
	
}  
 