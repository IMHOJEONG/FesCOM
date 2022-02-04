import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

// 1. 7분 27초
public class BOJ_2798 {
   
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        int[] test = new int[N];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            test[i] = Integer.parseInt(stk.nextToken());
        }
        int result = 0;
        
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                for(int k = 0 ; k < N ; k++){
                    
                    if(i!=j && j!=k && i != k){
                        if(test[i] + test[j] + test[k] <= M){
                            result = Math.max(test[i] + test[j] + test[k],result);
                        }
                    }
        
                }   
            }   
        }
        
        System.out.println(result);
        
        
        
   }
	
}  
 