package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex14 {

	static Integer[][] dp;
	static String first;
	static String second;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		first = br.readLine();
		second = br.readLine();
		
		dp = new Integer[first.length()][second.length()];
		
		int result = LCS(first.length() - 1, second.length() - 1);
		
		System.out.println(result);
	}

	public static int LCS(int firLen, int secLen) {
		if(firLen < 0 || secLen < 0) {
			return 0;
		}
		if(dp[firLen][secLen] == null) {
			if(first.charAt(firLen) == second.charAt(secLen)) {
				dp[firLen][secLen] = LCS(firLen - 1, secLen - 1) + 1;
			} 
			else {
				dp[firLen][secLen] = Math.max(LCS(firLen - 1, secLen), LCS(firLen, secLen - 1)); 
			}
		}
		
		return dp[firLen][secLen];
	}
}
