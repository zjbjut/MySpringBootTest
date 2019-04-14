package com.example.ConfigApplication.observerModel;

import com.example.ConfigApplication.MyStaticTest;

import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {
        Reader reader=new Reader("张三");
        Reader reader1=new Reader("张三1");
        Reader reader2=new Reader("张三2");
        Reader reader3=new Reader("张三3");
        Reader reader4=new Reader("张三4");


        Writer writer=new Writer("作者1");
        Writer writer2=new Writer("作者2");
        WriterManager writerManager=WriterManager.getInstance();

        writerManager.subscribe("张三","作者1");
        writerManager.subscribe("张三2","作者1");
        writerManager.subscribe("张三3","作者1");

        writerManager.subscribe("张三1","作者2");
        writerManager.subscribe("张三4","作者2");

        writer.updataNovel("新城变");
        writer2.updataNovel("盘龙");
//        Integer a=1;
//        Integer b=2;
//        Integer c=3;
//        Integer d=3;
//        Integer e=321;
//        Integer f=321;
//        Long g=3L;
//        int a1=1;
//        System.out.println(a==a1);
//        System.out.println(c==d);
//        System.out.println(e==f);
//        System.out.println(a.equals(a1));
//        System.out.println(c==(a+b));
//        System.out.println(c==(a1+b));
//        System.out.println(c==(b+a1));
//        System.out.println(c.equals(b+a1));
//        System.out.println(g==(a+b));
//        System.out.println(g.equals(d));

//        int[] nums = {4, 1, 2, 1, 2};
//        int res = 0;
//        Map<Integer,Integer> map=new HashMap<>();
//
//        for (int num : nums) {
//            if(map.containsKey(num)){
//                int time=map.get(num)+1;
//                if(time>nums.length/2){
////                    return num;
//                }
//                map.put(num,time);
//            }else {
//                map.put(num,1);
//            }
//        }
    }
}
