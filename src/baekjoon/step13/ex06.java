package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex06 {
	static int[][] arr = new int[9][9];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		sudoku();
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void sudoku() {
		
	}
	
	public static int possibility(int row, int col) {
		int countRow = 0;
		int countCol = 0;
		
		for(int i = 0; i < 9; i++) {
			if(i != col && arr[row][i] != 0) {
				countRow++;
			}
			
			if(i != row && arr[i][col] != 0) {
				countCol++;
			}
		}
		
		
		System.out.println(row + " " + col + " : " + countRow + " " + countCol);
		if(countRow == 8) {
			return 1;
		}
		else if(countCol == 8) {
			return 2;
		}
		
		return 0;
	}
	
}
