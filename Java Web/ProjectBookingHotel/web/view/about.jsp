<%-- 
    Document   : about
    Created on : 16-07-2020, 22:19:25
    Author     : GL552VW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        hr{               
            padding-top: 10px;
            width: 1100px;
            height: 500px;           
            border-radius: 47px;
            background-color:  #ffe9e1;

        }
    </style>
    <body>
    <body>
        <div>          

            <jsp:include page="header.jsp"></jsp:include>

        </div>
        <div id="carouselId" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselId" data-slide-to="0" class="active"></li>
                <li data-target="#carouselId" data-slide-to="1"></li>
                <li data-target="#carouselId" data-slide-to="2"></li>
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

        <div class="container posts">
            <div class="row">
                <div class="col-md-12">
                    <hr>
                    <h1 id="H1Title" class="main-header text-center" style="padding-top: 30px;color: #955851">Welcome to TypnTypn Hotel</h1>
                    <p style="text-align:justify"><p style="margin-left:auto; margin-right:auto; text-align:justify">Đến với TypnTypn Hotel, bạn sẽ được hòa mình vào với thiên nhiên trong lành, được tham gia các hoạt động vui chơi giải trí, thư giãn nghỉ ngơi để trút bỏ hết những ưu phiền và bộn bề của cuộc sống. Khu khách sạn sang trọng với đầy đủ các hạng mục tiện nghi gồm nhiều loại phòng và bungalow hiện đại kết hợp phong cách truyền thống, hệ thống bể bơi bể sục đa năng cùng hệ thống nhà hàng, phòng hội nghị, khu vui chơi, nhà hàng…<br />
                        <br />
                        TypnTypn Hotel với các phòng biệt thự và bungalow được trang bị đầy đủ tiện nghi, không gian bên trong được bài trí theo phong cách sang trọng pha trộn những nét truyền thống của người Việt và những nét hiện đại của phương Tây. Chúng tôi có đội ngũ nhân viên được đào tạo bài bản, chuyên nghiệp và tác phong chuyên nghiệp, phục vụ tận tình.<br />
                        <br />
                        TypnTypn Hotel cung cấp đầy đủ những dịch vụ tiện ích, có thủ tục kiểm tra nhanh chóng, wi-fi công cộng miễn phí phủ sóng toàn bộ khách sạn… Điểm nổi bật của Lake Hotel là nhà hàng cung cấp được cả ẩm thực phương Đông và phương Tây được xây dựng và phục vụ trên tầng cao nhất. Quý khách có thể vừa thưởng thức bữa tối ngon miệng vừa ngắm bầu trời đầy sao và thành phố khi về đêm. Ngoài ra, du khách có thể tận hưởng những dịch vụ khác như spa, phòng gym ngay trong khu vực khách sạn. Thật tuyệt vời khi mà, những thới quen rèn luyện sức khỏe, chăm sóc bản thân của bạn vẫn được duy trì đều đặn trong những kỳ nghỉ dài ngày.<br />
                        <br/>
                        TypnTypn Hotel tự tin mang đến cho bạn sự thăng hoa về cảm xúc, những trải nghiệm tốt nhất, tuyệt vời nhất trong kỳ nghỉ dưỡng của bạn. Hãy đến với chúng tôi, chúng tôi đảm bảo rằng bạn sẽ không hối tiếc.<br/>
                        <br/>
                    </p>

                </div>
            </div>
        </div> 
            <div>
             <jsp:include page="footer.jsp"></jsp:include>
             </div>
    </body>
</html>
