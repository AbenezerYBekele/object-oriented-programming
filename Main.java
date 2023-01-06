package wq;

/*
 * Name:Abenezer Y Bekele
 * Course: CIDS 235
 * Project 2
 */   


public class Main {
	public static void Main(String argss[]) {
		
		PhoneCall PhoneObj;
		PhoneObj= new IncomingCall();
		PhoneObj.Thing();
		PhoneObj= new OutgoingCall();
		PhoneObj.Thing();
	}
	
}
