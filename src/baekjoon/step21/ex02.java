package baekjoon.step21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class ex02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		for(int i = 0; i < N; i++) {
			int input = Integer.parseInt(br.readLine());
			if(input == 0) {
				if(priorityQueue.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(priorityQueue.poll());
				}
			} else {
				priorityQueue.add(input);
			}
		}
		
	}

}
