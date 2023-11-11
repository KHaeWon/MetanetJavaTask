package Market;

public class Appliance extends Product {
	
	private String company;
	
	Appliance(String name, int price, String seller, String company){
		super(name, price, seller);
		this.company=company;
	}

	@Override
	public void printDetailInfo() {
		System.out.println("이름:"+name+"가격"+price+"판매자"+seller+"제조사"+company);
	}
	
	
}
