package baekjoon.step24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ex01 {

	static int V;
	static int E;
	static int K;
	static ArrayList<Point> list;
	static class Point {
		int from;
		int to;
		int weight;
		
		Point(int from, int to, int weight) {
			this.from = from;
			this.to = to;
			this.weight = weight;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		
		K = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			list.add(new Point(u, v, w));
		}
		
		for(int i = 0; i < V; i++) {
			System.out.println(distance(K-1, i, 0));
		}
	}
	static int distance(int a, int b, int sum) {
		if(a == b) 
			return sum;
		return 0;
	}
}
