<%-- 
    Document   : service
    Created on : 23-07-2020, 21:04:38
    Author     : GL552VW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel = "stylesheet" href="css/default.css" type="text/css">   
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <style>
        body {

            background-image: url(images/patern.png);
        }
        .Accomodation-container ul li {
            list-style: none;
            clear: both;
            display: -webkit-box;
            padding-top: 60px;
            padding-bottom: 60px;
        }
        .Accomodation-container ul li .Left-row {
            width: 46%;
            float: left;
            padding: 0 2%;
            height: 230px;
        }
        .Accomodation-container ul li .Right-row {
            width: 46%;
            float: left;
            padding: 0 2%;
        }
        .left{
            padding-top: 30px;
            color:#955851; 
            background-color: #ffefea;
        }
    </style>
    <script>
        function ahihi() {
            alert("Service set successfully")

        }
    </script>
    <body>
        <div>          

            <jsp:include page="header.jsp"></jsp:include>

            </div>
            <div class="row">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="images/cover.jpg" height="500px" alt="First slide">
                </div>
            </div>

            <div class="row ">
                <div class="col-sm-2" style="margin-left: 700px; text-align: center;padding-top: 100px;">
                    <h3 style="color: #955851">Dịch Vụ </h3>
                    <img src="images/icon.png" alt="Chào mừng đến với Typn Typn Hotel" style="width: 100%"/>

                </div>

            </div>
            <p style="text-align: center;margin-left: 100px;">Nếu như bạn đang tìm một ngôi nhà để lưu trú, thì the PT Houses là sự lựa chọn tuyệt vời của bạn. Hơn thế nữa, chúng tôi luôn</p>
            <p style="margin-left: 500px;">muốn đem lại sự tiện nghi nhất cho các vị khách thông qua các dịch vụ tiện nghi sau.</p>

            <section>

                <div class="container col-md-12">
                    <div class="container">                      
                        <div class="wpb_wrapper">
                            <div class="Accomodation-container">
                                <ul>
                                    <li>
                                    <c:forEach items="${requestScope.services}" var="s" varStatus="loop">

                                        <c:if test="${loop.index mod 2 == 0}">

                                            <div class="col-md-6">
                                                <div class="Accomodation-inner-container">
                                                    <div class="Left-row">
                                                        <img width="100%" src="images/${s.sid}.jpg" alt=""/>
                                                    </div>
                                                    <div class="Right-row">
                                                        <h4>${s.name}</h4>               
                                                        <p class="font-weight-bold">
                                                            Giá dịch vụ: ${s.price} đồng
                                                        </p>

                                                        <c:if test="${s.sid == 'S01'}">
                                                            Quần áo của bạn sẽ sạch sẽ ngay khi bạn sử dụng dịch vụ<br/>
                                                        </c:if>
                                                        <c:if test="${s.sid == 'S02'}">
                                                            Quần áo của bạn sẽ sạch sẽ ngay khi bạn sử dụng dịch vụ<br/>
                                                        </c:if>
                                                        <c:if test="${s.sid == 'S03'}">
                                                            Thức ăn ngon miệng luôn luôn chờ để phục vụ bạn<br/>
                                                        </c:if>
                                                        <c:if test="${s.sid == 'S04'}">
                                                            Khu vực an toàn cho phương tiện di chuyển của bạn<br/>
                                                        </c:if>
                                                        <c:if test="${requestScope.a == null}">
                                                            <a class="btn btn-primary" href="${pageContext.request.contextPath}/login">Đặt dịch vụ</a>
                                                        </c:if>
                                                        <c:if test="${requestScope.a !=null}">
                                                            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#${s.sid}">
                                                                Đặt dịch vụ
                                                            </button>
                                                        </c:if>
                                                        <div class="modal" id="${s.sid}">
                                                            <div class="modal-dialog">
                                                                <div class="modal-content">

                                                                    <!-- Modal Header -->
                                                                    <div class="modal-header">
                                                                        <h4 class="modal-title">Xác nhận dịch vụ</h4>
                                                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                                    </div>
                                                                    <c:if test="${requestScope.size != 0}">
                                                                        <form action="service" method="post">
                                                                            <input type="hidden" name="sid" value="${s.sid}"/>
                                                                            <!-- Modal body -->

                                                                            <div class="modal-body">
                                                                                <div class="form-group">
                                                                                    <label for="kind">Số phòng : </label>
                                                                                    <select class="form-control" id="rid" name="rid" style="height:40px;width: 150px">
                                                                                        <c:forEach items="${requestScope.rooms}" var="r">
                                                                                            <option ${(r.rid == requestScope.rid)?"selected=\"selected\"":"" } value="${r.rid}">${r.roomnumber}</option>
                                                                                        </c:forEach>
                                                                                    </select>
                                                                                </div>
                                                                                ${s.name} : ${s.price} đồng/sản phẩm
                                                                            </div>

                                                                            <!-- Modal footer -->
                                                                            <div class="modal-footer">
                                                                                <button type="submit" onclick="ahihi()" class="btn btn-danger">Đồng ý</button>
                                                                            </div>
                                                                        </form>
                                                                    </c:if>
                                                                    <c:if test="${requestScope.size == 0}">
                                                                        <div class="modal-body">
                                                                            ${requestScope.error}
                                                                        </div>
                                                                        <div class="modal-footer">
                                                                            <button type="submit" class="btn btn-danger" data-dismiss="modal">Đồng ý</button>
                                                                        </div>
                                                                    </c:if>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </c:if>

                                    </c:forEach>
                                </li>
                                <li>
                                    <c:forEach items="${requestScope.services}" var="s" varStatus="loop">

                                        <c:if test="${loop.index mod 2 == 1}">
                                            <div class="col-md-6">
                                                <div class="Accomodation-inner-container">
                                                    <div class="Left-row">
                                                        <img width="100%" src="images/${s.sid}.jpg" alt=""/>
                                                    </div>
                                                    <div class="Right-row">
                                                        <h4>${s.name}</h4>
                                                        <p class="bold_p_accommodation">
                                                            Giá dịch vụ: ${s.price} đồng
                                                        </p>
                                                        <c:if test="${s.sid == 'S01'}">
                                                          Quần áo của bạn sẽ sạch sẽ ngay khi bạn sử dụng dịch vụ<br/>
                                                        </c:if>
                                                        <c:if test="${s.sid == 'S02'}">
                                                           Quần áo của bạn sẽ sạch sẽ ngay khi bạn sử dụng dịch vụ<br/>
                                                        </c:if>
                                                        <c:if test="${s.sid == 'S03'}">
                                                            Thức ăn ngon miệng luôn luôn chờ để phục vụ bạn<br/>
                                                        </c:if>
                                                        <c:if test="${s.sid == 'S04'}">
                                                            Khu vực an toàn cho phương tiện di chuyển của bạn<br/>
                                                        </c:if>                                        
                                                        <c:if test="${requestScope.a == null}">
                                                            <a class="btn btn-primary" href="${pageContext.request.contextPath}/login">Đặt dịch vụ</a>
                                                        </c:if>
                                                        <c:if test="${requestScope.a !=null}">
                                                            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#${s.sid}">
                                                                Đặt dịch vụ
                                                            </button>
                                                        </c:if>

                                                        <div class="modal" id="${s.sid}">
                                                            <div class="modal-dialog">
                                                                <div class="modal-content">

                                                                    <!-- Modal Header -->
                                                                    <div class="modal-header">
                                                                        <h4 class="modal-title">Xác nhận dịch vụ</h4>
                                                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                                    </div>
                                                                    <c:if test="${requestScope.size != 0}">
                                                                        <form action="service" method="post">
                                                                            <input type="hidden" name="sid" value="${s.sid}"/>
                                                                            <!-- Modal body -->

                                                                            <div class="modal-body">
                                                                                <div class="form-group">
                                                                                    <label for="kind">Số phòng : </label>
                                                                                    <select class="form-control" id="rid" name="rid" style="height:40px;width: 150px">
                                                                                        <c:forEach items="${requestScope.rooms}" var="r">
                                                                                            <option ${(r.rid == requestScope.rid)?"selected=\"selected\"":"" } value="${r.rid}">${r.roomnum}</option>
                                                                                        </c:forEach>
                                                                                    </select>
                                                                                </div>
                                                                                ${s.name} : ${s.price} đồng/sản phẩm
                                                                            </div>

                                                                            <!-- Modal footer -->
                                                                            <div class="modal-footer">
                                                                                <button type="submit" onclick="ahihi()" class="btn btn-danger">Đồng ý</button>
                                                                            </div>
                                                                        </form>
                                                                    </c:if>
                                                                    <c:if test="${requestScope.size == 0}">
                                                                        <div class="modal-body">
                                                                            ${requestScope.error}
                                                                        </div>
                                                                        <div class="modal-footer">
                                                                            <button type="submit" class="btn btn-danger" onclick="ahihi()" data-dismiss="modal">Đồng ý</button>
                                                                        </div>
                                                                    </c:if>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </c:if>

                                    </c:forEach>
                                </li> 
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <div class="left mt-4">

            <div style="margin-left: 300px; padding-top: 10px;"><h2>Do You Have Any Question?</h2></div>
            <div><a style="margin-left: 65%; color:white;background: #e8a88c; padding: 1px 30px; border-radius: 20px;width:100px;" href="${pageContext.request.contextPath}/kind">Contact Us</a></div>

        </div>

        <div>
            <jsp:include page="footer.jsp"></jsp:include>
        </div>   
    </body>
</html>
