package basic_di_component.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/25 11:38
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
public class Black {

    @Value("black")
    private String name;

    @Value("1")
    private Integer order;

    @Override
    public String toString() {
        return "Black{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
