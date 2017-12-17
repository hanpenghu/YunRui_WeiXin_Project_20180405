package com.winwin.picreport.Futils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Collection;
import java.util.Map;

public class NotEmpty {


	public static boolean empty(Object ob){

		if(notEmpty(ob)){
			return false;
		}else{
			return true;
		}

	}




	public static boolean notEmpty(Object ob){
		if(ob==null){
			return false;
		}else{
			if(ob instanceof String){
				if("".equals(ob)){return false;}else{return true;}
			}else if(ob instanceof Collection){
				if(((Collection) ob).size()>0){return true;}else{return false;}
			}else if(ob instanceof Map){
				if(((Map) ob).size()>0){return true;}else{return false;}
			}else if(ob instanceof JSONObject){
				if(((JSONObject) ob).isEmpty()){return false;}else{
					if(((JSONObject) ob).size()==0){return false;}else{return true;}
				}
			}else if(ob instanceof JSONArray){
				if(((JSONArray) ob).isEmpty()){return false;}else{
					if(((JSONArray) ob).size()==0){return false;}else{return true;}
				}
			}else{return true;}
		}
	}
	
	public static boolean allNotEmpty(Object[ ]obs){
		for(Object ob:obs){
			if(!notEmpty(ob)){return false;}
		}
		return true;
	}

	public static boolean allEmpty(Object[ ]obs){
		for(int i=1;i<=obs.length;i++){
			/**
			 *循环所有,如果有一个不是空的,就代表有不是空的,不是所有是空的,返回false
			 * */
			if(notEmpty(obs[i])){
				return false;
			}
			/**
			 *如果到了最后一个,也是空的,就返回true,代表所有的都空了
			 * */
			if(empty(obs[i])&&i==obs.length){
				return true;
			}
		}
		return false;
	}


	public static boolean haveSomeEmpty(Object[ ]obs){
		for(Object ob:obs){
			if(empty(ob)){
				return true;
			}
		}
		return false;
	}



}
