package com.bai.bean;

import java.util.ArrayList;

public class MyJava {
    //main方法快捷键psvm
    public static void main(String[] args) {
        System.out.println("输出的快捷键是sout");
        String name = "白某";
        System.out.println("name = " + name);//soutv可以显示变量
        System.out.println("MyJava.main");//soutm是输出方法的名称
        System.out.println("args = [" + args + "]");//soutp是输出方法的参数
        int age = 17;
        //如果小于18就显示未成年
        if (age <18) {  //if的快捷叫做ifn
            System.out.println("此人未成年");
        }
        ArrayList<String> strings = new ArrayList<String>();//万能快捷键alt+enter
        strings.add("唐三藏");         //ctrl+d快速复制一行
        strings.add("唐1藏");         //ctrl+y是快速删除一行
        strings.add("唐2藏");         //ctrl+z是一步撤销    ctrl+shift+z是多步骤撤销
        strings.add("唐3藏");         //多行编辑  alt+鼠标
        for (String string : strings) {     //遍历循环的快捷键   iter
            System.out.println("string = " + string);
        }

        //创建电脑
        Computer c1 = new Computer();
        c1.setPrice(5555.0D);
        c1.setColor("黑色");
        c1.setTypeName("拯救者");
        System.out.println("c1 = " + c1);
        Computer c2 = new Computer();
        c2.setPrice(5555.0D);
        c2.setColor("黑色");
        c2.setTypeName("拯救者");
        System.out.println("c2 = " + c2);
        System.out.println(c1 == c2);
        Phone p1 = Phone.getInstance();
        Phone p2 = Phone.getInstance();
        System.out.println(p1==p2);
        //单例模式分为：饿汉，懒汉
    }
}
