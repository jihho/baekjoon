package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex12 {
	static int N;
	static Integer[] arr;
	static Integer[][] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new Integer[N];
		dp = new Integer[N][2];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			max = Math.max(max, bitonicFront(i) + bitonicBack(i) - 1);
		}
		
		System.out.println(max);
	}
	public static int bitonicFront(int n) {
		dp[n][0] = 1;
		for(int i = n - 1; i >= 0; i--) {
			if(arr[i] < arr[n]) {
				dp[n][0] = Math.max(dp[n][0], bitonicFront(i) + 1);
			}
		}
		return dp[n][0];
	}
	
	public static int bitonicBack(int n) {
		dp[n][1] = 1;
		for(int i = n + 1; i < N; i++) {
			if(arr[i] < arr[n]) {
				dp[n][1] = Math.max(dp[n][1], bitonicBack(i) + 1);
			}
		}
		return dp[n][1];
	}
}
