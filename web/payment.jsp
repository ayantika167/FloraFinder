<%-- 
    Document   : payment
    Created on : 1 May, 2023, 7:54:18 PM
    Author     : mitra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style3.css">
    <title>Document</title>
</head>
<body>
    
    <div class="payment">
        <h2 style="margin-bottom: 15px;">Please do your Payment</h2>
          <img src="img/scan.jpg" style="max-width: 65%; margin: 15px 0;">
          <button id="open" onclick="bannerShow()">Download Receipt</button>
    </div>
    <div class="banner" id="banner">
        <span id="close" onclick="bannerHide()">&times;</span>
        <div class="hold">        
            <div>
                <img src="img/check.png" alt=""/></div>
            <div>
                <h2>Your payment is successfull.</h2>
                <span>Transition Id : 0015895189035426</span><br>
                <a href="" download="">download recipt</a>
            </div>
        </div>
    </div>
    <div>
      
    </div>
    <script>
        function bannerShow() {
            var x = document.getElementById("banner");
            if (x.style.display === "none") {
                x.style.display = "block";
            } else {
                x.style.display = "none";
            }
        }
        function bannerHide() {
            var x = document.getElementById("banner");
            if (x.style.display === "block") {
                x.style.display = "none";
            }
        }
    </script>
</body>
</html>
