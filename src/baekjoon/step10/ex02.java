package baekjoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(n, 0));
	}
	
	public static int fibonacci(int n, int val) {
		
		if(n == 0)
			return 0;
		
		if(n == 1)
			return 1;
		
		val = val + fibonacci(n-1, val) + fibonacci(n-2, val);
		
		return val;
	}

}
