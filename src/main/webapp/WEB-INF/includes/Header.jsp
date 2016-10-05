<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand " style="color: white">hacker</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="${pageContext.request.contextPath}/Blog">Blog</a></li>
					<li><a href="${pageContext.request.contextPath}/forum">Forum</a></li>
					<li><a href="${pageContext.request.contextPath}/userdetails">Login</a></li>
					
					</ul>
					</div>
					</div>
					</nav>