import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class B_1343 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
        StringTokenizer stk = new StringTokenizer(br.readLine());
    
        int t = toInt(stk.nextToken());
        
        for(int i = 0; i < t ; i++){
            
            int n = toInt(br.readLine());
            
            if((n/2)%2 != 0){
                System.out.println("NO");
                continue;
            }
            
            long[] arr = new long[n];
            long leftsum = 0;
            for(int j = 0 ; j < n/2 ; j++){
                arr[j] = (j+1)*2;
                leftsum+=arr[j];
            }
            
            int count = (n/2)/2;
            long rightsum = leftsum/count;
              
            
            for(int j = n/2, k = 0, l = n-1, y = 1; j < n && k < count ; j++, k++, l--, y+=2){
                arr[j] = y;
                arr[l] = rightsum-y;
            }
            
            System.out.println("YES");
            StringBuilder stb = new StringBuilder();
            for(int j = 0; j < n ; j++){
                stb.append(arr[j]+" ");    
            }
            stb.setLength(stb.length()-1);
            System.out.println(stb);
            
            
        }
        

	}
	
}  