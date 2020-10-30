package annnotation.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/23 10:09
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class QuickstartAnnotationApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
//        Person person = ctx.getBean(Person.class);
//        System.out.println(person);

        String[] beanNames = ctx.getBeanDefinitionNames();
        Stream.of(beanNames).forEach(System.out::println);
    }

}
