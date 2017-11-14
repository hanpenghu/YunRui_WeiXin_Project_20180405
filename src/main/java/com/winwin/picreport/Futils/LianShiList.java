package com.winwin.picreport.Futils;

import java.util.ArrayList;
import java.util.List;

public class LianShiList<T>{
    private List<T> list=new ArrayList<T>();
    public LianShiList<T> setList(T t){
        list.add(t);
        return this;
    }
    public List<T> getList() {
        return list;
    }
}
