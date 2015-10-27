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




import model.Passagem;    //importar a entidade rodovia



/**
 *
 * @author Usuario
 */


// ATENÇÃO, ANTES DE DE COMEÇAR A PROGRAMAR ABRA ESTE LINK PARA FLUIR --> https://www.youtube.com/watch?v=fYFd2K4XFfo&list=PL73iAmm7by8BDhhkvyfrmjebr0DV11MJj&index=14
public class DaoPassagem {
    private Connection conexao = null;
   
    //fazer metodos construtores depois
    public DaoPassagem() {
    }

    public DaoPassagem(String schema) {
        this.setSchema(schema);
    }
    

    public List<Passagem> buscar() {
        List<Passagem> lista = new ArrayList<Passagem>();
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            Statement cs = conexao.createStatement(); // Statement é o responsável por executar seus códigos sql no banco de dados. 
            ResultSet rs = cs.executeQuery("SELECT IDPASSAGEM, IDCAMERA, IDVEICULO, DATAHORA FROM public.passagem");

            while (rs.next()) {
                Passagem passagem = new Passagem();
                passagem.setIdPassagem(rs.getInt("IDPASSAGEM"));
                passagem.setIdCamera(rs.getInt("IDCAMERA"));
                passagem.setIdVeiculo(rs.getInt("IDVEICULO"));
                passagem.setDataHora(rs.getString("DATAHORA"));
                
                lista.add(passagem);
            }
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoPassagem").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

    public Passagem buscar(Passagem passagem) {
        try {
            conexao = Conexao.abrirConexao(); //abre a conexão com o bd.
            
            /* depois ver essa porra
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            
          */
            
            // PreparedStatemente é uma forma de fazer inserção no banco mais segura, onde você prepara os parametros para serem inseridos. 
            PreparedStatement ps = conexao.prepareStatement("select IDCAMERA, IDVEICULO, DATAHORA from PASSAGEM where IDPASSAGEM=?"); // pesquiso o id que o usuario digitou na tela e exibo o valor dos campos tabela para tal id
            ps.setInt(1, passagem.getIDPASSAGEM()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 

            ResultSet rs = ps.executeQuery(); // executequery e um metodo do preparedStatement, nossa querySQL e jogada para o executequery e apos, passamos ela para o resultset (executeQuery serve para fazer SELECT)

            while (rs.next()) { //percorre o resultset
                passagem.setIdCamera(rs.getInt("IDCAMERA")); // obtenho os dados do banco e alimento a classe model (convertendo os valores).
                passagem.setIdveiculo(rs.getInt("IDVEICULO"));
                passagem.setDataHora(rs.getString("DATAHORA"));
                
            }
            
            // fecha os metodos e conexao; se as conexoes não forem fechadas da problemas com o banco.
            rs.close(); 
            ps.close();
            conexao.close();
        } catch (SQLException ex) { // trata o erro caso exista, a linguagem obriga a ter um tratamento.
            Logger.getLogger("DaoPassagem").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return passagem;
    }

    public void inserir(Passagem passagem) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            PreparedStatement ps = conexao.prepareStatement("insert PASSAGEM (IDCAMERA, IDVEICULO, DATAHORA) values(?,?,?)");

            ps.setInt(1, passagem.getIdCamera()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setInt(2, passagem.getIdVeiculo());
            ps.setString(3, passagem.getDataHora());
                        

            ps.executeUpdate(); // executa o update no banco (executeUpdate serve para INSERT, UPDATE, DELETE).
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoPassagem").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void atualizar(Passagem passagem) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*  PS: O SCHEMA não pode atrapalhar o Esquema 
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
             */
            
            PreparedStatement ps = conexao.prepareStatement("update PASSAGEM set IDCAMERA = ?, IDVEICULO = ?, DATAHORA = ?"
							+ "  where IDRODOVIA = ?");


            ps.setInt(1, passagem.getIdCamera());
            ps.setInt(2, passagem.getIdVeiculo());
            ps.setString(3, passagem.getDataHora());

            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoPassagem").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(Passagem Passagem) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            PreparedStatement ps = conexao.prepareStatement("delete from PASSAGEM where IDPASSAGEM = ?");

            ps.setInt(1, passagem.getIdPassagem());

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoPassagem").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
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
