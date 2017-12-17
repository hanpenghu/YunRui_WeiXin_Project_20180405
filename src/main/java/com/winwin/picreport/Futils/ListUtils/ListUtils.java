package com.winwin.picreport.Futils.ListUtils;
import java.util.List;

public class ListUtils<T> {

    public static ListUtils g(){
        return new ListUtils();
    }

    public  ListUtils<T> add(T t,List<T> list){
        list.add(t);
        return this;
    }


//    public static void main(String[]args){
//        List<String> attachList =new LinkedList<String>();
//        new ListUtils<String>()
//                .add("1",attachList)
//                .add("2",attachList);
//
//        System.out.println(attachList);
//    }


}
