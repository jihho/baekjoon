package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex07 {

	static int N;
	static int[] arr;
	static int maxVal = Integer.MIN_VALUE;
	static int minVal = Integer.MAX_VALUE;
	static int[] operatorArr = new int[4];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < 4; i++) {
			operatorArr[i] = Integer.parseInt(st.nextToken());
		}
		
		operatorCalc(arr[0], 1);
		
		System.out.println(maxVal);
		System.out.println(minVal);
	}
	
	public static void operatorCalc(int num, int depth) {
		if(depth == N) {
			if(maxVal < num) {
				maxVal = num;
			}
			if(minVal > num) {
				minVal = num;
			}
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			if(operatorArr[i] != 0) {
				int val = num;
				
				if(i == 0) {
					val = val + arr[depth];
				}
				else if(i == 1) {
					val = val - arr[depth];
				}
				else if(i == 2) {
					val = val * arr[depth];
				}
				else if(i == 3) {
					if(val >= 0) {
						val = val / arr[depth];
					} else {
						val = - (Math.abs(val) / arr[depth]);
					}
				}
				
				operatorArr[i] -= 1;
				operatorCalc(val, depth+1);
				operatorArr[i] += 1;
			}
		}
	}
}
