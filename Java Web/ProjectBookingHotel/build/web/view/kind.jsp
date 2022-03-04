<%-- 
    Document   : kind
    Created on : 18-07-2020, 19:48:58
    Author     : GL552VW
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="model.KindOfRoom"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <style>

        .Accomodation-container ul li {
            list-style: none;
            clear: both;
            display: -webkit-box;
            padding-top: 60px;
            padding-bottom: 60px;
        }
        .Accomodation-container ul li:nth-child(odd) .Left-row {
            width: 46%;
            float: left;
            padding: 0 2%;
            height: 230px;
        }
        .Accomodation-container ul li:nth-child(odd) .Right-row {
            width: 46%;
            float: left;
            padding: 0 2%;
            padding-top: 20px;
        }
        .Accomodation-container ul li:nth-child(even) .Left-row {
            width: 46%;
            float: right;
            padding: 0 2%;
            height: 230px;
        }
        .Accomodation-container ul li:nth-child(even) .Right-row {
            width: 46%;
            float: right;
            padding: 0 2%;
            padding-top: 20px;
        }
        .Accomodation-container ul li:nth-child(odd) .Right-row a {
            color: #955851;
            font-style: initial;
            text-align: right;
            display: block;
        }
        .Accomodation-container ul li:nth-child(even) .Left-row a {
            color: #955851;
            font-style: initial;
            text-align: right;
            display: block;
        }
        .bold{
            font-weight: 700;
        }
        .left{
            padding-top: 30px;
            color:#955851; 
            background-color: #ffefea;
        }

    </style>
    <body>


        <jsp:include page="header.jsp"></jsp:include>

            <div class="row">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="images/cover.jpg" height="500px" alt="First slide">
                </div>
            </div>

            <div class="row ">
                <div class="col-sm-2" style="margin-left: 700px; text-align: center;padding-top: 100px;">
                    <h3 style="color: #955851">LOẠI PHÒNG </h3>
                    <img src="images/icon.png" alt="Chào mừng đến với Typn Typn Hotel" style="width: 100%"/>
                </div>
            </div>
            <section class="section-room bg-white">
                <div class="container">
                    <div class="wpb_wrapper">
                        <div class="Accomodation-container">
                            <ul>

                                <li>
                                    <div class="Accomodation-inner-container">
                                        <div class="Left-row">
                                            <img width="100%" src="images/K03.jpg"  />
                                        </div>
                                        <div class="Right-row">
                                            <h2 style="color: #955851">Phòng đơn</h2>
                                            <p class="bold">
                                                Giá phòng: 200 $ / ngày
                                            </p>                 
                                            Phòng đơn với thiết kế hài hòa, nội thất sang trọng với đầy đủ tiện nghi hiện đại. Diện tích khoảng 13m<sub>2</sub> mỗi phòng được trang trí cửa sổ mang đến không gian thoải mái nhất cho bạn.
                                            <a href="${pageContext.request.contextPath}/single">Read Detail >><span aria-hidden="true" class="arrow_carrot-2right"></span></a>
                                    </div>
                                </div>
                            </li>

                            <li>
                                <div class="Accomodation-inner-container"  style="background-color:#f5f5f5;border-radius:30px;">
                                    <div class="Right-row">
                                        <img width="100%" src="images/K02.jpg"  />
                                    </div>
                                    <div class="Left-row">
                                        <h2 style="color: #955851">Phòng đôi </h2>
                                        <p class="bold">
                                            Giá phòng: 250 $ / ngày
                                        </p>  
                                        Phòng đôi có tầm nhìn bao quát có diện tích khoảng 16m<sub>2</sub> mỗi phòng có một phòng đơn và một phòng đôi không gian rộng lớn thoải mái 
                                        <a href="${pageContext.request.contextPath}/double">Read Detail >><span aria-hidden="true" class="arrow_carrot-2right"></span></a>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="Accomodation-inner-container">
                                    <div class="Left-row">
                                        <img width="100%" src="images/K01.jpg"  />
                                    </div>
                                    <div class="Right-row">
                                        <h2 style="color: #955851">Phòng VIP</h2>
                                        <p class="bold">
                                            Giá phòng: 350 $ / ngày
                                        </p>  
                                        Phòng VIP có tiện ích sang trọng với diện tích khoảng 27m<sub>2</sub> phù hợp với cả gia đình với 2 giường cỡ lớn và có tầm nhìn đẹp ra ngoài.
                                        <a href="${pageContext.request.contextPath}/vip">Read Detail >><span aria-hidden="true" class="arrow_carrot-2right"></span></a>
                                    </div>
                                </div>
                            </li>

                        </ul>
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
