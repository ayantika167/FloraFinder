<%-- 
    Document   : logfail
    Created on : 12 May, 2023, 3:09:59 PM
    Author     : mitra
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            body{
                background-color: teal;
            }
            table {
                background-color: lightblue;
                width: 500px;
                height: 300px;
               margin: auto;
               margin-top: 150px;
            }
            img {
                 height: 100px;
                width: 100px;
                border-radius: 10%;
                padding-left: 200px;
                padding-top: 50px;
                padding-bottom: 0;
                padding-right: 0;
              }
              h2
              {
                  padding-left: 180px;
                  padding-top: 15px;
              }
              h3 a
              {
                  text-decoration: none;
                  color: red;
                  padding-left: 120px;
                  font-size: 26px;
                                 
              }
        </style>
        </head>
    <body>
        <table>
            <tr>
                <td>
        <img src="img/fail.png" alt=""/>
        <h2>Login failed...</h2>
       
        
        <h3><a href = "login.jsp">Click Here to LOG IN!!</a></h3>
                </td>
            </tr>
        </table>
    </body>
</html>