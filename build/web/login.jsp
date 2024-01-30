<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style1.css">
    <title> Admin login</title>
</head>

<body>
    <div class="container">
        <div class="form-box">

            <form action="http://localhost:8080/ecommerce/adminlog" method="POST" class="form">
                <div class="form-control">
                    <center>
                        <h3><b> ADMIN LOGIN </b></h3>
                    </center>
                    <br>
                    <b><h5><label>Username</label></h5></b>
                    <input type="text" name="username" placeholder="Enter Username" required><br>
                    <b><h5><label>Password</label></h5></b>
                    <input type="password" name="password" placeholder="Enter Password" required>
                    <br><br>
                   
                    <div style="margin:10px;align-items:center;justify-content:center;display:flex">
                        <input type="Submit" class="btn btn-Success" name="Login" value="Log In"
                            style="margin-right: 80px; margin-left: 80px; font-size: 22px;">
                        
                    </div>
                </div>
            </form>
        </div>

    </div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>

</html>