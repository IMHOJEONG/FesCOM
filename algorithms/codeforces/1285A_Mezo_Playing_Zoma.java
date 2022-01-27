import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1519 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
            
        char[] arr = br.readLine().toCharArray();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0 ; i < arr.length ; i++){
            
            if(arr[i] == 'L'){
                count1++;
            }
            else{
                count2++;
            }
            
        }
        
        if(count1 == 0){
            
            System.out.println(Math.abs(count2)+1);
        
        }
        else if(count2 == 0){
            
            System.out.println(Math.abs(count1)+1);
        }
        else{
            
            System.out.println(Math.abs(count1)+Math.abs(count2)+1);
        }
        
    
        

	}
	
}  
 