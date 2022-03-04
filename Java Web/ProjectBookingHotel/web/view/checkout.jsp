<%-- 
    Document   : checkout
    Created on : 23-07-2020, 19:38:08
    Author     : GL552VW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel = "stylesheet" href="css/default.css" type="text/css"> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <script>
        function find() {
            var from = document.getElementById("from").value;
            var to = document.getElementById("to").value;
            var roomnum = document.getElementById("roomnum").value;
            var user = document.getElementById("user").value;
            if (from > to) {
                alert("Lựa chọn lại Date To");
            }
            else if (from == null || to == null || roomnum == null || user == null || from == "" || to == "" || roomnum == "" || user == "")
                alert("Not null")
            else
                document.getElementById("find").submit();
        }
    </script>
    <body>
         <jsp:include page="adheader.jsp"></jsp:include>
          <div class="row">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="images/cover.jpg" height="500px" alt="First slide">
                </div>
            </div>
          <section>
                <div class="container">
                    <div class="row ">
                        <div class="col-sm-2" style="margin-left: 470px; text-align: center;padding-top: 50px;">
                            <h3 style="color: #955851" >Hủy Phòng</h3>
                            <img src="images/icon.png" alt="Chào mừng đến với Typn Typn Hotel" style="width: 100%"/>
                        </div>
                    </div><br/><br/>
                    <div class="d-flex justify-content-center">
                        <div class="col-md-6" >
                            <div class="panel panel-info col-md-12" style="border: 1px solid #bce8f1;">

                                <form action="checkout" id="find" method="post" class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="fromf01">Ng&#224;y đến<span class="required">*</span></label>
                                            <input class="form-control" type="date" name="from" id="from" value="${requestScope.from}" />
                                    </div>
                                    <div class="form-group">
                                        <div class="form-group">
                                            <label for="tof01">Số Phòng<span class="required">*</span></label>
                                            <input class="form-control" type="text" id="roomnum" name="roomnum" id="" value="${requestScope.roomnum}" />
                                        </div>
                                    </div>
                                </div>

                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="tof01">Ng&#224;y đi<span class="required">*</span></label>
                                        <input class="form-control" type="date" name="to" id="to" value="${requestScope.to}" />
                                    </div>
                                    <div class="form-group">
                                        <label for="tof01">Username<span class="required">*</span></label>
                                        <input class="form-control" type="text" id="user" name="user" id="" value="${requestScope.user}" />
                                    </div>


                                </div>
                                <input type="hidden" name="fid" value="F02"></input>
                                <div style="padding: 15px 15px">
                                    <input type="button" value="Tìm thông tin" onclick="find()" class="btn btn-primary"/>
                                </div>
                                <div>${requestScope.error}</div>
                            </form>
                            <c:if test="${requestScope.name!=null}">
                                <div class="form-group">
                                    <label >Tên khách hàng</label>
                                    <input class="form-control" type="text" readonly="" value="${requestScope.name}" />
                                    <form action="delete" method="post">
                                        <input type="hidden" name="user" value="${requestScope.user}">
                                        <input type="hidden" name="rid" value="${requestScope.rid}">
                                        <input type="hidden" name="from" value="${requestScope.from}">
                                        <input type="hidden" name="to" value="${requestScope.to}">
                                        <div style="padding: 15px 15px">
                                            <input type="submit" value="Check Out" class="btn btn-primary"/>
                                        </div>
                                    </form>
                                </div>
                            </c:if>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>
