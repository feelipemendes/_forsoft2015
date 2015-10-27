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




import model.DaoEndereco;    //importar a entidade contato



/**
 *
 * @author Usuario
 */


// ATENÇÃO, ANTES DE DE COMEÇAR A PROGRAMAR ABRA ESTE LINK PARA FLUIR --> https://www.youtube.com/watch?v=fYFd2K4XFfo&list=PL73iAmm7by8BDhhkvyfrmjebr0DV11MJj&index=14
public class DaoEndereco {
    private Connection conexao = null;
   
    //fazer metodos construtores depois
    public DaoEndereco() {
    }

    public DaoEndereco(String schema) {
        this.setSchema(schema);
    }
    

    public List<Endereco> buscar() {
        List<Endereco> lista = new ArrayList<Endereco>();
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            Statement cs = conexao.createStatement(); // Statement é o responsável por executar seus códigos sql no banco de dados. 
            ResultSet rs = cs.executeQuery("SELECT IDENDERECO, CEP, LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF FROM public.endereco");

            while (rs.next()) {
                Endereco endereco = new Endereco();
                endereco.setIdEndereco(rs.getInt("IDENDERECO"));
                endereco.setCep(rs.getString("CEP"));
                endereco.setLogradouro(rs.getString("LOGRADOURO"));
                endereco.setNumero(rs.getString("NUMERO"));
                endereco.setComplemento(rs.getString("COMPLEMENTO"));
                endereco.setBairro(rs.getString("BAIRRO"));
                endereco.setCidade(rs.getString("CIDADE"));
                endereco.setUf(rs.getString("UF"));
                lista.add(endereco);
            }
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoEndereco").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

    public Endereco buscar(Endereco endereco) {
        try {
            conexao = Conexao.abrirConexao(); //abre a conexão com o bd.
            
            /* depois ver essa porra
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            
          */
            
            // PreparedStatemente é uma forma de fazer inserção no banco mais segura, onde você prepara os parametros para serem inseridos. 
            PreparedStatement ps = conexao.prepareStatement("select IDENDERECO, CEP, LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF from CONTATO where IDCONTATO=?"); // pesquiso o id que o usuario digitou na tela e exibo o valor dos campos tabela para tal id
            ps.setInt(1, endereco.getIDENDERECO()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 

            ResultSet rs = ps.executeQuery(); // executequery e um metodo do preparedStatement, nossa querySQL e jogada para o executequery e apos, passamos ela para o resultset (executeQuery serve para fazer SELECT)

            while (rs.next()) {
                //Endereco endereco = new Endereco();
                endereco.setIdEndereco(rs.getInt("IDENDERECO"));
                endereco.setCep(rs.getString("CEP"));
                endereco.setLogradouro(rs.getString("LOGRADOURO"));
                endereco.setNumero(rs.getString("NUMERO"));
                endereco.setComplemento(rs.getString("COMPLEMENTO"));
                endereco.setBairro(rs.getString("BAIRRO"));
                endereco.setCidade(rs.getString("CIDADE"));
                endereco.setUf(rs.getString("UF"));
            }
            
            // fecha os metodos e conexao; se as conexoes não forem fechadas da problemas com o banco.
            rs.close(); 
            ps.close();
            conexao.close();
        } catch (SQLException ex) { // trata o erro caso exista, a linguagem obriga a ter um tratamento.
            Logger.getLogger("DaoEndereco").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return endereco;
    }

    public void inserir(Endereco endereco) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            PreparedStatement ps = conexao.prepareStatement("insert into CONTATO (CEP, LOGRADOURO, NUMERO, COMPLEMENTEO, BAIRRO, CIDADE, UF) values(?,?,?,?,?,?,?)");
            
            //Endereco endereco = new Endereco();
            ps.setString(1, endereco.getCep());
            ps.setString(2, endereco.getLogradouro());
            ps.setString(3, endereco.getNumero());
            ps.setString(4, endereco.getComplemento());
            ps.setString(5, endereco.getBairro());
            ps.setString(6, endereco.getCidade());
            ps.setString(7, endereco.getUf());

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
            
            PreparedStatement ps = conexao.prepareStatement("update ENDERECO set CEP = ?, LOGRADOURO = ?, NUMERO = ?, COMPLEMENTO = ?, BAIRRO = ?, CIDADE = ?, UF = ?"
							+ "  where IDENDERECO = ?");

            //Endereco endereco = new Endereco();
            ps.setString(1, endereco.getCep());
            ps.setString(2, endereco.getLogradouro());
            ps.setString(3, endereco.getNumero());
            ps.setString(4, endereco.getComplemento());
            ps.setString(5, endereco.getBairro());
            ps.setString(6, endereco.getCidade());
            ps.setString(7, endereco.getUf());
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoEndereco").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(Endereco endereco) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            PreparedStatement ps = conexao.prepareStatement("delete from ENDERECO where IDENDERECO= ?");
            
            //Endereco endereco = new Endereco();
            ps.setInt(1, endereco.getIdEndereco());

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
