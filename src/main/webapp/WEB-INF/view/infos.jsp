<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@  taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>   
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="<%=path%>/css/bootstrap.css"/> 
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
</head>
<body>
<form action="/selects" method="post">
	经度:<input type="text" name="jd" value="${infoVO.jd}">
	维度:<input type="text" name="wd" value="${infoVO.wd}">
	距离:<input type="text" name="start" value="${infoVO.start}">--<input type="text" name="end" value="${infoVO.end}">
	<input type="submit" value="查询">
</form>
<table class="table">
	<tr>
		<td>序号</td>
		<td>车牌</td>
		<td>时间</td>
		<td>经度</td>
		<td>维度</td>
		<td>距离</td>
	</tr>
	<c:forEach items="${infos}" var="info" varStatus="i">
		<tr>
			<td>${i.count}</td>
			<td>${info.cardno}</td>
			<td>${info.created}</td>
			<td>${info.jd}</td>
			<td>${info.wd}</td>
			<td>${info.distance}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>