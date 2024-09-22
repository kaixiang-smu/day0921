package com.qf.ctrl;

public class Demo4 {
    public static void main(String[] args) {
        /**
         * while(条件){
         *    // 执行语句
         * }
         * ---------------
         * 条件内写的是布尔表达式
         * 执行流程：
         * 1）执行到while时，先判断条件
         * 2）如果条件为true，执行{}内语句
         * 3）执行完又回头继续判断条件
         * 4）如果条件为true，执行{}内语句，执行完继续回头执行条件判断...
         * 5）只有当while后的条件是false时才会退出循环
         */
        // 死循环，慎用
//        while (true){
//            System.out.println("我爱Java");
//        }
        /**
         * 循环有四要素：
         * 1）循环初始值
         * 2）循环控制条件
         * 3）循环内容
         * 4）循环迭代
         */
        int i = 1;
        while (i<=10){
            System.out.println("我爱Java");
            i++;
        }
        // 输出1-10
        int j = 1;
        while (j<=10){
            System.out.println(j);
            j++;
        }
        // 输出10-1
        int k = 1;
        while (k<=10){
            System.out.print(11-k+" ");
            k++;
        }
        System.out.println("\r\n-------------------");
        // 输出1-100，每10个换一行
        int x = 1;
        while (x<=100){
            System.out.print(x+"\t");
            if(x%10==0){
                System.out.println();
            }
            x++;
        }
        System.out.println("-----------------------");
        int y = 1;
        while (y<=100){
            if(y%2==0){
                System.out.print(y+" ");
            }
            y++;
        }
        System.out.println("\r\n-----------------------");
        int z = 2;
        while (z<=100){
            System.out.print(z+" ");
            z+=2;
        }
        System.out.println("\r\n-----------------------");
        int m = 1;
        int s = 0;
        while (m<=10){
            s+=m;
            m++;
        }
        System.out.println(s);
    }
}
