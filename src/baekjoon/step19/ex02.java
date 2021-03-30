package baekjoon.step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex02 {

	static int[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < N; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		
		divide(N, 0, 0);
	}
	static void divide(int n, int x, int y) {
		int value = arr[x][y];
		boolean flag = true;
		
		out: for(int i = x; i < x + n; i++) {
			for(int j = y; j < y + n; j++) {
				if(arr[i][j] != value) {
					flag = false;
					break out;
				}
			}
		}
		
		if(flag) {
			System.out.print(value);
		} 
		else {
			int divideN = n/2;
			System.out.print("(");
			divide(divideN, x, y);
			divide(divideN, x, y+divideN);
			divide(divideN, x+divideN, y);
			divide(divideN, x+divideN, y+divideN);
			System.out.print(")");
		}
	}
}
