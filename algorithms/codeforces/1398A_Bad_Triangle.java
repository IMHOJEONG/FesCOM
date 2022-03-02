import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1398 {
   
   public static int toInt(String msg){
       return Integer.parseInt(msg);
   }
   
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = toInt(br.readLine());
        
        for(int i = 0; i < T ; i++){
            
            int N = toInt(br.readLine());
            
            StringTokenizer stk = new StringTokenizer(br.readLine());
            
            int[] arr = new int[N];
            
            for(int j = 0 ; j < N ; j++){
                arr[j] = toInt(stk.nextToken());
            }
            
            if(arr[0] + arr[1] <= arr[N-1]){
                System.out.println(1 + " " + 2 + " " + N);
            }
            else{
                System.out.println(-1);
            }
            
        }
        
   }
	
}  
 