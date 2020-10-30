package basic_di_constructor.bean.config;

import basic_di_constructor.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/25 11:15
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Configuration
@ComponentScan("basic_di_constructor.bean")
public class ConstructorConfig {

    @Bean
    public Person getPerson() {
        return new Person("zlei", 22);
    }

}
