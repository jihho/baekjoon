package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex11724 {
	static int N;
	static int M;
	static int arr[][];
	static boolean visited[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			arr[num1][num2] = arr[num2][num1] = 1;
		}
		int sum = 0;
		
		for(int i = 1; i <= N; i++) {
			if(!visited[i]) {
				bfs(i);
				sum++;
			}
		}
		
		System.out.println(sum);
		
	}
	public static void bfs(int x) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(x);
		visited[x] = true;
		while(!queue.isEmpty()) {
			int cur = queue.poll();
			for(int i = 0; i <= N; i++) {
				if(!visited[i] && arr[cur][i] == 1) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
}
