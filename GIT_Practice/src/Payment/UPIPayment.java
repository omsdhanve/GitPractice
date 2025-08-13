package Payment;

public class UPIPayment {
	public String doPaymentUsingPhonePe(long phno,double amount) {
		return "Rs."+amount+" is sending to phno: "+phno+" using phonepe";
	}
	
	public String doPaymentUsingGPay(long phno,double amount) {
		return "Rs."+amount+" is sending to phno: "+phno+" using GPay";
	}
	
	public String doPaymentUsingAmazonPay(long phno,double amount) {
		return "Rs."+amount+" is sending to phno: "+phno+" using GPay";
	}
	
}
