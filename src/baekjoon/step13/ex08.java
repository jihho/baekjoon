package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex08 {

	static int N;
	static int[][] arr;
	static boolean[] visited;
	static int Min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N][N];
		visited = new boolean[N];
		
		for(int i = 0; i < N; i++) {
			visited[i] = false;
		}
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		startLink(0, 0);
		System.out.println(Min);
	}
	
	public static void startLink(int at, int depth) {
		if(depth == N / 2) {
			diff();
			return;
		}
		
		for(int i = at; i < N; i++) {
			if(visited[i] == false) {
				visited[i] = true;
				startLink(i+1, depth+1);
				visited[i] = false;
			}
		}
	}
	
	public static void diff() {
		int team_start = 0;
		int team_link = 0;
		
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(visited[i] == true && visited[j] == true) {
					team_start += arr[i][j];
					team_start += arr[j][i];
				}
				else if(visited[i] == false && visited[j] == false) {
					team_link += arr[i][j];
					team_link += arr[j][i];
				}
			}
		}
		
		int val = Math.abs(team_start - team_link);
		
		if(val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		
		Min = Math.min(val, Min);
	}

}
