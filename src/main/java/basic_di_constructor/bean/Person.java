package basic_di_constructor.bean;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/25 11:01
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Person {

    private String name;

    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
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
