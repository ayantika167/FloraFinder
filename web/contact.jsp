<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Document</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" integrity="sha384-22W8+mcDa9Ll1n0VL87Obgw+2Qlzv/yJILN7czfHgJNjNiq8Swv/A9hY0D/soXDY" crossorigin="anonymous">

    </head>
    <style>
        body
        {
            background: linear-gradient(to bottom, #006699 0%, #99ccff 100%);
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Verdana, Geneva, Tahoma, sans-serif;
        }

        .contactus
        {
            position: relative;
            width: 100%;
            padding: 40px 100px;
        }
        .contactus .title
        {
            display: flex;
            justify-content: center;
            align-items: center;
            font-size: 2em;
            font-family: Georgia, 'Times New Roman', Times, serif;
        }
        .contactus .title h1
        {
            color: #fff;
            font-weight: 500;
        }
        .form
        {
            grid-area: form;
        }
        .form:hover
        {
            background: #ccffff;
            letter-spacing: 0.20em;
            box-shadow: 0 0 20px #ccffff;
        }
        .info
        {
            grid-area: info;
        }
        .map
        {
            grid-area: map;
        }
        .contact
        {
            padding: 40px;
            background: #fff;
            box-shadow: 0 5px 35px rgba(0,0,0,0.15);
        }
        .box
        {
            position: relative;
            display: grid;
            grid-template-columns: 2fr 1fr;
            grid-template-rows: 5fr 4fr;
            grid-template-areas: 
                "form info"
                "form map";
            grid-gap: 20px;
            margin-top: 20px;
        }


        /* form */
        .contact h3
        {

            font-weight: 500;
            font-size: 1.4em;
            margin-bottom: 10px;
            font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
        }
        .joyma
        {
            color: #0e3959;
        }
        .formbox
        {
            position: relative;
            width: 100%;
        }
        .formbox .row50
        {
            display: flex;
            gap: 20px;
        }
        .inputbox
        {
            display: flex;
            flex-direction: column;
            margin-bottom: 10px;
            width: 50%;
        }

        .formbox .row100 .inputbox
        {
            width: 100%;
        }
        .inputbox span
        {
            color: #1875a0;
            margin-top: 10px;
            margin-bottom: 5px;
            font-weight: 500;
        }
        .inputbox input
        {
            padding: 10px;
            font-size: 1.1em;
            outline: none;
            border: 1px solid #333;
        }
        .inputbox textarea
        {
            padding: 10px;
            font-size: 1.1em;
            outline: none;
            border: 1px solid #333; 
            resize: none;
            min-height: 220px;
            margin-bottom: 10px;
        }
        .inputbox input[type="submit"]
        {
            background: #0d4f43;
            color: #fff;
            border: none;
            font-size: 1.1em;
            max-width: 120px;
            font-weight: 500;
            cursor: pointer;
            padding: 14px 15px;
        }
        .inputbox ::placeholder
        {
            color: #999;
        }
        .btn
        {

            position: absolute;
            width: 150px;
            height: 10%;
            border-radius: 30px;
        }
        .btn:hover
        {
            background: var(--clr);
            letter-spacing: 0.20em;
            box-shadow: 0 0 25px 0var(--clr);
        }
        .write
        {
            color:black !important;
        }

        /* info */
        .info
        {
            background: #053f45;
        }
        .info:hover
        {
            background: var(--clr);
            letter-spacing: 0.20em;
            box-shadow: 0 0 35px 0var(--clr);
        }
        .info h3
        {
            color: #fff;
            margin-bottom: 40px;
        }
        .info .infobox div
        {
            display: flex;
            align-items: center;
            margin-bottom: 10px;
        }
        .info .infobox div span
        {
            min-width: 40px;
            height: 40px;
            color: #fff;
            background: #18b7ff;
            display: flex;
            justify-content: center;
            align-items: center;
            font-size: 1.5em;
            border-radius: 50%;
            margin-right: 15px;
        }
        .info .infobox div p
        {
            color: #fff;
            font-size: 1.1em;
        }
        .info .infobox div a
        {
            color: #fff;
            text-decoration: none;
            font-size: 1.1em;
        }
        .sci
        {
            margin-top: 40px;
            display: flex;
        }
        .sci li
        {
            list-style: none;
            margin-right: 20px;
        }
        .sci li a
        {
            color: #fff;
            font-size: 2em;
            color: #ccc;
        }
        .sci li a:hover
        {
            color: #fff;
        }

        /* map */
        .container-fluid
        {
            padding: 0;
            width: 100%;
            height: 100%;
            margin: auto;
            overflow: hidden;
        }
        .container-fluid iframe
        {
            height: 350px;
            width: 500px;
            border: 1px solid #fff;
            display: block;
            margin: auto;
            transition: transform 2s;
        }
        .container-fluid:hover iframe
        {
            transform: scale(1.2);
        }

        /* responsive design */
        @media (max-width: 991px)
        {
            body
            {
                background: linear-gradient(#027f92 20%,#60d0e1 40%,#a1d4dc);
            }
            .contactus
            {
                padding: 20px;
            }
            .box
            {
                position: relative;
                display: grid;
                grid-template-columns: 1fr;
                grid-template-rows: auto;
                grid-template-areas: 
                    "form"
                    "info"
                    "map";
                grid-gap: 20px;
                margin-top: 20px;
            }
            .map
            {
                min-height: 300px;
            }
            .formbox .row50
            {
                display: flex;
                gap: 0;
                flex-direction: column;
            }
            .inputbox
            {
                width: 100%;
            }
            .contact
            {
                padding: 30px;
            }
            .map
            {
                min-height: 300px;
                padding: 0;
            }
        }
    </style>
    <body>

        <%@include file="nav1.jsp" %>

        <div class="contactus">
            <div class="title">
                <h1>Get In Touch</h1>
            </div>

            <div class="box">
                <!--FORM-->
                <div class="contact form" style="color: #ccffff;">
                    <h3> <b class="joyma"> Send a Message</b> </h3>
                    <form action="http://localhost:8080/ecommerce/probsolve" method="POST">
                        <div class="formbox">
                            <div class="row50">
                                <div class="inputbox">
                                    <span>First Name</span>
                                    <input type="text" class="write" name="tbfirstname" placeholder="First Name">
                                </div>
                                <div class="inputbox">
                                    <span>Last Name</span>
                                    <input type="text" class="write" name="tblastname" placeholder="Last Name">
                                </div>
                            </div>

                            <div class="row50">
                                <div class="inputbox">
                                    <span>Email</span>
                                    <input type="text" class="write" name="tbemail" placeholder="email@.com">
                                </div>
                                <div class="inputbox">
                                    <span>Mobile</span>
                                    <input type="text" class="write" name="tbp_no" placeholder="+91">
                                </div>
                            </div>

                            <div class="row100">
                                <div class="inputbox">
                                    <span>Message</span>
                                    <textarea class="write" name="tbmessage" placeholder="Write Your Message Here..."></textarea>
                                </div>
                            </div> 

                            <div class="row100">
                                <div class="inputbox">
                                    <button type="submit" class="btn btn-success" style="--clr:#004d4d" value="Send">Send</button>
                                </div>
                            </div> 
                    </form>
                </div>
            </div>

            <!--INFO-->
            <div class="contact info"  style="--clr:#004d4d">
                <h3>Contact Info</h3>
                <div class="infobox">
                    <div>
                        <span><ion-icon name="location"></ion-icon></span>
                        <p>Sector V, Kolkata <br>INDIA</p>
                    </div>
                    <div>
                        <span><ion-icon name="mail"></ion-icon></span>
                        <a href="#mailto:florafinder@email.com">florafinder@email.com</a>
                    </div>
                    <div>
                        <span><ion-icon name="call"></ion-icon></span>
                        <a href="#tel:+918926479850">+91 8926479850</a>
                    </div>

                    <!--Social Media Links-->
                    <ul class="sci">
                        <li><a href="#"><ion-icon name="logo-facebook"></ion-icon></a></li>
                        <li><a href="#"><ion-icon name="logo-twitter"></ion-icon></a></li>
                        <li><a href="#"><ion-icon name="logo-instagram"></ion-icon></a></li>
                    </ul>

                </div>
            </div>

            <!--MAP-->
            <div class="container-fluid" >
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3684.0784051633777!2d88.42702929999997!3d22.5761707!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3a02751a9d9c9e85%3A0x7fe665c781b10383!2sTechno%20Main%20Salt%20Lake!5e0!3m2!1sen!2sin!4v1682866436855!5m2!1sen!2sin" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
            </div>
        </div>
    </div>

    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>

</body>
</html>