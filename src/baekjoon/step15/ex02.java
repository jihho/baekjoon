package baekjoon.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ex02 {

	static int N;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return Integer.compare(o1[0], o2[0]);
				}
				return Integer.compare(o1[1], o2[1]);
			}
			
		});
		
		int count = 0;
		int end_time = 0;
		
		for(int i = 0; i < N; i++) {
			if(end_time <= arr[i][0]) {
				end_time = arr[i][1];
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
