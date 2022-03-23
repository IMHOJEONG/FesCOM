import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_6800 {
	public static int toInt(String msg) {
		return Integer.parseInt(msg);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = toInt(br.readLine());
		String[][] test = new String[N][2];
		for(int i = 0; i < N ; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			String val = stk.nextToken();
			String str = stk.nextToken();
			test[i][0] = val;
			test[i][1] = str;
		}
		
		StringBuilder target = new StringBuilder(br.readLine());
		StringBuilder stb = new StringBuilder();
		while(!target.toString().equals("")) {
			
			for(int i = 0; i < N ; i++) {
				String str = test[i][1];
				
				if(target.substring(0, str.length()).equals(str)) {
					stb.append(test[i][0]);
					target.delete(0, str.length());			
					break;
				}
			}
			
		}
		
		System.out.println(stb);
		
	}
}	
