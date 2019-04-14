package com.example.ConfigApplication.observerModel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;

public class Writer extends Observable {
    private String name;
    private String lastNovel;
    public Writer(String name){
        this.name=name;
        WriterManager writerManager=WriterManager.getInstance();
        writerManager.addWriter(this);
    }
    public void updataNovel(String bookname){
        System.out.println("作者的小说更新了："+bookname);
        setChanged();
        lastNovel=bookname;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String time=df.format(new Date()).toString();// new Date()为获取当前系统时间
        notifyObservers(time);
    }

    public String getName() {
        return name;
    }

    public String getLastNovel() {
        return lastNovel;
    }
}
