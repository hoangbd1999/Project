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
                    <h3 style="color: #955851">D???ch V??? </h3>
                    <img src="images/icon.png" alt="Ch??o m???ng ?????n v???i Typn Typn Hotel" style="width: 100%"/>

                </div>

            </div>
            <p style="text-align: center;margin-left: 100px;">N???u nh?? b???n ??ang t??m m???t ng??i nh?? ????? l??u tr??, th?? the PT Houses l?? s??? l???a ch???n tuy???t v???i c???a b???n. H??n th??? n???a, ch??ng t??i lu??n</p>
            <p style="margin-left: 500px;">mu???n ??em l???i s??? ti???n nghi nh???t cho c??c v??? kh??ch th??ng qua c??c d???ch v??? ti???n nghi sau.</p>

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
                                                            Gi?? d???ch v???: ${s.price} ?????ng
                                                        </p>

                                                        <c:if test="${s.sid == 'S01'}">
                                                            Qu???n ??o c???a b???n s??? s???ch s??? ngay khi b???n s??? d???ng d???ch v???<br/>
                                                        </c:if>
                                                        <c:if test="${s.sid == 'S02'}">
                                                            Qu???n ??o c???a b???n s??? s???ch s??? ngay khi b???n s??? d???ng d???ch v???<br/>
                                                        </c:if>
                                                        <c:if test="${s.sid == 'S03'}">
                                                            Th???c ??n ngon mi???ng lu??n lu??n ch??? ????? ph???c v??? b???n<br/>
                                                        </c:if>
                                                        <c:if test="${s.sid == 'S04'}">
                                                            Khu v???c an to??n cho ph????ng ti???n di chuy???n c???a b???n<br/>
                                                        </c:if>
                                                        <c:if test="${requestScope.a == null}">
                                                            <a class="btn btn-primary" href="${pageContext.request.contextPath}/login">?????t d???ch v???</a>
                                                        </c:if>
                                                        <c:if test="${requestScope.a !=null}">
                                                            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#${s.sid}">
                                                                ?????t d???ch v???
                                                            </button>
                                                        </c:if>
                                                        <div class="modal" id="${s.sid}">
                                                            <div class="modal-dialog">
                                                                <div class="modal-content">

                                                                    <!-- Modal Header -->
                                                                    <div class="modal-header">
                                                                        <h4 class="modal-title">X??c nh???n d???ch v???</h4>
                                                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                                    </div>
                                                                    <c:if test="${requestScope.size != 0}">
                                                                        <form action="service" method="post">
                                                                            <input type="hidden" name="sid" value="${s.sid}"/>
                                                                            <!-- Modal body -->

                                                                            <div class="modal-body">
                                                                                <div class="form-group">
                                                                                    <label for="kind">S??? ph??ng : </label>
                                                                                    <select class="form-control" id="rid" name="rid" style="height:40px;width: 150px">
                                                                                        <c:forEach items="${requestScope.rooms}" var="r">
                                                                                            <option ${(r.rid == requestScope.rid)?"selected=\"selected\"":"" } value="${r.rid}">${r.roomnumber}</option>
                                                                                        </c:forEach>
                                                                                    </select>
                                                                                </div>
                                                                                ${s.name} : ${s.price} ?????ng/s???n ph???m
                                                                            </div>

                                                                            <!-- Modal footer -->
                                                                            <div class="modal-footer">
                                                                                <button type="submit" onclick="ahihi()" class="btn btn-danger">?????ng ??</button>
                                                                            </div>
                                                                        </form>
                                                                    </c:if>
                                                                    <c:if test="${requestScope.size == 0}">
                                                                        <div class="modal-body">
                                                                            ${requestScope.error}
                                                                        </div>
                                                                        <div class="modal-footer">
                                                                            <button type="submit" class="btn btn-danger" data-dismiss="modal">?????ng ??</button>
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
                                                            Gi?? d???ch v???: ${s.price} ?????ng
                                                        </p>
                                                        <c:if test="${s.sid == 'S01'}">
                                                          Qu???n ??o c???a b???n s??? s???ch s??? ngay khi b???n s??? d???ng d???ch v???<br/>
                                                        </c:if>
                                                        <c:if test="${s.sid == 'S02'}">
                                                           Qu???n ??o c???a b???n s??? s???ch s??? ngay khi b???n s??? d???ng d???ch v???<br/>
                                                        </c:if>
                                                        <c:if test="${s.sid == 'S03'}">
                                                            Th???c ??n ngon mi???ng lu??n lu??n ch??? ????? ph???c v??? b???n<br/>
                                                        </c:if>
                                                        <c:if test="${s.sid == 'S04'}">
                                                            Khu v???c an to??n cho ph????ng ti???n di chuy???n c???a b???n<br/>
                                                        </c:if>                                        
                                                        <c:if test="${requestScope.a == null}">
                                                            <a class="btn btn-primary" href="${pageContext.request.contextPath}/login">?????t d???ch v???</a>
                                                        </c:if>
                                                        <c:if test="${requestScope.a !=null}">
                                                            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#${s.sid}">
                                                                ?????t d???ch v???
                                                            </button>
                                                        </c:if>

                                                        <div class="modal" id="${s.sid}">
                                                            <div class="modal-dialog">
                                                                <div class="modal-content">

                                                                    <!-- Modal Header -->
                                                                    <div class="modal-header">
                                                                        <h4 class="modal-title">X??c nh???n d???ch v???</h4>
                                                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                                    </div>
                                                                    <c:if test="${requestScope.size != 0}">
                                                                        <form action="service" method="post">
                                                                            <input type="hidden" name="sid" value="${s.sid}"/>
                                                                            <!-- Modal body -->

                                                                            <div class="modal-body">
                                                                                <div class="form-group">
                                                                                    <label for="kind">S??? ph??ng : </label>
                                                                                    <select class="form-control" id="rid" name="rid" style="height:40px;width: 150px">
                                                                                        <c:forEach items="${requestScope.rooms}" var="r">
                                                                                            <option ${(r.rid == requestScope.rid)?"selected=\"selected\"":"" } value="${r.rid}">${r.roomnum}</option>
                                                                                        </c:forEach>
                                                                                    </select>
                                                                                </div>
                                                                                ${s.name} : ${s.price} ?????ng/s???n ph???m
                                                                            </div>

                                                                            <!-- Modal footer -->
                                                                            <div class="modal-footer">
                                                                                <button type="submit" onclick="ahihi()" class="btn btn-danger">?????ng ??</button>
                                                                            </div>
                                                                        </form>
                                                                    </c:if>
                                                                    <c:if test="${requestScope.size == 0}">
                                                                        <div class="modal-body">
                                                                            ${requestScope.error}
                                                                        </div>
                                                                        <div class="modal-footer">
                                                                            <button type="submit" class="btn btn-danger" onclick="ahihi()" data-dismiss="modal">?????ng ??</button>
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
