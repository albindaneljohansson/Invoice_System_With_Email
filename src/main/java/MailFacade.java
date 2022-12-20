import javax.mail.MessagingException;

public class MailFacade {
    String recipient;
    String subject;
    String text;

    public MailFacade (String recipient, String subject, String text){
        this.recipient = recipient;
        this.subject = subject;
        this.text = text;
    }
    public void sendMail() throws MessagingException {
        MailUtility.sendMail(recipient,subject,text);
    }

}