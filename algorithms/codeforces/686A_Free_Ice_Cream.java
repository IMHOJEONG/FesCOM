import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_686 {
   
   public static int toInt(String msg){
       return Integer.parseInt(msg);
   }
    
   public static long toLong(String msg){
       return Long.parseLong(msg);
   }  
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = toInt(stk.nextToken());
        long x = toLong(stk.nextToken());
        int result =0;
        for(int i = 0 ; i < n; i++){
        
            StringTokenizer stk1 = new StringTokenizer(br.readLine());
            
            char oper = stk1.nextToken().charAt(0);
            int val = toInt(stk1.nextToken());
            
            if(oper == '+'){
                x+=val;
            }
            else {
                if(x < val){
                    result++;
                    continue;
                }
                else{
                    x-=val;
                }
            }
        }
        System.out.println(x+" "+result);

   }
	
}  
 