<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
	<title>电影网 - 电影信息管理</title>
	<script src="${pageContext.request.contextPath}/static/js/jquery.js"></script>
	<script>
		function loadCategories(){
			$.getJSON("../ajax/list", function(json){
				$("#categoryList").empty();
				for(var i=0; i<json.categories.length; i++){
					var c = json.categories[i];
					var line = "<tr><td>"+c.id+"</td><td>"+c.name+"</td><td><button class='edit' data-ref='"+c.id+"'>编辑</button></td></tr>";
					$("#categoryList").append(line);
				}
				alert("总行数："+json.totalRows);
			});
		}
		$(function(){
			loadCategories();
			$("#cateSave").click(function(){
				$.ajax({
					url:"../ajax/save",//路径
					data:$("#editForm").serialize(),//表单的值
					type:"post",//类型
					dataType:"json",//返回类型
					success:function(json){
						if(json.ok){
							loadCategories();
							$("#cateId").val(0);
							$("#cateName").val("");
						}
					}
				});
			});
			$("#categoryList").on("click","button.edit",function(){
				var id = $(this).attr("data-ref");
				$.ajax({
					url:"../ajax/single",
					type:"get",
					data:{"id":id},
					dataType:"json",
					success:function(json){
						$("#cateId").val(json.id);
						$("#cateName").val(json.name);
					},
					error:function(){
						alert("服务器忙，稍后再试");
					}
				});
			});
		});
	</script>
</head>
<body>
	<table border="1">
		<thead><tr><th>分类ID</th><th>分类名称</th><th>操作</th></tr></thead>
		<tbody id="categoryList">
		</tbody>
	</table>
	<hr/>
	<form id="editForm">
		<input id="cateId" type="hidden" name="id" />
		分类名称：<input id="cateName" name="name" />
		<button id="cateSave" type="button">保存</button>
	</form>
</body>
</html>