package com.thinkgem.jeesite.common.utils;
import java.util.List;

public class PageData {
	private long total;
	private List<?> rows;
	private List<?> title;
	
	
	
	public PageData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public PageData(long total, List<?> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}


   
	
	
	public PageData(long total, List<?> rows, List<?> title) {
		super();
		this.total = total;
		this.rows = rows;
		this.title = title;
	}



	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	public List<?> getTitle() {
		return title;
	}
	public void setTitle(List<?> title) {
		this.title = title;
	}
	
	
	
}
