<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>单表管理</title>
	<meta name="decorator" content="default"/>
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
    var qdrId=${sessionScope.NCR_id};
    var columns=[];   
    $.post("${ctx}/qms/qmsNcr/qmsNcrDesc",{qdrId:qdrId},
    		function(obj){
        /**根据名称进行回显*/
	    		var q=obj.qms;
        		var a=obj.qmsNcrpro;

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
	           	 $("#qcuserId").textbox('setValue',q.qcuserId);
	        	   /*  */
	        	   $("#abiuserId").textbox('setValue',q.abiuserId);
	        	   /*  */
	        	   $("#abnormalDate").textbox('setValue',q.abnormalDate);
	        	   /**下拉框回显*/
	        	   $('#status').combobox('select',q.status);	 
	        	   var html="";
	        	   for (var i = 0; i < a.length; i++) {		
	        		   
	        	   html+="<tr><td><label>编&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号：</label></td><td><input name='id' class='easyui-textbox' value='"+a[i].id+"'/></td>"
	        	   html+="<td><label>备&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;注：</label></td><td><input name='remarks'  class='easyui-textbox' value='"+a[i].remarks+"'/></td>" 		
	        	   html+="<td><label>缺点代码：</label></td><td><input name='defectCode'  class='easyui-textbox' value='"+a[i].defectCode+"'/></td>" 	
	        	   html+="<td><label>次品数量：</label></td><td><input name='productcount' class='easyui-textbox' value='"+a[i].productcount+"'/></td>" 		
	        	   html+="<td><label>NCR编号：</label></td><td><input name='ncrid'  class='easyui-textbox' value='"+a[i].ncrid+"'/></td></tr>" 
	        	   html+="<tr style='height:5px;'></tr>";
	        	   }
				 $("#dg").append(html);
				 $.parser.parse("#div2");
        },
    "json")
   /*  $(function(){
	    $("#submit").click(function(){
	    	alert("1");
			var params = $(".form").serialize();	
			alert(params);
			$.ajax({
				type:"post",
				url:"${ctx}/act/task/start",
				data:params,
				
				dataType:"json"
			});
		});
    }); */
    </script>
    <style type="text/css">
       	#div2{
        		width: 800px;
        		height: 100px;
        		background-color:red;
        		padding:10px;
        		background:#fafafa;"   
        	}
       #div3{
        		width: 800px;
        		height: 180px;
        		background-color:blue;
        		padding:10px;
        		background:#fafafa;"     		
        	}
        #ge{
        	width: 600px;
        	padding-left: 1200px;
        }
        #kong{
        	margin-left:180px;
        }
        .jianxi{
        	padding-left: 30px;
        }
        .txtCenter{
        	padding-left: 30px;
        }
        .mid{
        	margin-left:30px;
        	margin-top: 10px;
        }
    </style>
</head>
<body  style="width: 1000px;">
  <form:form id="inputForm" modelAttribute="qmsNcr" action="${ctx}/qms/qmsNcr/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<form:hidden path="act.taskId"/>
		<form:hidden path="act.taskName"/>
		<form:hidden path="act.taskDefKey"/>
		<form:hidden path="act.procInsId"/>
		<form:hidden path="act.procDefId"/>
		<form:hidden id="flag" path="act.flag"/>
		<sys:message content="${message}"/>
     <em><h3 style="color: red">异常处理信息</h3></em>
        <div id="div1"  class="easyui-panel" title="NCR信息" data-options="iconCls:'icon-save',closable:true,collapsible:true,minimizable:true,maximizable:true">
		                            <table>
										  	<tr style="margin-bottom: 30px; height: 50px;">
										  		<td class="txtCenter"><label>编号：</label></td>
										  		<td><input name="ncrCode" id="ncrCode" class="easyui-textbox"/></td>
										  		
										  		<td class="jianxi"><label>客户名称：</label></td>
										  		<td><input name="customerName"  id="customerName" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>产品型号：</label></td>
										  		<td><input name="deviceNo"  id="deviceNo" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>批号/箱号：</label></td>
										  		<td><input name="lotNo"  id="lotNo" class="easyui-textbox"/></td>
										  	</tr>	
										    									       
										  	<tr style="margin-bottom: 30px; height: 40px;">
										  		<td class="jianxi"><label>发现工序：</label></td>
										  		<td><input name="issueDept"  id="issueDept" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>责任工序：</label></td>
										  		<td><input name="responseDept"  id="responseDept" class="easyui-textbox"/></td>
										  	</tr>   
										  	<tr style="margin-bottom: 30px; height: 40px;">
										  		<td class="jianxi"><label>总数量：</label></td>
										  		<td><input name="totalQty"  id="totalQty" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>抽样数量：</label></td>
										  		<td><input name="sampleQty" id="sampleQty" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>次品数量：</label></td>
										  		<td><input name="defectiveCount" id="defectiveCount" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>机号：</label></td>
										  		<td><input name="machineNo"  id="machineNo" class="easyui-textbox"/></td>
										  	</tr>						     
										  	<tr style="margin-bottom: 30px; height: 40px;">
										  		<td class="jianxi"><label>品管员工号：</label></td>
										  		<td><input name="qcuserId"  id="qcuserId" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>发现者：</label></td>
										  		<td><input name="abiuserId"  id="abiuserId" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>发现日期：</label></td>
										  		<td><input name="abnormalDate" id="abnormalDate" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>状态：</label></td>
										  		<td>
											  		 <select class="easyui-combobox" id="status" name="status" style="width: 200px;">
															<option value="1">待处理</option>
															<option value="2">结案</option>
													  </select> 
												</td>
										  	</tr>
										  </table>
		  </div>
      
      
        <div id="div2" class="easyui-panel" title="异常描述信息"     
			        data-options="iconCls:'icon-save',maximizable:true">   
				     <table id="dg">
				     	  
				     </table>
				</div>  	
				
				<!--产品处理意见  -->
			     <div id="div3" class="easyui-panel" title="产品处理意见" data-options="iconCls:'icon-save',maximizable:true"> 
                         <em><strong><h4 id="kong">填写产品处理意见</h4></strong></em> 
                        <textarea cols="5"  rows="4" style="width: 900px; height: 60px; resize: none;margin-left: 260px;"></textarea>
				  	    <table>
				  	       <tr>
				  	           <td id="ge">意见人:<input type="text" name="" value=""> </td>
				  	       </tr>
				  	    </table>	     
				</div>
				
				
				<input type="submit"  id="submit">
		</form:form>
</body>
</html>