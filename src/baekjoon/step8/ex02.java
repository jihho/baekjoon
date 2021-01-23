package baekjoon.step8;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n == 1) {
			System.out.println(n);
		} else {
			int sum = 1;
			int i = 1;
			
			while(true) {
				sum = sum + i*6;
				i++;
				if(sum >= n) {
					break;
				}
			}
			
			System.out.println(i);
		}
		
	}

}
