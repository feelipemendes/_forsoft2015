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




import model.Frete;    //importar a entidade rodovia



/**
 *
 * @author Usuario
 */


// ATENÇÃO, ANTES DE DE COMEÇAR A PROGRAMAR ABRA ESTE LINK PARA FLUIR --> https://www.youtube.com/watch?v=fYFd2K4XFfo&list=PL73iAmm7by8BDhhkvyfrmjebr0DV11MJj&index=14
public class DaoFrete {
    private Connection conexao = null;
   
    //fazer metodos construtores depois
    public DaoFrete() {
    }

    public DaoFrete(String schema) {
        this.setSchema(schema);
    }
    

    public List<Frete> buscar() {
        List<Frete> lista = new ArrayList<Frete>();
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            Statement cs = conexao.createStatement(); // Statement é o responsável por executar seus códigos sql no banco de dados. 
            ResultSet rs = cs.executeQuery("SELECT IDFRETE, IDTRANSPORTADOR, IDVEICULO, TIPO, SITUACAO FROM public.frete");

            while (rs.next()) {
                Frete frete = new Frete();
                frete.setIdFrete(rs.getInt("IDFRETE"));
                frete.setIdTransportador(rs.getInt("IDTRANSPORTADOR"));
                frete.setIdVeiculo(rs.getInt("IDVEICULO"));
                frete.setTipo(rs.getString("TIPO"));
                frete.setSituacao(rs.getString("SITUACAO"));
                
                lista.add(frete);
            }
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoFrete").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

    public Frete buscar(Frete frete) {
        try {
            conexao = Conexao.abrirConexao(); //abre a conexão com o bd.
            
            /* depois ver essa porra
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            
          */
            
            // PreparedStatemente é uma forma de fazer inserção no banco mais segura, onde você prepara os parametros para serem inseridos. 
            PreparedStatement ps = conexao.prepareStatement("select IDTRANSPORTADOR, IDVEICULO, TIPO, SITUACAO from FRETE where IDFRETE=?"); // pesquiso o id que o usuario digitou na tela e exibo o valor dos campos tabela para tal id
            ps.setInt(1, frete.getIDFRETE()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 

            ResultSet rs = ps.executeQuery(); // executequery e um metodo do preparedStatement, nossa querySQL e jogada para o executequery e apos, passamos ela para o resultset (executeQuery serve para fazer SELECT)

            while (rs.next()) { //percorre o resultset
                frete.setNome(rs.getInt("IDFRETE")); // obtenho os dados do banco e alimento a classe model (convertendo os valores).
                frete.setIdTransportador(rs.getInt("IDTRANSPORTADOR"));
                frete.setIdVeiculo(rs.getInt("IDVEICULO"));
                frete.setTipo(rs.getString("TIPO"));
                frete.setSituacao(rs.getString("SITUACAO"));
                
            }
            
            // fecha os metodos e conexao; se as conexoes não forem fechadas da problemas com o banco.
            rs.close(); 
            ps.close();
            conexao.close();
        } catch (SQLException ex) { // trata o erro caso exista, a linguagem obriga a ter um tratamento.
            Logger.getLogger("DaoFrete").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return frete;
    }

    public void inserir(Frete frete) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            PreparedStatement ps = conexao.prepareStatement("insert into FRETE (IDTRANSPORTADOR, IDVEICULO, TIPO, SITUACAO) values(?,?,?,?)");

            ps.setInt(1, frete.getIdTransportador()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setInt(2, frete.getIdVeiculo());
            ps.setString(3, frete.getTipo());
            ps.setString(4, frete.getSituacao());
            

            ps.executeUpdate(); // executa o update no banco (executeUpdate serve para INSERT, UPDATE, DELETE).
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoFrete").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void atualizar(Frete frete) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*  PS: O SCHEMA não pode atrapalhar o Esquema 
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
             */
            
            PreparedStatement ps = conexao.prepareStatement("update FRETE set IDTRANSPORTADOR = ?, IDVEICULO= ?, TIPO = ?, SITUACAO = ?"
							+ "  where IDFRETE = ?");


            ps.setInt(1, frete.getIdTransportador());
            ps.setInt(2, frete.getIdVeiculo());
            ps.setString(3, frete.getTipo());
            ps.setString(4, frete.getSituacao());
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoFrete").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(Frete frete) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            PreparedStatement ps = conexao.prepareStatement("delete from FRETE where IDFRETE = ?");

            ps.setInt(1, frete.getIdFrete());

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoFrete").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
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
