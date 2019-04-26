<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<title>单表管理</title>
<meta name="decorator" content="default" />
<link rel="stylesheet" type="text/css"
	href="${ctxStatic}/js/bootstrap-theme.css">
<link rel="stylesheet" type="text/css"
	href="${ctxStatic}/js/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${ctxStatic}/js/easyui.css">
<link rel="stylesheet" type="text/css" href="${ctxStatic}/js/icon.css">
<link rel="stylesheet" type="text/css" href="${ctxStatic}/js/demo.css">
<link rel="stylesheet" type="text/css"
	href="${ctxStatic}/js/zTreeStyle/zTreeStyle.css">
<script type="text/javascript" src="${ctxStatic}/js/jquery.min.js"></script>
<script type="text/javascript"
	src="${ctxStatic}/js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript"
	src="${ctxStatic}/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${ctxStatic}/js/easytree.js"></script>
<script type="text/javascript" src="${ctxStatic}/js/jquery.ztree.all.js"></script>
<script type="text/javascript" src="${ctxStatic}/js/angular.min.js"></script>
<script type="text/javascript" src="${ctxStatic}/js/bootmotai.js"></script>
<script type="text/javascript">
      /*列表回显 */
      //查询两部分一部分是根据id查询对象的信息
       var qdrId="${param.qdrId}";
       var array =[];
       var columns=[];       
        $.post("${ctx}/qms/qmsNcr/qmsNcrDesc",{qdrId:qdrId},
        		function(obj){
        	                /**根据名称进行回显*/
			        	    var q=obj.qms;
			        	   /**Ncr编号*/
			        	   $("#ncrCode").textbox('setValue',q.ncrCode);
			        	   /**产品型号*/
			        	   $("#deviceNo").textbox('setValue',q.ncrCode);
			        	   /**客户代码*/	  
			        	   $("#customerName").textbox('setValue',q.customerName);
			        	   /*  */
			        	   $("#lotNo").textbox('setValue',q.lotNo);
			        	   /*  */
			        	   $("#issueDept").textbox('setValue',q.issueDept);
			        	   /*  */        	 
			        	   $("#responseDept").textbox('setValue',q.responseDept);
			        	   /*  */
			        	   $("#totalQty").textbox('setValue',q.totalQty);
			        	   /*  */
			               $("#sampleQty").textbox('setValue',q.sampleQty);
			        	   /*  */
			        	   $("#defectiveCount").textbox('setValue',q.defectiveCount);
			        	   /*  */
			           	   $("#machineNo").textbox('setValue',q.machineNo);
			        	   /*  */       	  
			        	   $("#qcuserId").textbox('setValue',q.qcuserId);
			        	   /*  */
			        	   $("#abiuserId").textbox('setValue',q.abiuserId);
			        	   /*  */
			        	   $("#abnormalDate").textbox('setValue',q.abnormalDate);
			        	   /**下拉框回显*/
			        	   $('#status').combobox('select',q.status);	   
			        	      //列表的回显
			        	      $("#dg").datagrid({
			        	               columns: [obj.qmslist.title], //动态取标题
			        	               
			        	              
			        	           });
			        	     $("#dg").datagrid("loadData", obj.qmslist.rows);  
			        	    
			        	   
         	             
                 },
        "json")
	</script>
</head>
<body>

   
	<div style="width: 1200px; height: 40px; background-color: #fafafa;">
		<table>
			<tr>
				<td style="width: 1100px;"></td>

				<td><a id="btn" href="${ctx}/qms/qmsNcr/"
					class="easyui-linkbutton">返回</a></td>
			</tr>
		</table>
	</div>

	<div id="p" class="easyui-panel" title="NCR信息"
		style="width: 1200px; height: 300px; padding: 10px; background: #fafafa;"
		data-options="iconCls:'icon-save',maximizable:true">
		<table>
			<tr>
				<td>
					<form>
						<table cellspacing="1" cellpadding="1">
							<tr style="margin-bottom: 30px;">
								<td class="txtCenter"><label>编号：</label></td>
								<td><input id="ncrCode" class="easyui-textbox" /></td>

								<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label>客户名称：</label></td>
								<td><input id="customerName" class="easyui-textbox" /></td>
								<td><label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;产品型号：</label></td>
								<td><input id="deviceNo" class="easyui-textbox" /></td>
								<td><label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;批号/箱号：</label></td>
								<td><input id="lotNo" class="easyui-textbox" /></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
							</tr>
							<tr>
								<td><label>发现工序：</label></td>
								<td><input id="issueDept" class="easyui-textbox" /></td>
								<td><label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;责任工序：</label></td>
								<td><input id="responseDept" class="easyui-textbox" /></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td><label>总数量：</label></td>
								<td><input id="totalQty" class="easyui-textbox" /></td>
								<td><label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;抽样数量：</label></td>
								<td><input id="sampleQty" class="easyui-textbox" /></td>
								<td><label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;次品数量：</label></td>
								<td><input id="defectiveCount" class="easyui-textbox" /></td>
								<td><label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;机号：</label></td>
								<td><input id="machineNo" class="easyui-textbox" /></td>
							</tr>
							<tr>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
							</tr>

							<tr>
								<td><label>品管员工号：</label></td>
								<td><input id="qcuserId" class="easyui-textbox" /></td>
								<td><label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;发现者：</label></td>
								<td><input id="abiuserId" class="easyui-textbox" /></td>
								<td><label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;发现日期：</label></td>
								<td><input id="abnormalDate" class="easyui-textbox" /></td>
								<td><label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;状态：</label></td>
								<td><select class="easyui-combobox" id="status"name="status" style="width: 200px;">
										<option value="1">待处理</option>
										<option value="2">结案</option>
								</select></td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
		</table>



	</div>
	<!--处理-->
	<div id="p" class="easyui-panel" title="异常描述信息"
		style="width: 1200px; height: 260px; padding: 10px; background: #fafafa;"
		data-options="iconCls:'icon-save',maximizable:true">
		<table id="dg"
			data-options=" rownumbers:true,singleSelect:true,autoRowHeight:false,pagination:true, resizeHandle:'right'">
			<thead>
				<tr></tr>
			</thead>
		</table>
	</div>
</body>
</html>