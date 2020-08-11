package com.xiaoshu.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class GoodsVo extends Goods{

	private String tname;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String createtime1;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String createtime2;
	private Integer num;
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getCreatetime1() {
		return createtime1;
	}
	public void setCreatetime1(String createtime1) {
		this.createtime1 = createtime1;
	}
	public String getCreatetime2() {
		return createtime2;
	}
	public void setCreatetime2(String createtime2) {
		this.createtime2 = createtime2;
	}
	@Override
	public String toString() {
		return "GoodsVo [tname=" + tname + ", createtime1=" + createtime1 + ", createtime2=" + createtime2 + ", num="
				+ num + "]";
	}
	
	
}