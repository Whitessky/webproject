<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'MyGoods.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<h1>我的商品</h1>
	<hr>
	<center>
		<table width="750" height="60" cellpadding="0" cellspacing="0"
			border="0">
			<tr>
				<td width="30%" bgcolor="#EEE" align="center"><br> <b>我的商品</b><br>

					<s:iterator value="myList" var="g">
						<div>
							<dl>
								<dt>
									<img src="images/<s:property value="#g.goodsPicture" />"
										width="120" height="90" border="1" />
								</dt>
								<dd class="dd_name">
									<s:property value="#g.goodsName" />
								</dd>
								<dd class="dd_city">
									价格:
									<s:property value="#g.goodsPrice" />
									￥ &nbsp;&nbsp;备注：
									<s:property value="#g.goodsNote" />
									&nbsp;&nbsp;
									<s:property value="#session.existGoods.goodsContact" />
									<a
										href="${pageContext.request.contextPath }/goods_delete.action?searchId=<s:property value="#g.goodsId" />">
										删除</a> <a
										href="${pageContext.request.contextPath }/goods_edit.action?searchId=<s:property value="#g.goodsId" />">
										编辑</a>
								</dd>
							</dl>
						</div>
					</s:iterator></td>
			</tr>
		</table>
	</center>

</body>
</html>
