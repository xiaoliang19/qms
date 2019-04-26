/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.sys.entity.Expenseclaimdetails;

/**
 * 报销记录DAO接口
 * @author xie
 * @version 2019-03-26
 */
@MyBatisDao
public interface ExpenseclaimdetailsDao extends CrudDao<Expenseclaimdetails> {
	
}