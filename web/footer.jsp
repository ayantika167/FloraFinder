<%-- 
    Document   : footer
    Created on : 27 Apr, 2023, 9:31:44 PM
    Author     : dipta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
  <meta charset="UTF-8">
  <title>Florafinder</title>
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css"/>
  <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
  <style>
      
footer {
  background-color: #1b1b1b;
  color: #fff;
  padding: 50px 0;
}

.footer-container {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
}

.footer-column {
  width: calc(25% - 20px);
  margin-right: 20px;
}

.footer-column:last-child {
  margin-right: 0;
}

.footer-column h3 {
  font-size: 20px;
  margin-bottom: 20px;
}

.footer-column ul {
  list-style: none;
  margin: 0;
  padding: 0;
}

.footer-column ul li {
  margin-bottom: 10px;
}

.footer-column ul li a {
  color: #fff;
  text-decoration: none;
}

.social-media-icons {
  display: flex;
  justify-content: flex-start;
}

.social-media-icons li {
  margin-right: 10px;
}

.social-media-icons li:last-child {
  margin-right: 0;
}

.social-media-icons a {
  display: block;
  height: 40px;
  width: 40px;
  background-color: #fff;
  border-radius: 50%;
  line-height: 40px;
  text-align: center;
  color: #1b1b1b;
  transition: all 0.3s ease;
}

.social-media-icons a:hover {
  transform: scale(1.2);
text-decoration: none;
transition: all 0.3s ease;
}

.social-media-icons i {
font-size: 20px;
line-height: 40px;
}

.social-media-icons .fa-facebook-f {
color: #1877f2;
}

.social-media-icons .fa-twitter {
color: #1da1f2;
}

.social-media-icons .fa-instagram {
color: #e1306c;
}

.social-media-icons .fa-pinterest-p {
color: #bd081c;
}

.footer-bottom {
text-align: center;
margin-top: 50px;
}

  </style>
</head>

    <body>
        <footer id="footer">
  <div class="footer-container">
    <div class="footer-column">
      <h3>About Florafinder</h3>
      <p>Florafinder is a leading online store for buying high-quality plants. We offer a wide variety of healthy plants and exceptional customer service.</p>
    </div>
    <div class="footer-column">
      <h3>Our Services</h3>
      <ul>
        <li><a href="#">Shop Plants</a></li>
        <li><a href="#">Delivery Information</a></li>
        <li><a href="#">Returns and Refunds</a></li>
        <li><a href="#">Plant Care Tips</a></li>
      </ul>
    </div>
    <div class="footer-column">
      <h3>Contact Us</h3>
      <ul>
        <li><a href="#">Email Us</a></li>
        <li><a href="#">Call Us</a></li>
        <li><a href="#">Live Chat</a></li>
        <li><a href="#">Visit Our Store</a></li>
      </ul>
    </div>
    <div class="footer-column">
      <h3>Connect With Us</h3>
      <ul class="social-media-icons">
        <li><a href="https://www.facebook.com/"><i class="fab fa-facebook-f"></i></a></li>
        <li><a href="https://twitter.com/"><i class="fab fa-twitter"></i></a></li>
        <li><a href="https://www.instagram.com/"><i class="fab fa-instagram"></i></a></li>
        <li><a href="https://www.pinterest.com/"><i class="fab fa-pinterest-p"></i></a></li>
      </ul>
    </div>
  </div>
  <div class="footer-bottom">
    <p>&copy; 2023 Florafinder. All Rights Reserved.</p>
  </div>
</footer>
    </body>
</html>
