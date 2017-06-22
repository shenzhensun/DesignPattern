package designpattern.simplefactory01.Factory;
/**

 *
 *  
 * @author Administrator2
 *
 */
public class SendFactory {
	
	public Sender producr(String type){
		if (type.equals("mail")){
			
			return new MailSender();
			
		}else if ("qq".equals(type)) {
			
			return new QqSender();
			
		}else {
			System.out.println("error");
			
			return null;
		}
		
		}

	public Sender produceMail(){
		return new MailSender();
	}
    public Sender produceQQ(){
	return new QqSender();
    }


    

	
	

}
