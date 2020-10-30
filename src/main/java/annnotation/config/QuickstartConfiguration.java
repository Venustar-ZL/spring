package annnotation.config;

import basic_dl.quickstart_byname.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/23 10:07
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Configuration
// 如果不加扫描路径，只会扫描本类所在包及其子包下的所有@Component组件
@ComponentScan("basic_dl.quickstart_byname.bean")
public class QuickstartConfiguration {

    @Bean(name = "person")
    public Person person() {
        Person person = new Person();
        return person;
    }

}
