package Payment;

public class UPIPayment {
	public String doPaymentUsingPhonePe(long phno,double amount) {
		return "Rs."+amount+" is sending to phno: "+phno;
	}
}
