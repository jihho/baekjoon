package baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ex04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		double sum = 0.0;
		int[] count = new int[4000];
		
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
			count[Math.abs(list.get(i))]++;
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
		
		sb.append(Math.round(sum/N)).append("\n");
		sb.append(list.get((N-1)/2)).append("\n");
		
		int range = list.get(N-1) - list.get(0);
		sb.append(range);
		System.out.println(sb);
	}

}
