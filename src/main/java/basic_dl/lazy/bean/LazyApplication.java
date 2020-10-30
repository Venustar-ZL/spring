//package basic_dl.lazy.bean;
//
//import org.springframework.beans.factory.NoSuchBeanDefinitionException;
//import org.springframework.beans.factory.ObjectProvider;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * @author ：zhanglei
// * @date ：Created in 2020/10/22 18:07
// * @description：
// * @modified By：
// * @version: 1.0
// */
//public class LazyApplication {
//
//    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazy.xml");
//        Cat cat = ctx.getBean(Cat.class);
//        System.out.println(cat);
//
//
//        // 太丑 弃用
////        Dog dog;
////        try {
////            dog = ctx.getBean(Dog.class);
////        } catch (NoSuchBeanDefinitionException e) {
////            dog = new Dog();
////        }
////        System.out.println(dog);
//        // 采用延时，包装所需的bean，只有在真正调用的时候才报错
//        ObjectProvider<Dog> dogObjectProvider = ctx.getBeanProvicer(Dog.class);
//        Dog dog = dogObjectProvider.getIfAvailable(Dog::new);
//    }
//
//}
