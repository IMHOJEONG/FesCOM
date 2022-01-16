import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1397 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
    static int fac(int n){
        if(n==1) return 1;
        
        return n*fac(n-1);
    }
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder stb = new StringBuilder();
        int t = toInt(br.readLine());
        
        for(int i = 0 ; i < t ; i++){
            
            int n = toInt(br.readLine());
            int[] arr = new int[26];
            
            for(int j = 0 ; j < n ;j++){
                
                char[] test = br.readLine().toCharArray();
                
                for(int k = 0; k < test.length ; k++){
                    arr[(test[k]-97)]++; 
                }
                
            }   
            if(n==1){
                
                System.out.println("YES");
                continue;
            }
            boolean isok = true;
            
            for(int j = 0 ; j < 26 ;j++){
                if(arr[j] % 2!=0){
                    isok = false;
                    break;
                }
            }
            if(isok){
                System.out.println("YES");
            }   
            else{
                System.out.println("NO");
            }
            
        }
        
        

	}
	
}  
