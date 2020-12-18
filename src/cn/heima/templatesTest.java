package cn.heima;

import cn.guigu.customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Lynsir
 * @date 2020/12/8 - 18:08
 */
public class templatesTest {

    //模板6：prsf
    private static final customer cust = new customer();
    //变形1：psf
    public static final int num = 10;
    //变形2：psfi
    public static final int num2 = 20;
    //变形3：psfs
    public static final String s = "CHINA";

    public static void main(String[] args) {
        System.out.println("templatesTest.main");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("args = " + args);
        
        int a = 2;
        System.out.println("a = " + a);

        String[] arr = new String[]{"Jerry", "Tom", "Lucy", "Rose"};
        //for:fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



        //变形：增強for快捷鍵iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr:倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //if:ifn
        if (list == null) {

        }
        //if:inn
        if (list != null) {

        }

        //list.nn 和 list.null
        if (list == null) {

        }
        if (list != null) {

        }


    }

}
