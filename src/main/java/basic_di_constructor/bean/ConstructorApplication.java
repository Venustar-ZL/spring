package basic_di_constructor.bean;

import basic_di_constructor.bean.config.ConstructorConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/25 11:09
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class ConstructorApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConstructorConfig.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(person.toString());
    }

}
