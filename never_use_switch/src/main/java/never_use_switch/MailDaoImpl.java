package never_use_switch;

import org.fluttercode.datafactory.impl.DataFactory;

/**
 * @author Evgeny Borisov
 */
public class MailDaoImpl implements MailDao {

    private static DataFactory dataFactory = new DataFactory();


    @Override
    public MailInfo getMailInfo() {
        return MailInfo.builder().
                clientName(dataFactory.getName()).
                clientMail(dataFactory.getEmailAddress()).
                mailCode(dataFactory.getNumberBetween(1, 5))
                .build();
    }


}
