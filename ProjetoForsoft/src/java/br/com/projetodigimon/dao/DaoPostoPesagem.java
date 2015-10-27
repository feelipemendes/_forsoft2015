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




import model.PostoPesagem;    //importar a entidade rodovia



/**
 *
 * @author Usuario
 */


// ATENÇÃO, ANTES DE DE COMEÇAR A PROGRAMAR ABRA ESTE LINK PARA FLUIR --> https://www.youtube.com/watch?v=fYFd2K4XFfo&list=PL73iAmm7by8BDhhkvyfrmjebr0DV11MJj&index=14
public class DaoPostoPesagem {
    private Connection conexao = null;
   
    //fazer metodos construtores depois
    public DaoPostoPesagem() {
    }

    public DaoPostoPesagem(String schema) {
        this.setSchema(schema);
    }
    

    public List<PostoPesagem> buscar() {
        List<PostoPesagem> lista = new ArrayList<PostoPesagem>();
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            Statement cs = conexao.createStatement(); // Statement é o responsável por executar seus códigos sql no banco de dados. 
            ResultSet rs = cs.executeQuery("SELECT IDPOSTO, IDRODOVIA, LATITUDE, LONGITUDE, SITUACAO FROM public.postoPesagem");

            while (rs.next()) {
                PostoPesagem postoPesagem = new PostoPesagem();
                postoPesagem.setIdPostoPesagem(rs.getInt("IDPOSTOPESAGEM"));
                postoPesagem.setIdRodovia(rs.getInt("IDRODOVIA"));
                postoPesagem.setLatitude(rs.getString("LATITUDE"));
                postoPesagem.setLongitude(rs.getString("LONGITUDE"));
                postoPesagem.setSituacao(rs.getString("SITUACAO"));
                
                lista.add(postoPesagem);
            }
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoPostoPesagem").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

    public PostoPesagem buscar(PostoPesagem postoPesagem) {
        try {
            conexao = Conexao.abrirConexao(); //abre a conexão com o bd.
            
            /* depois ver essa porra
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            
          */
            
            // PreparedStatemente é uma forma de fazer inserção no banco mais segura, onde você prepara os parametros para serem inseridos. 
            PreparedStatement ps = conexao.prepareStatement("select IDRODOVIA, LATITUDE, LONGITUDE from POSTOPESAGEM where IDPOSTOPESAGEM=?"); // pesquiso o id que o usuario digitou na tela e exibo o valor dos campos tabela para tal id
            ps.setInt(1, postoPesagem.getIDPOSTOPESAGEM()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 

            ResultSet rs = ps.executeQuery(); // executequery e um metodo do preparedStatement, nossa querySQL e jogada para o executequery e apos, passamos ela para o resultset (executeQuery serve para fazer SELECT)

            while (rs.next()) { //percorre o resultset
                postoPesagem.setIdPostoPesagem(rs.getInt("IDPOSTOPESAGEM")); // obtenho os dados do banco e alimento a classe model (convertendo os valores).
                postoPesagem.setIdRodovia(rs.getInt("IDRODOVIA"));
                postoPesagem.setLatitude(rs.getString("LATITUDE"));
                postoPesagem.setLongitude(rs.getString("LONGITUDE"));
                postoPesagem.setSituacao(rs.getInt("SITUACAO"));
            }
            
            // fecha os metodos e conexao; se as conexoes não forem fechadas da problemas com o banco.
            rs.close(); 
            ps.close();
            conexao.close();
        } catch (SQLException ex) { // trata o erro caso exista, a linguagem obriga a ter um tratamento.
            Logger.getLogger("DaoPostoPesagem").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return postoPesagem;
    }

    public void inserir(PostoPesagem postoPesagem) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            PreparedStatement ps = conexao.prepareStatement("insert into POSTOPESAGEM (IDRODOVIA, LATITUDE, LONGITUDE, SITUACAO) values(?,?,?,?)");

            ps.setString(1, postoPesagem.getIdRodovia()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setString(2, postoPesagem.getLatitude());
            ps.setInt(3, postoPesagem.getLongitude());
            ps.setString(4, postoPesagem.getSituacao());
            

            ps.executeUpdate(); // executa o update no banco (executeUpdate serve para INSERT, UPDATE, DELETE).
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoPostoPesagem").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void atualizar(PostoPesagem postoPesagem) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*  PS: O SCHEMA não pode atrapalhar o Esquema 
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
             */
            
            PreparedStatement ps = conexao.prepareStatement("update POSTOPESAGEM set IDRODOVIA = ?, LATITUDE = ?, LONGITUDE = ?, SITUACAO = ?"
							+ "  where IDPOSTOPESAGEM = ?");


            ps.setInt(1, postoPesagem.getIdRodovia());
            ps.setString(2, postoPesagem.getLatitude());
            ps.setInt(3, postoPesagem.getLongitude());
            ps.setString(4, postoPesagem.getSituacao());

            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoPostoPesagem").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(PostoPesagem postoPesagem) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            PreparedStatement ps = conexao.prepareStatement("delete from POSTOPESAGEM where IDPOSTOPESAGEM = ?");

            ps.setInt(1, postoPesagem.getIdPostoPesagem());

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoPostoPesagem").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
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
