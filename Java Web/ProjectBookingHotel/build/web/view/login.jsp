<%-- 
    Document   : login
    Created on : 14-07-2020, 19:42:04
    Author     : GL552VW
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <style>
        body {

            background: url(images/gold.jpg) no-repeat center center fixed;
            background-size: 1600px;

        }
         .card-body{
            background-color:#ffefea;
        }
        .btn-primary{
            background-color: #e8a88c!important;
            border-color: #da6a08!important;

        }
    </style>
    <body>
          <div>          
              
            <jsp:include page="header.jsp"></jsp:include>
            
         </div>
            <div class="container" style="padding-top: 250px;"> 

                <div class="cotainer">
                    <div class="row justify-content-center">
                        <div class="col-md-10">
                            <div class="card">
                                <div class="card-header">Đăng Ký</div>
                                <div class="card-body">
                                    <form action="login" method="POST" id="login">
                                        <div class="container">
                                            <div class="row">
                                                <div class="col-sm-12">
                                                    <div class="form-group row">
                                                        <label for="username" class="col-md-4 col-form-label text-md-right">Tên đăng nhập</label>
                                                        <div class="col-md-6">
                                                            <input type="text" id="username" class="form-control" name="username" required autofocus placeholder="Username">
                                                        </div>
                                                    </div> 

                                                    <div class="form-group row">
                                                        <label for="password" class="col-md-4 col-form-label text-md-right">Mật khẩu</label>
                                                        <div class="col-md-6">
                                                            <input type="text" id="password" class="form-control" name="password" required placeholder="Password">
                                                        </div>
                                                    </div>


                                                </div>
                                                <div class="col-sm-12">
                                                    <div class="form-group row justify-content-center">
                                                        <div class="col-md-6 offset-md-4">
                                                            <div class="checkbox">
                                                                <label>
                                                                    <input type="checkbox" name="remember"> Remember Me
                                                                </label>
                                                            </div>
                                                        </div>


                                                        <div class="col-md-6 offset-md-4">
                                                            <button type="submit" class="btn btn-primary">
                                                                Đăng nhập
                                                            </button>
                                                            <a href="${pageContext.request.contextPath}/signup" class="btn btn-primary">
                                                            Đăng ký
                                                        </a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
