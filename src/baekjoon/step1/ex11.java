package baekjoon.step1;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		int num1 = second / 100;
		int num2 = (second - (num1 * 100)) / 10;
		int num3 = second - (num1 * 100) - (num2 * 10);
		
		System.out.println(first * num3);
		System.out.println(first * num2);
		System.out.println(first * num1);
		System.out.println(first * second);
	}

}
