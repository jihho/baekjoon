package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ex03 {
	public static class Bulk {
		int weight;
		int height;
		
		Bulk(int weight, int height) {
			this.weight = weight;
			this.height = height;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Bulk> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		while(N-- != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int weight = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			
			list.add(new Bulk(weight, height));
		}
		
		for(int i = 0; i < list.size(); i++) {
			int rank = 1;
			for(int j = 0; j < list.size(); j++) {
				if(list.get(i).height < list.get(j).height && list.get(i).weight < list.get(j).weight) {
					rank++;
				}
			}
			sb.append(rank + " ");
		}
		
		System.out.println(sb);
		
	}

}
