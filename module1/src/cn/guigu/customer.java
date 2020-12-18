package cn.guigu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class customer extends Manager {

    private static int num;



    @Override
    public void method() {
        System.out.println("客户当经理办事！");
    }

    public static void main(String[] args) {
        getList();


       // method1();
    }

    private static void getList() {
        //region Description
        List list1 = new ArrayList();
        list1.add("ab");
        Date date = new Date();
        //endregion
        list1.add(0, 123);
        int num1 = 10;
        System.out.println("num1 = " + num1);


    }

    public static void method1() {

        num = 10;
        int size = 8;

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}