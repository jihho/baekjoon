package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ex08 {

	static int N;
	static int[][] arr;
	static boolean[] visited;
	static int[] memArr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N][N];
		visited = new boolean[N];
		memArr = new int[N];
		
		for(int i = 0; i < N; i++) {
			visited[i] = false;
		}
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		startLink(0);
	}
	
	public static void startLink(int depth) {
		if(depth == N) {
			for(int i = 0; i < N/2; i++) {
				System.out.print(memArr[i] + " ");
			}
			System.out.println();
			for(int i = N/2; i < N; i++) {
				System.out.print(memArr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(visited[i] == false) {
				visited[i] = true;
				
				memArr[depth] = i;
				
				startLink(depth+1);
				visited[i] = false;
			}
		}
	}

}
