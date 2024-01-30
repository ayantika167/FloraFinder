<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--<link rel="stylesheet" href="css/style2.css">-->
    <title>Document</title>
</head>

<body>
    <div class="form-box">
        <div class="button-box">
            <div id="btn"></div>
            <button type="button" class="toggle-btn" onclick="login()">Log In</button>
            <button type="button" class="toggle-btn" onclick="signin()">Sign In</button>
        </div>
        <form id="login" action="http://localhost:8080/ecommerce/login" method="POST" class="input-group">
            <input type="text" class="input-field" name="username" placeholder="User Id" required>
            <input type="password" class="input-field" name="password" placeholder="Password" required>
            <label class="check-box"><input type="checkbox">Remember me </label>
            <p align="center"><a href="http://localhost:8080/ecommerce/ValidateEmail.html">Forgot password??</a></p>
            <br>
            <button type="submit" class="submit-btn">Log in</button>
            <br>
            <button class="submit-btn"><a style="text-decoration: none; color: #fff" href="login.jsp">If you are admin,Log In</a></button>
        </form>
        <form id="signin"  method= "POST" action="http://localhost:8080/ecommerce/registration" class="input-group">
            <input type="text" name="tbUserName" class="input-field"   placeholder="User Id" required>
            <input type="email" name="tbMail" class="input-field" placeholder="Mail Id" required>
            <input type="number" name="tbP_No" class="input-field" placeholder="Phone Number" required>
            <input type="password" name="tbPassword" class="input-field" placeholder="Password" id="password" onChange="validatePassword();" required>
            <input type="password" name="tbConPassword" class="input-field" placeholder="Confirm Password" id="confirm_password" onKeyup="validatePassword();" required>
            <span id="errorMsg">cc</span>
            <label class="check-box"><input type="checkbox">I agree to the terms and conditions</label>
            <button type="submit" class="submit-btn">Sign In</button>
        </form>
    </div>
    <script>
        var x = document.getElementById("login");
        var y = document.getElementById("signin");
        var z = document.getElementById("btn");

        function signin() {
            x.style.left = "-100%";
            y.style.right = "50%";
            z.style.left = "110px";
        }
        function login() {
            x.style.left = "50%";
            y.style.right = "-100%";
            z.style.left = "0px";
        }
        
        function validatePassword(){
            var password = document.getElementById("password");
            var confirm_password = document.getElementById("confirm_password");
            var errorMsg = document.getElementById("errorMsg");
            if(password.value != confirm_password.value) {
                errorMsg.style.display = "block";
                errorMsg.innerHTML = "Passwords Don't Match";
            } else {
                errorMsg.style.display = "none";
                errorMsg.innerHTML = "";
            }
        }

    </script>
    <style>
        #loader {
            border: 12px solid #f3f3f3;
            border-radius: 50%;
            border-top: 12px solid #444444;
            width: 70px;
            height: 70px;
            animation: spin 1s linear infinite;
        }

        @keyframes spin {
            100% {
                transform: rotate(360deg);
            }
        }

        .center {
            position: absolute;
            top: 0;
            bottom: 0;
            left: 0;
            right: 0;
            margin: auto;
        }

* {
    margin: 0;
    padding: 0;
}

body {
    background:  url("img/banner.jpg") no-repeat center center ;
    background-size: cover;
    min-height: 100vh;
    position: relative;
    display: block;
    width: 100%;
    overflow: hidden;
}
 
.form-box {
    position: absolute;
    inset: 50% auto auto 50%;
    transform: translate(-50%, -50%);
    display: block;
    width: 380px;
    height: 480px;
    background: #fff;
    padding: 25px;
    border-radius: 5px;
    box-shadow: 0 0 15px -5px rgba(180, 170, 150, 1);
    overflow: hidden;
}

.button-box {
    width: 220px;
    margin: 35px auto;
   position: relative;
    box-shadow: 0 0 20px 9px #ff61241f;
    border-radius: 30px;
}

.toggle-btn {
    padding: 10px 30px;
    cursor: text;
    background: transparent;
    border: 0;
    outline: none;
    position: relative;
}

#btn {
    top: 0;
    left: 0;
    position: absolute;
    width: 110px;
    height: 100%;
    background: linear-gradient(to right, #ff105f, #ffad06);
    color: #fff;
    border-radius: 30px;
    transition: .5s;
}

.input-group {
    inset: 195px auto auto 50% ;
    transform: translateX(-50%);
    position: absolute;
    width: 280px;
    margin: auto;
    transition: .5s;
}

#signin {
	inset: 155px -100% auto auto;
    transform: translateX(50%);
}

.input-field {
    width: 100%;
    padding: 10px 0;
    margin: 5px 0;
    border-left: 0;
    border-top: 0;
    border-right: 0;
    border-bottom: 1px solid #999;
    outline: none;
    background: transparent;
}

.submit-btn {
    width: 85%;
    padding: 10px 30px;
    cursor: pointer;
    display: block;
    margin: auto;
    background: linear-gradient(to right, #ff105f, #ffad06);
    color: #fff;
    border: 0;
    outline: none;
    border-radius: 30px;
}

label.check-box {
    display: flex;
    gap: 10px;
    margin: 10px 0;
}

span:not(#errorMsg) {
    color: #777;
    font-size: 12px;
    bottom: 68px;
    position: absolute;
}

span#errorMsg {
	color: red;
	display: none;
}

#signin {
    right: -100%;
}
    </style>
    <!--<div id="loader" class="center"></div>
    <script>
        document.onreadystatechange = function () {
            if (document.readyState !== "complete") {
                document.querySelector("body").style.visibility = "hidden";
                document.querySelector("#loader").style.visibility = "visible";
            } else {
                document.querySelector("#loader").style.display = "none";
                document.querySelector("body").style.visibility = "visible";
            }
        };
    </script>-->

</body>

</html>