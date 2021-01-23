package baekjoon.step8;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if(x == 1) {
			System.out.println(1 + "/" + 1);
		} else {
			int num = 1;
			int den = 2;
			int idx = 2;
			boolean isEven = true;
			
			while(true) {
				if(idx == x) break;
				
				if(isEven && den != 1) {
					num += 1;
					den -= 1;
				}
				else if(isEven && den == 1) {
					num += 1;
					isEven = false;
				}
				else if(!isEven && num != 1) {
					num -= 1;
					den += 1;
				}
				else if(!isEven && num == 1) {
					den += 1;
					isEven = true;
				}
				
				idx++;
			}
			
			System.out.println(num + "/" + den);
		}
		
	}

}
