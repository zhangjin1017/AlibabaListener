<%@ page import="com.zj.listener.User2" %><%--
  Created by IntelliJ IDEA.
  User: 1216916137
  Date: 2022-01-12
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>向session中保存数据</h1>
<%
session.setAttribute("s1",new User2());
%>
</body>
</html>
