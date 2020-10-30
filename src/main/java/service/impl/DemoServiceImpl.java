package service.impl;

import dao.DemoDao;
import factory.BeanFactory;
import service.DemoService;

import java.util.List;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/19 14:15
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class DemoServiceImpl implements DemoService {

//    private DemoDao demoDao = new DemoDaoImpl();

    DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");


    @Override
    public List<String> findAll() {
        return demoDao.finaAll();
    }
}
