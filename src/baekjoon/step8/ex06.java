package baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[][] arr = new int[15][15];
		
		for(int i = 0; i < 15; i++) {
			arr[i][1] = 1;
			arr[0][i] = i;
		}
		
		for(int i = 1; i < 15; i++) {
			for(int j = 2; j < 15; j++) {
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		String str = "";
		
		for(int i = 0; i <t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			str = str + arr[k][n] + "\n";
			
		}
		
		System.out.println(str);
	}
	

}
