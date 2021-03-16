package baekjoon.step23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex10 {

	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {-2,-1,2,1,2,1,-2,-1};
    static int[] dy = {1,2,1,2,-1,-2,-1,-2};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int I = Integer.parseInt(br.readLine());
			map = new int[I][I];
			visited = new boolean[I][I];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int curX = Integer.parseInt(st.nextToken());
			int curY = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int moveX = Integer.parseInt(st.nextToken());
			int moveY = Integer.parseInt(st.nextToken());
			bfs(I, curX, curY, moveX, moveY);
			System.out.println(map[moveX][moveY]);
			
		}
	}
	
	static void bfs(int len, int curX, int curY, int moveX, int moveY) {
		
		visited[curX][curY] = true;
		
		if(curX == moveX && curY == moveY) {
			return;
		}
		
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {curX, curY});
		
		while(!queue.isEmpty()) {
			int[] temp = queue.poll();
			int x = temp[0];
			int y = temp[1];
			
			for(int i = 0; i < 8; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx >= 0 && ny >= 0 && nx < len && ny < len) {
					if(!visited[nx][ny]) {
						visited[nx][ny] = true;
						queue.add(new int[] {nx, ny});
						map[nx][ny] = map[x][y] + 1;
						
					}
				}
			}
		}
		
	}

}
