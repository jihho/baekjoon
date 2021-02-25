package baekjoon.step23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex04 {

	static int M;
	static int N;
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static int[][] map;
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(T-- > 0) {
			int count = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			map = new int[M][N];
			visited = new boolean[M][N];
			
			for(int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				map[x][y] = 1;
			}
			
			for(int i = 0; i < M; i++) {
				for(int j = 0; j < N; j++) {
					if(map[i][j] == 1 && visited[i][j] != true) {
						count++;
						bfs(i, j);
					}
				}
			}
			
			sb.append(count + "\n");
		}
		
		System.out.println(sb);
	}
	static void bfs(int startX, int startY) {
		Queue<int[]> queue = new LinkedList<>();
		visited[startX][startY] = true;
		queue.offer(new int[] {startX, startY});
		
		while(!queue.isEmpty()) {
			int[] temp = queue.poll();
			int curX = temp[0];
			int curY = temp[1];
			
			for(int i = 0; i < 4; i++) {
				int nx = curX + dx[i];
				int ny = curY + dy[i];
				
				if(nx >= 0 && ny >= 0 && nx < M && ny < N) {
					if(map[nx][ny] == 1 && visited[nx][ny] != true) {
						queue.offer(new int[] {nx, ny});
						visited[nx][ny] = true;
					}
				}
			}
		}
	}
}
