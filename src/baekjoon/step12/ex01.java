package baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		while(N-- > 0) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		for(int i = 0; i < list.size(); i++) {
			int val = list.get(i);
			int idx = 0;
			for(int j = i+1; j < list.size(); j++) {
				if(val > list.get(j)) {
					val = list.get(j);
					idx = j;
				}
			}
			
			if(list.get(i) != val) {
				int num = list.get(i);
				list.set(i, val);
				list.set(idx, num);
			}
			
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
