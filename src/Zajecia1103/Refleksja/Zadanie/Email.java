package Zajecia1103.Refleksja.Zadanie;

import java.util.Date;

public class Email extends Document{
	private String subject;
	private String[] to;
	
	public Email( String subject, String[] to, Date date) {
		super(date);
		this.subject = subject;
		this.to = to;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public String[] getTo() {
		return to;
	}
	
}
