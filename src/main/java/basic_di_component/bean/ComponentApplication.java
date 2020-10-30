package basic_di_component.bean;

import basic_di_component.bean.config.ComponentConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/25 11:39
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class ComponentApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentConfig.class);
        Red red = ctx.getBean(Red.class);
        System.out.println(red.toString());
    }

}
