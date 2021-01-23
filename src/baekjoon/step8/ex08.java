package baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ex08 {
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		if(a.length() >= b.length()) {
			addFunc(a, b);
		} else {
			addFunc(b, a);
		}
		
		for(int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i));
		}
	}
	
	public static void addFunc(String a, String b) {
		int num = 0;
		int idx1 = a.length() - 1;
		int idx2 = b.length() - 1;
		
		while(true) {
			if(idx1 < 0) {
				if(num != 0) {
					list.add(num);
				}
				break;
			}
			
			int sum = 0;
			sum += Character.getNumericValue(a.charAt(idx1)) + num;
			if(idx2 >= 0) {
				sum += Character.getNumericValue(b.charAt(idx2));
				idx2--;
			} 
			
			list.add(sum % 10); 
			num = sum / 10;
			
			idx1--; 
		}
		
	}

}
