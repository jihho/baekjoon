package baekjoon.step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long C = Integer.parseInt(st.nextToken());
		
		long result = fnc(A % C, B, C);
		System.out.println(result);
		
	}
	static long fnc(long a, long b, long c) {
		if(b == 1)
			return a;
		
		long temp = fnc(a, b / 2, c) % c;
		
		if(b % 2 == 0) {
			return (temp * temp) % c;
		} else {
			return (((temp * temp) % c) * a) % c;
		}
	}

}
