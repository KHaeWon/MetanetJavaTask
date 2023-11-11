package kr.or.kosa.daily;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
/*
1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
3: 스택에 들어있는 정수의 개수를 출력한다.
4: 스택이 비어있으면 1, 아니면 0을 출력한다.
5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 */
public class Ex_11_07_Stack2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());//명령의 수

		Stack<Integer> stack = new Stack<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			String[] menu = in.nextLine().split(" ");
			switch(menu[0]) {
			case "1":
				stack.push(Integer.parseInt(menu[1]));
				break;
			case "2":
                if (stack.size()>0) {
                	list.add(stack.pop());
//                    int index = stack.search(stack.peek());
//                    list.add(stack.get(index));
                } else {
                	list.add(-1);
                }
                break;
            case "3":
            	int index = stack.search(stack.peek());
            	list.add(index+1);
            	break;
			case "4":
				if(!stack.empty()) {
					list.add(0);
				}else{
					list.add(1);
					}
				break;
			case "5":
				if(!stack.empty()) {
					list.add(stack.peek());
				}else{
					list.add(-1);
					}
				break;
				
			}
				
		}
		
		for(int result:list) {
			System.out.println(result);
		}
	}

}
