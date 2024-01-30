package firstpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStream;
import static java.lang.System.out;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;


public class update_cust extends HttpServlet {

    
    OracleConnection oconn;
    OraclePreparedStatement ost;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               
                String vUserid = request.getParameter("usr");
                String vEmail = request.getParameter("mail");
                String vPhone = request.getParameter("pno");
                String vPassword = request.getParameter("password");
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
            
 //out.println(vUserid + vEmail + vPhone + vPassword);
            
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@Ankita:1521:orcl","ankita","mitra");

            String q = "UPDATE USERSS SET MAIL = ?, P_NO = ?, PASSWORD = ?  WHERE USR = ?";

            ost = (OraclePreparedStatement) oconn.prepareStatement(q);
            
            
            ost.setString(1, vEmail);
            ost.setString(2, vPhone);
            ost.setString(3, vPassword);
            ost.setString(4, vUserid);
            int rowCount = ost.executeUpdate();
            if (rowCount > 0) {
                request.setAttribute("update", "success");
                //out.println("updtaed");
                response.sendRedirect("http://localhost:8080/ecommerce/admindash.jsp");
            } else {
                //out.println("not updtaed");
                request.setAttribute("update", "failed");
            }
            out.println("</body>");
            out.println("</html>");
            ost.close();
            oconn.close();
        }
         catch (SQLException ex) {
            out.println("Failed");
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
