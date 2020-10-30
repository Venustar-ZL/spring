package test;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/29 11:01
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        int[] array = new int[] {8, 2, 4, 6, 3, 1, 5, 7, 9};
        int[] res = sort(array);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }


    public static int[] sort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for(int j = 0; j < len - 1 -i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
