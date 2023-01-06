package wq;

public class IncomingCall extends PhoneCall {
	
	private String PhoneNumber;
	private double minutes;

	public void Thing() {
		
	}
	
	//Default constructor
	public IncomingCall(){
		PhoneNumber= " ";
	}
	//Alternate
	public IncomingCall(String Number) {
		PhoneNumber=Number;	
	}
	
	//copy constructor
	public IncomingCall(IncomingCall obj) {
		this.PhoneNumber= obj.PhoneNumber;}
	
	//MakeCopy
	public void MakeCopy(IncomingCall obj) {
		this.PhoneNumber= obj.PhoneNumber;
		this.minutes= obj.minutes;
		}

	// Setters
	public void SetPhoneNumber(String  PhoneNumber) {
		 this.PhoneNumber= PhoneNumber;
	}
	public void Setminutes(double minutes) {
		this.minutes= minutes;
	}

	//Getters
	
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public double getminutes() {
		return minutes; 
		}
	
	// calculator
	
	public double CalculatePay() {
		return ( RateIncoming * 1);
		}
	
	// toString
	public String toString() {
		return ("Incoming phone call: "+PhoneNumber + " "+ RateIncoming+" per call. Total is $"+ CalculatePay() );
	}
}