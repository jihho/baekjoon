package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex5585 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = Integer.parseInt(br.readLine());
		boolean even = false;
		int back = 1000 - money;
		int sum = 0;
		int n = 500;
		while(true) {
			if(back == 0) {
				break;
			}
			sum += back / n;
			back = back - n * (back / n);
			if(!even) {
				n = n / 5;
				even = true;
			}else {
				n = n / 2;
				even = false;
			}
		}
		
		System.out.println(sum);
	}

}
