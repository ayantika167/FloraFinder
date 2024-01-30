<%@page import="oracle.jdbc.OraclePreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="oracle.jdbc.OracleResultSetMetaData"%>
<%@page import="oracle.jdbc.OracleResultSet"%>
<%@page import="oracle.jdbc.OracleStatement"%>
<%@page import="oracle.jdbc.OracleConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
   <style>
           .row{
                overflow: hidden;
  position: relative;
  width: 900px;
  height: 700px;
  background: #fff;
  box-shadow: 0 19px 38px rgba(0, 0, 0, 0.30), 0 15px 12px rgba(0, 0, 0, 0.22);

            }
            .row img{
                width: 50%;
                position: relative;
                top:20px;
                left: 350px;
            }
            .update{
                 position: relative;
  width: 640px;
  height: 100%;
  padding: 50px 30px;
  -webkit-transition:-webkit-transform 1.2s ease-in-out;
  transition: -webkit-transform 1.2s ease-in-out;
  transition: transform 1.2s ease-in-out;
  transition: transform 1.2s ease-in-out, -webkit-transform 1.2s ease-in-out;

            }
             label{
               display: block;
  width: 260px;
  margin: 25px auto 0;
  text-align: center;
            }
            input{
  display: block;
  width: 100%;
  margin-top: 5px;
  font-size: 16px;
  padding-bottom: 5px;
  border-bottom: 1px solid rgba(109, 93, 93, 0.4);
  text-align: center;
  font-family: 'Nunito', sans-serif; 
}
         </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%!         
               OracleConnection oconn;
               OraclePreparedStatement opst;
               OracleStatement ost;
               OracleResultSet ors; 
               OracleResultSetMetaData orsmd;
               String a,usr;
        %>
    </head>
    <body>
        <%
             usr=request.getParameter("usr");
            //STEP 1 : REGISTERING OF THE REQUIRED DRIVER WITH THE JAVA PROGRAM
                //Class.forName("oracle.jdbc.OracleDriver");
                DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
                
                 //STEP 2: INSTANTIATING THE CONNECTION OBJECT 
                oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@Ankita:1521:orcl","ankita","mitra");

                //STEP 4: CREATING THE QUERY
                a = "SELECT * from userss where usr=?";
                opst=(OraclePreparedStatement)oconn.prepareStatement(a);
                opst.setString(1,usr);
                
                //STEP 5: INSTANTIATING STATEMENT OBJECT FOR EXECUTING SQL QUERIES
                ors =(OracleResultSet) opst.executeQuery();
                
                
                 //STEP 6: GETTING SYSTEM INFORMATION ABOUT THE FETCHED TABLE
                orsmd = (OracleResultSetMetaData)ors.getMetaData();
                
                
            %>
      <div class="row">
           <div class="update">
                
            <form action="http://localhost:8080/ecommerce/update_cust" method="POST">
            
                    <%
                        
                        while(ors.next())
                        {
                             %>
                                <label>User Id<label>
                                <input type="text"  name="usr" value="<%=ors.getString(1)%>" readonly>
                                <br>
                                <label>Email<label>
                                <input type="text"  name="mail" value="<%=ors.getString(2)%>">
                                <br>
                                <label>Phone Number<label>
                                <input type="text"  name="pno" value="<%=ors.getString(3)%>">
                                <br>
                                <label>Password<label>
                                <input type="text"  name="password" value="<%=ors.getString(4)%>">
                          
                
                <%
                    }
                %>
                    <button name="button">Submit</button>
            
            </form>
        </div>
                    
     </div>
    </body>
</html>