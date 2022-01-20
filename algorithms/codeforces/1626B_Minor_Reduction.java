import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class B_1626 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int k = 0 ; k < t ; k++){
            
            char[] arr = br.readLine().toCharArray();
            
            int check = arr.length-1;

            int countfour = 0;
            int targetfive = -1;
            int countfive = 0;
            for(int i = 0 ; i < check; i++){
                
                int next = (arr[i]-'0') + (arr[i+1]-'0');
                
                if(next>=10){
                    targetfive = i;
                    countfive++;
                }
                else{
                    countfour++;
                }
                    
            }
            // System.out.println(countfour +","+countfive+","+targetfive+", "+check);
            if(countfour == check){
                int val = (arr[0]-'0') + (arr[1]-'0');
                StringBuilder stb = new StringBuilder();
                stb.append(val);
                for(int j = 2; j < arr.length;j++){
                    stb.append(arr[j]);
                }
                System.out.println(stb);
            }
            else if(countfive == check){
                StringBuilder stb = new StringBuilder();
                for(int j = 0; j < arr.length-2;j++){
                    stb.append(arr[j]);
                }
                stb.append((arr[arr.length-2]-'0') + (arr[arr.length-1]-'0'));
                System.out.println(stb);
            }
            else{
                StringBuilder stb = new StringBuilder();
                for(int j = 0; j < targetfive;j++){
                    stb.append(arr[j]);
                }
                stb.append((arr[targetfive]-'0') + (arr[targetfive+1]-'0'));
                for(int j = targetfive+2; j < arr.length;j++){
                    stb.append(arr[j]);
                }
                System.out.println(stb);
            }
            
        }
        
        

	}
	
}  
