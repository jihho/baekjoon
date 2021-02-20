package baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[8000];
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num + 4000]++;
			sum += num;
			
			if(max < num) {
				max = num;
			}
			
			if(min > num) {
				min = num;
			}
		}
		
		sb.append(sum/N).append("\n");
		sb.append(max-min).append("\n");
		
		System.out.println(sb);
		
	}

}
