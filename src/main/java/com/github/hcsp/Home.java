package com.github.hcsp;

import com.github.hcsp.pet.Cat;
// We want to create two cats, not one cat with two references
// Fix createTwoCats() method to make the problem output "1: Cat(Tom), 2: Cat(Tom),
// cat1==cat2: false"
// 我们希望创建两只猫，而不是一只猫的两个引用
// 请修改createTwoCats()方法，使得程序输出"1: Cat(Tom), 2: Cat(Tom), cat1==cat2: false"
public class Home {                            //Home类
    public static Cat cat1;                   //公开的静态成员变量cat1
    public static Cat cat2;                    //公开的静态成员变量cat2

    public static void main(String[] args) {            //程序入口
        createTwoCats();                             //函数的调用

        System.out.println("1: " + cat1 + ", 2:" + cat2 + ", cat1==cat2: " + (cat1 == cat2));
    }                                                 //输出

    public static void createTwoCats() {            //函数的声明
        cat1 = new Cat("Tom");
        cat2 = new Cat("Tom");
        if (cat1 == cat2) {
            System.out.println("false");
        } else {
        }
    }
}
