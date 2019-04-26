/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.qms.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.DateUtils;
import com.thinkgem.jeesite.common.utils.PageData;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.common.utils.excel.ExportExcel;
import com.thinkgem.jeesite.modules.qms.entity.QmsNcr;
import com.thinkgem.jeesite.modules.qms.entity.QmsNcrDesc;
import com.thinkgem.jeesite.modules.qms.service.QmsNcrService;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
/**
 * 单表生成Controller
 * 
 * @author xiexiaoliang
 * @version 2019-04-09
 */
@Controller
@RequestMapping(value = "${adminPath}/qms/qmsNcr")
public class QmsNcrController extends BaseController {

	@Autowired
	private QmsNcrService qmsNcrService;

	@ModelAttribute
	public QmsNcr get(@RequestParam(required = false) String id) {
		QmsNcr entity = null;
		if (StringUtils.isNotBlank(id)) {
			entity = qmsNcrService.get(id);
		}
		if (entity == null) {
			entity = new QmsNcr();
		}
		return entity;
	}

	@RequiresPermissions("qms:qmsNcr:view")
	@RequestMapping(value = { "list", "" })
	public String list() {


		return "modules/qms/qmsNcrList";
	}

	@RequestMapping("findQmsList")
	public String findQmsList(String qdrId,Model model) {
		return "modules/qms/qmsNcrForm";
	}
	@RequestMapping("qmsNcrDesc")
	@ResponseBody
	public  HashMap<String, Object> qmsNcrDesc(QmsNcr qmsNcr1,String qdrId,Model model) {

		QmsNcr qmsNcr = qmsNcrService.getQmsByQdrId(qdrId);
		PageData pageData=qmsNcrService.qmsNcrDesc(qdrId);
		List<QmsNcrDesc> qmsNcrpro=qmsNcrService.qmsNcrpro(qdrId);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("qms", qmsNcr);
		map.put("qmslist", pageData);
		map.put("qmsNcrpro",qmsNcrpro);
		return map;
	}
	
	@RequiresPermissions("qms:qmsNcr:view")
	@RequestMapping(value = "qmspro")
	public String qmspro(QmsNcr qmsNcr,Model model,HttpServletRequest request){
	String  view="qmsproList" ;
	    
		/*  // 查看审批申请单
	 		if (StringUtils.isNotBlank(qmsNcr.getId())){//.getAct().getProcInsId())){

	 			// 环节编号
	 			String taskDefKey = qmsNcr.getAct().getTaskDefKey();
	 			
			// 查看工单
	 			if(qmsNcr.getAct().isFinishTask()){
	 				view = "testAuditView";
	 			}
	 			// 修改环节
	 			else if ("modify".equals(taskDefKey)){
	 				view = "testAuditForm";
	 			}
	 			// 审核环节
	 			else if ("audit".equals(taskDefKey)){
	 				view = "testAuditAudit";
	 			}
	 			// 审核环节2
	 			else if ("audit2".equals(taskDefKey)){
	 				view = "testAuditAudit";
	 			}
	 			// 审核环节3
	 			else if ("audit3".equals(taskDefKey)){
	 				view = "testAuditAudit";
	 			}
	 			// 审核环节4
	 			else if ("audit4".equals(taskDefKey)){
	 				view = "testAuditAudit";
	 			}
	 			// 兑现环节
	 			else if ("apply_end".equals(taskDefKey)){
	 				view = "testAuditAudit";
	 			}
	 		}*/
		model.addAttribute("qmsNcr", qmsNcr);	
		return "modules/qms/"+view;
	}
	

	@RequiresPermissions("qms:qmsNcr:view")
	@RequestMapping(value = "pro")
	public String pro(QmsNcr qmsNcr, Model model) {
		model.addAttribute("qmsNcr", qmsNcr);
		return "modules/qms/pro";
	}
	@RequiresPermissions("qms:qmsNcr:view")
	@RequestMapping(value = "Analysis")
	public String Analysis(QmsNcr qmsNcr, Model model) {
		model.addAttribute("qmsNcr", qmsNcr);
		return "modules/qms/Analysis";
	}


	@RequiresPermissions("qms:qmsNcr:view")
	@RequestMapping(value = "form")
	public String form(QmsNcr qmsNcr, Model model) {
		model.addAttribute("qmsNcr", qmsNcr);
		return "modules/qms/qmsNcrForm";
	}
	

	@RequestMapping(value="FindAll")
	@ResponseBody
	public PageData FindAll(HttpServletRequest request, HttpServletResponse response ,Integer page,Integer rows ,
			String customerName,String  deviceNo ,String lotNo,String issueDept, String responseDept,String findData, String doneData ,String status){	
		QmsNcr qmsNcr = new QmsNcr();
		qmsNcr.setCustomerName(customerName);
		qmsNcr.setDeviceNo(deviceNo);
		qmsNcr.setLotNo(lotNo);
		qmsNcr.setIssueDept(issueDept);
		qmsNcr.setFindData(findData);
		qmsNcr.setDoneData(doneData);
		qmsNcr.setStatus(status);
		qmsNcr.setResponseDept(responseDept);
		//根据值查询总记录数

		//把总记录数进行分页
		PageData list = qmsNcrService.getList(page, rows, qmsNcr);
		return list; 

	}

	@RequiresPermissions("oa:testAudit:edit")
	@RequestMapping(value = "save")
	public String save(QmsNcr qmsNcr, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, qmsNcr)) {
			return form(qmsNcr, model);
		}
		qmsNcrService.save(qmsNcr);
		addMessage(redirectAttributes, "保存单表成功");
		return "redirect:" + adminPath + "/act/task/todo/";
	//	return "redirect:" + Global.getAdminPath() + "/qms/qmsNcr/?repage";
	}

	@RequiresPermissions("qms:qmsNcr:edit")
	@RequestMapping(value = "delete")
	public String delete(QmsNcr qmsNcr, RedirectAttributes redirectAttributes) {
		qmsNcrService.delete(qmsNcr);
		addMessage(redirectAttributes, "删除单表成功");
		return "redirect:" + Global.getAdminPath() + "/qms/qmsNcr/?repage";
	}


	/**
	 * 数据导出
	 * */
	@RequestMapping(value = "Export")
	public String Export(HttpServletResponse response,HttpServletRequest request ,QmsNcr qmsNcr,RedirectAttributes redirectAttributes) {
		try {

			String fileName = "NCR数据"+DateUtils.getDate("yyyyMMddHHmmss")+".xlsx";
			Page<QmsNcr> page = qmsNcrService.findUser(new Page<QmsNcr>(request, response, -1), qmsNcr);
			new ExportExcel("NCR数据", QmsNcr.class).setDataList(page.getList()).write(response, fileName).dispose();
			return null;

		} catch (IOException e) {

			addMessage(redirectAttributes, "导出用户失败！失败信息："+e.getMessage());
		}

		return "redirect:" + Global.getAdminPath() + "/qms/qmsNcr/?repage";
	}
}