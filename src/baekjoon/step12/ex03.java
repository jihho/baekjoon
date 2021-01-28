package baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] cnt = new int[10001];
		
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			cnt[Integer.parseInt(br.readLine())] ++;
		}
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			while(cnt[i] > 0) {
				sb.append(i).append('\n');
				cnt[i]--;
			}
		}
		
		System.out.println(sb);
	}

}
