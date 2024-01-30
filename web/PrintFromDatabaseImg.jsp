<%@page import="java.util.Base64"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
    
    
    
    <title>JSP Page</title>
    <style>
        .card {
            width: 10rem;
            height: 10rem;
        }
    </style>
</head>
<body>
    
<!--    navbar-->

<!--    end of navbar-->
    <%
    Connection conn= null;
    Statement st=null;
    ResultSet rs=null;
    try {
        String url = "jdbc:oracle:thin:@Ankita:1521:orcl";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn = DriverManager.getConnection(url,"ankita","mitra");
        st = conn.createStatement();
       // ss=conn.createStatement();

        String s = "select * from product";
       // String t="Select * from testimg";
        rs = st.executeQuery(s);
%>
<div class="container">
    <div class="row">
        <% 
        while (rs.next()) { %>
        <div class="col-md-3">

            <table >
            <thead>
            <th></th>
            </thead>
            <tbody>
                <tr>
                
           
                    <td >
                        <center><% //to show the image
                        Blob imageBlob = rs.getBlob("image");
                        byte[] imageBytes = imageBlob.getBytes(1, (int) imageBlob.length());
                        out.write("<img style='width:140px;height:235px'src=\"data:image/jpeg;base64," + new String(Base64.getEncoder().encode(imageBytes)) + "\"/>");
                        %>
                        </center>
                    </td>
                </tr>
                    <!--<tr> <th><%= rs.getString(1)%></th></tr> -->
                <tr> <th> Product Name: <%= rs.getString(2)%></th></tr>
                <tr> <th> Category: <%= rs.getString(3)%></th></tr>
                <tr> <th> Price: <%= rs.getString(4)%></th></tr>
                 
<!--                <td>
                
                    <button class="btn btn-primary">Edit</button>
                    <div>
                    <form method="POST" action="http://localhost:8080/ecommerce/productdetails.jsp">
                    <button type="submit" class="btn btn-danger">Delete</button>
                    </form>  
                    </div>
                </td>-->
                
        </table>
                <br>
                <hr>
                <br>
            </div>
        
        <% } %>
        </div>
    </div>
</div>
<%
    } catch(Exception e){
        e.printStackTrace();
    } finally {
        try { rs.close(); } catch (Exception e) { }
        try { st.close(); } catch (Exception e) { }
        try { conn.close(); } catch (Exception e) { }
    }
%>



<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.1/jquery.min.js"></script>

</body>
</html>