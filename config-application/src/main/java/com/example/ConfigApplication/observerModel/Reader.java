package com.example.ConfigApplication.observerModel;

import java.util.Observable;
import java.util.Observer;

public class Reader implements Observer {

    String name;

    public Reader(String name){
        this.name=name;
        WriterManager writerManager=WriterManager.getInstance();
        writerManager.addReader(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Writer writer=(Writer)o;
        System.out.println(name+"发现书籍更新：" + writer.getName()+";于时间"+arg.toString());
    }


}
