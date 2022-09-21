package ch01.quiz.case02;

public class VIPCustomer extends Customer{

	private int agentID;
	double salesRatio; //할인률 (VIP만)
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
//		super(0, null);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public int getAgentId() {
		return agentID;
	}
}
