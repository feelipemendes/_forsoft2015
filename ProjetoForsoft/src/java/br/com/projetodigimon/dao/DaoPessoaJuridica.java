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




import model.DaoPessoaJuridica;    //importar a entidade contato



/**
 *
 * @author Usuario
 */


// ATENÇÃO, ANTES DE DE COMEÇAR A PROGRAMAR ABRA ESTE LINK PARA FLUIR --> https://www.youtube.com/watch?v=fYFd2K4XFfo&list=PL73iAmm7by8BDhhkvyfrmjebr0DV11MJj&index=14
public class DaoPessoaJuridica {
    private Connection conexao = null;
   
    //fazer metodos construtores depois
    public DaoPessoaJuridica() {
    }

    public DaoPessoaJuridica(String schema) {
        this.setSchema(schema);
    }
    

    public List<PessoaJuridica> buscar() {
        List<PessoaJuridica> lista = new ArrayList<pessoaJuridica>();
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            Statement cs = conexao.createStatement(); // Statement é o responsável por executar seus códigos sql no banco de dados. 
            ResultSet rs = cs.executeQuery("SELECT IDPESSOAJURIDICA, IDENDERECO, IDCONTATO, CNPJ, NOMEFANTASIA, RAZAOSOCIAL, SITUACAO FROM public.pessoaJuridica");

            while (rs.next()) {
                PessoaJuridica PessoaJuridica = new PessoaJuridica();
                pessoaJuridica.setIdPessoaJuridica(rs.getInt("IDPESSOAJURIDICA"));
                pessoaJuridica.setIdEndereco(rs.getInt("IDENRECO"));
                pessoaJuridica.setIdContato(rs.getInt("IDCONTATO"));
                pessoaJuridica.setCnpj(rs.getCnpj());
                pessoaJuridica.setNomeFantasia(rs.getString("NOMEFANTASIA"));
                pessoaJuridica.setRazaoSocial(rs.getString("RAZAOSOCIAL"))
                pessoaJuridica.setSituacao(rs.getString("SITUACAO"));
                lista.add(pessoaJuridica);
            }
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoPessoaJuridica").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

    public pessoaJuridica buscar(PessoaJuridica pessoaJuridica) {
        try {
            conexao = Conexao.abrirConexao(); //abre a conexão com o bd.
            
            /* depois ver essa porra
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            
          */
            
            // PreparedStatemente é uma forma de fazer inserção no banco mais segura, onde você prepara os parametros para serem inseridos. 
            PreparedStatement ps = conexao.prepareStatement("select IDPESSOAJURIDICA, IDENRECO, IDCONTATO, NOME, CPF, DATANASCIMENTO,RG, UF, ORGAOEMISSOR, SEXO, SITUACAO from PESSOAJURIDICA where IDPESSOAJURIDICA=?"); // pesquiso o id que o usuario digitou na tela e exibo o valor dos campos tabela para tal id
            ps.setInt(1, pessoaJuridica.getIDCONTATO()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 

            ResultSet rs = ps.executeQuery(); // executequery e um metodo do preparedStatement, nossa querySQL e jogada para o executequery e apos, passamos ela para o resultset (executeQuery serve para fazer SELECT)

            while (rs.next()) { //percorre o resultset
                //PessoaJuridica PessoaJuridica = new PessoaJuridica();
                pessoaJuridica.setIdPessoaJuridica(rs.getInt("IDPESSOAJURIDICA"));
                pessoaJuridica.setIdEndereco(rs.getInt("IDENRECO"));
                pessoaJuridica.setIdContato(rs.getInt("IDCONTATO"));
                pessoaJuridica.setCnpj(rs.getString("CNPJ"));
                pessoaJuridica.setNomeFantasia(rs.getString("NOMEFANTASIA"));
                pessoaJuridica.setRazaoSocial(rs.getString("RAZAOSOCIAL"));
                pessoaJuridica.setSituacao(rs.getString("SITUACAO"));
                
            }
            
            // fecha os metodos e conexao; se as conexoes não forem fechadas da problemas com o banco.
            rs.close(); 
            ps.close();
            conexao.close();
        } catch (SQLException ex) { // trata o erro caso exista, a linguagem obriga a ter um tratamento.
            Logger.getLogger("DaoPessoaJuridica").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return PessoaJuridica;
    }

    public void inserir(PessoaJuridica pessoaJuridica) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            PreparedStatement ps = conexao.prepareStatement("insert into PESSOAJURIDICA (NOME, CPF, DATANASCIMENTO, RG, UF, ORGAOEMISSOR, SEXO, SITUACAO) values(?,?,?,?,?,?,?,?,?,?,?)");
            
            //PessoaJuridica pessoaJuridica = new PessoaJuridica();
            ps.setString(1, pessoaJuridica.getCnpj());
            ps.setString(2, pessoaJuridica.getNomeFantasia());
            ps.setString(8, pessoaJuridica.getRazaoSocial());
            

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
            
            PreparedStatement ps = conexao.prepareStatement("update PESSOAJURIDICA set NOME = ?, CPF = ?, DATANASCIMENTO = ?, RG = ?, UF = ?, ORGAOEMISSOR = ?, SEXO = ?, SITUACAO = ?"
							+ "  where IDPESSOAJURIDICA = ?");

            //PessoaJuridica pessoaJuridica = new PessoaJuridica();
            ps.setString(1, pessoaJuridica.getCnpj());
            ps.setString(2, pessoaJuridica.getNomeFantasia());
            ps.setString(3, pessoaJuridica.getRazaoSocial());
            ps.setInt(4, pessoaJuridica.getIdPessoaJuridica());
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoPessoaJuridica").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(PessoaJuridica pessoaJuridica) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            PreparedStatement ps = conexao.prepareStatement("delete from PESSOAJURIDICA where IDPESSOAJURIDICA= ?");
            
            //PessoaJuridica pessoaJuridica = new PessoaJuridica();
            ps.setInt(1, pessoaJuridica.getIdPessoaJuridica());

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoPessoaJuridica").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
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
