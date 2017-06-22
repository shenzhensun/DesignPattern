package designpattern.simplefactory01.Factory;
/**
 *
 * @author Administrator
 *
 */
public class SendMailFactory implements Provider {

	public Sender produce(){
		return new MailSender();
	}
	
	
	
}
