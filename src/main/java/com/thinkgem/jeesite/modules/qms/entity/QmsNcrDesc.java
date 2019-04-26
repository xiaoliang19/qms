package com.thinkgem.jeesite.modules.qms.entity;

public class QmsNcrDesc {
    private  Integer id;
    private  String  remarks;   //备注
    private String   defectCode;  //默认信息
    private String   productcount; //产品数量
    private String   ncrid; //外键id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getDefectCode() {
		return defectCode;
	}
	public void setDefectCode(String defectCode) {
		this.defectCode = defectCode;
	}
	public String getProductcount() {
		return productcount;
	}
	public void setProductcount(String productcount) {
		this.productcount = productcount;
	}
	public String getNcrid() {
		return ncrid;
	}
	public void setNcrid(String ncrid) {
		this.ncrid = ncrid;
	}
	
	
    
}
