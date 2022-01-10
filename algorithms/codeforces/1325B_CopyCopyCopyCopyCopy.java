import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class B_1325 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}

	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int i = 0 ; i < t ; i++){
            
            int n = toInt(br.readLine());
            
            StringTokenizer stk = new StringTokenizer(br.readLine());
            
            HashSet<Integer> sets = new HashSet<>();
            for(int j = 0 ; j < n ; j++){
                sets.add(toInt(stk.nextToken()));
            }
            
            System.out.println(sets.size());
            
            
     
            
        }
        

	}
	
}  
