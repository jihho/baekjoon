package baekjoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(n, 1));
	}
	
	public static int factorial(int n, int val) {
		
		if(n == 0) {
			return val;
		}
		
		return factorial(n-1, val*n);
	}

}
