package kr.or.kosa.task;

import java.util.Scanner;

//아래 코드는 금액을 입력받아 

//예)
//12345
//10000 1개
//5000 0개
//1000 2개
//500 0개
//100 3개 
//50 0개
//10 4개
//5 1개
//1 0개
//를 계산하는 프로그램 입니다 

//타원 : 프로세스의 시작과 끝
//육각형 : 변수의 초기 설정
//평행사변형 : 데이터의 입력과 출력
//사각형 : 동작, 각종 연산 처리
//물결도형 : 다이얼로그와 같은 출력 표시
//마름모 : 판단 및 분기
//화살표 : 흐름의 방향

public class Ex01_flow_chart {

	public static void main(String[] args) {

		int unit = 10000; //unit : 화폐 단위
		int num = 0; //num : 화폐매수
		int sw = 0; //sw : 스위칭 변수, 화폐의 다음 단위를 위해
		
		Scanner in = new Scanner(System.in);
		int money = Integer.parseInt(in.nextLine()); //money : 입력받는 금액
		
		while(unit>1) {
			
			num = (int)(money/unit);
			//System.out.println("unit = "+unit+"num = "+num);
			System.out.println(unit+"\t"+num+"개");
			money = money-(unit*num);
			if(sw==0) {
				unit = unit/2;
				sw=1;
			}else {
				unit = unit/5;
				sw=0;
			}
		}
		
	}

}
