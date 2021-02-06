package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex01 {
	static Integer[][] dp	= new Integer[41][2];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			Integer[] arr = fibonacci(num);
			System.out.println(arr[0] + " " + arr[1]);
		}
	}
	
	public static Integer[] fibonacci(int N) {
		if(dp[N][0] == null || dp[N][1] == null) {
			dp[N][0] = fibonacci(N-1)[0] + fibonacci(N-2)[0];
			dp[N][1] = fibonacci(N-1)[1] + fibonacci(N-2)[1];
		}
		
		return dp[N];
	}
	

}
