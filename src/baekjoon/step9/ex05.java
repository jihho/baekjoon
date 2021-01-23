package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) 
				break;
			
			int count = 0;
			
			for(int i = n + 1; i <= 2 * n; i++) {
				if(isPrime(i)) 
					count += 1;
			}
			
			System.out.println(count);
			
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
