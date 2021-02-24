package baekjoon.step23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex01 {
	static int N;
	static int M;
	static int V;
	static boolean[] visited;
	static int[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		visited = new boolean[1001];
		arr = new int[1001][1001];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = arr[y][x] = 1;
		}
		
		dfs(V);
		
		System.out.println();
		
		visited = new boolean[1001];
		bfs();
	}
	
	static void dfs(int start) {
		visited[start] = true;
		System.out.print(start + " ");
		
		for(int i = 1; i <= N; i++) {
			if(arr[start][i] == 1 && visited[i] == false) {
				visited[i] = true;
				dfs(i);
			}
		}
	}
	
	static void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(V);
		
		visited[V] = true;
		System.out.print(V + " ");
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			for(int i = 1; i <= N; i++) {
				if(arr[temp][i] == 1 && visited[i] == false) {
					queue.offer(i);
					visited[i] = true;
					System.out.print(i + " ");
				}
			}
		}
		
	}

}
