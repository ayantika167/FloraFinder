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

public class AddCart extends HttpServlet {
    String vName,vPrice,vQty,vTot;
    OracleConnection oconn;
    OraclePreparedStatement ost;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
            vName=request.getParameter("pname");
            vPrice=request.getParameter("pprice");
            vQty=request.getParameter("quantity");
            vTot=String.valueOf(Integer.parseInt(vPrice)*Integer.parseInt(vQty));
//            out.println("name: "+vName);
//            out.println("price: "+vPrice);
//            out.println("qty: "+vQty);
//            out.println("total: "+vTot);
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@Ankita:1521:orcl","ankita","mitra");
            String q = "INSERT INTO cart(p_name,price,quantity,totalprice) values(?,?,?,?)";
            ost =(OraclePreparedStatement) oconn.prepareStatement(q);
            ost.setString(1,vName);
            ost.setString(2,vPrice);
            ost.setString(3,vQty);
            ost.setString(4,vTot);
            int ra = ost.executeUpdate();
            if(ra>0) response.sendRedirect("http://localhost:8080/ecommerce/AddCart.html");
            else out.println("Not added to cart");
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException ex) {
            Logger.getLogger(AddCart.class.getName()).log(Level.SEVERE, null, ex);
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
