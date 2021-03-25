package baekjoon.step21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class ex01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				if(priorityQueue.isEmpty()) {
					sb.append(0).append('\n');
				} else {
					sb.append(priorityQueue.poll()).append('\n');
				}
			} else {
				priorityQueue.add(num);
			}
		}
		
		System.out.println(sb);
	}

}
