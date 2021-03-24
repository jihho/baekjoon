package baekjoon.step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class ex01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			if(order.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				stack.add(num);
			}
			else if(stack.size() == 0 && !order.equals("size")) {
				if(order.equals("empty") ) {
					System.out.println(1);
				}
				else {
					System.out.println(-1);
				}
			}
			else if(order.equals("top")) {
				System.out.println(stack.peek());
			}
			else if(order.equals("size")) {
				System.out.println(stack.size());
			}
			else if(order.equals("pop")) {
				System.out.println(stack.pop());
			}
			else if(order.equals("empty")) {
				System.out.println(0);
			}
		}
	}

}
