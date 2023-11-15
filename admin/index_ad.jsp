<html>
<head>
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.Date"%>
<%@ page buffer="1kb" autoFlush="true"%>
<%@ page import="example.*" %> <%-- ppt에는 footer 헤더에 넣으라고 되어있음 --%>
    
<%@ page errorPage = "exception/product_not_found.jsp" %> <%-- 6주차 예외처리 다시 확인--%>
<%@ page errorPage = "exception/main_server_downtime.jsp" %> <%-- 6주차 예외처리 다시 확인--%>
    
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script>
	window.open("popup/popup1.jsp", "popup", "width=365, height = 250, left = 0, top=0")
</script>
<title>냥이 공간</title>
</head>
<body>	<%-- JSP 주석 처리 --%>  <%-- 부트스트랩 --%>
    <%@ include file="top_banner.jsp" %>
	<%@ include file="top_menu.jsp" %>
	<%@ include file="body_main.jsp" %>	
    <%@ include file="footer.jsp" %>
    
현재 페이지 버퍼 용량 : <%= out.getBufferSize() %> <br>
남은 페이지 버퍼 용량 : <%= out.getRemaining() %>
</body>
</html>