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
                table, tr, td
                {
                   margin: auto;
                    padding: 10px;
                    border: 3px solid darkblue;
                    border-collapse: collapse;
                   width: 50%;
                 }
                th
                {
                    padding: 10px;
                    border: 3px solid darkblue;
                    border-collapse: collapse;
                    color: black;
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
    <body style="background-color: rgb(200, 226, 242)">
        <div>
            <span style="font-weight: bold; font-size: 250%">CART DETAILS....</span>
            <span>
                <form method="POST" action="cartdetails.jsp">
                    <input type="text" placeholder="&#128269;Enter User to search" name="tSearch" style="width: 500px; height: 25px" required>
                    <button type="submit" name="bSearch"  class="btn-success" style="height: 30px; width: 100px; font-style: italic">Search</button>
                </form>
            </span>
        </div>
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
                    <form method="POST" action="cartdetails.jsp">
                        <button type="submit" style="height: 30px; width: 200px;  font-style: italic; font-weight: bold">Display all Users</button>
                    </form>
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
                    <th colspan="2">ACTIONS</th>
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
            <form method="POST" action="http://localhost:8080/ecommerce/DelCart?p_name=<%=ors3.getString(1)%>"  onsubmit=" return funDelete()">
                <td><button type="submit" class="btn-danger">Delete</button></td>
                     </form>
                </tr>
              <%
                    }
                    
                    %>
            </tbody>
            <tfoot></tfoot>
        </table>
        <%
           if (reccounter3 == 0)
                    {
                    %>
                    <h2 style="font-family: monospace; color: black; font-weight: bold">No matching records exists. Try with a better match</h2>
                    <%
                    }
        // ors.close();
       //  ost.close();
           oconn3.close();
           
         %>
    </body>
</html>