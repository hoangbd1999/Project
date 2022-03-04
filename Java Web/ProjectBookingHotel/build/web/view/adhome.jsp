<%-- 
    Document   : adhome
    Created on : 23-07-2020, 19:20:34
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
    <style>
        body {

            background-image: url(images/patern.png);
        }
        .rooms-section {
            position: relative;
            background-attachment: fixed;
            background-position: center center;
            background-repeat: no-repeat;
            background-size: cover;
            padding-bottom: 40px;
        }
        .bgr-acomom {
            background-image: url(images/502_1.jpg);
        }
        #section-2 .title {
            padding-top: 40px;
            color: #fff;
            text-align: center;
            line-height: 40px;
            position: relative;
            margin-bottom: 30px;
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
            height: 100px;
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
        $('#myCarousel').carousel({
            interval: 1000
        });
        function available() {
            var from = document.getElementById("datefrom").value;
            var to = document.getElementById("dateto").value;
            if (from > to) {
                alert("Lựa chọn lại Date To");
            } else if (from == null || to == null || from == "" || to == "")
                alert("date not null")
            else
                document.getElementById("available").submit();
        }
    </script>
    <body>
       <jsp:include page="adheader.jsp"></jsp:include>

        <div id="carouselId" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselId" data-slide-to="0" class="active"></li>
                <li data-target="#carouselId" data-slide-to="1"></li>
                <li data-target="#carouselId" data-slide-to="2"></li>
                <li data-target="#carouselId" data-slide-to="3"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="carousel-item active">
                    <img src="images/K01.jpg" alt="First slide">

                </div>
                <div class="carousel-item">
                    <img src="images/K02.jpg" alt="Second slide">
                </div>
                <div class="carousel-item">
                    <img src="images/K03.jpg" alt="Third slide">
                </div>
                <div class="carousel-item">
                    <img src="images/K04.jpg" alt="four slide">
                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselId" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselId" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
        <section>
            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <h1 style="color: #955851">Về Chúng Tôi </h1>
                        <div>
                            <p><div style="text-align:justify">Khách sạn TypnTypn tọa lạc tại Quận Hai Bà Trưng, Hà Nội. Nhà hát Lớn Hà Nội và Nhà hát Múa rối Nước Thăng Long là điểm đến văn hóa nổi tiếng; ngoài ra không thể quên kể đến những địa danh được nhiều người biết đến như Văn Miếu cùng Lăng Bác. Sắp có sự kiện hay trận thi đấu nào không? Đừng quên kiểm tra thử lịch chương trình tại Sân vận động Quốc gia Mỹ Đình hay Cung Thể thao dưới nước Mỹ Đình.<br />
                                <br/>
                            </div>
                            </p>
                        </div>
                        <div class="btn-a">
                            <a class="learn-more theme-btn btn-style-two" style="color:white;background: #e8a88c; padding: 10px 30px; border-radius: 20px; margin: 0 auto;width:100px; " href="${pageContext.request.contextPath}/about">Xem thêm</a>
                        </div>

                    </div>
                    <div class="images-column col-md-6 ">
                        <div class="inner-box">
                            <div class="row">
                                <div class="col-md-12">
                                    <h3 style="color: #955851">Chào mừng đến với Typn Typn Hotel </h3>
                                    <img src="images/dep.jpg" alt="Chào mừng đến với Typn Typn Hotel" style="width: 100%"/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div><br/><br/>
           
            <div class="services-section" id="section-3" style='background-color: #f4f4f4;'>
                <div class="container" style="position: relative;z-index: 9;">
                    <section>
                        <div class="container col-sm-12">
                            <div class="container">
                                <h2 class="main-header text-center" style="padding-top: 30px;color: #955851">THE BEST SERVICES</h2>
                                <div class="text-desc" style="text-align: center;">Hãy đến với chúng tôi bạn sẽ nhận được những dịch vụ và ưu đãi tốt nhất</div>

                                <div class="wpb_wrapper">
                                    <div class="Accomodation-container">
                                        <ul>
                                            <li>
                                                <div class="col-md-6">
                                                    <div class="Accomodation-inner-container">
                                                        <div class="Left-row">
                                                            <img width="100%" src="images/S01.jpg" class="rounded-circle" alt=""/>
                                                        </div>
                                                        <div class="Right-row">
                                                            <h5 style='border: solid 1px #dedede;display: block;border-left: none;border-right: none;'>Giặt là</h5>                                                       
                                                            Dịch vụ giặt là của chúng tôi có thể làm sạch tất cả đồ đạc của bạn từ quần áo, váy, phù hợp với ...<br/>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="col-md-6">
                                                    <div class="Accomodation-inner-container">
                                                        <div class="Left-row">
                                                            <img width="100%" src="images/S02.jpg" class="rounded-circle" alt=""/>
                                                        </div>
                                                        <div class="Right-row">
                                                            <h5 style='border: solid 1px #dedede;display: block;border-left: none;border-right: none;'>Đồ ăn</h5> 

                                                            Quần áo của bạn sẽ sạch sẽ ngay khi bạn sử dụng dịch vụ<br/>

                                                        </div>
                                                    </div>
                                                </div>

                                            </li>
                                            <li>
                                                <div class="col-md-6">
                                                    <div class="Accomodation-inner-container">
                                                        <div class="Left-row">
                                                            <img width="100%" src="images/S03.jpg" class="rounded-circle" alt="" height="150px;"/>
                                                        </div>
                                                        <div class="Right-row">
                                                            <h5 style='border: solid 1px #dedede;display: block;border-left: none;border-right: none;'>Phòng Thể Dục</h5>                                        
                                                            Thức ăn ngon miệng luôn luôn chờ để phục vụ bạn<br/>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="col-md-6">
                                                    <div class="Accomodation-inner-container">
                                                        <div class="Left-row">
                                                            <img width="100%" src="images/S04.jpg" class="rounded-circle" alt=""/>
                                                        </div>
                                                        <div class="Right-row">
                                                            <h5 style='border: solid 1px #dedede;display: block;border-left: none;border-right: none;'>Đặt TOUR</h5>                                  
                                                            Khu vực an toàn cho phương tiện di chuyển của bạn<br/>
                                                        </div>
                                                    </div>
                                                </div>
                                            </li> 

                                            <div>
                                                <a style="margin-left: 40%; color:white;background: #e8a88c; padding: 5px 30px; border-radius: 20px;width:100px;" href="${pageContext.request.contextPath}/service">Xem thêm</a>
                                            </div>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
        </section><br/><br/>
        <div>
            <div class="row">
                <div class="col-md-4">
                    <div class="thumbnail">
                        <img src="images/502_1.jpg" alt="Lights" style="width:487px;height:500px;">           
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="caption">
                        <h2 style="text-align: center;font-family: 'GothamRnd-Medium';color: #965851;line-height: 38px;margin-top: 120px;">GALLERY</h2><br/><br/>
                        <div>
                            <a style="margin-left: 36%; color:white;background: #e8a88c; padding: 7px 30px; border-radius: 20px;width:100px;" href="${pageContext.request.contextPath}/kind">Xem thêm</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="thumbnail">
                        <img src="images/601.jpg" alt="Fjords" style="width:500px;height:500px;">             
                    </div>
                </div>
            </div>
            <div class="row">
                <div >
                    <div class="thumbnail">
                        <img src="images/502_2.jpg" alt="Lights" style="width:501px;">           
                    </div>
                </div>
                <div >
                    <div class="thumbnail">     
                        <img src="images/K04.jpg" alt="Nature" style="width:546px;height:500px;">

                    </div>
                </div>
                <div >
                    <div class="thumbnail">
                        <img src="images/502_3.jpg" alt="Fjords" style="width:489px;height:500px;">             
                    </div>
                </div>
            </div>
        </div><br/><br/>
        <div class="left mt-4">

            <div style="margin-left: 300px; padding-top: 10px;"><h2>Do You Have Any Question?</h2></div>
            <div><a style="margin-left: 65%; color:white;background: #e8a88c; padding: 1px 30px; border-radius: 20px;width:100px;" href="${pageContext.request.contextPath}/kind">Contact Us</a></div>

        </div>

        <div>
            <jsp:include page="footer.jsp"></jsp:include>
        </div>
    </body>
</html>
