<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.edit-panel{
		width:380px;
		line-height: 2.5;
	}
	label.fieldname{
		display: inline-block;
		width:100px;
		text-align: right;
	}
</style>
</head>
<body>
	<fieldset class="edit-panel">
		<legend>课程查询</legend>
		<div>
			<label class="fieldname">课程名称：</label>
			<input type="text" autocomplete="off" list="suggest" />
			<datalist id="suggest" >
				<option value="1">ASP</option>
				<option value="2">ASP.NET</option>
				<option value="3">ASP.NET AJAX</option>
				<option value="4">C</option>
				<option value="5">C++</option>
				<option value="6">C#</option>
			</datalist>
			<button>查询</button>
		</div>
	</fieldset>
</body>
</html>