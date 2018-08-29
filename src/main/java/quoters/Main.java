package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class Main {



    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

     /*   String[] names = context.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out::println);*/
    }
}
