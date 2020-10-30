package dao.impl;

import dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/19 14:17
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> finaAll() {
        return Arrays.asList("aa", "bb", "cc");
    }
}
