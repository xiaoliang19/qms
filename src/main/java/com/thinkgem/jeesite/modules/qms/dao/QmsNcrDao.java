/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.qms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.qms.entity.QmsNcr;
import com.thinkgem.jeesite.modules.qms.entity.QmsNcrDesc;

/**
 * 单表生成DAO接口
 * @author xiexiaoliang
 * @version 2019-04-09
 */
@MyBatisDao
public interface QmsNcrDao extends CrudDao<QmsNcr> {
   
	@Select("select * from qms_ncr")
	List<QmsNcr> getList();
	
	
	/**
	 *  查询
	 * */

	List<QmsNcr> getFindList(QmsNcr qmsNcr);
	
	

    @Select("SELECT * from qms_ncr q WHERE q.QDR_ID=#{qdrId}")
	QmsNcr getQmsByQdrId(String qdrId);


    @Select("SELECT * from QMS_NCR_desc  d where d.ncrid=#{qdrId}")
	List<QmsNcrDesc> qmsNcrDesc(String qdrId);
	
}