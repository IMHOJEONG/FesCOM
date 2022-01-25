import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1622 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int k = 0 ; k < t ; k++){
            
            StringTokenizer stk = new StringTokenizer(br.readLine());
        
            HashSet<Integer> sets = new HashSet<>();
            int[] arr = new int[3];
            for(int j = 0 ; j < 3 ;j++){
                int val = toInt(stk.nextToken());
                arr[j] = val;
                sets.add(arr[j]);
            }
            Arrays.sort(arr);
            
            if(sets.size()==1){
                if(arr[0] % 2 == 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else if(sets.size()==2){
                if(arr[0] == arr[1]){
                   
                    if(arr[2] % 2 == 0){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
                else if(arr[1] == arr[2]){
                    if(arr[0] % 2 == 0){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
            }
            else{
                if(arr[0]+arr[1] == arr[2]){
                    System.out.println("YES");
                }   
                else{
                    System.out.println("NO");
                }
            }
            
            
            
            
            
           
        }
        
        

	}
	
}  
 