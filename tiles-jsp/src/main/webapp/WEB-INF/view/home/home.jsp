<%--
  Created by IntelliJ IDEA.
  User: tangcheng
  Date: 2018/4/4
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<a href="<c:url value="/greeting" />">Greeting</a>|<a href="<c:url value="/basic"/>">Basic</a>
<div>
    Main content would go here.Lets try.
    ${home}
</div>
