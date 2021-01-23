package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int minNum = -1;
		int sum = 0;
		boolean isMin = true;
		
		for(int i = m; i < n + 1; i++) {
			if(isPrime(i)) {
				if(isMin) {
					minNum = i;
					isMin = false;
				}
				sum += i;
			}
		}
		
		if(minNum == -1) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(minNum);
		}
		
		
		
	}
	
	public static boolean isPrime(int n) {
		
		if(n == 2) 
			return true;
		
		if(n == 1 || n % 2 == 0) 
			return false;
		
		int sqrt = (int) Math.sqrt(n);
		
		for(int i = 3; i <= sqrt; i += 2) {
			if(n % i == 0)
				return false;
		}
		
		return true;
	}

}
