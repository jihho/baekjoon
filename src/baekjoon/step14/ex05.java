package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex05 {
	static long[][] costs;
	static long[][] rgbArr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		costs = new long[N][3];
		rgbArr = new long[N][3];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 3; j++) {
				rgbArr[i][j] = -1;
			}
		}
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			costs[i][0] = Long.parseLong(st.nextToken());
			costs[i][1] = Long.parseLong(st.nextToken());
			costs[i][2] = Long.parseLong(st.nextToken());
		}
		
		rgbArr[0][0] = costs[0][0];
		rgbArr[0][1] = costs[0][1];
		rgbArr[0][2] = costs[0][2];
		
		long min = Math.min(rgb(N-1,0), Math.min(rgb(N-1, 1), rgb(N-1, 2)));
		System.out.println(min);
	}
	
	public static long rgb(int i, int j) {
		if(rgbArr[i][j] == -1) {
			int y1, y2;
			if(j == 0) {
				y1 = 1;
				y2 = 2;
			}
			else if(j == 1) {
				y1 = 0;
				y2 = 2;
			}
			else {
				y1 = 0;
				y2 = 1;
			}
			rgbArr[i][j] = Math.min(costs[i][j] + rgb(i-1, y1), costs[i][j] + rgb(i-1, y2));
		}
		
		return rgbArr[i][j];
	}

}
