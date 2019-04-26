package com.thinkgem.jeesite.common.utils;

public class Titileutil {
   
	private  String  field;
	private  String  title;
	private  Integer width; 
	private  String  align; 
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Titileutil() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Titileutil(String field, String title, Integer width, String align) {
		super();
		this.field = field;
		this.title = title;
		this.width = width;
		this.align = align;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public String getAlign() {
		return align;
	}
	public void setAlign(String align) {
		this.align = align;
	}
	
}
