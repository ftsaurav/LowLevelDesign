interface NotificationService{
    void send(String to, String subject, String body);
}
class EmailNotificationService implements NotificationService {

    @Override
    public void send(String to, String subject,String body){
        System.out.println("Sending Email to " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: "+body);
    }
}

class SendGridService {
    public void sendEmail(String recipient, String title, String content){
        System.out.println("Sending email via SendGrid to " + recipient);
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }
}
class SendGridAdapter implements NotificationService{
    private SendGridService sendGridService;

    public SendGridAdapter(SendGridService sendGridService){
        this.sendGridService = sendGridService;
    }

    @Override
    public void send(String to, String subject, String body) {
        //Adapter Method -> convert parameters and calls to SendGrid Method
        sendGridService.sendEmail(to,subject,body);
    }
}
public class NotificationServiceMain {
    public static void main(String[] args) {
        // EmailNotificationService emailNotificationService= new EmailNotificationService();
        // emailNotificationService.send("h1", "h2", "h3");
        NotificationService sendGridAdapter= new SendGridAdapter(new SendGridService());
        sendGridAdapter.send("1", "h2", "h3");


        
    }
}
