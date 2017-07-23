package probono.model.dto;


public class NotExsitException extends Exception{
	public NotExsitException(){}
	public NotExsitException(String msg){
		super(msg);
	}
}