<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
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
	<!-- <script type="text/javascript" src="../js/jquery.min.js"></script> -->
	<script type="text/javascript" src="${ctxStatic}/js/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="${ctxStatic}/js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="${ctxStatic}/js/easytree.js"></script>
	<script type="text/javascript" src="${ctxStatic}/js/jquery.ztree.all.js"></script>
	<script type="text/javascript" src="${ctxStatic}/js/angular.min.js"></script>
	<script type="text/javascript" src="${ctxStatic}/js/bootmotai.js"></script>	
    <script type="text/javascript">
    
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
     <em><h3 style="color: red">异常处理信息</h3></em>
        <div id="div1"  class="easyui-panel" title="NCR信息" data-options="iconCls:'icon-save',closable:true,collapsible:true,minimizable:true,maximizable:true">
		                            <table>
										  	<tr style="margin-bottom: 30px; height: 50px;">
										  		<td class="txtCenter"><label>编号：</label></td>
										  		<td><input  id="customerName" class="easyui-textbox"/></td>
										  		
										  		<td class="jianxi"><label>客户名称：</label></td>
										  		<td><input  id="customerName" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>产品型号：</label></td>
										  		<td><input  id="customerName" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>批号/箱号：</label></td>
										  		<td><input  id="customerName" class="easyui-textbox"/></td>
										  	</tr>	
										    									       
										  	<tr style="margin-bottom: 30px; height: 40px;">
										  		<td class="jianxi"><label>发现工序：</label></td>
										  		<td><input  id="customerName" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>责任工序：</label></td>
										  		<td><input  id="customerName" class="easyui-textbox"/></td>
										  	</tr>   
										  	<tr style="margin-bottom: 30px; height: 40px;">
										  		<td class="jianxi"><label>总数量：</label></td>
										  		<td><input  id="customerName" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>抽样数量：</label></td>
										  		<td><input  id="customerName" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>次品数量：</label></td>
										  		<td><input  id="customerName" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>不良率：</label></td>
										  		<td><input  id="customerName" class="easyui-textbox"/></td>
										  	</tr>						     
										  	<tr style="margin-bottom: 30px; height: 40px;">
										  		<td class="jianxi"><label>提报人工序：</label></td>
										  		<td><input  id="customerName" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>提报人：</label></td>
										  		<td><input  id="customerName" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>提报日期：</label></td>
										  		<td><input  id="customerName" class="easyui-textbox"/></td>
										  		<td class="jianxi"><label>状态：</label></td>
										  		<td>
										  			<select name="dept" style="width:208px;">   
										  				 <option value="1">待处理</option>
										  				 <option value="2">结案</option>
										  			</select>										  			
										  		</td>
										  	</tr>
										  </table>
		  </div>
      
      
        <div id="div2" class="easyui-panel" title="异常描述信息"     
			        data-options="iconCls:'icon-save',maximizable:true">   
				     <table>
				     	  <tr>
				     	  	  <td id="td1">
				     	  	  	   <table class="mid">
				     	  	  	   	  <tr>
				     	  	  	   	  	 <td id="td2"><label>编&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号：</label></td>
										 <td><input  id="customerName" class="easyui-textbox"/></td> 		
				     	  	  	   	  </tr>
				     	  	  	   </table>
				     	  	  </td>
				     	      <td>
				     	      	   <table class="mid">
				     	  	  	   	  <tr>
				     	  	  	   	  	 <td id="td2" ><label>发现时间：</label></td>
										 <td><input  id="customerName" class="easyui-textbox"/></td> 		
				     	  	  	   	  </tr>
				     	  	  	   </table>
				     	      </td>
				     	      <td>
				     	      	   <table  class="mid">
				     	  	  	   	  <tr>
				     	  	  	   	  	 <td id="td2"><label>总&nbsp;&nbsp;数&nbsp;量：</label></td>
										 <td><input  id="customerName" class="easyui-textbox"/></td> 		
				     	  	  	   	  </tr>
				     	  	  	   </table>
				     	      </td>			     	      
				     	  </tr>
				     	    <tr>
				     	  	  <td id="td1">
				     	  	  	   <table  class="mid">
				     	  	  	   	  <tr>
				     	  	  	   	  	 <td id="td2"><label>缺点代码：</label></td>
										 <td><input  id="customerName" class="easyui-textbox"/></td> 		
				     	  	  	   	  </tr>
				     	  	  	   </table>
				     	  	  </td>
				     	      <td>
				     	      	   <table  class="mid">
				     	  	  	   	  <tr>
				     	  	  	   	  	 <td id="td2"><label>次品数量：</label></td>
										 <td><input  id="customerName" class="easyui-textbox"/></td> 		
				     	  	  	   	  </tr>
				     	  	  	   </table>
				     	      </td>
				     	      <td>
				     	      	   <table  class="mid">
				     	  	  	   	  <tr>
				     	  	  	   	  	 <td id="td2"><label>发&nbsp;&nbsp;现&nbsp;者：</label></td>
										 <td><input  id="customerName" class="easyui-textbox"/></td> 		
				     	  	  	   	  </tr>
				     	  	  	   </table>
				     	      </td>
				     	      
				     	  </tr>
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
				
				
				
</body>
</html>