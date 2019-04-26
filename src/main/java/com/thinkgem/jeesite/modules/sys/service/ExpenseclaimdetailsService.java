/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.sys.entity.Expenseclaimdetails;
import com.thinkgem.jeesite.modules.sys.dao.ExpenseclaimdetailsDao;

/**
 * 报销记录Service
 * @author xie
 * @version 2019-03-26
 */
@Service
@Transactional(readOnly = true)
public class ExpenseclaimdetailsService extends CrudService<ExpenseclaimdetailsDao, Expenseclaimdetails> {

	
	public Expenseclaimdetails get(String id) {
		Expenseclaimdetails expenseclaimdetails = super.get(id);
		return expenseclaimdetails;
	}
	
	public List<Expenseclaimdetails> findList(Expenseclaimdetails expenseclaimdetails) {
		return super.findList(expenseclaimdetails);
	}
	
	public Page<Expenseclaimdetails> findPage(Page<Expenseclaimdetails> page, Expenseclaimdetails expenseclaimdetails) {
		return super.findPage(page, expenseclaimdetails);
	}
	
	@Transactional(readOnly = false)
	public void save(Expenseclaimdetails expenseclaimdetails) {
		super.save(expenseclaimdetails);
	}
	
	@Transactional(readOnly = false)
	public void delete(Expenseclaimdetails expenseclaimdetails) {
		super.delete(expenseclaimdetails);
	}
	
}