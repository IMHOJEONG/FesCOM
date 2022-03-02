import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1382 {
   
   public static int toInt(String msg){
       return Integer.parseInt(msg);
   }
   
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = toInt(br.readLine());
        
        for(int i = 0 ; i < T; i++){
            boolean isok = false;
            int check = -1;
            StringTokenizer stk = new StringTokenizer(br.readLine());
            HashSet<Integer> sets = new HashSet<>();
            int l1 = toInt(stk.nextToken());
            int l2 = toInt(stk.nextToken());
            
            StringTokenizer stk1 = new StringTokenizer(br.readLine());
            for(int j = 0; j < l1 ; j++){
                sets.add(toInt(stk1.nextToken()));
            }
            StringTokenizer stk2 = new StringTokenizer(br.readLine());
            for(int j = 0; j < l2 ; j++){
                int target = toInt(stk2.nextToken());
                if(sets.contains(target)){
                    isok = true;
                    check = target;
                    break;
                }
            }
            
            if(isok){
                System.out.println("YES");
                System.out.println(1+" "+check);
            }
            else {
                System.out.println("NO");
            }
            
            
            
        }
        
        
        
   }
	
}  
 