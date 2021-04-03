package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex4963 {

	static int w;
	static int h;
	static int map[][];
	static boolean visited[][];
	static int[] dx = {0, 0, 1, -1, -1, 1, -1, 1};
	static int[] dy = {1, -1, 0, 0, -1, 1, 1, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if(w == 0 && h == 0) {
				break;
			}
			
			
			map = new int[h][w];
			visited = new boolean[h][w];
			int sum = 0;
			
			for(int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(map[i][j] == 1 && visited[i][j] == false) {
						sum += dfs(i, j);
					}
				}
			}
			System.out.println(sum);
		}
		
		
	}
	static int dfs(int x, int y) {
		visited[x][y] = true;
		for(int i = 0; i < 8; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			if(xx >= 0 && yy >= 0 && xx < h && yy < w) {
				if(map[xx][yy] == 1 && !visited[xx][yy]) {
					dfs(xx, yy);
				}
			}
		}
		return 1;
		
	}
}
