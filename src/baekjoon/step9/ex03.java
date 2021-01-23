package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sqrtNum = (int) Math.sqrt(n);
		
		for(int i = 2; i <= sqrtNum; i++) {
			while(n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
		}
		
		if(n != 1) {
			System.out.println(n);
		}
		
	}

}
