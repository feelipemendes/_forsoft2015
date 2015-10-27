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




import model.Pesagem;    //importar a entidade rodovia



/**
 *
 * @author Usuario
 */


// ATENÇÃO, ANTES DE DE COMEÇAR A PROGRAMAR ABRA ESTE LINK PARA FLUIR --> https://www.youtube.com/watch?v=fYFd2K4XFfo&list=PL73iAmm7by8BDhhkvyfrmjebr0DV11MJj&index=14
public class DaoPesagem {
    private Connection conexao = null;
   
    //fazer metodos construtores depois
    public DaoPesagem() {
    }

    public DaoRodovia(String schema) {
        this.setSchema(schema);
    }
    

    public List<Pesagem> buscar() {
        List<Pesagem> lista = new ArrayList<Pesagem>();
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            Statement cs = conexao.createStatement(); // Statement é o responsável por executar seus códigos sql no banco de dados. 
            ResultSet rs = cs.executeQuery("SELECT IDPESAGEM, DATAHORA, PBT, PESOEIXO, IDPOSTO, IDVEICULO, TRANSBORDO, REMANEJAMENTO FROM public.pesagem");

            while (rs.next()) {
                Pesagem pesagem = new Pesagem();
                pesagem.setIdPesagem(rs.getString("IDPESAGEM"));
                pesagem.setDataHora(rs.getString("DATAHORA"));
                pesagem.setPbt(rs.getString("PBT"));
                pesagem.setPesoEixo(rs.getString("PESOEIXO"));
                pesagem.setIdPosto(rs.getInt("IDPOSTO"));
                pesagem.setIdVeiculo(rs.getInt("IDVEICULO"));
                pesagem.setTransbordo(rs.getString("TRANSBORDO"));
                pesagem.setRemanejamento(rs.getString("REMANEJAMENTO"));
                
                lista.add(pesagem);
            }
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoPesagem").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

    public Pesagem buscar(Pesagem pesagem) {
        try {
            conexao = Conexao.abrirConexao(); //abre a conexão com o bd.
            
            /* depois ver essa porra
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            
          */
            
            // PreparedStatemente é uma forma de fazer inserção no banco mais segura, onde você prepara os parametros para serem inseridos. 
            PreparedStatement ps = conexao.prepareStatement("select DATAHORA, PBT, PESOEIXO, IDPOSTO, IDVEICULO, TRANSBORDO, REMANEJAMENTO from PESAGEM where IDPESAGEM=?"); // pesquiso o id que o usuario digitou na tela e exibo o valor dos campos tabela para tal id
            ps.setInt(1, pesagem.getIDPESAGEM()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 

            ResultSet rs = ps.executeQuery(); // executequery e um metodo do preparedStatement, nossa querySQL e jogada para o executequery e apos, passamos ela para o resultset (executeQuery serve para fazer SELECT)

            while (rs.next()) { //percorre o resultset
                rodovia.setIdPesagem(rs.getInt("IDPESAGEM"));
                rodovia.setDataHora(rs.getString("DATAHOTA"));
                rodovia.setPbt(rs.getString("PBT"));
                rodovia.setPesoEixo(rs.getString("PESOEIXO"));
                rodovia.setIdPosto(rs.getInt("IDPOSTO"));
                rodovia.setIdVeiculo(rs.getInt("IDVEICULO"));
                rodovia.setTransbordo(rs.getString("TRANSBORDO"));
                rodovia.setRemanejamento(rs.getString("REMANEJAMENTO"));
            }
            
            // fecha os metodos e conexao; se as conexoes não forem fechadas da problemas com o banco.
            rs.close(); 
            ps.close();
            conexao.close();
        } catch (SQLException ex) { // trata o erro caso exista, a linguagem obriga a ter um tratamento.
            Logger.getLogger("DaoPesagem").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return pesagem;
    }

    public void inserir(Pesagem pesagem) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            PreparedStatement ps = conexao.prepareStatement("insert into PESAGEM (DATAHORA, PBT, PESOEIXO, IDPOSTO, IDVEICULO, TRANSBORDO, REMANEJAMENTO) values(?,?,?,?,?,?,?)");

            ps.setString(1, pesagem.getDataHora()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setString(2, pesagem.getPbt());
            ps.setInt(3, pesagem.getPesoEixo());
            ps.setString(4, pesagem.getIdPosto());
            ps.setString(5, pesagem.getIdVeiculo());
            ps.setString(6, pesagem.getTransbordo());
            ps.setString(7, pesagem.getRemanejamento());
            

            ps.executeUpdate(); // executa o update no banco (executeUpdate serve para INSERT, UPDATE, DELETE).
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoPesagem").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void atualizar(Pesagem pesagem) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*  PS: O SCHEMA não pode atrapalhar o Esquema 
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
             */
            
            PreparedStatement ps = conexao.prepareStatement("update PESAGEM set DATAHORA = ?, PBT = ?, PESOEIXO = ?, IDPOSTO = ?, IDVEICULO = ?, TRANSBORDO = ?, REMANEJAMENTO = ?"
							+ "  where IDPESAGEM = ?");


            ps.setString(1, pesagem.getDataHora());
            ps.setString(2, pesagem.getPbt());
            ps.setString(3, pesagem.getPesoEixo());
            ps.setInt(4, pesagem.getIdPosto());
            ps.setInt(5, pesagem.getIdVeiculo());
            ps.setString(6, pesagem.getTransbordo());
            ps.setString(7, pesagem.getRemanejamento());

            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoPesagem").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(Pesagem pesagem) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            PreparedStatement ps = conexao.prepareStatement("delete from PESAGEM where IDPESAGEM = ?");

            ps.setInt(1, pesagem.getIdPesagem());

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoPesagem").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
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
