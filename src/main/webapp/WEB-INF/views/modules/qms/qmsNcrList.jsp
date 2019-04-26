<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<#include '../../lcgCommonPage2.html'>
<html>
<head>
	<title>单表管理</title>
	<meta name="decorator" content="default"/>

	<link rel="stylesheet" type="text/css" href="${ctxStatic}/js/bootstrap-theme.css">
	<link rel="stylesheet" type="text/css" href="${ctxStatic}/js/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="${ctxStatic}/js/easyui.css">
	<link rel="stylesheet" type="text/css" href="${ctxStatic}/js/icon.css">
	<link rel="stylesheet" type="text/css" href="${ctxStatic}/js/demo.css">
	<link rel="stylesheet" type="text/css" href="${ctxStatic}/js/zTreeStyle/zTreeStyle.css">
    <script type="text/javascript" src="${ctxStatic}/js/jquery.min.js"></script>
	<script type="text/javascript" src="${ctxStatic}/js/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="${ctxStatic}/js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="${ctxStatic}/js/easytree.js"></script>
	<script type="text/javascript" src="${ctxStatic}/js/jquery.ztree.all.js"></script>
	<script type="text/javascript" src="${ctxStatic}/js/angular.min.js"></script>
	<script type="text/javascript" src="${ctxStatic}/js/bootmotai.js"></script>
	<script type="text/javascript">	
	  function fun(){
		  var customerName=$("#customerName").val();
		  var deviceNo=$("#deviceNo").val();
		  var lotNo=$("#lotNo").val();
		  var issueDept=$("#issueDept").val();
		  var responseDept=$("#responseDept").val();
		  var findData=$("#findData").val();
		  var doneData=$("#doneData").val();
		  var status=$("#status").val();  
		  //var myObject = {customerName:customerName,deviceNo:deviceNo,lotNo:lotNo,issueDept:issueDept,responseDept:responseDept,findData:findData,doneData:doneData,status:status}; 
		  $("#dg").datagrid("load",{
			  customerName:customerName,
			  deviceNo:deviceNo,
			  lotNo:lotNo,
			  issueDept:issueDept,
			  responseDept:responseDept,
			  findData:findData,
			  doneData:doneData,
			  status:status
		       
		  });
	  }
	
	
	
	
	
	
	
	/*  */
	$(function(){	
		$('#dg').datagrid({    
		    url:'${ctx}/qms/qmsNcr/FindAll', 
		    pagination : true,
			pageSize : 2,
			pageList : [ 2, 4, 6, 8, 10 ],
			pagination:true,
			singleSelect:false,
			fitColumns:true,
		    columns:[[    
		    	{
	                field : 'ck',
	                checkbox : true,
	                width:100
	            },
		        {field:'qdrId',title:'编号',width:100,align:'center'},    
		        {field:'ncrCode',title:'生成流水码',width:120,align:'center'},    
		        {field:'customerName',title:'客户代码',width:100,align:'center'},    
		        {field:'deviceNo',title:'产品型号',width:120,align:'center'},    
		        {field:'lotNo',title:'批号',width:100,align:'center'},    
		        {field:'issueDept',title:'发现工序',width:120,align:'center'},    
		        {field:'responseDept',title:'责任工序',width:120,align:'center'},    
		        {field:'defectiveCount',title:'次品数量',width:100,align:'center'},    
		        {field:'findData',title:'发现时间',width:120,align:'center'},    
		        {field:'doneData',title:'结束时间',width:100,align:'center'},    
		        {field:'status',title:'状态',width:100,align:'center'}         
		    ]],
		    toolbar : [ {
				text :  '查看异常信息',
				iconCls : 'icon-edit',
				handler : function() {
					/**编辑*/
					var list = $('#dg').datagrid('getSelections');
					var ids = "";
					for ( var a in list) {
						ids +=","+list[a].qdrId;
					}
					ids = ids.substring(1);
					location.href="${ctx}/qms/qmsNcr/findQmsList?qdrId="+ids;
					
					
			   }
			}, {
				text : '导出',
				iconCls : 'icon-ok',
				handler : function() {						
					 var result = confirm("您确认要导出吗?");  
					    if (result == true) {  
					    	  location.href="${ctx}/qms/qmsNcr/Export";
					    } else {  
					        alert("导出失败 !");  
					    }  			
				}			
			}, {
				text : '打印',
				iconCls : 'icon-ok',
				handler : function() {						
					 var result = confirm("您确认要导出吗?");  
					    if (result == true) {  
					    	 location.href="${ctx}/qms/qmsNcr/Export";
					    } else {  
					        alert("导出失败 !");  
					    }  			
				}			
			},{
				text : '新建任务',
				iconCls : 'icon-ok',
				handler : function() {	
					var list = $('#dg').datagrid('getSelections');
					var ids = "";
					for ( var a in list) {
						ids +=","+list[a].qdrId;
					}
					var count=ids.lastIndexOf(",");
					 if (count == 0) {  
					     ids = ids.substring(1);
						 location.href="${ctx}/act/task/process?NCR_id="+ids;
				    }else if(count == -1){
				    	alert("任务必须选择一个 !");
				    } else {  
				        alert("任务只能启动一个 !");  
				    }  			
					
				}			
			}
			
			
			]
		});	
	})
	</script>
	
	
	
	
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/qms/qmsNcr/" >NCR列表</a></li>
	</ul>
	
    <form id="form1">
		<input class="easyui-textbox" id="customerName" name="customerName" style="width:20%;height: 30px" data-options="label:'客户代码:'">
		<input class="easyui-textbox" id="deviceNo" name="deviceNo" style="width:20%;height: 30px" data-options="label:'产品型号:'">
		<input class="easyui-textbox" id="lotNo" name="lotNo" style="width:20%;height: 30px" data-options="label:'批号:'">
		<input class="easyui-textbox" id="issueDept" name="issueDept" style="width:20%;height: 30px" data-options="label:'发现工序:'"><br>
		<input class="easyui-textbox" id="responseDept" name="responseDept" style="width:20%;height: 30px" data-options="label:'责任工序:'">
		<input class="easyui-textbox" id="findData" name="findData" style="width:20%;height: 30px" data-options="label:'发现时间:'">
		<input class="easyui-textbox" id="doneData" name="doneData" style="width:20%;height: 30px" data-options="label:'结束时间:'">
		<input class="easyui-textbox" id="status" name="status" style="width:20%;height: 30px" data-options="label:'状态:'">   
	</form>
	    <button onclick="fun()"  class="easyui-linkbutton" style="width:80px;height: 30px;">查询</button>
	 
	
	<sys:message content="${message}"/>
	<table id="dg" style="width: 1230px"></table>
</body>
</html>