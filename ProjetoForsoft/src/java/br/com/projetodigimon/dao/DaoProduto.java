package br.com.projetodigimon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




import model.Produto;    //importar a entidade rodovia



/**
 *
 * @author Usuario
 */


// ATENÇÃO, ANTES DE DE COMEÇAR A PROGRAMAR ABRA ESTE LINK PARA FLUIR --> https://www.youtube.com/watch?v=fYFd2K4XFfo&list=PL73iAmm7by8BDhhkvyfrmjebr0DV11MJj&index=14
public class DaoProduto {
    private Connection conexao = null;
   
    //fazer metodos construtores depois
    public DaoProduto() {
    }

    public DaoProduto(String schema) {
        this.setSchema(schema);
    }
    

    public List<Produto> buscar() {
        List<Produto> lista = new ArrayList<Produto>();
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            Statement cs = conexao.createStatement(); // Statement é o responsável por executar seus códigos sql no banco de dados. 
            ResultSet rs = cs.executeQuery("SELECT IDPRODUTO, IDCARGA, MERCADORIA, PESOTOTAL, VALORTOTAL, SITUACAO FROM public.produto");

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("IDPRODUTO"));
                produto.setIdCarga(rs.getInt(""));
                produto.setMercadora(rs.getString(""));
                produto.setPesoTotal(rs.getString(""));
                produto.setValorTotal(rs.getString(""));
                produto.setSituacao(rs.getString(""));
                
                lista.add(produto);
            }
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoProduto").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

    public Produto buscar(Produto produto) {
        try {
            conexao = Conexao.abrirConexao(); //abre a conexão com o bd.
            
            /* depois ver essa porra
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            
          */
            
            // PreparedStatemente é uma forma de fazer inserção no banco mais segura, onde você prepara os parametros para serem inseridos. 
            PreparedStatement ps = conexao.prepareStatement("select IDCARGA, MERCADORIA, PESOTOTAL, VALORTOTAL, SITUACAO from PRODUTO where IDPRODUTO=?"); // pesquiso o id que o usuario digitou na tela e exibo o valor dos campos tabela para tal id
            ps.setInt(1, produto.getIDPRODUTO()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 

            ResultSet rs = ps.executeQuery(); // executequery e um metodo do preparedStatement, nossa querySQL e jogada para o executequery e apos, passamos ela para o resultset (executeQuery serve para fazer SELECT)

            while (rs.next()) { //percorre o resultset
                produto.setIdCarga(rs.getInt("IDCARGA")); // obtenho os dados do banco e alimento a classe model (convertendo os valores).
                produto.setMercadoria(rs.getString("MERCADORIA"));
                produto.setPesoTotal(rs.getString("PESOTOTAL"));
                produto.setValorTotal(rs.getInt("VALORTOTAL"));
                produto.setSituacao(rs.getString("SITUACAO"));
            }
            
            // fecha os metodos e conexao; se as conexoes não forem fechadas da problemas com o banco.
            rs.close(); 
            ps.close();
            conexao.close();
        } catch (SQLException ex) { // trata o erro caso exista, a linguagem obriga a ter um tratamento.
            Logger.getLogger("DaoProduto").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return produto;
    }

    public void inserir(Produto produto) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            PreparedStatement ps = conexao.prepareStatement("insert into RODOVIA (IDCARGA, MERCADORIA, PESOTOTAL, VALORTOTAL, SITUACAO) values(?,?,?,?,?)");

            ps.setInt(1, produto.getIdCarga()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setString(2, produto.getMercadoria());
            ps.setString(3, produto.getPesoTotal());
            ps.setString(4, produto.getValorTotal());
            ps.setString(5, produto.getSituacao());
            

            ps.executeUpdate(); // executa o update no banco (executeUpdate serve para INSERT, UPDATE, DELETE).
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoProduto").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void atualizar(Produto produto) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*  PS: O SCHEMA não pode atrapalhar o Esquema 
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
             */
            
            PreparedStatement ps = conexao.prepareStatement("update PRODUTO set IDCARGA = ?, MERCADORIA = ?, PEOSTOTAL = ?, VALORTOTAL = ?, SITUACAO = ?"
							+ "  where IDRODOVIA = ?");


            ps.setInt(1, produto.getIdCarga());
            ps.setString(2, produto.getMercadoria());
            ps.setString(3, produto.getPesoTotal());
            ps.setString(4, produto.getValorTotal());
            ps.setString(5, produto.getSituacao());

            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoProduto").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(Produto produto) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            PreparedStatement ps = conexao.prepareStatement("delete from PRODUTO where IDPRODUTO = ?");

            ps.setInt(1, produto.getIdProduto());

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoProduto").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
    }

    
    /*
    
    public String getSchema() {
        return schema;
    }

    public final void setSchema(String schema) {
        this.schema = schema;
    }
    
    */

}
