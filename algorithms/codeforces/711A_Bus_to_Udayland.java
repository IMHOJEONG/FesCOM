import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_711 {
   
   public static int toInt(String msg){
       return Integer.parseInt(msg);
   }
   
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = toInt(br.readLine());
        
        boolean isok = false;
        StringBuilder stb = new StringBuilder();
        for(int i = 0; i < T ; i++){
            String check = br.readLine();
            char[] arr = check.toCharArray();
            if(isok){
                stb.append(check+"\n");
                continue;
            }
            for(int j = 0; j < 4 ; j+=3){
                if(arr[j] == 'O' && arr[j+1] == 'O')
                {
                    isok = true;
                    arr[j] = '+';
                    arr[j+1] = '+';
                }

                if(isok){
                    break;
                }
            }
            stb.append(String.valueOf(arr)+"\n");
            
        }
        
        if(isok){
            stb.setLength(stb.length()-1);
            System.out.println("YES");
            System.out.println(stb);
        }
        else {
            System.out.println("NO");
        }
        
        
        
   }
	
}  
 