package basic_dl.quickstart_byname.bean;

import org.springframework.stereotype.Component;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/22 16:41
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
public class Person {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
