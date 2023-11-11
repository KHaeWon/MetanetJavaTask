package kr.or.kosa.daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//배:0, 등:1
//도 : 0 1 1 1 ->A
//개 : 0 0 1 1 ->B
//걸 : 0 0 0 1 ->C
//윷 : 0 0 0 0 ->D
//모 : 1 1 1 1 ->E
public class Ex_11_02_Yunnori {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str = "";
		List<String> list = new ArrayList<>();
		
		for(int i=0;i<3;i++) { //행
			str = in.nextLine();
			String arr[] = str.split(" ");
			//System.out.println(i+"arr.length="+arr.length);
			
			int count = 0;//행마다 초기화를 해주지 않았어서 문제가 발생했었음
			
			for(int j=0;j<4;j++) { //열
				if(arr[j].equals("0")) 
					count++;
			}
			
			String result = "";
			switch(count) {
			case 0:
				result = "E";
				break;
			case 1:
				result = "A";
				break;
			case 2:
				result = "B";
				break;   
			case 3:      
				result = "C";
				break;    
			case 4:   
				result = "D";
				break;
			default:
				System.out.println("0 또는 1만 입력하세요");
				return;
			}
			
			list.add(result);
			
		}
		
		for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
		
		
		
		
	}

}
