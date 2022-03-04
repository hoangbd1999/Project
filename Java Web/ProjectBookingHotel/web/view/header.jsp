<%-- 
    Document   : header
    Created on : 24-06-2020, 19:09:27
    Author     : GL552VW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP header</title>
        <link rel = "stylesheet" href="css/default.css" type="text/css">   
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
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
                          <a class="nav-link" href="${pageContext.request.contextPath}/home"><h6>Trang chủ</h6><span class="sr-only">(current)</span></a>
                      </li>
                      <li class="nav-item" style="padding: 0 10px 0 10px">
                        <a class="nav-link" href="${pageContext.request.contextPath}/about"><h6>Giới thiệu</h6></a>
                    </li>
                      <li class="nav-item" style="padding: 0 10px 0 10px">
                          <a class="nav-link" href="${pageContext.request.contextPath}/kind"><h6>Loại Phòng</h6></a>
                      </li>
                      <li class="nav-item" style="padding: 0 10px 0 10px">
                        <a class="nav-link" href="${pageContext.request.contextPath}/service"><h6>Dịch vụ</h6></a>
                    </li>
                    <li class="nav-item" style="padding: 0 10px 0 10px">
                        <a class="nav-link" href="${pageContext.request.contextPath}/book"><h6>Đặt Phòng</h6></a>
                    </li>
                    <li class="nav-item" style="padding: 0 10px 0 10px">
                        <a class="nav-link" href="#"><h6>Đánh Giá</h6></a>
                    </li>   
                                                          
                  </ul>
                <c:if test="${requestScope.a==null}">
                    <ul class="nav navbar-nav navbar-right " >
                        <li class="nav-item" ><a href="${pageContext.request.contextPath}/signup" class="nav-link"><span class="glyphicon glyphicon-user"></span><h6>Đăng Ký</h6> </a></li>
                        <li class="nav-item"><a href="${pageContext.request.contextPath}/login" class="nav-link"><span class="glyphicon glyphicon-log-in"></span> <h6>Đăng Nhập</h6></a></li>
                  
                  </ul>
                </c:if>
                
                <c:if test="${requestScope.a!=null}">
                    <ul class="nav navbar-nav navbar-right " style="padding-left: 50px">
                        <li style="padding: 0 10px 0 10px" class="nav-item" ><a href="#" class="nav-link"><span class="glyphicon glyphicon-user"></span><h6>${requestScope.nick}</h6></a></li>
                        <li class="nav-item"><a href="${pageContext.request.contextPath}/logout" class="nav-link"><span class="glyphicon glyphicon-log-in"></span> <h6>Đăng Xuất</h6></a></li>
                    </ul>
                </c:if>
                      
              </div>
          </nav>
      </div>
        
        <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
