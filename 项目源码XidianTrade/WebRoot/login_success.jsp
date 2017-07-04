<%@ page language="java"
	import="java.awt.*,java.sql.*,java.io.*,java.util.*,com.ghl.model.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>西电淘 - 主页</title>
<link rel="stylesheet" type="text/css" href="home.css">
<link href="/WebContent/home.css" rel="stylesheet" type="text/css">

</script>
<script language="javascript">
<!--
	function check1() {
		//判断num1是不是空,表单form1中控件num1的值
		if (form1.q.value == "") {
			window.alert("搜索关键字不能为空");
			return false;
		}

	}
	-->
</script>
</head>

<body onselectstart="return false;">
	<div class="top">
		<div class="top-right">
			<div class="username">
				<p>
					欢迎您：
					<s:property value="#session.existStudent.userName" />
				</p>
				<ul class="sub_menu">
					<li><a href="upload.jsp">上传</a></li>
					<li><a
						href="goods_myGoods.action?student.studentId=<s:property value="#session.existStudent.studentId" />">我的商品</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="center">
		<div class="text-line">西电淘 - 宝贝就在身边</div>
		<form name="form1" id="search_form" method="postt"
			action="goods_loginedSearch" class="searching-unit"
			data-regestered="regestered">
			<input id="query" type="text" size="27" name="searchName"
				autocomplete="off" placeholder="搜索你喜欢的" /> <input type="image"
				src="photos/search.png" class="go" onclick="return check1()"
				width="31px" height="20px">
		</form>
		<div class="random">
			<a href="goods_loginedFindAll.action">随便看看</a>
		</div>
	</div>
	<div class="message_wrapper">
		<s:iterator value="list" var="g">
			<div class="message_detail">
				<div class="photo">
					<a
						href="${pageContext.request.contextPath }/goods_details.action?searchId=<s:property value="#g.goodsId" />"><img
						src="images/<s:property value="#g.goodsPicture" />"></a>
				</div>
				<div class="message">
					<p>
						名称:
						<s:property value="#g.goodsName" />
					</p>
					<p>
						价格:
						<s:property value="#g.goodsPrice" />
					</p>
				</div>
			</div>
		</s:iterator>
	</div>
</body>

</html>
