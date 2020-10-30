package d_withanno;

import d_withanno.annotation.Color;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/22 17:54
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class WithAnnoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-byanno.xml");
        Map<String, Object> beans = ctx.getBeansWithAnnotation(Color.class);
        beans.forEach((beanName, bean) -> {
            System.out.println(beanName + " : " + bean.toString());
        });

        // 获取所有的bean
        String[] beanNames = ctx.getBeanDefinitionNames();
        Stream.of(beanNames).forEach(System.out::println);
    }

}
