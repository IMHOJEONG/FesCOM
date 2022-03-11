import java.util.*;
import java.io.*;

public class A_1511 {
    
    public static int toInt(String msg){
        return Integer.parseInt(msg);
    }
    
   public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int i = 0 ; i < t; i++){
            
            int n = toInt(br.readLine());
            
            
            int[] a1 = new int[n];
            int[] b1 = new int[n];
            StringTokenizer stk = new StringTokenizer(br.readLine());
            StringTokenizer stk1 = new StringTokenizer(br.readLine());
        
            for(int j = 0 ; j < n ; j++){
                a1[j] = toInt(stk.nextToken());
            }
            for(int j = 0 ; j < n ; j++){
                b1[j] = toInt(stk1.nextToken());
            }
            int maxA = -1;
            int maxB = -1;
            for(int j = 0 ; j < n ; j++){
            
                if(a1[j] > b1[j]) {
                    int val = b1[j];
                    b1[j] = a1[j];
                    a1[j] = val;
                }
                
                maxA = Math.max(a1[j], maxA);
                maxB = Math.max(b1[j], maxB);
                
            }
            
            System.out.println(maxA * maxB);

        }
   }
}  
 