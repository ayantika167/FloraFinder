<%@page import="oracle.jdbc.OraclePreparedStatement"%>
<%@page import="oracle.jdbc.OracleResultSetMetaData"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="oracle.jdbc.OracleResultSet"%>
<%@page import="oracle.jdbc.OracleStatement"%>
<%@page import="oracle.jdbc.OracleConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Displaying all user details</title>
        <%!
                OracleConnection oconn3;
                OracleStatement ost3;
                OraclePreparedStatement opst3;
                OracleResultSet ors3;
                OracleResultSetMetaData orsmd3;
                String q3;
                int counter3, reccounter3;
            %>
            <style>
                body {
                    background:  linear-gradient(to bottom, #990099, #3399ff) no-repeat center center ;
                    background-size: cover;
                    min-height: 100vh;
                    position: relative;
                    display: block;
                    width: 100%;
                    overflow: hidden;
                }
                table, tr, td
                {
                   margin: auto;
                    padding: 10px;
                    border: 3px solid #001a33;
                    border-collapse: collapse;
                   width: 50%;
                 }
                th
                {
                    padding: 10px;
                    border: 3px solid #001a33;
                    border-collapse: collapse;
                    color: black;
                }
                .active
                {
                    background-color: #4d004d;
                    color: #ffff;
                    font-size: 1.5rem;
                    border: none;
                    padding: 9px 0;
                    width: 300px;
                    cursor: pointer;
                    height: 50px;
                    border-radius: 6px;
                    transition: all 0.2s ease;
                    margin-left: 55%;
                    margin-top: 5%;
                }
            </style>
            <script>
                function funDelete()
                {
                    if(confirm("Are you sure you want to delete the record?") === true)
                        return true;
                    else return false;
                }
            </script>
    </head>
    <body>
        <%@include file="nav1.jsp" %>
        
        <br/>
        <br/>
        <br/>
        
        <%
            // STEP 1: REGISTERING THE JSP WITH ORACLE
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            
            //STEP 2: CREATING THE CONNECTION OBJECT
            oconn3 = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@Ankita:1521:orcl","ankita","mitra");
            
            if(request.getParameter("bSearch")!=null)
            {
                String vSearchUser = request.getParameter("tSearch");
        
                    //STEP 4: CREATING THE QUERY
                    q3 = "select * from cart where p_name=?";
           
                    //STEP 3: CREATING THE STATEMENT
                    opst3 = (OraclePreparedStatement)oconn3.prepareStatement(q3);
            
                    //STEP 5: FILLING UP THE PARAMETERS
                    opst3.setString(1, vSearchUser);
            
                    //STEP 5: Executing the query and populating the resultset
                    ors3 = (OracleResultSet)opst3.executeQuery();
                     
                    %>
                    
                    <%
            }
            else
            {
                           
            //STEP 3: CREATING THE STATEMENT
            ost3 = (OracleStatement)oconn3.createStatement();
            
            //STEP 4: CREATING THE QUERY
            q3 = "select * from cart order by 1";
            
            //STEP 5: Executing the query and populating the resultset
            ors3 = (OracleResultSet)ost3.executeQuery(q3);
            
            
            }
            //STEP 6: Getting the Headings
            orsmd3 = (OracleResultSetMetaData)ors3.getMetaData();
        %>
        <table>
            <thead>
                <tr>
                <%
                    for(counter3 = 1; counter3 <= orsmd3.getColumnCount(); counter3 ++)
                    {
                    %>
                    <th><%=orsmd3.getColumnName(counter3)%></th>
                    <%
                        }
                        %>
                    
                    </tr>
            </thead>
            <tbody>
                <%
                    reccounter3 = 0;
                    while(ors3.next())
                    {
                        reccounter3++;
                    %>
                <tr>
                    <%
                        for(int i = 1; i <= 4; i ++)
                        {
                    %>
                    <td><%=ors3.getString(i)%></td>
                    <%
                        }
                     %>
            
              <%
                    }
                    
                    %>
            </tbody>
            <tfoot></tfoot>
        </table>
            <form action="http://localhost:8080/ecommerce/buy.jsp">
                <div>
            <button type="submit" class="active" > <b>Place Order</b> </button>
        </div>
            </form>
            
        
           
         
    </body>
</html>