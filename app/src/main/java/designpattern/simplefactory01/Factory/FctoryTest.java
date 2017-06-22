package designpattern.simplefactory01.Factory;

public class FctoryTest {

	public static void main(String[] args) {
		
		SendFactory sendFactory =new SendFactory();
		Sender sender= sendFactory.producr("qq");
		sender.send();
		
		//
		

		Provider provider =new SendMailFactory();
		Sender sender2=provider.produce();
		sender2.send();
		
	}
	
	
	
}
