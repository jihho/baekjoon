package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex08 {
	static Integer[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		dp = new Integer[N+1];
		dp[0] = dp[1] = 0;
		
		System.out.println(calcFunc(N));
		
	}
	public static int calcFunc(int n) {
		if(dp[n] == null) {
			int num1 = Integer.MAX_VALUE;
			int num2 = Integer.MAX_VALUE;
			int num3 = Integer.MAX_VALUE;
			if(n % 3 == 0) {
				num1 = 1 + calcFunc(n / 3);
			}
			if(n % 2 == 0) {
				num2 = 1 + calcFunc(n / 2);
			}
			num3 = 1 + calcFunc(n - 1);
			
			dp[n] = Math.min(num1, Math.min(num2, num3));
		}
		
		return dp[n];
	}

}
