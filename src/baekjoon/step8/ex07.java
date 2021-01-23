package baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(findNum(n));
		
		
		
	}
	public static int findNum(int n) {
		int num = 0;
		
		if(n == 4 || n == 7) {
			num = -1;
		}
		
		else if(n % 5 == 0) {
			num = n / 5;
		}
		else if(n % 5 == 1 || n % 5 == 3) {
			num = (n / 5) + 1;
		}
		else if(n % 5 == 2 || n % 5 == 4) {
			num = (n / 5) + 2;
		}
		
		return num;
	}

}
