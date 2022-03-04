<%-- 
    Document   : singleroom
    Created on : 18-07-2020, 15:46:18
    Author     : GL552VW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <style>
        #carouselExampleIndicators{
            width: 50%;
            margin-left: 28%;          
            border:solid 5px #ffe8e0;
            position: relative;
        }
        .wpb_wrapper{
            width: 50%;
            margin-left: 28%;
            padding-top: 40px;

        }
        .left{
            padding-top: 30px;
            color:#955851; 
            background-color: #ffefea;
        }

    </style>
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
                    <h3 style="color: #955851">Phòng Đơn </h3>
                    <img src="images/icon.png" alt="Chào mừng đến với Typn Typn Hotel" style="width: 100%"/>
                </div>
            </div>
            <div id="carouselExampleIndicators" class="carousel slide mt-4" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block w-100" src="images/401.jpg" alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="images/402.jpg" alt="Second slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="images/403.jpg" alt="Third slide">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>

            <div class="wpb_wrapper">
                Ph&ograve;ng Đơn c&oacute; tầm nh&igrave;n bao qu&aacute;t, c&oacute; diện t&iacute;ch khoảng 30m<sup>2</sup> được chia th&agrave;nh 1 ph&ograve;ng ngủ v&agrave; 1 ph&ograve;ng kh&aacute;ch ri&ecirc;ng biệt c&ugrave;ng với 1 ban c&ocirc;ng nhỏ c&oacute; đặt b&agrave;n tr&agrave; ở ph&iacute;a ngo&agrave;i để qu&yacute; kh&aacute;ch c&oacute; thể vừa thưởng thức tr&agrave; vừa ngắm b&igrave;nh minh hay ho&agrave;ng h&ocirc;n.<br />
                Ph&ograve;ng Đơn của ch&uacute;ng t&ocirc;i với lối kiến tr&uacute;c độc đ&aacute;o v&agrave; nội thất sang trọng sẽ mang đến cho bạn cảm gi&aacute;c thoải m&aacute;i, lạc v&agrave;o 1 kh&ocirc;ng gian sang trọng, đẳng cấp.<br />
                <br/><br/>
                <strong>Tiện &iacute;ch trong ph&ograve;ng:</strong><br/><br/>
                <table border="0" cellpadding="8" cellspacing="0" style="width:100%">
                    <tbody>
                        <tr>
                            <td style="width:50%">
                                <ul>
                                    <li>Diện t&iacute;ch: 30-35m<sup>2</sup></li>
                                    <li>Điều hòa 2 chiều</li>
                                    <li>Điện thoại</li>
                                    <li>Mini bar và đồ uống</li>
                                    <li>Kết nối wifi và internet</li>
                                    <li>Dịch vụ phục vụ tại phòng</li>
                                </ul>
                            </td>
                            <td>
                                <ul>
                                    <li>1 giường kingsize </li>
                                    <li>Phòng tắm với bồn tắm đứng và vòi hoa sen</li>
                                    <li>Ti vi LCD SONY 32 inch</li>
                                    <li>Bàn trà với trà và café miễn phí</li>
                                    <li>Miễn phí chỗ gửi xe tại khách sạn</li>                                   
                                </ul>
                            </td>
                        </tr>
                    </tbody>
                </table><br/>
                <a style="color:white;background: #e8a88c; padding: 10px 20px; border-radius: 20px; margin-left: 320px ;width:120px;" href="${pageContext.request.contextPath}/book">Book long term<span aria-hidden="true" class="arrow_carrot-2right"></span></a><br><br>
        </div>
    <div class="left mt-4">

            <div style="margin-left: 300px; padding-top: 10px;"><h2>Do You Have Any Question?</h2></div>
            <div><a style="margin-left: 65%; color:white;background: #e8a88c; padding: 1px 30px; border-radius: 20px;width:100px;" href="${pageContext.request.contextPath}/kind">Contact Us</a></div>

        </div>
           
        <div>
            <jsp:include page="footer.jsp"></jsp:include>
        </div>
    </body>
</html>
