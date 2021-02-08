package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex03 {

	static Integer[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		arr = new Integer[10000001];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		
		System.out.println(tile(N));
		
	}
	
	public static int tile(int N) {
		if(arr[N] == null) {
			arr[N] = (tile(N-1) + tile(N-2)) % 15746;
		}
		
		return arr[N];
	}

}
