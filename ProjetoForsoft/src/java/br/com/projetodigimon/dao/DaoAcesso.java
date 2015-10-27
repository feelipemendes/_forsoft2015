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
import model.Acesso;    //importar a entidade rodovia

public class DaoAcesso {
    private Connection conexao = null;
   
    //fazer metodos construtores depois
    public DaoAcesso() {
    }

    public DaoAcesso(String schema) {
        this.setSchema(schema);
    }
    

    public List<Acesso> buscar() {
        List<Acesso> lista = new ArrayList<Acesso>();
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            Statement cs = conexao.createStatement(); // Statement é o responsável por executar seus códigos sql no banco de dados. 
            ResultSet rs = cs.executeQuery("SELECT IDACESSO, IDPESSOAFISICA, IDPESSOAJURIDICA, IDCONTATO, USUARIO, SENHA, TIPOUSUARIO, SITUACAO FROM public.acesso");

            while (rs.next()) {
                Acesso acesso = new Acesso();
                
                acesso.setIdAcesso(rs.getInt("IDMOTORISTA"));
                acesso.setPessoaFisica(rs.getInt("IDPESSOAFISICA"));
                acesso.setPessoaJuridica(rs.getInt("IDPESSOJURIDICA"));
                acesso.setIdContato(rs.getInt("IDCONTATO"));
                acesso.setUsuario(rs.getString("USUARIO"));
                acesso.setSenha(rs.getString("SENHA"));
                acesso.setTipoUsuario(rs.getString("TIPOUSUARIO"));
                acesso.setSituacao(rs.getString("SITUACAO"));
                
                lista.add(acesso);
            }
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoAcesso").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

    public Acesso buscar(Acesso acesso) {
        try {
            conexao = Conexao.abrirConexao(); //abre a conexão com o bd.
            
            /* depois ver essa porra
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            
          */
            
            // PreparedStatemente é uma forma de fazer inserção no banco mais segura, onde você prepara os parametros para serem inseridos. 
            
            
            PreparedStatement ps = conexao.prepareStatement("select IDPESSOAFISICA, IDPESSOAJURIDICA, IDCONTATO, USUARIO, SENHA, TIPOUSUARIO, SITUACAO from ACESSO where IDACESSO=?"); // pesquiso o id que o usuario digitou na tela e exibo o valor dos campos tabela para tal id
            ps.setInt(1, acesso.getIdAcesso()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 
                
            ResultSet rs = ps.executeQuery(); // executequery e um metodo do preparedStatement, nossa querySQL e jogada para o executequery e apos, passamos ela para o resultset (executeQuery serve para fazer SELECT)

            while (rs.next()) { //percorre o resultset
                acesso.setIdAcesso(rs.getInt("IDMOTORISTA"));// obtenho os dados do banco e alimento a classe model (convertendo os valores).
                acesso.setPessoaFisica(rs.getInt("IDPESSOAFISICA"));
                acesso.setPessoaJuridica(rs.getInt("IDPESSOJURIDICA"));
                acesso.setIdContato(rs.getInt("IDCONTATO"));
                acesso.setUsuario(rs.getString("USUARIO"));
                acesso.setSenha(rs.getString("SENHA"));
                acesso.setTipoUsuario(rs.getString("TIPOUSUARIO"));
                acesso.setSituacao(rs.getString("SITUACAO"));
            }
            
            // fecha os metodos e conexao; se as conexoes não forem fechadas da problemas com o banco.
            rs.close(); 
            ps.close();
            conexao.close();
        } catch (SQLException ex) { // trata o erro caso exista, a linguagem obriga a ter um tratamento.
            Logger.getLogger("DaoAcesso").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return acesso;
    }

    public void inserir(Acesso acesso) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            PreparedStatement ps = conexao.prepareStatement("insert into ACESSO (IDPESSOAFISICA, IDPESSOAJURIDICA, IDCONTATO, USUARIO, SENHA, TIPOUSUARIO, SITUACAO) values(?,?,?,?,?,?,?)");
                        
            ps.setString(1, acesso.getIdPessoaFisica()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setString(2, acesso.getIdPessoaJuridica());
            ps.setString(3, acesso.getIdContato());
            ps.setString(4, acesso.getUsuario());
            ps.setString(5, acesso.getSenha());
            ps.setString(6, acesso.getTipoUsuario());
            ps.setString(7, acesso.getSituacao());
            

            ps.executeUpdate(); // executa o update no banco (executeUpdate serve para INSERT, UPDATE, DELETE).
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoAcesso").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void atualizar(Acesso acesso) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*  PS: O SCHEMA não pode atrapalhar o Esquema 
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
             */
            
            PreparedStatement ps = conexao.prepareStatement("update ACESSO set IDPESSOAFISICA = ?, IDPESSOAJURIDICA = ?, IDCONTATO = ?, USUARIO = ?, SENHA = ?, TIPOUSUARIO = ?, SITUACAO = ? where IDACESSO = ?");
                        
            ps.setInt(5, acesso.getIdAcesso()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 
            
            
            ps.setString(1, acesso.getIdPessoaFisica()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setString(2, acesso.getPessoaJuridica());
            ps.setString(3, acesso.getContato());
            ps.setString(4, acesso.getUsuario());
            ps.setString(5, acesso.getSenha());
            ps.setString(6, acesso.getTipoUsuario());
            ps.setString(7, acesso.getSituacao());

            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoMotorista").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(Acesso acesso) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            PreparedStatement ps = conexao.prepareStatement("delete from acesso where IDACESSO = ?");

            ps.setInt(1, acesso.getIdAcesso());

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoAcesso").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
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
