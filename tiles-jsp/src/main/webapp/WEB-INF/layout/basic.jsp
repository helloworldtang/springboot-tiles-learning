<%--
  Created by IntelliJ IDEA.
  User: tangcheng
  Date: 2018/4/4
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><tiles:getAsString name="title"/></title>
    <link href="<c:url value="/static/css/common.css"/>" rel="stylesheet">
    <link href="<c:url value="/static/css/bootstrap.css"/>" rel="stylesheet">
</head>
<body>
<%--Header--%>
<header id="header">
    <tiles:insertAttribute name="header"/>
</header>

<section id="sidemenu">
    <tiles:insertAttribute name="menu"/>
</section>

<section id="site-content">
    <tiles:insertAttribute name="body"/>
</section>

<%--Footer--%>
<footer id="footer">
    <tiles:insertAttribute name="footer"/>
</footer>

</body>
</html>
