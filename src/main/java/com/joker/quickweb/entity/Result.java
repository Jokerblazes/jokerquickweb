package com.joker.quickweb.entity;

public class Result<T> {
	private T data;
	private int flag;
	private String msg;
	
	public Result(T data,int flag,String msg) {
		this.data = data;
		this.flag = flag;
		this.msg = msg;
	}
	
	public Result<T> buildData(T data) {
		this.data = data;
		if (data != null) {
			this.flag = 1;
			this.msg = "获取数据成功！";
		} else {
			this.msg = "获取数据失败！";
		}
		return this;
	}
	
	public Result<T> buildFlag(int flag) {
		this.flag = flag;
		if (flag == 0) 
			this.msg = "失败！";
		else {
			this.msg = "成功！";
		}
		return this;
	}
	
	public Result() {}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
