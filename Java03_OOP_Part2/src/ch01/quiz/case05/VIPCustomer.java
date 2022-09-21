package ch01.quiz.case05;

public class VIPCustomer extends Customer{

	private int agentID;
	double salesRatio; //할인률 (VIP만)
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
//		super(0, null);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		this.agentID = agentID;
	}
	
	public int getAgentId() {
		return agentID;
	}
	@Override //오버라이딩됨을 알려주는annotation
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //보너스 포인트 적립
		return price - (int)(price *salesRatio);
}
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 삼담원 번호는 "+ agentID +"입니다";
	}

//오버라이딩 : 메소드 정의부가 똑같다. 그리고 블록 안 내용을 재정의	
}
