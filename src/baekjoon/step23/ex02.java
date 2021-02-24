package baekjoon.step23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex02 {
	static int computers;
	static int networks;
	static int[][] arr;
	static boolean[] visited;
	static int start = 1;
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		computers = Integer.parseInt(br.readLine());
		networks = Integer.parseInt(br.readLine());
		
		visited = new boolean[computers + 1];
		arr = new int[computers + 1][computers + 1];
		
		for(int i = 0; i < networks; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = arr[y][x] = 1;
		}
		
		bfs();
		
		System.out.println(count);
	}
	
	static void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			for(int i = 1; i <= computers; i++) {
				if(arr[temp][i] == 1 && visited[i] != true) {
					visited[i] = true;
					count++;
					queue.offer(i);
				}
			}
			
		}
		
	}

}
