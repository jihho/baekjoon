package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex04 {
	static boolean[] visited;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		visited = new boolean[N];
		arr = new int[M];
		
		for(int i = 0; i < N; i++) {
			visited[i] = false;
		}
	}
	
	public static void dfs(int at, int N, int M, int depth) {
		if(depth == M) {
			for(int val:arr) {
				sb.append(val + " ");
			}
			sb.append("\n");
		}
		
		for(int i = at; i < N; i++) {
			
		}
	}

}
