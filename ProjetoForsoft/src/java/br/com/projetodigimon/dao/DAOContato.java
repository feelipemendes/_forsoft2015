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




import model.DaoContato;    //importar a entidade contato



/**
 *
 * @author Usuario
 */


// ATENÇÃO, ANTES DE DE COMEÇAR A PROGRAMAR ABRA ESTE LINK PARA FLUIR --> https://www.youtube.com/watch?v=fYFd2K4XFfo&list=PL73iAmm7by8BDhhkvyfrmjebr0DV11MJj&index=14
public class DaoContato {
    private Connection conexao = null;
   
    //fazer metodos construtores depois
    public DaoContato() {
    }

    public DaoContato(String schema) {
        this.setSchema(schema);
    }
    

    public List<Contato> buscar() {
        List<Contato> lista = new ArrayList<Contato>();
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            Statement cs = conexao.createStatement(); // Statement é o responsável por executar seus códigos sql no banco de dados. 
            ResultSet rs = cs.executeQuery("SELECT IDCONTATO, TELEFONE, CELULAR, EMAIL FROM public.contato");

            while (rs.next()) {
                Contato contato = new Contato();
                contato.setIdContato(rs.getInt("IDCONTATO"));
                contato.setTelefone(rs.getString("TELEFONE"));
                contato.setCelular(rs.getString("CELULAR"));
                contato.setEmail(rs.getString("EMAIL"));
                lista.add(contato);
            }
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoContato").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

    public Contato buscar(Contato contato) {
        try {
            conexao = Conexao.abrirConexao(); //abre a conexão com o bd.
            
            /* depois ver essa porra
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            
          */
            
            // PreparedStatemente é uma forma de fazer inserção no banco mais segura, onde você prepara os parametros para serem inseridos. 
            PreparedStatement ps = conexao.prepareStatement("select TELEONFE, CELULAR, EMAIL from CONTATO where IDCONTATO=?"); // pesquiso o id que o usuario digitou na tela e exibo o valor dos campos tabela para tal id
            ps.setInt(1, contato.getIDCONTATO()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 

            ResultSet rs = ps.executeQuery(); // executequery e um metodo do preparedStatement, nossa querySQL e jogada para o executequery e apos, passamos ela para o resultset (executeQuery serve para fazer SELECT)

            while (rs.next()) { //percorre o resultset
                //Contato contato = new Contato();
                contato.setIdContato(rs.getInt("IDCONTATO")); // obtenho os dados do banco e alimento a classe model (convertendo os valores).
                contato.setTelefone(rs.getString("TELEFONE"));
                contato.setCelular(rs.getString("CELULAR"));
                contato.setEmail(rs.getInt("EMAIL"));
                
            }
            
            // fecha os metodos e conexao; se as conexoes não forem fechadas da problemas com o banco.
            rs.close(); 
            ps.close();
            conexao.close();
        } catch (SQLException ex) { // trata o erro caso exista, a linguagem obriga a ter um tratamento.
            Logger.getLogger("DaoContato").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return contato;
    }

    public void inserir(Contato contato) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            PreparedStatement ps = conexao.prepareStatement("insert into CONTATO (TELEFONE, CELULAR, EMAIL) values(?,?,?)");
            
            //Contato contate = new Contato();
            ps.setString(1, contato.getTelefone());
            ps.setInt(2, contato.getCelular());
            ps.setString(3, contato.getEmail());            

            ps.executeUpdate(); // executa o update no banco (executeUpdate serve para INSERT, UPDATE, DELETE).
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoContato").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void atualizar(Contato contato) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*  PS: O SCHEMA não pode atrapalhar o Esquema 
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
             */
            
            PreparedStatement ps = conexao.prepareStatement("update CONTATO set TELEFONE= ?, CELULAR= ?, EMAIL = ?"
							+ "  where IDCONTATO = ?");

            //Contato contato = new Contato();
            ps.setString(1, contato.getCelular());
            ps.setString(2, contato.getEmail());
            ps.setInt(3, contato.getIdContato());            
            ps.setString(4, contato.getTelefone());
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoContato").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(Contato contato) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            PreparedStatement ps = conexao.prepareStatement("delete from CONTATO where IDCONTATO = ?");
            
           // Contato contato = new Contato();
            ps.setInt(1, contato.getIdContato());

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoContato").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
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
