package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ex2217 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] list = new int[N];
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			list[i] = num;
		}
		
		Arrays.sort(list);
		int max = list[0];
		for(int i = 0; i < list.length; i++) {
			max = Math.max(max, list[i]*(N-i));
		}
		System.out.println(max);
	}

}
