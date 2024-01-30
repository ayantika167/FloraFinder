package firstpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;


public class probsolve extends HttpServlet {

    String vFirstname,vLastname,vEmail,vPhonenumber,vMessage;
    OracleConnection oconn;
    OraclePreparedStatement ost;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registration</title>");            
            out.println("</head>");
            out.println("<body>");
           vFirstname = request.getParameter("tbfirstname");
            vLastname=request.getParameter("tblastname");
           vEmail=request.getParameter("tbemail");
            vPhonenumber = request.getParameter("tbp_no");
            vMessage = request.getParameter("tbmessage");
         
            out.println("<h1>Your Info:</h1>");
            out.println("<h2>User Id &nbsp;&nbsp;&nbsp;&nbsp; "+vFirstname+"</h2>");
            out.println("<h2>Mail Id &nbsp;&nbsp;&nbsp;&nbsp; "+vLastname+"</h2>");
            out.println("<h2>Phone Number &nbsp;&nbsp;&nbsp;&nbsp; "+vEmail+"</h2>");
            out.println("<h2>Password &nbsp;&nbsp;&nbsp;&nbsp; "+vPhonenumber+"</h2>");
            out.println("<h2>Password &nbsp;&nbsp;&nbsp;&nbsp; "+vMessage+"</h2>");
           
            out.println("<h2 style='color:orange'>Saving the data within database.........</h2>");
             
//STEP 1 : REGISTERING OF THE REQUIRED DRIVER WITH THE JAVA PROGRAM
                //Class.forName("oracle.jdbc.OracleDriver");
                DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
                
                 //STEP 2: INSTANTIATING THE CONNECTION OBJECT 
                oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@Ankita:1521:orcl","ankita","mitra");
                
                //STEP 3: CREATING THE QUERY
                String q = "INSERT INTO custprob(firstname,lastname,email,p_no,message) values(?,?,?,?,?)";
            
                //STEP 4: INSTANTIATING STATEMENT OBJECT FOR EXECUTING SQL QUERIES
                ost =(OraclePreparedStatement) oconn.prepareStatement(q);
                
                //STEP 5: CHANGING THE DATE FORMAT FROM JAVA DATE  TO ORACLE DATE
                /*SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
                Date date = dt.parse(vDOB);
                SimpleDateFormat dt1 = new SimpleDateFormat("dd-MMM-yyyy");
                vDOB = dt1.format(date);*/
                
                //STEP 6: FILLING THE BLANK VALUES OF THE QUERY MARKED WITH ? 
                ost.setString(1,vFirstname);
                ost.setString(2,vLastname);
                ost.setString(3,vEmail);
                ost.setString(4,vPhonenumber);
                ost.setString(5,vMessage);
               
                
                //STEP 7: EXECUTING THE QUERY
                
                int ra = ost.executeUpdate();
                
                //out.println("<h2>Rows affected is : " + ra + "</h2>");
                 //out.println("<h2 style='color:green'>Data saved successfully.........</h2>");
                if(ra>0){
                     response.sendRedirect("probsuccess.jsp");
                }
                else{
                    response.sendRedirect("probfail.jsp");
                }
                //ost.close();
                //oconn.close();
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            Logger.getLogger(probsolve.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}