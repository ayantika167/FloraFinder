<%@page import="oracle.jdbc.OracleResultSet"%>
<%@page import="oracle.jdbc.OraclePreparedStatement"%>
<%@page import="oracle.jdbc.OracleConnection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function funClose()
            {
                if (window.parent)
                    if (confirm("Closing window......") === true)
                        window.parent.window.close();
                    else if (confirm("Closing window......") === true)
                        window.close();
            }
        </script>     
    </head>
    <style>
        body
        {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            background: url("img/banner.jpg") no-repeat center center / cover;
        }
        .box
        {
            position: absolute;
            width: 400px;
            height: 550px;
            background: #1c1c1c;
            border-radius: 8px;
            overflow: hidden;
        }
        .box::before
        {
            content: '';
            position: absolute;
            top: -50%;
            left: -50%;
            width: 380px;
            height: 420px;
            background: linear-gradient(0deg, transparent, transparent, #035d64, #035d64, #035d64);
            z-index: 1;
            transform-origin: bottom right;
            animation: animate 6s linear infinite;
        }
        .box::after
        {
            content: '';
            position: absolute;
            top: -50%;
            left: -50%;
            width: 380px;
            height: 420px;
            background: linear-gradient(0deg, transparent, transparent, #035d64, #035d64, #035d64);
            z-index: 1;
            transform-origin: bottom right;
            animation: animate 6s linear infinite;
            animation-delay: -3s;
        }
        .borderLine
        {
            position: absolute;
            top: 0;
            inset: 0;
        }
        .borderLine::before
        {
            content: '';
            position: absolute;
            top: -50%;
            left: -50%;
            width: 380px;
            height: 420px;
            background: linear-gradient(0deg, transparent, transparent, #ab0e42, #ab0e42, #ab0e42);
            z-index: 1;
            transform-origin: bottom right;
            animation: animate 6s linear infinite;
            animation-delay: -1.5s;
        }
        .borderLine::after
        {
            content: '';
            position: absolute;
            top: -50%;
            left: -50%;
            width: 380px;
            height: 420px;
            background: linear-gradient(0deg, transparent, transparent, #ab0e42, #ab0e42, #ab0e42);
            z-index: 1;
            transform-origin: bottom right;
            animation: animate 6s linear infinite;
            animation-delay: -4.5s;
        }
        @keyframes animate
        {
            0%
            {
                transform: rotate(0deg);
            }
            100%
            {
                transform: rotate(360deg);
            }
        }
        .box form
        {
            position: absolute;
            inset: 4px;
            background: linear-gradient(#07093e, #09303c);
            padding: 50px 40px;
            border-radius: 8px;
            z-index: 2;
            display: flex;
            flex-direction: column;
        }
        .box form h2
        {
            color: #fff;
            font-weight: 500;
            text-align: center;
        }
        .box form .inputBox
        {
            position: relative;
            width: 300px;
            margin-top: 35px;
        }

        .box form .inputBox input
        {
            position: relative;
            width: 100%;
            padding: 20px 10px 10px;
            background: transparent;
            outline: none;
            border: none;
            box-sizing: none;
            color: #23242a;
            font-size: 1.2em;
            letter-spacing: 0.05em;
            transition: 0.5s;
            z-index: 10;
        }

        .box form .inputBox i
        {
            position: absolute;
            left: 0;
            bottom: 0;
            width: 100%;
            height: 2px;
            background: #fff;
            border-radius: 4px;
            overflow: hidden;
            transition: 0.5s;
            pointer-events: none;
        }
        .box form .inputBox input:valid ~ i,
        .box form .inputBox input:focus ~ i
        {
            height: 44px;
        }
        .box form .sub
        {
            display: flex;
            justify-content: center;
            gap: 10px
        }

        .box form button[type="submit"]
        {
            border: none;
            outline: none;
            padding: 9px 25px;
            background: #fff;
            cursor: pointer;
            font-size: 0.9em;
            border-radius: 4px;
            font-weight: 600;
            width: 290px;
            margin-top: 10px;
            font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;

        }
        .box form button[type="submit"]:active
        {
            opacity: 0.8;
        }
        .box form button[type="reset"]
        {
            border: none;
            outline: none;
            padding: 9px 25px;
            background: #fff;
            cursor: pointer;
            font-size: 0.9em;
            border-radius: 4px;
            font-weight: 600;
            width: 290px;
            margin-top: 10px;
            font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;

        }
        .box form button[type="reset"]:active
        {
            opacity: 0.8;
        }
        .box form button[type="button"]
        {
            border: none;
            outline: none;
            padding: 9px 25px;
            background: #fff;
            cursor: pointer;
            font-size: 0.9em;
            border-radius: 4px;
            font-weight: 600;
            width: 290px;
            margin-top: 10px;
            font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;

        }
        .box form button[type="button"]:active
        {
            opacity: 0.8;
        }
        h3
        {
            margin-bottom: 40%;
            display: flex;
            justify-content: center;
            align-items: center;
        }
    </style>
    <body>
        <%!
            String vemail, vques, vans;
            OracleConnection oconn;
            OraclePreparedStatement ost;
            OracleResultSet ors = null;
        %>
        <%
            vemail = request.getParameter("pemail");
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@Ankita:1521:orcl", "ankita", "mitra");
            ost = (OraclePreparedStatement) oconn.prepareStatement("SELECT * FROM USERSS where mail=?");
            ost.setString(1, vemail);
            ors = (OracleResultSet) ost.executeQuery();
            if (ors.next()) {
                //vques = ors.getString("SQUES"); //SQUES IS D COL NAME FOR SECURITY QUES IN UR DB
                vans = ors.getString("USR");
            } else {
        %>
        <script>
            alert("Do not try any malaligned URL. \n You can only use  the link received in mail ");
            window.close();
        </script>
        <%
            }
            ost.close();
            oconn.close();
            if (request.getParameter("bVerify") != null) {
                if (request.getParameter("tbAns").equals(vans)) {
        %>
        <script>
            alert("Security Answer verified successfully!!!");
            location.href = "http://localhost:8080/ecommerce/NewPassword.jsp?pemail=<%=vemail%>";
        </script>
        <%
        } else {
        %> 
        <h3 style="color:red">Wrong Answer. Please try again!!!</h3>                 
        <%
            }
        } else {
        %>


        <%
            }
        %> 
        <div class="box">
            <span class="borderLine"></span>
            <form name="frmSecurity" method="POST" action="http://localhost:8080/ecommerce/VerifyQues.jsp?pemail=<%=vemail%>">

                <h2> <b> SECURITY VERIFICATION FORM</b> </h2>

                <div class="inputBox">
                    <span style="color: #fff">USER NAME</span>
                    <input type="text" size="30" name="tbQues" value="<%=vans%>" style="color: solid black" readonly />

                    <i></i>
                </div>
                <div class="inputBox">
                    <span style="color: #fff">CONFIRM USER NAME</span>
                    <input type="text" size="30" name="tbAns" required/>
                    <i></i>
                </div>
                <br>
                <div class="sub">
                    <button type="submit" name="bVerify">Verify</button>

                    <button type="reset" name="bReset">Reset</button>
                    <button type="button" name="bClose" onclick="funClose();">Close</button>
                </div>
            </form>
        </div>
         </body>
</html>