<%--
  Created by IntelliJ IDEA.
  User: tangcheng
  Date: 2018/4/4
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
    <title><tiles:getAsString name="title"></tiles:getAsString></title>
</head>
<body>
<%--Header--%>
<tiles:insertAttribute name="header"></tiles:insertAttribute>

<%--Body--%>
<tiles:insertAttribute name="body"></tiles:insertAttribute>

<%--Footer--%>
<tiles:insertAttribute name="footer"></tiles:insertAttribute>
</body>
</html>
