import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_141 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] line = br.readLine().toCharArray();
		char[] line1 = br.readLine().toCharArray();
		char[] line2 = br.readLine().toCharArray();
		
		HashMap<Character, Integer> map 
		    = new HashMap<>();
		    
	    for(int i = 0 ; i < line.length ; i++){
	        if(map.containsKey(line[i])){
	            map.put(line[i], map.get(line[i])+1);
	        }
	        else{
	            map.put(line[i], 1);
	        }
	    }
	    for(int i = 0 ; i < line1.length ; i++){
	        if(map.containsKey(line1[i])){
	            map.put(line1[i], map.get(line1[i])+1);
	        }
	        else{
	            map.put(line1[i], 1);
	        }
	    }
	    
	    boolean isok = true;
	    for(int i = 0 ; i < line2.length ; i++){
	        if(map.containsKey(line2[i])){
	            
                map.put(line2[i], map.get(line2[i])-1);
                if(map.get(line2[i]) == 0){
                    map.remove(line2[i]);
                }
	            
	        }
	        else{
	            isok = false;        
                break;
	        }
	        
	    }
	    if(!isok){
		    System.out.println("NO");
	        return;   
	    }
        //System.out.println(map);
		System.out.println(map.isEmpty() ? "YES" : "NO");
		
		
	}
	
} 