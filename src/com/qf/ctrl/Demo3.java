package com.qf.ctrl;

public class Demo3 {
    public static void main(String[] args) {
        /**
         * 执行流程：
         * 1）遇到switch，拿着其后的值与下方case进行等值比较
         * 2）如果与case后的值相等，就执行case内的语句
         *   遇到break，结束当前switch执行
         * 3）如果case后的不相等，与下一个case比较
         * 4）如果所有case都不相等，直接执行default
         */
        int week = 10;
        switch (week){// 此处只能写byte short int char String和枚举
            case 1:// case后写定值，常量，其后一定是冒号
                System.out.println("Monday");// 执行语句
                break;// 可加可不加，break破坏switch执行
                      // 如果没有break，就不打断执行，会造成case击穿
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
