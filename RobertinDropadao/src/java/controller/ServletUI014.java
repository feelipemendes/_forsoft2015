/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//peraeeeeee
package controller;

import dao.DaoRodovia;
import model.Rodovia;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Luiz
 */
@WebServlet(name = "ServletUI014", urlPatterns = {"/web/ServletUI014"})
public class ServletUI014 extends HttpServlet {
    private DaoRodovia daorodovia;
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
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
        Rodovia rodovia = new Rodovia();
        
        String nome = request.getParameter("nome");
        String extensaoKm = request.getParameter("extensaoKm");
        String ufInicial = request.getParameter("ufInicial");
        String ufFinal = request.getParameter("ufFinal");
        String cidadeInicial = request.getParameter("cidadeInicial");
        String cidadeFinal = request.getParameter("cidadeFinal");
        
        // remover depois
        //rodovia.setTipo("a");
        //rodovia.setSituacao("b");
        rodovia.setIdRodovia(3);
        
                
        rodovia.setNome(nome);
        rodovia.setExtensaoKm(Float.parseFloat(extensaoKm));
        rodovia.setUfInicial(ufInicial);
        rodovia.setUfFinal(ufFinal);
        rodovia.setCidadeInicial(cidadeInicial);
        rodovia.setCidadeFinal(cidadeFinal);
        
        
        
        System.out.println("FORA DO TRY SERVLET");
        try{
            System.out.println("ENTROU NO TRY");
             daorodovia.inserir(rodovia);
             request.setAttribute("msg","Cadastrado com Sucesso!");
        }catch(Exception e){
            //captura uma exeption e faz alguma coisa que eu colocar dentro dele.
        }   
                
        out.println("<html><body>");
        out.println("Nome: "+rodovia.getNome()+"<br>");
        out.println("Extensão: "+rodovia.getExtensaoKm()+"<br>");
        out.println("Cidade Inicial: "+rodovia.getCidadeInicial()+"<br>");
        out.println("UF Inicial: "+rodovia.getUfInicial()+"<br>");
        out.println("Cidade Final: "+rodovia.getCidadeFinal()+"<br>");
        out.println("UF Final: "+rodovia.getUfFinal()+"<br>");
        out.println("</body></html>");
       
        
        
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ServletUI014.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ServletUI014.class.getName()).log(Level.SEVERE, null, ex);
        }
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
