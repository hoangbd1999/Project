<%-- 
    Document   : showcustomer
    Created on : 27-07-2020, 19:13:07
    Author     : GL552VW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Customer"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
         .left{
            padding-top: 30px;
            color:#955851; 
            background-color: #ffefea;}
         
    </style>
    <body>
        <jsp:include page="adheader.jsp"></jsp:include>
          <div class="row">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="images/cover.jpg" height="500px" alt="First slide">
                </div>
            </div>
           <div class="row ">
                        <div class="col-sm-2" style="margin-left: 650px; text-align: center;padding-top: 50px;">
                            <h3 style="color: #955851" >List Customer</h3>
                            <img src="images/icon.png" alt="Chào mừng đến với Typn Typn Hotel" style="width: 100%"/>
                        </div>
           </div><br/>
           <div class="d-flex justify-content-center">
            <form action="listcus" method="POST">
              <table border="1">
             <tr>
                 <td>Username</td>
                 <td>RoomId</td>
                 <td>Name</td>
                 <td>FormOfRoom</td>
                 <td>Checkin</td>               
                 <td>Checkout</td>               
             </tr>
             
             <c:forEach items="${cus}" var="item1">                
                     <tr>
                     <td>${item1.username}</td>
                     <td>${item1.rid}</td>
                     <td>${item1.name}</td>                                   
                     <td>${item1.fid}</td>                    
                     <td>${item1.checkin}</td>                    
                     <td>${item1.checkout}</td>                    
                                       
                     </tr>                      
             </c:forEach>
             
            
         </table>
          </form>
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
