package com.qf.operation;
// 演示三目运算
public class Demo3 {
    public static void main(String[] args) {
        /**
         * 数据类型 变量名 = 布尔表达式？表达式1：表达式2；
         * 三目运算？后的两个式子类型要一致
         */
        int r1 = 1>0?1:0;
        int r2 = 1<0?1:0;
        System.out.println(r1);
        System.out.println(r2);
        int r3 = 1>0?1+1:1-1;
        System.out.println(r3);
        String r4 = 1>0?"1大":"0大";
        System.out.println(r4);
        boolean r5 = 1>0?true:false;
        System.out.println(r5);
        // 定义两个变量，输出其中的较大者
        int i = 1;
        int j = 2;
        System.out.println(i>j?i:j);
        // 定义三个变量，输出其中的较大者
        int x = 1;
        int y = 2;
        int z = 3;
//        int r6 = x>y?x:y;
//        System.out.println(r6>z?r6:z);
        String r6 = x>y?(x>z?"x最大":"z最大"):(y>z?"y最大":"z最大");
        System.out.println(r6);
    }
}
