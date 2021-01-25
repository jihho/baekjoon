package baekjoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex04 {

	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		sb.append((int) Math.pow(2, N) - 1 + " \n");

		hanoi(N, 1, 2, 3);
		
		System.out.println(sb);
	}
	
	public static void hanoi(int n, int start, int mid, int to) {
		
		if(n == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		
		hanoi(n-1, start, to, mid);
		sb.append(start + " " + to + "\n");
		hanoi(n-1, mid, start, to);
	}

}
