import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class B_1454 {
   
   public static int toInt(String msg){
       return Integer.parseInt(msg);
   }
   
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = toInt(br.readLine());
        
        for(int i = 0 ; i < T; i++){
        
            int N = toInt(br.readLine());
            
            StringTokenizer stk = new StringTokenizer(br.readLine());
            
            int[] arr = new int[N+1];
            int[] arr1 = new int[N];
            for(int j = 0; j < N ; j++){
                
                int target = toInt(stk.nextToken());
                
                arr[target]++;
                arr1[j] = target;
                
            }    
            
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int j = 0; j < N ; j++){
                
                int check = arr1[j];
                    
                if(arr[check] == 1){
                    if(min > check){
                        min = check;
                        minIndex = (j+1);
                    }
                    
                }   
                
            }    
            
            System.out.println(minIndex);
            
            
        }
        
        
        
   }
	
}  
 