<%-- 
    Document   : adheader
    Created on : 23-07-2020, 19:40:15
    Author     : GL552VW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel = "stylesheet" href="css/default.css" type="text/css"> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
         <div class="container-fluid fixed-top">
            <nav class="navbar navbar-expand-sm navbar-dark divall1">

                <a href="${pageContext.request.contextPath}/home" style="padding-left: 6%">
                    <img class="img-menu" src="images/logo.png" alt="">
                </a>

                <div class="collapse navbar-collapse" id="collapsibleNavId">
                    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">

                        <li class="nav-item " style="padding: 0 10px 0 10px">
                            <a class="nav-link" href="${pageContext.request.contextPath}/adhome"><h6>Trang chủ</h6><span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item" style="padding: 0 10px 0 10px">
                            <a class="nav-link" href="${pageContext.request.contextPath}/checkout"><h6>Hủy Phòng</h6></a>
                        </li>
                        <li class="nav-item" style="padding: 0 10px 0 10px">
                            <a class="nav-link" href="${pageContext.request.contextPath}/listcus"><h6>Xem Phòng</h6></a>
                        </li>

                    </ul>    
                    <c:if test="${requestScope.a!=null}">
                        <ul class="nav navbar-nav navbar-right " style="padding-left: 50px">
                            <li style="padding: 0 10px 0 10px" class="nav-item" ><a href="#" class="nav-link"><span class="glyphicon glyphicon-user"></span><h6>${requestScope.nick}</h6></a></li>
                            <li class="nav-item"><a href="${pageContext.request.contextPath}/logout" class="nav-link"><span class="glyphicon glyphicon-log-in"></span> <h6>Đăng Xuất</h6></a></li>
                        </ul>
                    </c:if>

                </div>
            </nav>
        </div>
    </body>
</html>
