package wq;
/*
 * Name:Abenezer Y Bekele
 * Course: CIDS 235
 * Project 2
 */   



public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IncomingCall Call1= new IncomingCall("212-555-3096");
		System.out.println(Call1);
		OutgoingCall Call2= new OutgoingCall("312-874-0232", 10);
		System.out.println(Call2);
		IncomingCall Call3= new IncomingCall("345-094-8372");
		System.out.println(Call3);
		OutgoingCall Call4= new OutgoingCall("644-564-8572",4);
		System.out.println(Call4);
		IncomingCall Call5= new IncomingCall("343-194-3372");
		System.out.println(Call5);
		OutgoingCall Call6= new OutgoingCall("343-194-3372",10);
		System.out.println(Call6);
		IncomingCall Call7= new  IncomingCall("545-065-2362");
		System.out.println(Call7);
		OutgoingCall Call8= new OutgoingCall("655-999-6372",30);
		System.out.println(Call8);
		IncomingCall Call9= new  IncomingCall("125-345-4857");
		System.out.println(Call9);
		OutgoingCall Call10= new OutgoingCall("235-955-1371 ",3);
		System.out.println(Call10);

//		
	}

}
