<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>Home page</title>
<link rel="sytlesheet" href="css/site.css"/>
</head>
<body>
	<header>
		<h3 style="text-align:right">
		<%=LocalDate.now() %>
		</h3>
		<h1 style="border-bottom:1px solid black">${appTitle}</h1>
<nav>
<a href="home">Home</a>
<a href="hello">Hello</a>
<a href="visitor">Visitor</a>
</nav>
</header>