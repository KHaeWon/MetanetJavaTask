package Market;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsedMarket {

	Map<String, Product> productmap = new HashMap<>();
	Scanner in = new Scanner(System.in);
	Product product;
	int count=0; //상품의 개수
	
	//실행
	public void run() {
		while(true) {
			System.out.println("메뉴를 입력하세요 \n(1)등록(2)구매(3)조회(4)나가기");
			int menu = in.nextInt();
			
			switch(menu) {
			case 1:
				sell();
			case 2:
			case 3:
			}
			if(menu==4) break;
		}
	}
	
	//등록
	public void sell() {
		
		System.out.println("등록할 상품을 선택하세요/n(1)의류(2)가전(3)완구");
		int productmenu = in.nextInt();
		
		System.out.println("***상품 등록***");
		System.out.print("이름:");
		String name = in.next();
		System.out.print("가격:");
		int price = in.nextInt();
		System.out.print("판매자:");
		String seller = in.next();
		
		switch(productmenu) {
		case 1:
			System.out.println("사이즈");
			int size = in.nextInt();
			product = new Clothes(name, price, seller, size);
			break;
		case 2:
			System.out.println("제조사");
			String company = in.next();
			product = new Appliance(name, price, seller, company);
			break;
		case 3:
			System.out.println("적정 연령");
			int age = in.nextInt();
			product = new Toy(name, price, seller, age);
			break;
		default:
			System.out.println("올바른 메뉴를 선택하세요");	
		}
		productmap.put(name, product);
		count++;
		System.out.println("상품의 총 개수 : "+count);
		System.out.println("상품이 등록되었습니다.");
		
	}
	
	//구매
	public void buy(String name) {
		
		System.out.println("구매하고자 하는 상품의 이름을 입력해주세요:");
		
		
	}
	public void search() {
		
	}
	
}
