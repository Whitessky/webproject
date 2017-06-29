<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<title>编辑页面</title>
</head>
<body background="photos\uploadbg.jpg">
	<h1>编辑页面</h1>
	<center>
		<s:form name="UploadForm" method="post" enctype="multipart/form-data"
			action="goods_update" theme="simple">
			<input type="hidden" name="goodsId"
				value="<s:property value="#session.existGoods.goodsId"/>" />
			<table>
				<tr>
					<td>物品名称:<input type="text" name="goodsName"
							value="<s:property value="#session.existGoods.goodsName" />"></td>
				</tr>
				<tr>
					<td>物品价格:￥<input type="text" name="goodsPrice"
							value="<s:property value="#session.existGoods.goodsPrice" />"></td>
				</tr>
				<tr>
					<td>联系方式（电话、QQ、微信）:<input type="text" name="goodsContact"
							value="<s:property value="#session.existGoods.goodsContact" />"></td>
				</tr>
				<tr>
					<td>备注:<input type="text" name="goodsNote"
							value="<s:property value="#session.existGoods.goodsNote" />"></td>
				</tr>
				<tr>
					<td>图片地址:<input type="file" name="upload" id="goodsPicture"></td>
				</tr>
				<tr>
					<input type="hidden" name="student.studentId"
						value="<s:property value="#session.existStudent.studentId" />">
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="确认编辑"
						style="background-color:lightblue"> <input type="reset"
						value="重置" style="background-color:lightblue"><a
						href="javascript:history.go(-1)">退回 </a></td>

				</tr>
			</table>
		</s:form>
	</center>
</body>
</html>
