package br.com.projetodigimon.controller;

import br.com.projetodigimon.dao.DaoConexao;
import br.com.projetodigimon.model.Balanca;
import br.com.projetodigimon.model.Endereco;
import br.com.projetodigimon.model.Rodovia;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Helena
 */
@WebServlet(name = "ServletUI016", urlPatterns = {"/web/ServletUI016"})
public class ServletUI016 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        
        Balanca balanca = new Balanca ();
        
        
        String numSerie  = request.getParameter("numSerie");
        String fabricante  = request.getParameter("fabricante");
        String modelo = request.getParameter("modelo");
        
        
        balanca.setNumSerie(numSerie);
        balanca.setFabricante(fabricante);
        balanca.setModelo(modelo);
        
        Endereco endereco = new Endereco ();
        
        String logradouro = request.getParameter("logradouro");
        String numero = request.getParameter("numero");
        String complemento = request.getParameter("complemento");
        String cep = request.getParameter("cep");
        String cidade = request.getParameter("cidade");
        String bairro = request.getParameter("bairro");
        String uf = request.getParameter("uf");
        
        endereco.setLogradouro(logradouro);
        endereco.setNumero(numero);
        endereco.setComplemento(complemento);
        endereco.setCep(cep);
        endereco.setCidade(cidade);
        endereco.setBairro(bairro);
        endereco.setUf(uf);
        
        
        DaoConexao dc = new DaoConexao();
        
        
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("Numero Serie: "+balanca.getNumSerie()+"<br>");
        out.println("Fabricante: "+balanca.getFabricante()+"<br>");
        out.println("Modelo: "+balanca.getModelo()+"<br>");
        out.println("Logradouro: "+endereco.getLogradouro()+"<br>");
        out.println("Numero: "+endereco.getNumero()+"<br>");
        out.println("Complemento: "+endereco.getComplemento()+"<br>");
        out.println("Cep: "+endereco.getCep()+"<br>");
        out.println("Cidade: "+endereco.getCidade()+"<br>");
        out.println("Bairro: "+endereco.getBairro()+"<br>");
        out.println("Uf: "+endereco.getUf()+"<br>");
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
