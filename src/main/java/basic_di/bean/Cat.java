package basic_di.bean;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/22 16:58
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Cat {

    private String name;

    private Person person;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", person=" + person +
                '}';
    }
}
