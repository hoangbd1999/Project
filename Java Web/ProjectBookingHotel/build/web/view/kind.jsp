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
                    <h3 style="color: #955851">LO???I PH??NG </h3>
                    <img src="images/icon.png" alt="Ch??o m???ng ?????n v???i Typn Typn Hotel" style="width: 100%"/>
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
                                            <h2 style="color: #955851">Ph??ng ????n</h2>
                                            <p class="bold">
                                                Gi?? ph??ng: 200 $ / ng??y
                                            </p>                 
                                            Ph??ng ????n v???i thi???t k??? h??i h??a, n???i th???t sang tr???ng v???i ?????y ????? ti???n nghi hi???n ?????i. Di???n t??ch kho???ng 13m<sub>2</sub> m???i ph??ng ???????c trang tr?? c???a s??? mang ?????n kh??ng gian tho???i m??i nh???t cho b???n.
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
                                        <h2 style="color: #955851">Ph??ng ????i </h2>
                                        <p class="bold">
                                            Gi?? ph??ng: 250 $ / ng??y
                                        </p>  
                                        Ph??ng ????i c?? t???m nh??n bao qu??t c?? di???n t??ch kho???ng 16m<sub>2</sub> m???i ph??ng c?? m???t ph??ng ????n v?? m???t ph??ng ????i kh??ng gian r???ng l???n tho???i m??i 
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
                                        <h2 style="color: #955851">Ph??ng VIP</h2>
                                        <p class="bold">
                                            Gi?? ph??ng: 350 $ / ng??y
                                        </p>  
                                        Ph??ng VIP c?? ti???n ??ch sang tr???ng v???i di???n t??ch kho???ng 27m<sub>2</sub> ph?? h???p v???i c??? gia ????nh v???i 2 gi?????ng c??? l???n v?? c?? t???m nh??n ?????p ra ngo??i.
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
