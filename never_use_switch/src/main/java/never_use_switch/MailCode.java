package never_use_switch;/**
 * @author Evgeny Borisov
 */

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Repeatable(MailCode.List.class)
@Retention(RUNTIME)
public @interface MailCode {
    int value();

    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        MailCode[] value();
    }
}
