import java.util.Scanner;

//조별과제 - 물 자판기
/*
- 음료수 몇개, 음료수 가격, 자판기 보유금액, 일련 번호
- overriding
- 음료수 자판기는 음료수와 일련번호, 음료수 개수, 가격을 가지고 있다
- 음료수 자판기는 음료수의 개수를 입력받는다
- 음료수 자판기는 음료수 개수와 입력받은 개수를 계산한다
- 입력받은 개수보다 보유개수가 적으면 음료수를 제공하지 않는다
- 음료수 자판기는 돈을 입력 받는다
- 거스름돈을 계산해 돌려준다
- 음료수를 제공한다
 */

public class Ex01_VendingMachine {

	int num; //음료수 개수
	int price; //음료수 가격
	int machine_balance; //자판기 잔액
	static String machine_number; //자판기 일련번호
	
	Ex01_VendingMachine(){
		this.num=1;
		this.price=1000;
	}
	
	Ex01_VendingMachine(int num, int price){
		this.num=num;
		this.price=price;
	}
	
	//거스름돈 -> 입력받은값이 음료수 값보다 크면 호출
	//음료수 가격 = 음료수 1개 가격 * 음료수 개수
	int exchange(int num) {
		price = 1000 * num;
		machine_balance -= price;
		System.out.println("자판기 잔액 : "+machine_balance);
		return price;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("금액을 입력하세요 : ");
		int cash = Integer.parseInt(in.nextLine());//사용자가 입력한 금액
		System.out.println("개수를 선택하세요 : ");
		int num = Integer.parseInt(in.nextLine()); //사용자가 입력한 음료 개수
		Ex01_VendingMachine vendingMachine = new Ex01_VendingMachine();

		//거스름돈 조건
		if(cash>(vendingMachine.price*vendingMachine.num)) {
			vendingMachine.exchange(num);
			System.out.println("거스름돈은 "+num+"원입니다.");
		}

	}

}
