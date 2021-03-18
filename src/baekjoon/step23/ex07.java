package baekjoon.step23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex07 {

	static int M;
	static int N;
	static int H;
	static int[][][] map;
	static int[] dx = {0, 0, -1, 1, 0, 0};
	static int[] dy = {-1, 1, 0, 0, 0, 0};
	static int[] dz = {0, 0, 0, 0, 1, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		map = new int[N][M][H];
		
		for(int k = 0; k < H; k++) {
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < M; j++) {
					map[i][j][k] = Integer.parseInt(st.nextToken());
				}
			}
		}
		
		bfs();
	}
	static void bfs() {
		Queue<int[]> queue = new LinkedList<>();
		
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < M; k++) {
					if(map[j][k][i] == 1) {
						queue.offer(new int[] {j, k, i});
					}
				}
			}
		}
		
		while(!queue.isEmpty()) {
			int[] temp = queue.poll();
			int curX = temp[0];
			int curY = temp[1];
			int curZ = temp[2];

			for(int i = 0; i < 6; i++) {
				int nx = curX + dx[i];
				int ny = curY + dy[i];
				int nz = curZ + dz[i];
				
				if(nx >= 0 && ny >= 0 && nx < N && ny < M && nz >= 0 && nz < H) {
					if(map[nx][ny][nz] == 0) {
						queue.offer(new int[] {nx, ny, nz});
						map[nx][ny][nz] = map[curX][curY][curZ] + 1;
					}
				}
			}
		}
		
		int max = 0;
		for(int k = 0; k < H; k++) {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					if(map[i][j][k] == 0) {
						System.out.println(-1);
						return;
					}
					max = Math.max(max, map[i][j][k]);
				}
			}
		}
		System.out.println(max - 1);
		
	}

}
