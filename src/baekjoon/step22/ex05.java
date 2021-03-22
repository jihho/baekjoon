package baekjoon.step22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Long[] loadLength = new Long[N-1];
		Long[] oilPrice = new Long[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N-1; i++) {
			loadLength[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			oilPrice[i] = Long.parseLong(st.nextToken());
		}
		
		int idx = 0;
		int nextIdx = -1;
		Long curPrice = oilPrice[idx];
		Long sum = 0L;
		while(true) {
			if(idx == N - 1) break;
			
			boolean flag = false;
			for(int i = idx+1; i < N - 1; i++) {
				if(curPrice > oilPrice[i]) {
					nextIdx = i;
					flag = true;
					break;
				}
			}

			if(!flag) nextIdx = N - 1;
			
			for(int i = idx; i < nextIdx; i++) {
				sum += oilPrice[idx] * loadLength[i];
			}
			
			idx = nextIdx;
			curPrice = oilPrice[idx];
		}
		
		System.out.println(sum);
	}

}
