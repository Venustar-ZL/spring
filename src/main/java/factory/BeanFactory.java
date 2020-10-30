package factory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/19 17:39
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class BeanFactory {

    // 缓存区，保存已经创建好的对象
    private static Map<String, Object> beanMap = new HashMap<>();

    private static Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
        } catch (IOException e) {
            throw new ExceptionInInitializerError("BeanFactory initialize error, cause : " +  e.getMessage());
        }
    }

    public static Object getBean(String beanName) {
        // 1、紧耦合 不使用
//        return new DemoDaoImpl();

        // 2、使用反射 解决紧耦合
//        try {
//            return (DemoDaoImpl) Class.forName("service.impl.DemoServiceImpl").newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException("DemoDao instantiation error, cause:" + e.getMessage());
//        }
//        try {
//            Class<?> beanClazz = Class.forName(properties.getProperty(beanName));
//            return beanClazz.newInstance();
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", e);
//        } catch (IllegalAccessException | InstantiationException e) {
//            throw new RuntimeException("[" + beanName + "] instantiation error!", e);
//        }

        // 3、为了控制线程并发，引入双重检测锁
        if (!beanMap.containsKey(beanName)) {
            synchronized (BeanFactory.class) {
                if (!beanMap.containsKey(beanName)) {
                    try {
                        Class<?> clazz = Class.forName(properties.getProperty(beanName));
                        return clazz.newInstance();
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", e);
                    } catch (IllegalAccessException | InstantiationException e) {
                        throw new RuntimeException("[" + beanName + "] instantiation error!", e);
                    }
                }
            }
        }
        return beanMap.get(beanName);
    }
}
