package baekjoon.step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex01 {

	static int N;
	static int[][] arr;
	static int blue = 0;
	static int white = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		divide(N, 0, 0);
		System.out.println(white);
		System.out.println(blue);
		
	}
	static void divide(int n, int x, int y) {
		if(n == 1) {
			if(arr[y][x] == 0) {
				white++;
			} else {
				blue++;
			}
			return;
		}
		
		boolean sameColor = true;
		int color = arr[y][x];
		out: for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[y+i][x+j] != color) {
					sameColor = false;
					break out;
				}
			}
		}
		
		if(sameColor) {
			if(arr[y][x] == 0) {
				white++;
			} else {
				blue++;
			}
			return;
		}
		
		int newN = n/2;
		divide(newN, x, y);
		divide(newN, x+newN, y);
		divide(newN, x, y+newN);
		divide(newN, x+newN, y+newN);
	}

}
