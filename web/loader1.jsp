<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>landing</title>
	</head>
	<body>
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
			font-family: sans-serif;
		}
		
		.loader-hold {
			overflow: hidden;
			width: 100%;
			height: 100vh;
			display: grid;
			place-items: center;
			background-color: #000d1a;
			z-index: 50;
		}

		.loader {
			width: 120px;
			height: 120px;
			border-radius: 50%;
			display: inline-block;
			border-top: 5px solid #ddd;
			border-right: 5px solid transparent;
			box-sizing: border-box;
			animation: rotation 3s linear infinite;
		}

		.loader::after {
			content: '';
			box-sizing: border-box;
			position: absolute;
			left: 0;
			top: 0;
			width: 120px;
			height: 120px;
			border-radius: 50%;
			border-left: 5px solid #FF3D00;
			border-bottom: 5px solid transparent;
			animation: rotation 1.5s linear infinite reverse;
		}

		@keyframes rotation {
			0% {
				transform: rotate(0deg);
			}

			100% {
				transform: rotate(360deg);
			}
		}
	</style>
	<script type="text/javascript">
		setTimeout(function hideLoader() {
			window.location.replace("http://localhost:8080/ecommerce/landing.jsp");
		}, 5000);
	</script>
	
	</body>
</html>