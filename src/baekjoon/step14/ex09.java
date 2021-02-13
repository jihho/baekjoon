package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex09 {
	static Long[][] dp;
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		dp = new Long[N + 1][10];
		
		for(int i = 0; i < 10; i++) {
			dp[1][i] = 1L;
		}
		
		long result = 0;
		
		for(int i = 1; i <= 9; i++) {
			result += recur(N, i);
		}
		
		System.out.println(result % 1000000000);
		
	}

	public static long recur(int N, int val) {
		
		if(N == 1) {
			return dp[N][val];
		}
		
		if(dp[N][val] == null) {
			if(val == 0) {
				dp[N][val] = recur(N-1, 1);
			}
			else if(val == 9) {
				dp[N][val] = recur(N-1, 8);
			}
			else {
				dp[N][val] = recur(N-1, val-1) + recur(N-1, val+1);
			}
		}
		
		return dp[N][val] % 1000000000;
	}
}
