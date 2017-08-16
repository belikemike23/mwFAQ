<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: mike.wang
  Date: 2017/7/19
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${msg}</title>
    <link href="<c:url value="/resources/jqueryui/themes/jquery-ui.css" />" rel="stylesheet"  type="text/css" />
    <link href="<c:url value="/resources/jqueryui/themes/jquery-ui.structure.css" />" rel="stylesheet"  type="text/css" />
    <link href="<c:url value="/resources/jqueryui/themes/jquery-ui.theme.css" />" rel="stylesheet"  type="text/css" />
</head>
<body>
<h1>${msg}</h1>
<h2>This is the second title</h2>
<span>${name}</span>
<div>
    <a href="http://www.baidu.com">Link</a>
    <hr/>
    <form:form action="/answer" method="post" modelAttribute="questionentity" role="form" >
        <div class="form-group">
            <label for="content">Content:</label>
            <textarea class="form-control" id="content" name="keyword"  placeholder="Please Input Content"></textarea>
        </div>
        <input type="text" name="date" id="date">
        <p><button type="submit"  class="ui-button">提交</button></p>
    </form:form>
</div>
<script type="text/javascript" src="<c:url value="/resources/jquery/jquery.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/jqueryui/jquery-ui.js"/>"></script>
<script>
    $(document).ready(function () {
        $("a").click(function () {
            alert(  "Thanks for visiting")
        })
        $("#date").datepicker();
    })
</script>
</body>
</html>