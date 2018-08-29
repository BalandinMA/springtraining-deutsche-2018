package quoters.task3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-task3.xml");
        LogicService logicService = context.getBean("logicService", LogicService.class);
        logicService.doLogic();
    }
}
