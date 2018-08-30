package never_use_switch;

import lombok.Builder;
import lombok.Value;

/**
 * @author Evgeny Borisov
 */
@Value
@Builder
public class MailInfo {
    private String clientName;
    private String clientMail;
    private int mailCode;
}
