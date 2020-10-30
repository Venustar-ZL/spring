package basic_di.bean;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/22 17:01
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class QuickstartInjectBySetXmlApplication {

    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_di/inject-set.xml");
        Person person = factory.getBean(Person.class);
        System.out.println(person);
        Cat cat = factory.getBean(Cat.class);
        System.out.println(cat);
    }

}
