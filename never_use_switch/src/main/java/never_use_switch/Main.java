package never_use_switch;

import lombok.SneakyThrows;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Evgeny Borisov
 */
public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("never_use_switch");
        MailSender mailSender = context.getBean(MailSender.class);
        while (true) {
            try {
                mailSender.sendMail();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println();
            }
            Thread.sleep(1000);
            System.out.println("- - - - - -");
        }
    }
}
