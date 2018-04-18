<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.edit-panel{
		width:420px;
		line-height: 2.5;
	}
	.edit-panel .error{
		color:red;
	}
	label.fieldname{
		display: inline-block;
		width:100px;
		text-align: right;
	}
	
</style>
<script type="text/javascript" src="static/js/jquery.js"></script>
<script type="text/javascript" src="static/js/jquery.validate-1.17.0.js"></script>
<script type="text/javascript">
	$(function(){
		$("#editForm").validate({
			rules:{
				username:{required:true, remote:"check-username"}
			},
			messages:{
				username:{required:"请填写用户名",remote:"用户名已重复"}
			}
		});
		
	});
</script>
</head>
<body>
	<form id="editForm">
	<fieldset class="edit-panel">
		<legend>用户注册</legend>
		<div>
			<label class="fieldname">用户名：</label>
			<input type="text" name="username" />
		</div>
		<div>
			<label class="fieldname">密码：</label>
			<input type="password" name="password" />
		</div>
		<div>
			<label class="fieldname">密码确认：</label>
			<input type="password" name="passwordConfirm" />
		</div>
		<div>
			<label class="fieldname">&nbsp;</label>
			<input type="submit" value="提交" />
		</div>
	</fieldset>
	</form>
</body>
</html>