package baekjoon.step22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ex01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int K = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			ArrayList<Integer> arr = new ArrayList<>();
			for(int j = 0; j < K; j++) {
				int num = Integer.parseInt(st.nextToken());
				arr.add(num);
			}
			
			arr.sort(null);
			
			AddFile(arr, 0, arr.get(0), 1, K);
		}
	}
	public static void AddFile(ArrayList<Integer> list, int totalSum, int sum, int idx, int K) {
		if(idx == K) {
			System.out.println(totalSum);
			return;
		}
		
		sum += list.get(idx);
		totalSum += sum;
		System.out.println(totalSum);
		AddFile(list,totalSum, sum, idx+1, K);
		
	}
}
