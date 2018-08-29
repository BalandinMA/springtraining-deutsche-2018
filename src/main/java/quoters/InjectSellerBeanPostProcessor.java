package quoters;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Set;

public class InjectSellerBeanPostProcessor implements BeanPostProcessor {
    private LinkedList<Seller> sellers = DataService.getSortedSellers();

    @SneakyThrows
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        Class<?> type = bean.getClass();
        Set<Field> fields = ReflectionUtils.getAllFields(type);
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectSeller.class)) {
                field.setAccessible(true);
                if (sellers.isEmpty()) {
                    System.out.println("Seller list is empty");
//                    NPE
                } else {
                    field.set(bean, sellers.removeFirst());
                }
            }
        }
        return bean;
    }
}
