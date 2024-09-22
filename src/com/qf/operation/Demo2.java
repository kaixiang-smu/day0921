package com.qf.operation;

public class Demo2 {
    public static void main(String[] args) {
        /**
         * & 与，和的意思
         * 写法：
         *   Boolean 变量 = 布尔表达式1 & 布尔表达式2；
         * 作用：
         *   判断两边式子，整体结果由两边式子决定
         *   全对才对，一错就错
         *   简单点，就是条件同时成立才可以！
         *   例如登陆时要求用户名和密码同时正确才算成功
         */
        System.out.println(1>0 & 1>0);
        System.out.println(1>0 & 1<0);
        System.out.println(1<0 & 1>0);
        System.out.println(1<0 & 1<0);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        /**
         * | 或
         * 一对就对，全错才错
         * 简单点，有一个条件成立，结果就对！
         */
        System.out.println(1>0 | 1>0);
        System.out.println(1>0 | 1<0);
        System.out.println(1<0 | 1>0);
        System.out.println(1<0 | 1<0);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        /**
         * ！ 非，取反，对true和false取反的
         *
         */
        System.out.println(!true);
        System.out.println(!(1<0));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        /**
         * &&：短路与
         * 因为一错就错，全对才对
         * 所以当第一个式子结果为错时，已经决定整体结果
         * 后续的式子不再执行，即短路了
         * 以后用与都用短路与&&，不用&
         */
        int i = 1;
        System.out.println(1<0 && ++i>0);
        System.out.println(i);
        System.out.println(1<0 && 1/0>0);
        /**
         * || 或运算是一对即对，全错才错
         * 如果第一个式子是对的，后面的式子不再执行
         * 以后用或都用短路或||，不用|
         */
        System.out.println(1>0 || 1/0>0);
        // 定义一个int变量，判断该数是否既能被5整除又能被7整除
        int num = 15;
        boolean r1 = num%5==0 && num%7==0;
        System.out.println("该数是否既能被5整除又能被7整除?"+r1);
    }
}
