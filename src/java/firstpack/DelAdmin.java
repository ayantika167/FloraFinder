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

public class DelAdmin extends HttpServlet {

        String vId,query;
        OracleConnection oconn;
        OraclePreparedStatement ost;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
                        
            out.println("</head>");
            out.println("<body>");
            //STEP 1 : REGISTERING OF THE REQUIRED DRIVER WITH THE JAVA PROGRAM
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
                
                 //STEP 2: INSTANTIATING THE CONNECTION OBJECT 
                oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@Ankita:1521:orcl","ankita","mitra");
                
                //STEP 3: CREATING THE QUERY
                query = "delete from admin where id = ?";
            
                //STEP 4: INSTANTIATING STATEMENT OBJECT FOR EXECUTING SQL QUERIES
                ost =(OraclePreparedStatement) oconn.prepareStatement(query);
                
                
                //STEP 6: FILLING THE BLANK VALUES OF THE QUERY MARKED WITH ? 
                vId = request.getParameter("id");
                ost.setString(1,vId);
                
                //STEP 7: EXECUTING THE QUERY
                
                int ra = ost.executeUpdate();
                
                
                
                ost.close();
                oconn.close();

           
            response.sendRedirect("http://localhost:8080/ecommerce/admindash.jsp");
        }   catch (SQLException ex) {
                Logger.getLogger(DelAdmin.class.getName()).log(Level.SEVERE, null, ex);
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