package never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan("never_use_switch")
public class MainConfig {
    @Autowired
    ApplicationContext context;
    @Bean
    Map<String, MailGenerator> getGeneratorMap() {
//        Map<Integer, MailGenerator> mailGeneratorMap = new HashMap<>();
//        mailGeneratorMap.put(1, new EmailCallbackMailGenerator());
//        mailGeneratorMap.put(2, new HappyBirthdayMailGenerator());
//        mailGeneratorMap.put(3, new WelcomeMailGenerator());
//        return mailGeneratorMap;
        return context.getBeansOfType(MailGenerator.class);
    }
}
