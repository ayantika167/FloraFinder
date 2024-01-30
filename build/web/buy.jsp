<%-- 
    Document   : buy
    Created on : 14 May, 2023, 1:43:12 PM
    Author     : mitra
--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>Document</title>
    <style>
        * {
    margin: 0;
    padding: 0;
}

body {
    background: transparent url("img/banner.jpg") no-repeat center center / cover;
    min-height: 100vh;
    position: relative;
    display: block;
    width: 100%;
    overflow: hidden;
}
.payment {
    display: block;
    margin: 150px auto;
    width: 100%;
    max-width: 450px;
    text-align: center;
    padding: 25px;
    backdrop-filter: blur(5px);
    background-color: rgba(255, 255, 255, .1);
    border-radius: 10px;
    font-size: 18px;
    line-height: 24px;
}
.payment ul {
    width: 70%;
    display: block;
    margin: 10px auto;
    text-align: left;
    list-style: none;

}
.btngrp {
    display: block;
    padding: 10px;
    text-align: right;
}
.payment button {
    border: none;
    outline: none;
    padding: 10px;
}

.banner {
    padding: 25px;
    position: fixed;
    inset: auto 35px 35px 35px;
    border-radius: 10px;
    background-color: #fff;
    display: none;
}
.hold {
    display: grid;
    grid-template-columns: 85px 1fr;
    grid-template-rows: 1fr;
    gap: 10px;
    align-items: center;
}
.banner img {
    max-width: 100%;
}
.banner #close {
    position: absolute;
    inset: 15px 20px auto auto;
    font-size: 25px;
}
.payment ul li lable a
{
    text-decoration: none;
    color: black!important;
}
</style>

    
</head>
<body>
     <%@include file="nav1.jsp" %>
    <div class="payment">
        <h2>Select your payment option</h2>
        <ul class="pay">
            <li><label><a href="payment.jsp"> Google pay</a></label></li>
            <li><label><a href="payment.jsp"> Phone pay</a></label></li>
            <li><label><a href="payment2.jsp"> Cash On Delivery</a></label></li>
            
        </ul>
        
    </div>
   
            
</body>
</html>