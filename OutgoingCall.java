package wq;

public class OutgoingCall  extends PhoneCall {
	private String PhoneNumber;
	private double RatePerMinute;
	private double Minutes;
//	private double total_Price;\
	//double RateOutgoing;
	public void Thing() {
		
	}
	// Default 
	public OutgoingCall() {
		 PhoneNumber=" ";
		 RatePerMinute=0;
		 Minutes=0;
	//	 total_Price=0;
	}
	
	//Alternate
	public OutgoingCall( String PhoneNumber,  double number_of_Minutes) {
		 this.PhoneNumber= PhoneNumber;
		 this.Minutes=number_of_Minutes;
		
	}
	
	//copy constructor
	public OutgoingCall(OutgoingCall obj) {
		this.PhoneNumber=obj.PhoneNumber;
		//this.RatePerMinute= obj.RatePerMinute;
		this.Minutes= obj.Minutes;
		//this.total_Price= obj.total_Price;
	}
	//Make Copy
	public void MakeCopy(OutgoingCall obj) {
		this.PhoneNumber=obj.PhoneNumber;
		//this.RatePerMinute= obj.RatePerMinute;
		this.Minutes= obj.Minutes;
		//this.total_Price= obj.total_Price;
	}
	//Set method
	public void SetPhoneNumber(String  PhoneNumber) {
		 this.PhoneNumber= PhoneNumber;
	}
//	public void SetRatePerMinute(double RatePerMinute) {
//		this.RatePerMinute= RatePerMinute;
//	}
	public void Setnumber_of_Minutes(double number_of_Minutes) {
		this.Minutes= number_of_Minutes;
	}
//	public void Settotal_Price(double total_Price) {
//		this.total_Price= total_Price;
//	}
	
	//Get Method
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public double getRatePerMinute() {
		return RatePerMinute;
	}
	public double getnumber_of_Minutes() {
		return Minutes;
	}
//	public double gettotal_Price() {
//		return total_Price;
//	}
	public double total_Price() {
		return ( RateOutgoing * Minutes);
		
	}
	//toString
	public String toString() {
		return("Outgoing phone call :" +PhoneNumber+  " "+ RateOutgoing +" per minutes at " + Minutes+ " minutes. Total is $"+total_Price());
	}
	
	
	
}
