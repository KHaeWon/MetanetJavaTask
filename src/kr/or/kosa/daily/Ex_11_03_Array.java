package kr.or.kosa.daily;

import java.util.Scanner;

public class Ex_11_03_Array {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//테스트 케이스 개수 c
		int c = Integer.parseInt(in.nextLine());
		for(int i=1; i<=c; i++) {
			
			int sum=0; //합
			int count=0; //평균 이상 학생 수
			
			//학생의 수 n
			int n = in.nextInt();
			//학생의 점수 score
			int[] score = new int[n];
			for(int j=0;j<n;j++) {
				score[j] = in.nextInt();//0~100
				sum += score[j];
			}
			
			int avg = sum/n;
			
			for(int j=0; j<n; j++) {
				if(score[j]>avg) {
					count++;
				}
			}
			
			double ratio = (double)count/n;
			System.out.printf("%.3f%%\n",ratio*100);
			
		}
		
		
		
	}
	
}
