package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			int val = -1;
			int num1 = 0;
			int num2 = 0;
			
			for(int j = 2; j < n; j++) {
				if(isPrime(j) && isPrime(n-j) && (j <= (n - j))) {
					if(val == -1 || val >= (n - 2 * j)) {
						val = n - 2 * j;
						num1 = j;
						num2 = n - j;
					}
				}
			}
			
			System.out.println(num1 + " " + num2);
		}
	}
	
	public static boolean isPrime(int n) {
		if(n == 2)
			return true;
		
		if(n % 2 == 0 || n == 1)
			return false;
		
		for(int i = 3; i <= Math.sqrt(n); i += 2) {
			if(n % i == 0)
				return false;
		}
		
		return true;
	}

}
