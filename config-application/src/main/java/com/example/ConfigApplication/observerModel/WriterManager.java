package com.example.ConfigApplication.observerModel;

import java.util.HashMap;
import java.util.Map;

public class WriterManager {
    private Map<String, Writer> writers=new HashMap<>();
    private Map<String, Reader> readers=new HashMap<>();
    public void subscribe(String rederName,String writerName){
        Writer writer=writers.get(writerName);
        Reader reader=readers.get(rederName);
        writer.addObserver(reader);
    }

    public void unsubscribe(String rederName,String writerName){
        Writer writer=writers.get(writerName);
        Reader reader=readers.get(rederName);
        writer.deleteObserver(reader);
    }

    public void addWriter(Writer writer){
        writers.put(writer.getName(),writer);
    }
    public void addReader(Reader reader){
        readers.put(reader.getName(),reader);
    }

    //单例
    private WriterManager(){}

    public static WriterManager getInstance(){
        return WriterManagerInstance.instance;
    }
    private static class WriterManagerInstance{

        private static WriterManager instance = new WriterManager();

    }
}
