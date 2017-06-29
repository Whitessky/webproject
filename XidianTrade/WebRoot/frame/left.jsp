<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html>
<head>
<link href="dtree.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="dtree.js"></script>
</head>

<body bgColor=#DDF0FB leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">
<table width="90%" border="0" cellspacing="1" cellpadding="2" align="center">
<div class="dtree">
  <script type="text/javascript">
    d=new dTree('d');

    d.add('01','-1','西电淘管理系统');
    d.add('0101','01','资源管理部');
    d.add('010101','0101','用户管理','${pageContext.request.contextPath}/student_rootFindAll.action','','right');

    d.add('010102','0101','物品管理','${pageContext.request.contextPath}/goods_rootFindAll.action','','right');
    document.write(d);
  </script>
</div>
</table>

</body>
</html>
