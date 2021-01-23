package baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int x, y, xxyy;
			
			if(n % h == 0) {
				x = h;
				y = n / h;
			} else {
				x = n % h;
				y = (n / h) + 1;
			}
			
			xxyy = 100*x + y;
			
			str = str + xxyy + "\n";
		}
		
		System.out.println(str);
	}

}
