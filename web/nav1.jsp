
<%@page import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Ecommerce Website</title>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.4.0/css/all.css"/>
        <link href="css/spec.css" rel="stylesheet" type="text/css"/>
        <style>
            *{
                margin: 0;
                padding: 0;
                color: white;
                box-sizing: border-box;
                font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;       
            }
            nav
            {
                background: rgb(35, 29, 47);
            }
            nav:after
            {
                content: ' ';
                clear: both;
                display: table;
            }
            nav .logo
            {
                float: left;
                color:white;
                font-size: 29px;
                font-weight: 600;
                line-height: 70px;
                display: flex;
                align-items: center;
                padding-bottom: 25px;
                padding-top: 10px;
                padding-left: 30px;
            }
            nav .logo img{
                height: 70px;
                width: 70px;
                border-radius: 50%;
                margin-right: 15px;
            }
            nav ul{
                float: right;
                list-style: none;
                margin-right: 40px;
                position: relative;
                padding-top: 10px;
            }
            nav ul li{
                float: left;
                display:inline-block;
                background: rgb(35, 29, 47);
                margin: 0 5px;
            }
            nav ul li a{
                color: white;
                text-decoration: none;
                line-height: 70px;
                font-size:24px;
                padding: 8px 15px;             
            }
            nav ul li a:hover{
                color: cyan;
                border-radius: 5px;
                box-shadow: 0 0 5px #33ffff, 0 0 5px #66ffff;                     
            }
            nav ul ul li a:hover{
                color:cyan;
                box-shadow:none;
                z-index: 5;
            }
            nav ul ul{
                position: absolute;
                top: 90px;
                border-top: 3px solid cyan;
                opacity: 0;
                visibility: hidden;    
                transition: top .3s;
                z-index: 5;
            }
            nav ul ul a{
                font-size: 18px;
                 z-index: 5;
            }           
                         
            nav ul  li:hover > ul{
                top: 70px;
                opacity: 1;
                visibility: visible;
            }
            nav ul ul li{
                position: relative;
                margin: 0px;
                width: 200px;
                float: none;
                display:list-item;
                border-bottom: 1px solid rgba(0,0,0,0.3);
                 z-index: 5;
            }
            nav ul ul li a{
                line-height: 50px;
                 z-index: 5;
                
            }
            nav ul li a.log{
                border: 2px solid cyan;
                font-style: italic;
                margin-left: 40px;
            }
        </style>
    
    
    </head>
    <body>
        <%HttpSession sess=request.getSession(false);
        %>
        <nav>
            <div class="logo">
            <img src= "img/logo.png" alt="Logo">FloraFinder</div>
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li>
                    <a href="#">Products</a>
                    <ul>
                        <li><a href="Plants.jsp">Plants</a></li>
                        <li><a href="Tools.jsp">Tools</a></li>
                        <li><a href="Fertilizers.jsp">Fertilizers and Books</a></li>
                    </ul>
                </li>
                 <li><a href="#special">Special Offers</a></li>      
                <li>
                    <a href="aboutus.jsp">About Us</a>
                </li>
                <li>
                    <a href="contact.jsp">Contact Us</a>
                </li>
                <li>
                    <a href="Addtocart.jsp"><i class="fas fa-shopping-cart"></i></a>
                </li>
                <li>
                    <%out.println(sess.getAttribute("user"));%>
                </li>
                
                <li>
                    <a  class="log" href="custlog.jsp">Logout</a>
                </li>
                
                    
            </ul>
            
            
        </nav>
    </body>
</html>
