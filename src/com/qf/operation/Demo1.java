package com.qf.operation;
// 演示关系运算
public class Demo1 {
    public static void main(String[] args) {
        /**
         *  > >= < <= == !=
         *  结果都是布尔型
         */
        int a = 1;
        int b = 2;
        boolean r1 = a > b;
        System.out.println(r1);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        // 以上几个符号（> >= < <=）两边都是数字

        // 判断两个值是否相等，使用==
        System.out.println(a==b);
        // 判断两个值是否不相等，使用！=
        System.out.println(a!=b);
        // 以上两个符号（== !=）这两边可以是数字，也可以是字符串
        String name1 = "张三";
        String name2 = "张小三";
        System.out.println(name1 == name2);
        System.out.println(name1 != name2);
        // 总结：将来这些关系运算都是要配合if，elseif，以及循环等使用
    }
}
