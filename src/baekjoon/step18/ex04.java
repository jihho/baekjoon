package baekjoon.step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex04 {
	static class Printer {
		int prior;
		int location;
		
		Printer(int prior, int location) {
			this.prior = prior;
			this.location = location;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			Queue<Printer> queue = new LinkedList<>();
			
			int answer = 0;
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				int num = Integer.parseInt(st.nextToken());
				queue.add(new Printer(num, j));
			}
			
			while(!queue.isEmpty()) {
				Printer firstPr = queue.poll();
				boolean flag = false;
				for(Printer pr : queue) {
					if(firstPr.prior < pr.prior) {
						flag = true;
						break;
					}
				}
				
				if(flag) {
					queue.add(firstPr);
				} else {
					if(firstPr.location == M) {
						answer = N - queue.size();
						System.out.println(answer);
					}
				}
				
			}
		}
	}

}
