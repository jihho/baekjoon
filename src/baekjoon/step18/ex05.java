package baekjoon.step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class ex05 {

	static Deque<Integer> queue = new ArrayDeque<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			switch(order) {
			case "push_front": push_front(Integer.parseInt(st.nextToken())); break;
			case "push_back": push_back(Integer.parseInt(st.nextToken())); break;
			case "pop_front": System.out.println(pop_front()); break;
			case "pop_back": System.out.println(pop_back()); break;
			case "size": System.out.println(size()); break;
			case "empty": System.out.println(empty()); break;
			case "front": System.out.println(front()); break;
			case "back": System.out.println(back()); break;
			}
		}
	}
	static void push_front(int num) {
		queue.addFirst(num);
	}
	static void push_back(int num) {
		queue.addLast(num);
	}
	static int pop_front() {
		if(queue.isEmpty()) {
			return -1;
		}
		return queue.pollFirst();
	}
	static int pop_back() {
		if(queue.isEmpty()) {
			return -1;
		}
		return queue.pollLast();
	}
	static int size() {
		return queue.size();
	}
	static int empty() {
		if(queue.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}
	static int front() {
		if(queue.isEmpty()) {
			return -1;
		}
		return queue.getFirst();
	}
	static int back() {
		if(queue.isEmpty()) {
			return -1;
		}
		return queue.getLast();
	}

}
