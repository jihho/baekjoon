package baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex09 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			long start = Long.parseLong(st.nextToken());
			long end = Long.parseLong(st.nextToken());
			
			long distance = end - start;
			long seq = 0;
			long n = 0;
			
			while(true) {
				if(distance > n) {
					seq += 2;
					n += seq;
				} 
				else {
					break;
				}
			}
			
			if(distance > n - (seq/2)) {
				System.out.println(seq);
			} else {
				System.out.println(seq - 1);
			}
		}
	}

}
