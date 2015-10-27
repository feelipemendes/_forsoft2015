/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import br.com.projetodigimon.model.Balanca;    //importar a entidade rodovia

public class DaoBalanca {
    private Connection conexao = null;
   
    //fazer metodos construtores depois
    public DaoBalanca() {
    }

    //public DaoBalanca(String schema) {
    //    this.setSchema(schema);
    //}
    

    public List<Balanca> buscar() {
        List<Balanca> lista = new ArrayList<Balanca>();
        try {
            conexao = DaoConexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            Statement cs = conexao.createStatement(); // Statement é o responsável por executar seus códigos sql no banco de dados. 
            ResultSet rs = cs.executeQuery("SELECT IDBALANCA, IDPOSTO, NUMSERIE, FABRICANTE, MODELO, SITUACAO FROM public.balanca");

            while (rs.next()) {
                Balanca balanca = new Balanca();
                
                balanca.setIdBalanca(rs.getInt("IDBALANCA"));
                balanca.setIdPosto(rs.getInt("IDPOSTO"));
                balanca.setNumSerie(rs.getString("NUMSERIE"));
                balanca.setIdFabricante(rs.getString("FABRICANTE"));
                balanca.setModelo(rs.getString("MODELO"));
                balanca.setSituacao(rs.getString("SITUACAO"));
                
                lista.add(balanca);
            }
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoBalanca").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

    public Balanca buscar(Balanca balanca) {
        try {
            conexao = Conexao.abrirConexao(); //abre a conexão com o bd.
            
            /* depois ver essa porra
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            
          */
            
            // PreparedStatemente é uma forma de fazer inserção no banco mais segura, onde você prepara os parametros para serem inseridos. 
            
            
            PreparedStatement ps = conexao.prepareStatement("select IDPOSTO, NUMSERIE, FABRICANTE, MODELO, SITUACAO from BALANCA where IDBALANCA=?"); // pesquiso o id que o usuario digitou na tela e exibo o valor dos campos tabela para tal id
            ps.setInt(1, balanca.getIdBalanca()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 
                
            ResultSet rs = ps.executeQuery(); // executequery e um metodo do preparedStatement, nossa querySQL e jogada para o executequery e apos, passamos ela para o resultset (executeQuery serve para fazer SELECT)

            while (rs.next()) { //percorre o resultset
                balanca.setIdBalanca(rs.getInt("IDBALANCA"));
                balanca.setIdPosto(rs.getInt("IDPOSTO"));
                balanca.setNumSerie(rs.getString("NUMSERIE"));
                balanca.setIdFabricante(rs.getString("FABRICANTE"));
                balanca.setModelo(rs.getString("MODELO"));
                balanca.setSituacao(rs.getString("SITUACAO"));
                
            }
            
            // fecha os metodos e conexao; se as conexoes não forem fechadas da problemas com o banco.
            rs.close(); 
            ps.close();
            conexao.close();
        } catch (SQLException ex) { // trata o erro caso exista, a linguagem obriga a ter um tratamento.
            Logger.getLogger("DaoBalanca").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return balanca;
    }

    public void inserir(Balanca balanca) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            PreparedStatement ps = conexao.prepareStatement("insert into BALANCA (IDBALANCA, IDPOSTO, NUMSERIE, FABRICANTE, MODELO, SITUACAO) values(?,?,?,?,?,?)");
                        
            ps.setString(1, balanca.getIdBalanca()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setString(2, balanca.getIdPosto());
            ps.setString(3, balanca.getNumSerie());
            ps.setString(4, balanca.getFabricante());
            ps.setString(5, balanca.getModelo());
            ps.setString(6, balanca.getSituacao());
            

            ps.executeUpdate(); // executa o update no banco (executeUpdate serve para INSERT, UPDATE, DELETE).
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoBalanca").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void atualizar(Balanca balanca) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*  PS: O SCHEMA não pode atrapalhar o Esquema 
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
             */
           
            PreparedStatement ps = conexao.prepareStatement("update BALANCA set IDPOSTO = ?, NUMSERIE = ?, FABRICANTE = ?, MODELO = ?, SITUACAO = ? where IDBALANCA = ?");
                        
            ps.setInt(6, balanca.getIdBalanca()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 
            
            
            ps.setString(1, balanca.getIdPosto()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setString(2, balanca.getNumSerie());
            ps.setString(3, balanca.getFabricante());
            ps.setString(4, balanca.getModelo());
            ps.setString(5, balanca.getSituacao());

            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoBalanca").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(Balanca balanca) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            PreparedStatement ps = conexao.prepareStatement("delete from BALANCA where IDBALANCA = ?");

            ps.setInt(1, balanca.getIdBalanca());

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoBalanca").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
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
