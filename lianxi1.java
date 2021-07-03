package edu.xcdq.练习;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/6/30 20:30
 */
public class lianxi1 {
    /*public static void main(String[]args){
        String next;  //标识是否合格
        Scanner input = new Scanner(System.in);
        System.out.println("合格了吗 y/n");
        next = input.next();
        while (!"y".equals(next)){
            System.out.println("上午阅读教材");
            System.out.println("下午上机编程");
            System.out.println("合格了吗");
            next = input.next();
        }
        System.out.println("完成学习任务");
    }*/
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
        do{
            System.out.println("上机编写程序");
            System.out.println("合格了吗");
            answer = input.next();
        }while(!"y".equals(answer));
        System.out.println("恭喜你通过测试");
    }*/
    /*public static void main(String[] args) {
        int score;
        int total;  // 班级总人数
        int num = 0; // 成绩大于或等于80分的人
        Scanner input = new Scanner(System.in);
        System.out.println("输入班级总人数:");
        total = input.nextInt();
        int i=0;
        while(i<total){
            i++;
            System.out.println("请输入第"+i+"位学生的成绩:");
            score=input.nextInt();
            if(score>=80){
                continue;
            }
            num++;
        }
        System.out.println("80分以上的人数是"+num);
        double rate = (double) num/total*100;
        System.out.println("80分以上的学生所占的比例为:"+rate+"%");
    }*/
    /*public static void main(String[] args) {
        int score;
        int sum=0;
        double avg=0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的名字:");
        String name = input.next();
        for (int i=0;i<5;i++){
            System.out.println("请输入5门功课中第"+(i+1)+"门课的成绩");
            score = input.nextInt();
            sum+=score;
        }
        avg=(double)sum/5;
        System.out.println(name+"的平均分是:"+avg);
    }*/
    /*public static void main(String[] args) {
        int i,j;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个值:");
        int val = input.nextInt();
        System.out.println("根据这个值可以输出以下加法表:");
        for (i=0,j=val;i<=val;i++,j--){
            System.out.println(i+"+"+j+"="+(i+j));
        }
    }*/
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] score = new int[4];
        int classnum = 3;
        double num=0.0;  // 成绩总和
        double avg=0.0;  //平均分
        //循环输入学员成绩
        for(int i=0;i<3;i++){
            num=0.0;
            System.out.println("请输入第"+(i+1)+"个班级的成绩");
            for (int j=0;j<score.length;j++){
                System.out.println("请输入第"+(j+1)+"位学员的成绩");
                score[j]= input.nextInt();
                num+=score[j];

            }
            avg=num/score.length;
            System.out.println("第"+(i+1)+"个班的平均分是"+avg);
        }
    }*/
    /*public static void main(String[] args) {
        System.out.println("打印矩形");
        for (int i=0;i<5;i++){

            for (int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
    /*public static void main(String[] args) {
        System.out.println("九九乘法表");
        for (int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }*/
    /*public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }*/

    /*public static void main(String[] args) {
        System.out.println("九九乘法表");
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }
    }*/
    /*public static void main(String[] args) {
        int [] scores = new int[5];
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入五位学员的成绩");
        for (int i=0;i<scores.length;i++){
            scores [i]= input.nextInt();
            sum+=scores[i];
        }
        System.out.println("学生的平均分是"+(double)sum/scores.length);
    }*/
    /*public static void main(String[] args) {
        int [] score = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("请输入五位学员的成绩");
        for (int i=0;i<score.length;i++){
            score[i] = input.nextInt();
        }
        Arrays.sort(score);
        System.out.println("学员成绩按升序排列");
        for (int i=0;i<score.length;i++){
            System.out.println(score[i]);
        }
    }*/
    /*public static void main(String[] args) {
        int [] score = new int[5];
        int max = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入五位学员的成绩");
        for (int i=0;i<score.length;i++){
            score[i] = input.nextInt();
            if(score[i]>max){
                max=score[i];
            }
        }
        System.out.println("考试成绩最高分为"+max);
    }*/
    /*public static void main(String[] args) {
        int [] score = new int[6];
        score[0]=99;
        score[1]=85;
        score[2]=68;
        score[3]=56;
        score[4]=46;
        //获取用户要插入的数值
        Scanner input = new Scanner(System.in);
        System.out.println("请输入新增成绩：");
        int number = input.nextInt();
        //找到number要插入的位置index
        int index=score.length;
        for (int i=0;i<score.length;i++){
            if (number>score[i]){
                index=i;
                break;
            }
        }
        //元素后移
        for (int i=score.length-1;i>index;i--){
            score[i]=score[i-1];  //当list.length-1:5    list[5]=list[4]以此类推
        }
        //在index位置将num插入进来
        score[index]=number;
        System.out.println("插入成绩的下标是:"+index);
        System.out.println("插入值最后的成绩是:");
        for (int i=0;i<score.length;i++){
            System.out.print(score[i]+"\t");
        }
    }*/
    String schoolName;//分校名称
    int classNumber;//教室数目
    int labNumber;//机房数目
    //定义大学分校的方法
    public void showBranch(){
        System.out.println(schoolName+"分校\n"+"配备："+classNumber+"教"+labNumber+"机");
    }
    public static void main(String[] args) {
        lianxi1 branch = new lianxi1();
        System.out.println("-----初始化成员变量前------");
        branch.showBranch();
        branch.schoolName="东南";
        branch.classNumber=20;
        branch.labNumber=20;
        System.out.println("初始化成员变量后");
        branch.showBranch();




    }
}


