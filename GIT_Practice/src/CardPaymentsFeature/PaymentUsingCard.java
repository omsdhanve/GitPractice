package CardPaymentsFeature;

public class PaymentUsingCard {
	public String PayUsingDebitCard(long cardNo, Double amt) {
		return "Rs."+amt+" bill payment done using DebitCard";
	}
	
	public String PayUsingCreditCard(long cardNo, Double amt) {
		return "Rs."+amt+" bill payment done using CreditCard";
	}
}
