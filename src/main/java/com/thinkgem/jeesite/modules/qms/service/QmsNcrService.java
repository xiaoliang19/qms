/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.qms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.opensymphony.module.sitemesh.tapestry.Title;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.common.utils.PageData;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.common.utils.Titileutil;
import com.thinkgem.jeesite.modules.qms.entity.QmsNcr;
import com.thinkgem.jeesite.modules.qms.entity.QmsNcrDesc;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.modules.act.service.ActTaskService;
import com.thinkgem.jeesite.modules.act.utils.ActUtils;
import com.thinkgem.jeesite.modules.qms.dao.QmsNcrDao;

/**
 * 单表生成Service
 * @author xiexiaoliang
 * @version 2019-04-09
 */
@Service
@Transactional(readOnly = true)
public class QmsNcrService extends CrudService<QmsNcrDao, QmsNcr> {
	
	
	@Autowired
	private QmsNcrDao qmsNcrDao;
	@Autowired
	private ActTaskService actTaskService;

	public QmsNcr get(String id) {
		return super.get(id);
	}
	
	public List<QmsNcr> findList(QmsNcr qmsNcr) {
		return super.findList(qmsNcr);
	}
	
	public Page<QmsNcr> findPage(Page<QmsNcr> page, QmsNcr qmsNcr) {
		return super.findPage(page, qmsNcr);
	}
	
	@Transactional(readOnly = false)
	public void save(QmsNcr qmsNcr) {	
		super.save(qmsNcr);
		// 启动流程
		actTaskService.startProcess(ActUtils.PD_TEST_NCR[0], ActUtils.PD_TEST_NCR[1], qmsNcr.getId(), qmsNcr.getCustomerName());
	}
	
	@Transactional(readOnly = false)
	public void delete(QmsNcr qmsNcr) {
		super.delete(qmsNcr);
	}

	public List<QmsNcr> findAll() {
		// TODO Auto-generated method stub
		return super.findList();
	}

	public Page<QmsNcr> findUser(Page<QmsNcr> page, QmsNcr qmsNcr) {
		// 生成数据权限过滤条件（dsf为dataScopeFilter的简写，在xml中使用 ${sqlMap.dsf}调用权限SQL）
		qmsNcr.getSqlMap().put("dsf", dataScopeFilter(qmsNcr.getCurrentUser(), "o", "a"));
		// 设置分页参数
		qmsNcr.setPage(page);
		// 执行分页查询
		page.setList(dao.getList());
		return page;
	}

	public PageData getList(Integer page, Integer rows, QmsNcr qmsNcr) {
		PageHelper.startPage(page,rows);
		List<QmsNcr> list = this.dao.getFindList(qmsNcr);
		PageInfo<QmsNcr> pages = new PageInfo(list);	
		return new PageData(pages.getTotal(),pages.getList());
	}

	public QmsNcr getQmsByQdrId(String qdrId) {
		// TODO Auto-generated method stub
		return dao.getQmsByQdrId(qdrId);
	}

	public PageData qmsNcrDesc(String qdrId) {
		 List<QmsNcrDesc> qmsNcrDesc = dao.qmsNcrDesc(qdrId);
		 PageInfo<QmsNcr> pages = new PageInfo(qmsNcrDesc);
		 PageData pageData = new PageData(pages.getTotal(),pages.getList(),TitleUtil());
		 return pageData;
	}

	public List<QmsNcrDesc> qmsNcrpro(String qdrId) {
		
		 return  dao.qmsNcrDesc(qdrId);
	}
	
	
	
	
	
	private List<Titileutil> TitleUtil() {
		 Titileutil titileutil=new Titileutil("id","编号",200,"center");
		 Titileutil titileutil1=new Titileutil("remarks","备注",250,"center"); 
		 Titileutil titileutil2=new Titileutil("defectCode","缺点代码",250,"center");	 
		 Titileutil titileutil3=new Titileutil("productcount","次品数量",250,"center"); 
		 Titileutil titileutil4=new Titileutil("ncrid","NCR编号",200,"center");	 
		 List<Titileutil> list=new ArrayList();
		 list.add(titileutil);
		 list.add(titileutil1);
		 list.add(titileutil2);
		 list.add(titileutil3);
		 list.add(titileutil4);
		return list;
	}

	

	

	

	

	
	
}