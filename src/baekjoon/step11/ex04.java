package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex04 {
	public static boolean[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < M; j++) {
				if(str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		int min = 64;
		
		for(int i = 0; i < N - 7; i++) {
			for(int j = 0; j < M - 7; j++) {
				if(min > find(i, i+8, j, j+8)) {
					min = find(i, i+8, j, j+8);
				}
			}
		}
		
		System.out.println(min);
	}
	public static int find(int startX, int endX, int startY, int endY) {
		int cnt = 0;
		
		boolean flag = arr[startX][startY];
		
		for(int i = startX; i < endX; i++) {
			for(int j = startY; j < endY; j++) {
				if(arr[i][j] != flag) {
					cnt++;
				}
				
				flag = !flag;
			}
			flag = !flag;
		
		}
		return Math.min(cnt, 64-cnt); 
	}

}
