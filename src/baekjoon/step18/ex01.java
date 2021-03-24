package baekjoon.step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ex01 {
	static LinkedList<Integer> queue = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			
			switch(order) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				sb.append(pop()).append("\n");
				break;
			case "size":
				sb.append(size()).append("\n");
				break;
			case "empty":
				sb.append(empty()).append("\n");
				break;
			case "front":
				sb.append(front()).append("\n");
				break;
			case "back":
				sb.append(back()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
	
	static void push(int value) {
		queue.add(value);
		return;
	}
	static int pop() {
		if(queue.size() == 0) {
			return -1;
		}
		else {
			return queue.poll();
		}
	}
	static int size() {
		return queue.size();
	}
	static int empty() {
		if(queue.size() == 0) {
			return 1;
		} 
		else {
			return 0;
		}
	}
	static int front() {
		if(queue.size() == 0) {
			return -1;
		}
		else {
			return queue.peek();
		}
	}
	static int back() {
		if(queue.size() == 0) {
			return -1;
		}
		else {
			return queue.peekLast();
		}
	}
}
