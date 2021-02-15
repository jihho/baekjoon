package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex11 {

	static int N;
	static int[] arr;
	static Integer[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		dp = new Integer[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			part(i);
		}
		
		int max = dp[0];
		for(int i = 1; i < N; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
		
		
	}
	public static int part(int n) {
		if(dp[n] == null) {
			dp[n] = 1;
			
			for(int i = n - 1; i >= 0; i--) {
				if(arr[n] > arr[i]) {
					dp[n] = Math.max(dp[n], part(i) + 1);
				}
			}
		}
		return dp[n];
	}

}
