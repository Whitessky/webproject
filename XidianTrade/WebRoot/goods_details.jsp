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

<title>My JSP 'details.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
div {
	float: left;
	margin-left: 30px;
	margin-right: 30px;
	margin-top: 5px;
	margin-bottom: 5px;
}

div dd {
	margin: 0px;
	font-size: 10pt;
}

div dd.dd_name {
	color: blue;
}

div dd.dd_city {
	color: #000;
}
</style>
</head>

<body>
	<h1>商品详情</h1>
	<hr>
	<center>
		<table width="750" height="60" cellpadding="0" cellspacing="0"
			border="0">
			<tr>
				<!-- 商品详情 -->
				<td width="70%" valign="top">
					<table>
						<tr>
							<td rowspan="5"><img
								src="images/<s:property value="#session.existGoods.goodsPicture" />"
								width="200" height="160" /></td>
						</tr>
						<tr>
							<td><B> <s:property
										value="#session.existGoods.goodsName" />
							</B></td>
						</tr>
						<tr>
							<td>价格：￥ <s:property value="#session.existGoods.goodsPrice" />
							</td>
						</tr>
						<tr>
							<td>备注： <s:property value="#session.existGoods.goodsNote" />
							</td>
						</tr>
						<tr>
							<td>联系方式： <s:property
									value="#session.existGoods.goodsContact" />
							</td>
						</tr>
					</table> <a href="javascript:history.go(-1)">退回 </a>
				</td>
			</tr>
		</table>
	</center>
</body>
</html>
