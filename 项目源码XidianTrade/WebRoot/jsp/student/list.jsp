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
<style type="text/css">
.table1 {
	border: 1px solid #ddd;
	width: 900px;
}

thead {
	background-color: lightblue;
}
</style>
</head>
<body>
	<table border="0" width="900px">
		<tr>
			<td align="center" style="font-size:24px; color:#666">用户管理</td>
		</tr>
	</table>
	<br />
	<table cellspacing="0" border="1" class="table1">
		<thead>
			<tr>
				<th width="450">学生名称</th>
				<th width="450">学号</th>
				<th width="450">用户名</th>
				<th width="450">密码 </th>
				<th width="450">删除</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="studentList" var="s">
				<tr>
					<td align="center"><s:property value="#s.studentName" /></td>
					<td align="center"><s:property value="#s.studentNo" /></td>
					<td align="center"><s:property value="#s.userName" /></td>
					<td align="center"><s:property value="#s.password" /></td>
					<td align="center"><a
						href="${pageContext.request.contextPath}/student_delete.action?studentId=<s:property value="#s.studentId"/>"><img
							src="${pageContext.request.contextPath }/images/xx.png"></a></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<br />


	
</body>
</html>