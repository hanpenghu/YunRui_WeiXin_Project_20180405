package com.winwin.picreport.Futils;

import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Edto.PrdtSamp1;

import java.util.ArrayList;
import java.util.List;

public class FenYe {
	private List<PrdtSamp> prdtSampList=new ArrayList<>();//第一次需要传入的数据
	private Integer dangQianYe;//当前页的页面传过来
	private Integer meiYeXianShiShu=10;
	private Integer zongYeShu;
	private Integer zongJiLuShu;
	private PrdtSamp1 prdtSamp1;


	public PrdtSamp1 getPrdtSamp1() {
		return prdtSamp1;
	}

	public FenYe setPrdtSamp1(PrdtSamp1 prdtSamp1) {
		this.prdtSamp1 = prdtSamp1;
		return this;
	}

	public List<PrdtSamp> getPrdtSampList() {
		return prdtSampList;
	}

	public FenYe setPrdtSampList(List<PrdtSamp> prdtSampList) {
		this.prdtSampList = prdtSampList;
		return this;
	}

	public Integer getDangQianYe() {
		return dangQianYe;
	}
	public void setDangQianYe(Integer dangQianYe) {
		this.dangQianYe = dangQianYe;
	}
	public Integer getMeiYeXianShiShu() {
		if(!NotEmpty.notEmpty(meiYeXianShiShu)||meiYeXianShiShu==0){
			meiYeXianShiShu=10;
		}
		return meiYeXianShiShu;
	}
	public void setMeiYeXianShiShu(Integer meiYeXianShiShu) {
		if(!NotEmpty.notEmpty(meiYeXianShiShu)||meiYeXianShiShu==0){
			meiYeXianShiShu=10;
		}
		this.meiYeXianShiShu = meiYeXianShiShu;
	}
	public Integer getZongYeShu() {
		this.setZongYeShu();
		return this.zongYeShu;
	}
	
	public void setZongYeShu() {
		if(this.zongJiLuShu%this.meiYeXianShiShu==0){
			this.zongYeShu=this.zongJiLuShu/this.meiYeXianShiShu;
		}else{
			this.zongYeShu=this.zongJiLuShu/this.meiYeXianShiShu+1;
		}
	}
	
	public Integer getZongJiLuShu() {
		return zongJiLuShu;
	}
	public void setZongJiLuShu(Integer zongJiLuShu) {
		this.zongJiLuShu = zongJiLuShu;
		//顺便把总页数也设置一下
		this.setZongYeShu();
	}




	@Override
	public String toString() {
		return "FenYe [dangQianYe=" + dangQianYe + ", meiYeXianShiShu=" + meiYeXianShiShu + ", zongYeShu=" + zongYeShu
				+ ", zongJiLuShu=" + zongJiLuShu + "]";
	}



}
