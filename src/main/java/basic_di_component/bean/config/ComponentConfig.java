package basic_di_component.bean.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/25 11:48
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Configuration
@PropertySource("classpath:red.properties")
@ComponentScan("basic_di_component.bean")
public class ComponentConfig {
}
