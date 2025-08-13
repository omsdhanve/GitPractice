package UPILITE;

public class UpiLitePayment {
  public String doPaymentUsingPhonePeLite(Double amt, long phno) {
	  return "Rs"+amt+" Payment is Done using PhonePeLite to no:"+phno;
  }
  
  public String doPaymentUsingAmazonPeLite(Double amt, long phno) {
	  return "Rs"+amt+" Payment is Done using AmazonPeLite to no:"+phno;
  }
}
