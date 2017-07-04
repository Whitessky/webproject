<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<title>上传页面</title>
</head>
<body background="photos\uploadbg.jpg">
	<h1>上传页面</h1>
	<center>
		<s:form name="UploadForm" method="post" enctype="multipart/form-data"
			action="goods_upload">
			<table>
				<tr>
					<td>物品名称:<input type="text" name="goodsName" id="goodsName"></td>
				</tr>
				<tr>
					<td>物品价格:￥<input type="text" name="goodsPrice" id="goodsPrice"></td>
				</tr>
				<tr>
					<td>联系方式（电话、QQ、微信）:<input type="text" name="goodsContact"
						id="goodsContact"></td>
				</tr>
				<tr>
					<td>备注:<input type="text" name="goodsNote" id="goodsNote"></td>
				</tr>
				<tr>
					<td>图片地址:<input type="file" name="upload" id="goodsPicture"></td>
				</tr>
				<tr>
					<input type="hidden" name="student.studentId" value="<s:property value="#session.existStudent.studentId" />"></td>
				</tr>
				<tr>
					<td><input type="submit" value="上传文件"
						style="background-color:lightblue"> <input type="reset"
						value="重置" style="background-color:lightblue"><a
						href="javascript:history.go(-1)">退回 </a></td>

				</tr>
			</table>
		</s:form>
	</center>
</body>
</html>
