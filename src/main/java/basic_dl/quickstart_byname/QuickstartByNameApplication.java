package basic_dl.quickstart_byname;

import basic_dl.quickstart_byname.bean.Person;
import basic_dl.quickstart_byname.dao.DemoDao;
import dao.impl.DemoDaoImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/22 16:40
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class QuickstartByNameApplication {

    public static void main(String[] args) {
        // byname 获取bean
        /*
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-byname.xml");
        Person person = (Person)factory.getBean("person");
        System.out.println(person);
         */

        // bytype 获取

        /*
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-bytype.xml");
        Person person = factory.getBean(Person.class);
        System.out.println(person);

        DemoDao demoDao = factory.getBean(DemoDao.class);
        System.out.println(demoDao.finaAll());

         */



        // 获取多个bean
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-byname.xml");
        Map<String, DemoDao> beans =  ctx.getBeansOfType(DemoDao.class);
        beans.forEach((beanName, bean) -> {
            System.out.println(beanName + " : " + bean.toString());
        });



    }

}
