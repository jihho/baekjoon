package baekjoon.step23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ex03 {
	static char[][] map;
	static boolean[][] visited;
	static int dx[] = {0, 0, 1, -1};
	static int dy[] = {1, -1, 0, 0};
	static int[] aparts = new int[25*25];
	static int apartNum = 0;
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		map = new char[N][N];
		visited = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(map[i][j] == '1' && visited[i][j] != true) {
					apartNum++;
					bfs(i, j);
				}
			}
		}
		
		Arrays.sort(aparts);
		System.out.println(apartNum);
		
		for(int i = 0; i < aparts.length; i++) {
			if(aparts[i] != 0) {
				System.out.println(aparts[i]);
			}
		}
	}
	static void bfs(int startX, int startY) {
		Queue<int[]> queue = new LinkedList<>();
		visited[startX][startY] = true;
		aparts[apartNum]++;
		
		queue.add(new int[] {startX, startY});
		
		while(!queue.isEmpty()) {
			int[] temp = queue.poll();
			int curX = temp[0];
			int curY = temp[1];
			
			for(int i = 0; i < 4; i++) {
				int nx = curX + dx[i];
				int ny = curY + dy[i];
				
				if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
					if(map[nx][ny] == '1' && visited[nx][ny] != true) {
						queue.offer(new int[] {nx, ny});
						visited[nx][ny] = true;
						aparts[apartNum]++;
					}
				}
			}
		}
	}
}
