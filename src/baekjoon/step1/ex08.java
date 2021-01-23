package baekjoon.step1;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		double answer = first / (double) second;
		
		System.out.println(answer);
	}

}
