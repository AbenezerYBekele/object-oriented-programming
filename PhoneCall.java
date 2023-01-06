/**
 * 
 */
/**
 * @author abiye
 *
 */
package wq;

public abstract class PhoneCall   implements InterfacePhone { 

private String PhoneNumber;

public abstract void Thing();
	// Default constructor
	public PhoneCall() {
		PhoneNumber = " ";  
		}
	public PhoneCall( String Phone ) {
		this.PhoneNumber= Phone;
	}
	//copy constructor
//	public PhoneCall(PhoneCall obj) {
//		this.PhoneNumber=obj.PhoneNumber;	}
//	//MakeCopy
//	public void Makecopy(PhoneCall obj) {
//		this.PhoneNumber=obj.PhoneNumber;	}
	//Set Methods
	public void setPhoneNumber(String Phone) {
		this.PhoneNumber=Phone ; 
		}
	//get Methods
	public String getPhone_Number() {
		return PhoneNumber;		}
	
	// ToString	
//	public String toString() {
//		return ( "Phone_Number :"+PhoneNumber+ "The price of call is :"+Price_The_Call);
//	}
//	
}