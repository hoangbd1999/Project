<%-- 
    Document   : footer
    Created on : 18-07-2020, 22:06:56
    Author     : GL552VW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <style>
        @import url('https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css');
        section {
            padding: 60px 0;
        }

        section .section-title {
            text-align: center;
            color: #007b5e;
            margin-bottom: 50px;
            text-transform: uppercase;
        }
        #footer {
            background: #e8a88c !important;
        }
        #footer h5{
            padding-left: 10px;
            border-left: 3px solid #eeeeee;
            padding-bottom: 6px;
            margin-bottom: 20px;
            color:#9a5f5c;
        }
        #footer a {
            color: #ffffff;
            text-decoration: none !important;
            background-color: transparent;
            -webkit-text-decoration-skip: objects;
        }
        #footer ul.social li{
            padding: 3px 0;
        }
        #footer ul.social li a i {
            margin-right: 5px;
            font-size:25px;
            -webkit-transition: .5s all ease;
            -moz-transition: .5s all ease;
            transition: .5s all ease;
        }
        #footer ul.social li:hover a i {
            font-size:30px;
            margin-top:-10px;
        }
        #footer ul.social li a,
        #footer ul.quick-links li a{
           color: #641208;
        }
        #footer ul.social li a:hover{
            color:#eeeeee;
        }
        #footer ul.quick-links li{
            padding: 3px 0;
            -webkit-transition: .5s all ease;
            -moz-transition: .5s all ease;
            transition: .5s all ease;
        }
        #footer ul.quick-links li:hover{
            padding: 3px 0;
            margin-left:5px;
            font-weight:700;
        }
        #footer ul.quick-links li a i{
            margin-right: 5px;
        }
        #footer ul.quick-links li:hover a i {
            font-weight: 700;
        }
        .hi{
            color: #641208;
        }
        

        @media (max-width:767px){
            #footer h5 {
                padding-left: 0;
                border-left: transparent;
                padding-bottom: 0px;
                margin-bottom: 10px;
            }
        }
    </style>
    <body>
        <section id="footer">
            <div class="container">
                <div class="row text-center text-xs-center text-sm-left text-md-left">
                    <div class="col-xs-12 col-sm-4 col-md-4">
                        <h5>TypnTypn HOTEL</h5>
                        <ul class="list-unstyled quick-links">
                            <p class="hi">19 Hoài Thanh, Ninh Xá, Bắc Ninh</p>
                            <p class="hi">(024) 6259 8807 - (024) 6259 8807</p>
                            <p class="hi">Copyright © TypnTypn HOTEL. 2018 All Rights ReservedWebhotel</p>
                        </ul>
                    </div>
                    <div class="col-xs-12 col-sm-4 col-md-4">
                        <h5>VỀ CHÚNG TÔI</h5>
                        <ul class="list-unstyled quick-links">
                            <li><a href="https://www.facebook.com/profile.php?id=100015596220324"><i class="fa fa-angle-double-right"></i>Liên Hệ</a></li>
                            <li><a href="https://www.facebook.com/profile.php?id=100015596220324"><i class="fa fa-angle-double-right"></i>Địa chỉ & bản đồ</a></li>
                            <li><a href="https://www.facebook.com/profile.php?id=100015596220324"><i class="fa fa-angle-double-right"></i> Điều kiện & Điều khoản</a></li>
                            <li><a href="https://www.facebook.com/profile.php?id=100015596220324"><i class="fa fa-angle-double-right"></i>Tin tức</a></li>
                            <li><a href="https://www.facebook.com/profile.php?id=100015596220324"><i class="fa fa-angle-double-right"></i>Videos</a></li>
                        </ul>
                    </div>
                    <div class="col-xs-12 col-sm-4 col-md-4">
                        <h5>FeedBack</h5>
                        <p class="hi">Please send us your ideas, bug reports, suggestions! Any feedback would be appreciated.</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-5">
                        <ul class="list-unstyled list-inline social text-center">
                            <li class="list-inline-item"><a href="https://www.facebook.com/profile.php?id=100015596220324"><i class="fa fa-facebook"></i></a></li>
                            <li class="list-inline-item"><a href="https://www.facebook.com/profile.php?id=100015596220324"><i class="fa fa-twitter"></i></a></li>
                            <li class="list-inline-item"><a href="https://www.facebook.com/profile.php?id=100015596220324"><i class="fa fa-instagram"></i></a></li>
                            <li class="list-inline-item"><a href="https://www.facebook.com/profile.php?id=100015596220324"><i class="fa fa-google-plus"></i></a></li>
                            <li class="list-inline-item"><a href="https://www.facebook.com/profile.php?id=100015596220324" target="_blank"><i class="fa fa-envelope"></i></a></li>
                        </ul>
                    </div>
                 
                </div>	
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-2 text-center text-white">
                        <p class="hi"><u><a href="https://www.facebook.com/profile.php?id=100015596220324">TypnTypn Company</a></u> is a VIETNAMESE Company developing tourism business both at home and abroad</p>
                        <p class="hi">© All right Reversed.<a class="text-green ml-2" href="https://www.facebook.com/profile.php?id=100015596220324" target="_blank">TypnTypn</a></p>
                         
                    </div>

                </div>	
               
            </div> 
            <p class="font-weight-bold" style="margin-left: 1400px; font-size: 20px;">${view}</p>
        </section>
        
    </body>
</html>
