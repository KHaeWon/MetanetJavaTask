package kr.or.kosa.daily;

import java.util.Scanner;

public class Ex_11_06_basket_input {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); //바구니의 개수
		int m = in.nextInt(); //반복 횟수
		
		int[] basket = new int[n];
		
		for(int q=0; q<m; q++) {
			int i = in.nextInt(); //i번 바구니부터
			int j = in.nextInt(); //j번 바구니까지
			int k = in.nextInt(); //k번이 적힌 공 넣기
			
			for(int a=i-1; a<j; a++) {
				basket[a]=k;
			}
			
		}
		
		for(int val:basket) {
			System.out.print(val+" ");
		}
		
	}

}
