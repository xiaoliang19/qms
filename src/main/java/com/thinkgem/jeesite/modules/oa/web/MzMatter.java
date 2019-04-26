package com.thinkgem.jeesite.modules.oa.web;

import com.thinkgem.jeesite.common.persistence.ActEntity;
import com.thinkgem.jeesite.modules.oa.entity.TestAudit;
import com.thinkgem.jeesite.modules.sys.entity.Office;
import com.thinkgem.jeesite.modules.sys.entity.User;

public class MzMatter  extends ActEntity<TestAudit> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User 	user;	//	归属用户
	private Office 	office;	//	归属部门
	private String  id;
	private String appenDate;
	private String officeText;
	private String depText;
	private String personText;
	private String happenDate;
	private String name;

	private String content;

	
	
   
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Office getOffice() {
		return office;
	}
	public void setOffice(Office office) {
		this.office = office;
	}
	public String getHappenDate() {
		return happenDate;
	}
	public void setHappenDate(String happenDate) {
		this.happenDate = happenDate;
	}
	public String getAppenDate() {
		return appenDate;
	}
	public void setAppenDate(String appenDate) {
		this.appenDate = appenDate;
	}
	public String getOfficeText() {
		return officeText;
	}
	public void setOfficeText(String officeText) {
		this.officeText = officeText;
	}
	public String getDepText() {
		return depText;
	}
	public void setDepText(String depText) {
		this.depText = depText;
	}
	public String getPersonText() {
		return personText;
	}
	public void setPersonText(String personText) {
		this.personText = personText;
	}
	
	
	
}
