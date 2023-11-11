package kr.or.kosa.daily;

import java.util.Scanner;

/*
첫 번째 숫자가 두 번째 숫자의 약수이다.
첫 번째 숫자가 두 번째 숫자의 배수이다.
첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.
 */  

public class Ex_11_03_multiple {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while(true) {
			 
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			
			if(num1==0 && num2==0)
				break;
			
			if(num1==0 || num2==0)
				System.out.println("neither");
			else if(num2%num1==0)
				System.out.println("factor");
			else if(num1%num2==0)
				System.out.println("multiple");
			else 
				System.out.println("neither");
					
			
			
		}
			
			
		
	}

}
