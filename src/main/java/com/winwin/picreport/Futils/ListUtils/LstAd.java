package com.winwin.picreport.Futils.ListUtils;

import java.util.LinkedList;
import java.util.List;

public class LstAd {
    private List list =new LinkedList();
    public static LstAd g(){
        return new LstAd();
    }

    public LstAd ad(Object ob){
        list.add(ob);
        return this;
    }

    public List gt(){
        return list;
    }
}
