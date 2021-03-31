package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ex1946 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][2];
			int sum = 1;
			for(int j = 0; j < N; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				arr[j][0] = Integer.parseInt(st.nextToken());
				arr[j][1] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr, new Comparator<int[]> () {

				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
				}
				
			});
			
			int pivot = arr[0][1];
			for(int k = 1; k < arr.length; k++) {
				int score = arr[k][1];
				if(score < pivot) {
					pivot = score;
					sum++;
				}
			}
			System.out.println(sum);
		}
	}

}
