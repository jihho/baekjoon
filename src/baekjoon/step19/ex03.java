package baekjoon.step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex03 {
	static int[][] paper;
	static int[] dx = {0, 1, 2};
	static int[] dy = {0, 1, 2};
	static int[] arr = new int[3];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		paper = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		divide(N, 0, 0);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
	}
	static void divide(int n, int x, int y) {
		int value = paper[x][y];
		boolean flag = true;
		
		out:for(int i = x; i < x+n; i++) {
			for(int j = y; j < y+n; j++) {
				if(paper[i][j] != value) {
					flag = false;
					break out;
				}
			}
		}
		
		if(flag) {
			switch(value) {
			case -1: arr[0] += 1; break;
			case 0: arr[1] += 1; break;
			case 1: arr[2] += 1; break;
			}
		}
		else {
			int divideN = n/3;
			
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					divide(divideN, x + dx[i]*divideN, y + dy[j]*divideN);
				}
			}
			
		}
		
	}

}
