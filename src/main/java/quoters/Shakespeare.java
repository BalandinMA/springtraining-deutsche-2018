package quoters;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class Shakespeare implements Quoter {
    @Setter
    private String message;

    @InjectRandomInt(min = 3, max = 5)
    private int repeat;


    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}







