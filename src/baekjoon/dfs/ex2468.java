package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2468 {

	static int max; // 최대값
	static int count; // 안전지역 개수
	static int N;
	static int map[][];
	static int transMap[][];
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static boolean visited[][];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		max = 1;
		
		for(int i = 1; i < 101; i++) {
			transMap = new int[N][N];
			
			count = 0;
			visited = new boolean[N][N];
			
			for(int a = 0; a < N; a++) {
				for(int b = 0; b < N; b++) {
					if(map[a][b] <= i) {
						transMap[a][b] = 0;
					} 
					else {
						transMap[a][b] = 1;
					}
				}
			}
			
			for(int a = 0; a < N; a++) {
				for(int b = 0; b < N; b++) {
					if(transMap[a][b] == 1 && !visited[a][b]) {
						dfs(a, b);
						count++;
					}
				}
			}
			max = Math.max(max, count);
		}
		System.out.println(max);
		
	}
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if(transMap[nx][ny] == 1 && !visited[nx][ny]) {
					dfs(nx, ny);
				}
			}
		}
	}
}
