package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int totalSum = 0;
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(isPrime(num))
				totalSum += 1;
			
		}
		
		System.out.println(totalSum);
	}
	
	public static boolean isPrime(int n) {
		int i;
		int sqrt = (int) Math.sqrt(n);
		
		if(n == 2)
			return true;
		
		if(n % 2 == 0 || n == 1)
			return false;
		
		for(i = 3; i <= sqrt; i += 2) {
			if(n % i == 0) 
				return false;
		}
		
		return true;
	}

}
