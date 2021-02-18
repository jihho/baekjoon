package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex12 {
	static int N;
	static Integer[] arr;
	static Integer[] r_dp;
	static Integer[] l_dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new Integer[N];
		r_dp = new Integer[N];
		l_dp = new Integer[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			bitonicFront(i);
			bitonicBack(i);
		}
		
		int max = -1;
		
		for(int i = 0; i < N; i++) {
			max = Math.max(r_dp[i]+l_dp[i], max);
		}
		
		System.out.println(max - 1);
	}
	public static int bitonicFront(int n) {
		
		if(r_dp[n] == null) {
			r_dp[n] = 1;
			
			for(int i = n-1; i >= 0; i--) {
				if(arr[i] < arr[n]) {
					r_dp[n] = Math.max(r_dp[n], bitonicFront(i) + 1);
				}
			}
		}
		return r_dp[n];
	}
	
	public static int bitonicBack(int n) {

		if(l_dp[n] == null) {
			l_dp[n] = 1;
			
			for(int i = n+1; i < l_dp.length; i++) {
				if(arr[i] < arr[n]) {
					l_dp[n] = Math.max(l_dp[n], bitonicBack(i) + 1);
				}
			}
		}
		return l_dp[n];
	}
}
