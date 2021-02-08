package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex04 {
	static long[] arr = new long[101];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		arr[4] = 2;
		arr[5] = 2;
		for(int i = 6; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			System.out.println(pado(N));
		}
	}
	public static long pado(int N) {
		if(arr[N] == -1) {
			arr[N] = pado(N-5) + pado(N-1);
		}
		
		return arr[N];
	}
}
