import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class B_1385 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < t ; i++){
		    
		    int n = toInt(br.readLine());
		    StringTokenizer stk = new StringTokenizer(br.readLine());
		    HashMap<Integer, Integer> map = new HashMap<>();
		    StringBuilder stb = new StringBuilder();
		    for(int j = 0; j < 2*n ; j++){
		        
		        int target = Integer.parseInt(stk.nextToken());
		        
		        if(map.containsKey(target)){
		            
		        }
		        else{
		            stb.append(target+" ");
		            map.put(target, 1);
		        }
		    }
		    
		    stb.setLength(stb.length()-1);
		    
		    System.out.println(stb);
		    
		    
		}
		
	}
	
} 