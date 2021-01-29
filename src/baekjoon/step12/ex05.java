package baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ex05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<>();
		
		int count = str.length();
		int num = Integer.parseInt(str);
		
		while(count-- > 0) {
			list.add(num / (int) Math.pow(10, count));
			num = (int) (num % Math.pow(10, count)); 
		}
		
		Collections.sort(list);
		
		for(int i = list.size()- 1; i >= 0; i--) {
			sb.append(list.get(i));
		}
		
		System.out.println(sb);
	}

}
