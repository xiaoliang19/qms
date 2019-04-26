/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.qms.entity;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.ActEntity;
import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.common.utils.excel.annotation.ExcelField;

/**
 * 单表生成Entity
 * @author xiexiaoliang
 * @version 2019-04-09
 */
public class QmsNcr extends ActEntity<QmsNcr>{
	
	private static final long serialVersionUID = 1L;
	private String qdrId;		// NCR编号
	private String ncrCode;		// 生成流水码（N20190131001)
	private String customerName;		// 客户名称
	private String deviceNo;		// 产品型号
	private String lotNo;		// 批号
	private String issueDept;		// 发现工序
	private String responseDept;		// 责任工序
	private String totalQty;		// 总数量
	private String sampleQty;		// 抽样数量
	private String machineNo;		// 机号
	private String defectiveCount;		// 次品数量
	private String qcuserId;		// 品管员工号
	private String abiuserId;		// 发现者
	private String abnormalDate;		// 时间
	private String proDispositionMtd;		// 产品处理方法
	private String proFillPid;		// 产品处理方法填写者
	private String proFillTime;		// 产品处理填写时间
	private String reaAnPid;		// 原因分析填写者
	private String reaAnTime;		// 原因分析填写时间
	private String corAc;		// 纠正措施
	private String corAcPid;		// 纠正措施填写者
	private String corAcTime;		// 纠正措施填写时间
	private String dcrReId;		// 重检结果    fk
	private String xgQdrId;		// 相关QDRid
	private String qdrCode;		// 相关QDRcode
	private String flag;		// 是否保留管理员权限
	private String findData;		// 发现时间
	private String doneData;		// 结束时间
	private String status;		// 状态
	
	public QmsNcr() {
		super();
	}

	public QmsNcr(String id){
		super(id);
	}

	@Length(min=1, max=64, message="NCR编号长度必须介于 1 和 64 之间")
	public String getQdrId() {
		return qdrId;
	}

	public void setQdrId(String qdrId) {
		this.qdrId = qdrId;
	}
	
	@Length(min=0, max=64, message="生成流水码（N20190131001)长度必须介于 0 和 64 之间")
	@ExcelField(title="NCR编号", align=2, sort=40)
	public String getNcrCode() {
		return ncrCode;
	}

	public void setNcrCode(String ncrCode) {
		this.ncrCode = ncrCode;
	}
	
	@Length(min=0, max=65, message="客户名称长度必须介于 0 和 65 之间")
	@ExcelField(title="客户名称", align=2, sort=40)
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	@Length(min=0, max=66, message="产品型号长度必须介于 0 和 66 之间")
	@ExcelField(title="产品型号", align=2, sort=40)
	public String getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	
	@Length(min=0, max=67, message="批号长度必须介于 0 和 67 之间")
	@ExcelField(title="批号", align=2, sort=40)
	public String getLotNo() {
		return lotNo;
	}

	public void setLotNo(String lotNo) {
		this.lotNo = lotNo;
	}
	
	@Length(min=0, max=68, message="发现工序长度必须介于 0 和 68 之间")
	@ExcelField(title="发现序号", align=2, sort=40)
	public String getIssueDept() {
		return issueDept;
	}

	public void setIssueDept(String issueDept) {
		this.issueDept = issueDept;
	}
	
	@Length(min=0, max=69, message="责任工序长度必须介于 0 和 69 之间")
	@ExcelField(title="责任工序", align=2, sort=40)
	public String getResponseDept() {
		return responseDept;
	}

	public void setResponseDept(String responseDept) {
		this.responseDept = responseDept;
	}
	
	@Length(min=0, max=70, message="总数量长度必须介于 0 和 70 之间")
	@ExcelField(title="次品数量", align=2, sort=40)
	public String getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(String totalQty) {
		this.totalQty = totalQty;
	}
	
	@Length(min=0, max=71, message="抽样数量长度必须介于 0 和 71 之间")
	public String getSampleQty() {
		return sampleQty;
	}

	public void setSampleQty(String sampleQty) {
		this.sampleQty = sampleQty;
	}
	
	@Length(min=0, max=72, message="机号长度必须介于 0 和 72 之间")
	public String getMachineNo() {
		return machineNo;
	}

	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}
	
	@Length(min=0, max=73, message="次品数量长度必须介于 0 和 73 之间")
	
	public String getDefectiveCount() {
		return defectiveCount;
	}

	public void setDefectiveCount(String defectiveCount) {
		this.defectiveCount = defectiveCount;
	}
	
	@Length(min=0, max=74, message="品管员工号长度必须介于 0 和 74 之间")
	public String getQcuserId() {
		return qcuserId;
	}

	public void setQcuserId(String qcuserId) {
		this.qcuserId = qcuserId;
	}
	
	@Length(min=0, max=76, message="发现者长度必须介于 0 和 76 之间")
	public String getAbiuserId() {
		return abiuserId;
	}

	public void setAbiuserId(String abiuserId) {
		this.abiuserId = abiuserId;
	}
	
	@Length(min=0, max=77, message="时间长度必须介于 0 和 77 之间")
	public String getAbnormalDate() {
		return abnormalDate;
	}

	public void setAbnormalDate(String abnormalDate) {
		this.abnormalDate = abnormalDate;
	}
	
	public String getProDispositionMtd() {
		return proDispositionMtd;
	}

	public void setProDispositionMtd(String proDispositionMtd) {
		this.proDispositionMtd = proDispositionMtd;
	}
	
	@Length(min=0, max=79, message="产品处理方法填写者长度必须介于 0 和 79 之间")
	public String getProFillPid() {
		return proFillPid;
	}

	public void setProFillPid(String proFillPid) {
		this.proFillPid = proFillPid;
	}
	
	@Length(min=0, max=80, message="产品处理填写时间长度必须介于 0 和 80 之间")
	public String getProFillTime() {
		return proFillTime;
	}

	public void setProFillTime(String proFillTime) {
		this.proFillTime = proFillTime;
	}
	
	@Length(min=0, max=82, message="原因分析填写者长度必须介于 0 和 82 之间")
	public String getReaAnPid() {
		return reaAnPid;
	}

	public void setReaAnPid(String reaAnPid) {
		this.reaAnPid = reaAnPid;
	}
	
	@Length(min=0, max=83, message="原因分析填写时间长度必须介于 0 和 83 之间")
	public String getReaAnTime() {
		return reaAnTime;
	}

	public void setReaAnTime(String reaAnTime) {
		this.reaAnTime = reaAnTime;
	}
	
	@Length(min=0, max=84, message="纠正措施长度必须介于 0 和 84 之间")
	public String getCorAc() {
		return corAc;
	}

	public void setCorAc(String corAc) {
		this.corAc = corAc;
	}
	
	@Length(min=0, max=85, message="纠正措施填写者长度必须介于 0 和 85 之间")
	public String getCorAcPid() {
		return corAcPid;
	}

	public void setCorAcPid(String corAcPid) {
		this.corAcPid = corAcPid;
	}
	
	@Length(min=0, max=86, message="纠正措施填写时间长度必须介于 0 和 86 之间")
	public String getCorAcTime() {
		return corAcTime;
	}

	public void setCorAcTime(String corAcTime) {
		this.corAcTime = corAcTime;
	}
	
	@Length(min=0, max=87, message="重检结果    fk长度必须介于 0 和 87 之间")
	public String getDcrReId() {
		return dcrReId;
	}

	public void setDcrReId(String dcrReId) {
		this.dcrReId = dcrReId;
	}
	
	@Length(min=0, max=88, message="相关QDRid长度必须介于 0 和 88 之间")
	public String getXgQdrId() {
		return xgQdrId;
	}

	public void setXgQdrId(String xgQdrId) {
		this.xgQdrId = xgQdrId;
	}
	
	@Length(min=0, max=89, message="相关QDRcode长度必须介于 0 和 89 之间")
	public String getQdrCode() {
		return qdrCode;
	}

	public void setQdrCode(String qdrCode) {
		this.qdrCode = qdrCode;
	}
	
	@Length(min=0, max=90, message="是否保留管理员权限长度必须介于 0 和 90 之间")
	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	@Length(min=0, max=255, message="发现时间长度必须介于 0 和 255 之间")
	@ExcelField(title="发现时间", align=2, sort=40)
	public String getFindData() {
		return findData;
	}

	public void setFindData(String findData) {
		this.findData = findData;
	}
	
	@Length(min=0, max=255, message="结束时间长度必须介于 0 和 255 之间")
	@ExcelField(title="结束时间", align=2, sort=40)
	public String getDoneData() {
		return doneData;
	}

	public void setDoneData(String doneData) {
		this.doneData = doneData;
	}
	
	@Length(min=0, max=255, message="状态长度必须介于 0 和 255 之间")
	@ExcelField(title="状态", align=2, sort=40)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}