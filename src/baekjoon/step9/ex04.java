package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		for(int i = m; i <= n; i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	}
	
	public static boolean isPrime(int n) {
		if(n == 2)
			return true;
		
		if(n == 1 || n % 2 == 0) 
			return false;
		
		for(int i = 3; i <= Math.sqrt(n); i+=2) {
			if(n % i == 0)
				return false;
		}
		
		return true;
	}

}
