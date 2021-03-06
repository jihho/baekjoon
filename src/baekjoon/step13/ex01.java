package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex01 {

	static boolean[] visited;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		visited = new boolean[N];
		arr = new int[M];
		
		for(int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}
		
		dfs(N, M, 0);
		
	}
	
	public static void dfs(int N, int M, int depth) {
		if(depth == M) {
			for(int val: arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(visited[i] == false) {
				visited[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth+1);
				
				visited[i] = false;
			}
		}
	}

}
