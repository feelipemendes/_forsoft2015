/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dao.EnderecoDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Endereco;

/**
 *
 * @author Sora
 */
@WebServlet(name = "posto", urlPatterns = {"/posto"})
public class posto extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        Endereco endereco = new Endereco();
        EnderecoDao dao = new EnderecoDao();
        try {
            
           request.setCharacterEncoding("UTF-8");
           
            endereco.setCep(request.getParameter("cep"));
            endereco.setLogradouro(request.getParameter("logradouro"));
            endereco.setNumero(request.getParameter("numero"));
            endereco.setComplemento(request.getParameter("complemento"));
            endereco.setBairro(request.getParameter("bairro"));
            endereco.setCidade(request.getParameter("cidade"));
            String uf = request.getParameter("uf");
            endereco.setUf(uf.charAt(0));
          
            
            out.println("<html><body>");
            out.println("Dados digitados: ");
            out.println("CEP: "+endereco.getCep()+"<br>");
            out.println("Logradouro: "+endereco.getLogradouro()+"<br>");
            out.println("Numero: "+endereco.getNumero()+"<br>");
            out.println("Complemento: "+endereco.getComplemento()+"<br>");
            out.println("Bairro: "+endereco.getBairro()+"<br>");
            out.println("Cidade: "+endereco.getCidade());
            out.println("</body></html>");
            
            
            dao.insert(endereco);
            
           
        } finally {
            out.close();
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
