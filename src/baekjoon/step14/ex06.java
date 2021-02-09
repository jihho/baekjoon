package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex06 {
	static long[][] num;
	static long[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		num = new long[n][n];
		arr = new long[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = -1;
			}
		}
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j <= i; j++) {
				num[i][j] = Long.parseLong(st.nextToken());
			}
		}
		arr[0][0] = num[0][0];
		long max = -1;
		for(int i = 0; i < n; i++) {
			if(max < triangle(n-1, i)) {
				max = triangle(n-1, i);
			}
		}
		
		System.out.println(max);
	}
	
	public static long triangle(int i, int j) {
		if(arr[i][j] == -1) {
			 if(j == 0) {
				 arr[i][j] = triangle(i-1, j) + num[i][j];
			 }
			 else if(j == i) {
				 arr[i][j] = triangle(i-1, j-1) + num[i][j];
			 }
			 else {
				 arr[i][j] = Math.max(triangle(i-1, j-1) + num[i][j], triangle(i-1, j) + num[i][j]);
			 }
		}
		
		return arr[i][j];
	}

}
