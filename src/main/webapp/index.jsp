<!DOCTYPE html>
<html>
<head>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<title>Index Page</title>
<spring:url value="/js/jquery.min.js" var="jqueryJsUrl"
	htmlEscape="true" />
<spring:url value="/js/app.js" var="appJsUrl" htmlEscape="true" />

<script src="${jqueryJsUrl}"></script>
<script src="${appJsUrl}"></script>
</html>
