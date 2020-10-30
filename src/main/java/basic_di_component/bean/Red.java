package basic_di_component.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/25 11:47
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
public class Red {

    @Value("${red.name}")
    private String name;

    @Value("${red.order}")
    private Integer order;

    @Override
    public String toString() {
        return "Red{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
