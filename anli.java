package edu.xcdq.练习;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/7/1 8:46
 */
public class anli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user = new User();
        user.name="张三";
        user.pwd="123";
        user.money=100;
        System.out.println("--------------------------");
        System.out.println("\t欢迎登录前程ATM系统");
        System.out.println("--------------------------");
        boolean blog = false;
        String [] text= new String[50];
        for (int i = 3; i > 0; i--) {
            System.out.println("请输入用户名:");
            String user1 = input.next();
            System.out.println("请输入用户密码:");
            String pwd1 = input.next();
            if (user.name.equals(user1) && user.pwd.equals(pwd1)) {
                blog=true;
                System.out.println("登录成功");
                int number=0;
                do{
                    System.out.println("---------------------");
                    System.out.println("1、查询\n2、存款\n3、取款\n4、交易信息\n5、退出");
                    System.out.println("---------------------");
                    System.out.println("请选择你要执行的操作");
                    number = input.nextInt();
                switch (number) {
                    case 1:
                        user.searchMoney();
                        break;
                    case 2:
                        System.out.println("请输入你要存入的金额:");
                        float savemoney = input.nextFloat();
                        if (savemoney > 1000) {
                            System.out.println("单次最大存款金额不能大于1000元");
                            savemoney = 0;
                        } else if (savemoney < 0) {
                            System.out.println("存款金额不能为负数");
                            savemoney = 0;
                        } else if (savemoney % 100 != 0) {
                            System.out.println("不能存零钱");
                            savemoney = 0;
                        } else {
                            System.out.println("存款成功");
                            user.money += savemoney;
                            System.out.println("您的余额为:" + user.money);
                            for (int j = 0; j < text.length; j++) {
                                if (text[j] == null) {
                                    text[j] = "存" + savemoney;
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        System.out.println("请输入你要取出的金额:");
                        float getmoney = input.nextFloat();
                        if (getmoney > 1000) {
                            System.out.println("单次取款金额不能大于1000元");
                            getmoney = 0;
                        } else if (getmoney % 100 != 0) {
                            System.out.println("不能取零钱");
                            getmoney = 0;
                        } else if (getmoney < 0) {
                            System.out.println("不能取负数的钱");
                            getmoney = 0;
                        } else if (getmoney > user.money) {
                            System.out.println("余额不足");
                            getmoney = 0;
                        } else {
                            System.out.println("取款成功");
                            user.money -= getmoney;
                            System.out.println("您的余额为:" + user.money);
                            for (int j = 0; j < text.length; j++) {
                                if (text[j] == null) {
                                    text[j] = "取" + getmoney;
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        System.out.println("交易信息");
                        for (int j = 0; j < text.length; j++) {
                            if (text[j] != null) {
                                System.out.println(text[j]);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("退出成功");
                        break;
                }
                }while(number !=5);

            }else{
                if(i==1){
                    System.out.println("你的卡被吞，找相关工作人员");
                }else{
                    System.out.println("用户名或密码错误！今日剩余次数"+(i-1));
                }

            }
        }
    }
}