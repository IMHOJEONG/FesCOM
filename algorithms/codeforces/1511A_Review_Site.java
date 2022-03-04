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
            StringTokenizer stk = new StringTokenizer(br.readLine());
        
            int[] arr = new int[n];
            int up1 = 0;
            int down1 = 0;
            int up2 = 0;
            int down2 = 0;
            for(int j = 0 ; j < n ; j++){
                arr[j] = toInt(stk.nextToken());
                if(arr[j] == 1){
                    up1++;
                }
                if(arr[j] == 2){
                    down2++;
                }
                if(arr[j] == 3){
                    if(down1 > up1){
                        down1++;
                    }
                    else {
                        up1++;
                    }
                }
            }
            
            System.out.println(up1);

        }
   }
}  
 