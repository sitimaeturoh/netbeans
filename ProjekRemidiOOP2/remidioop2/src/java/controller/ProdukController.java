/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Barang;

/**
 *
 * @author MaySM
 */
public class ProdukController extends HttpServlet {
    private final static String add_action = "new";
    private final static String delete_action = "delete";
    private final static String edit_action = "edit";
    private final static String list_action = "list";
    private String message= "";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                String action = request.getParameter("action");
                if(action==null){
                    action= "list";
                }
                try {
                    switch (action) {
                    case "new":
                        showNewForm(request, response);
                        break;
                    case "create":
                        createBarang(request, response);
                        break;
                    case "delete":
                        deleteBarang(request, response);
                        break;
                    case "edit":
                        showEditForm(request, response);
                        break;
                    case "update":
                        updateBarang(request, response);
                        break;
                    default:
                        listBarang(request, response);
                        break;
                    }
                } 
            catch (SQLException ex) {
                throw new ServletException(ex);
            }
        }
    }
  
    private void listBarang(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        Barang p= new Barang();
        List<Barang> produks = p.all();
        request.setAttribute("produks", produks);
        RequestDispatcher dispatcher = request.getRequestDispatcher("produks/list.jsp");
        dispatcher.forward(request, response);
    }
    private void createBarang(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String kode = request.getParameter("kode");
        String nama = request.getParameter("nama");
        String harga = request.getParameter("harga");
        String stok = request.getParameter("stok");
 
        Barang barang = new Barang();
        barang.setKode(kode);
        barang.setNama(nama);
        barang.setHarga(harga);
        barang.setStok(stok);
        if (barang.create()){
            message= "new produk added";                    
            request.setAttribute("message", message);
            response.sendRedirect("produks?action="+list_action);
        }
        else{
            message= "new produk failed to add";
            request.setAttribute("message", message);
            request.getRequestDispatcher("produks?action="+add_action).include(request, response);
        }
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            RequestDispatcher dispatcher = request.getRequestDispatcher("produks/new.jsp");
            dispatcher.forward(request, response);
        }
    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            Barang barang= new Barang();
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("barang", barang.find(id));

            RequestDispatcher dispatcher = request.getRequestDispatcher("produks/edit.jsp");
            dispatcher.forward(request, response);
        }
    
   private void updateBarang(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        String kode = request.getParameter("kode");
        String nama = request.getParameter("nama");
        String harga = request.getParameter("harga");
        String stok = request.getParameter("stok");
 
        Barang barang = new Barang();
        barang.setId(id);
        barang.setKode(kode);
        barang.setNama(nama);
        barang.setHarga(harga);
        barang.setStok(stok);
        if (barang.update()){
            message= "produk updated";     
            request.setAttribute("message", message);
            List<Barang> produks = barang.all();
            request.setAttribute("produks", produks);
            request.getRequestDispatcher("/produks/list.jsp").include(request, response);
        }
        else{
            message= "produk failed to updated";     
            request.setAttribute("message", message);
            RequestDispatcher dispatcher = request.getRequestDispatcher("produks?action="+ edit_action);
            dispatcher.forward(request, response);
        }
  
    }
 
    private void deleteBarang(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
 
        Barang barang = new Barang();
        barang.setId(id);
        if(barang.delete()){
            message= "produk deleted";                    
        }
        else{
            message= "produk was not deleted";                
        }    
        request.setAttribute("message", message);
        RequestDispatcher dispatcher = request.getRequestDispatcher("produks?action="+ list_action);
        dispatcher.forward(request, response);

//        response.sendRedirect("produk?action="+list_action); 
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
