<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>landing</title>
	</head>
        <body>
            <div class="logo">
                <h1>Flora Finder</h1>
                <h3>Grow with us</h3>
            </div>
            <div class="cookie" id="cookie">
		<span>&times;</span>
		<h2>Cookies & Privacy</h2>
		<p> To give you a better experience,we use our own and third party cookies. You can read more about them in our <a>cookie policy</a>. </p>
		<div class="btnGrp">
			<button id="decline" onclick="decline();">Decline Now</button>
			<button id="accepts" onclick="accepts();">Accept all cookies</button>
		</div>
            </div>
            <div class="alert" id="alert"> Please accept cookies to continue... <br>
		<button onclick="alertAccept();">Accept cookies</button>
            </div>
            <div class="loader-hold" id="loaderHold">
		<span class="loader"></span>
            </div>
            <style type="text/css">
		* {
			padding: 0;
			margin: 0;
			box-shadow: border-box;
			border: 0;
			outline: 0;
			background: transparent;
			font-size: 16px;
			line-height: 20px;
			font-family: Calisto MT;
		}

		body {
			background: transparent url('img/backImage.jpeg') no-repeat center / cover;
			width: 100%;
			min-height: 100vh;
		}
                .logo {
                    display: block;
                    position: absolute;
                    inset: 50% auto auto 50%;
                    transform: translate(-50%, -50%);
                    text-align: center;
                    color: #fff;
                    text-shadow: 2px 2px 5px rgb(59, 49, 79);
                }
                .logo h1 {
                    margin-bottom: 10px;
                    font-size: 90px;
                    font-family: Segoe Script;
                }
                .logo h3 {
                    margin-top: 40px;
                    font-size: 60px;
                    font-family: Colonna MT;
                    font-weight: normal;
                }
		.cookie {
			position: fixed;
			inset: auto 25px 25px auto;
			width: 365px;
			height: auto;
			background: #fff;
			box-shadow: 0 0 25px -5px rgba(170, 180, 150, .5);
			padding: 20px;
			border-radius: 5px;
			z-index: 30;
		}

		.cookie h2 {
			font-size: 20px;
			line-height: 30px;
			color: rgb(59, 48, 79);
		}

		.cookie span {
			position: absolute;
			inset: 7.5px 15px auto auto;
			font-size: 25px;
			color: rgb(59, 48, 79);
		}

		.cookie a {
			color: rgb(59, 48, 79);
			font-weight: bold;
		}

		.cookie .btnGrp {
			padding: 10px 10px 0 10px;
			display: flex;
			gap: 10px;
		}

		.cookie button {
			width: 100%;
			padding: 10px;
			text-align: center;
			border: 2px solid rgb(59, 48, 79);
			border-radius: 5px;
			color: rgb(59, 48, 79);
			font-weight: bold;
			font-size: 15px;
		}

		.cookie button:last-child {
			background: rgb(59, 48, 79);
			color: #fff;
		}

		.alert {
			position: fixed;
			inset: 15px auto auto 50%;
			transform: translateX(-50%);
			color: rgb(59, 48, 79);
			background-color: #fff;
			border-color: #b6d4fe;
			padding: 20px;
			border-radius: 5px;
			font-size: 20px;
			display: none;
			z-index: 30;
		}

		.alert button {
			padding: 10px 0 0 0;
			width: 100%;
			text-align: center;
			font-size: 18px;
			color: blue;
                        cursor: pointer;
		}
            </style>
            <script type="text/javascript">
		function decline() {
			var decline = document.getElementById("decline");
			var cookie = document.getElementById("cookie");
			var alert = document.getElementById("alert");
			alert.style.display = 'block';
			cookie.style.display = "none";
		}
		function alertAccept() {
			var alert = document.getElementById("alert");
			var cookie = document.getElementById("cookie");
			cookie.style.display = "block";
			alert.style.display = 'none';
		}
		function accepts() {
			window.location.replace("http://localhost:8080/ecommerce/custlog.jsp");
		}
            </script>
    </body>
</html>