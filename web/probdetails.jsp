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
        <title>Displaying all complaints</title>
        <%!
            OracleConnection oconn2;
            OracleStatement ost2;
            OraclePreparedStatement opst2;
            OracleResultSet ors2;
            OracleResultSetMetaData orsmd2;
            String p;
            int counter2, reccounter2;
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
                if (confirm("Are you sure you want to delete the record?") === true)
                    return true;
                else
                    return false;
            }
        </script>
    </head>
    <body style="background-color: rgb(200, 226, 242)">
        <div>
            <span style="font-weight: bold; font-size: 250%">COMPLAINTS DETAILS....</span>
            <span>
                <form method="POST" action="probdetails.jsp">
                    <input type="text" placeholder="&#128269;Enter User to search" name="tSearch" style="width: 500px; height: 25px" required>
                    <button type="submit" name="bSearch" class="btn-success" style="height: 30px; width: 100px; font-style: italic">Search</button>
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
            oconn2 = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@Ankita:1521:orcl","ankita","mitra");

            if (request.getParameter("bSearch") != null) {
                String vSearchUser = request.getParameter("tSearch");

                //STEP 4: CREATING THE QUERY
                p = "select * from custprob where firstname=?";

                //STEP 3: CREATING THE STATEMENT
                opst2 = (OraclePreparedStatement) oconn2.prepareStatement(p);

                //STEP 5: FILLING UP THE PARAMETERS
                opst2.setString(1, vSearchUser);

                //STEP 5: Executing the query and populating the resultset
                ors2 = (OracleResultSet) opst2.executeQuery();

        %>
        <form method="POST" action="probdetails.jsp">
            <button type="submit" class="btn-aqua" style="height: 30px; width: 200px;  font-style: italic; font-weight: bold">Display all Messages</button>
        </form>
        <%                        } else {

                //STEP 3: CREATING THE STATEMENT
                ost2 = (OracleStatement) oconn2.createStatement();

                //STEP 4: CREATING THE QUERY
                p = "select * from custprob order by 1";

                //STEP 5: Executing the query and populating the resultset
                ors2 = (OracleResultSet) ost2.executeQuery(p);

            }
            //STEP 6: Getting the Headings
            orsmd2 = (OracleResultSetMetaData) ors2.getMetaData();
        %>
        <table>
            <thead>
                <tr>
                    <%
                        for (counter2 = 1; counter2 <= orsmd2.getColumnCount(); counter2++) {
                    %>
                    <th><%=orsmd2.getColumnName(counter2)%></th>
                        <%
                            }
                        %>
                    <th colspan="2">ACTIONS</th>
                </tr>
            </thead>
            <tbody>
                <%
                    reccounter2 = 0;
                    while (ors2.next()) {
                        reccounter2++;
                %>
                <tr>
                    <%
                        for (int i = 1; i <= 5; i++) {
                    %>
                    <td><%=ors2.getString(i)%></td>
                    <%
                        }
                    %>
                   
            <form method="POST" action="http://localhost:8080/ecommerce/DelProb?firstname=<%=ors2.getString(1)%>"  onsubmit=" return funDelete()">
                <td><button type="submit" class="btn-danger">Delete</button></td>
            </form>
        </tr>
        <%
            }

        %>
    </tbody>
    <tfoot></tfoot>
</table>
<%            if (reccounter2 == 0) {
%>
<h2 style="font-family: monospace; color: black; font-weight: bold">No matching records exists. Try with a better match</h2>
<%
    }
    // ors.close();
    //  ost.close();
    oconn2.close();

%>
</body>
</html>