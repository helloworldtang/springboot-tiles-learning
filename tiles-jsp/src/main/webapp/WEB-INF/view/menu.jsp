<nav>
    <a href="${pageContext.request.contextPath}/">
        <img class="logo" src="${pageContext.request.contextPath}/static/logo.png"/>
    </a>
    <ul id="menu">
        <li><a href="${pageContext.request.contextPath}/">Home</a></li>
        <li><a href="${pageContext.request.contextPath}/greeting">Default Greeting</a></li>
        <li><a href="${pageContext.request.contextPath}/greeting?name=tangcheng">Custom Greeting-queryString</a></li>
        <li><a href="${pageContext.request.contextPath}/greeting/tangcheng">Custom Greeting-path</a></li>
        <li><a href="${pageContext.request.contextPath}/basic">basic</a></li>
    </ul>
</nav>