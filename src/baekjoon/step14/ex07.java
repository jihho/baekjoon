package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex07 {
	static int[] arr;
	static long[][] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		dp = new long[N][2];
		
		arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 2; j++) {
				dp[i][j] = -1;
			}
		}
		
		dp[0][0] = arr[0];
		
		if(N > 1) {
			dp[1][0] = arr[0] + arr[1];
		}
		
		System.out.println(Math.max(stair(N-1, 0), stair(N-1, 1)));
		
	}

	public static long stair(int i, int j) {
		if(i != 0 && i != 1 && i != 2) {			
			if(dp[i][j] == -1) {
				if(j == 0) {
					dp[i][j] = Math.max(stair(i-2, 0) + arr[i],  stair(i-1, 1) + arr[i]); 
				} else {
					dp[i][j] = stair(i-2, 0) + arr[i];
				}
			}
		}
		else if(i == 2) {
			dp[i][0] = Math.max(arr[1]+arr[2], arr[0]+arr[2]);
			dp[i][1] = dp[0][0] + arr[2];
		}
			
		
		return dp[i][j];
	}

}
