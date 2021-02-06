package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex02 {
	static Integer arr[][][] = new Integer[21][21][21];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arr[0][0][0] = 1;
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == -1 && b == -1 && c == -1) {
				break;
			}
			
			int result = w(a,b,c);
			System.out.println("w(" + a + ", " + b + ", " + c + ") = " + result);
		}
	}
	
	public static int w(int a, int b, int c) {
		if(a <= 0 || b <= 0 || c <= 0) {
			return arr[0][0][0];
		}
		
		if(a > 20 || b > 20 || c > 20) {
			return w(20, 20, 20);
		}
		
		if(arr[a][b][c] == null) {
			if(a < b && b < c) {
				arr[a][b][c] = w(a,b,c-1) + w(a, b-1, c-1) - w(a, b-1, c);
			} else {
				arr[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1,b-1,c-1);
			}
		} 
		
		return arr[a][b][c];
	}

}
