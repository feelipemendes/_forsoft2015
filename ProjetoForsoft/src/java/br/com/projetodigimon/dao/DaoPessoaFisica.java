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




import model.DaoPessoaFisica;    //importar a entidade contato



/**
 *
 * @author Usuario
 */


// ATENÇÃO, ANTES DE DE COMEÇAR A PROGRAMAR ABRA ESTE LINK PARA FLUIR --> https://www.youtube.com/watch?v=fYFd2K4XFfo&list=PL73iAmm7by8BDhhkvyfrmjebr0DV11MJj&index=14
public class DaoPessoaFisica {
    private Connection conexao = null;
   
    //fazer metodos construtores depois
    public DaoPessoaFisica() {
    }

    public DaoPessoaFisica(String schema) {
        this.setSchema(schema);
    }
    

    public List<PessoaFisica> buscar() {
        List<PessoaFisica> lista = new ArrayList<pessoaFisica>();
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            Statement cs = conexao.createStatement(); // Statement é o responsável por executar seus códigos sql no banco de dados. 
            ResultSet rs = cs.executeQuery("SELECT IDPESSOAFISICA, IDENDERECO, IDCONTATO, NOME, CPF, DATANASCIMENTO, RG, UF, ORGAOEMISSOR, SEXO, SITUACAO FROM public.pessoaFisica");

            while (rs.next()) {
                PessoaFisica PessoaFisica = new PessoaFisica();
                pessoaFisica.setIdPessoaFisica(rs.getInt("IDPESSOAFISICA"));
                pessoaFisica.setIdEndereco(rs.getInt("IDENRECO"));
                pessoaFisica.setIdContato(rs.getInt("IDCONTATO"));
                pessoaFisica.setNome(rs.getString("NOME"));
                pessoaFisica.setCpf(rs.getString("CPF"));
                pessoaFisica.setDataNascimento(rs.getString("DATANASCIMENTO"));
                pessoaFisica.setRg(rs.getString("RG"));
                pessoaFisica.setUf(rs.getString("UF"));
                pessoaFisica.setOrgaoEmissor(rs.getString("ORGAOEMISSOR"));
                pessoaFisica.setSexo(rs.getString("SEXO"));
                pessoaFisica.setSituacao(rs.getString("SITUACAO"));
                lista.add(pessoaFisica);
            }
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoPessoaFisica").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

    public pessoaFisica buscar(PessoaFisica pessoaFisica) {
        try {
            conexao = Conexao.abrirConexao(); //abre a conexão com o bd.
            
            /* depois ver essa porra
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            
          */
            
            // PreparedStatemente é uma forma de fazer inserção no banco mais segura, onde você prepara os parametros para serem inseridos. 
            PreparedStatement ps = conexao.prepareStatement("select IDPESSOAFISICA, IDENRECO, IDCONTATO, NOME, CPF, DATANASCIMENTO,RG, UF, ORGAOEMISSOR, SEXO, SITUACAO from PESSOAFISICA where IDPESSOAFISICA=?"); // pesquiso o id que o usuario digitou na tela e exibo o valor dos campos tabela para tal id
            ps.setInt(1, pessoaFisica.getIDCONTATO()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 

            ResultSet rs = ps.executeQuery(); // executequery e um metodo do preparedStatement, nossa querySQL e jogada para o executequery e apos, passamos ela para o resultset (executeQuery serve para fazer SELECT)

            while (rs.next()) { //percorre o resultset
                //PessoaFisica PessoaFisica = new PessoaFisica();
                pessoaFisica.setIdPessoaFisica(rs.getInt("IDPESSOAFISICA"));
                pessoaFisica.setIdEndereco(rs.getInt("IDENRECO"));
                pessoaFisica.setIdContato(rs.getInt("IDCONTATO"));
                pessoaFisica.setNome(rs.getString("NOME"));
                pessoaFisica.setCpf(rs.getString("CPF"));
                pessoaFisica.setDataNascimento(rs.getString("DATANASCIMENTO"));
                pessoaFisica.setRg(rs.getString("RG"));
                pessoaFisica.setUf(rs.getString("UF"));
                pessoaFisica.setOrgaoEmissor(rs.getString("ORGAOEMISSOR"));
                pessoaFisica.setSexo(rs.getString("SEXO"));
                pessoaFisica.setSituacao(rs.getString("SITUACAO"));
                
            }
            
            // fecha os metodos e conexao; se as conexoes não forem fechadas da problemas com o banco.
            rs.close(); 
            ps.close();
            conexao.close();
        } catch (SQLException ex) { // trata o erro caso exista, a linguagem obriga a ter um tratamento.
            Logger.getLogger("DaoPessoaFisica").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return PessoaFisica;
    }

    public void inserir(PessoaFisica pessoaFisica) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            PreparedStatement ps = conexao.prepareStatement("insert into PESSOAFISICA (NOME, CPF, DATANASCIMENTO, RG, UF, ORGAOEMISSOR, SEXO, SITUACAO) values(?,?,?,?,?,?,?,?,?,?,?)");
            
            //PessoaFisica pessoaFisica = new PessoaFisica();
            ps.setString(1, pessoaFisica.getNome()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setString(2, pessoaFisica.getCpf());
            ps.setString(3, pessoaFisica.getDataNascimento());
            ps.setString(4, pessoaFisica.getRg());
            ps.setString(5, pessoaFisica.getUf());
            ps.setString(6, pessoaFisica.getOrgaoEmissor());
            ps.setString(7, pessoaFisica.getSexo());
            ps.setString(8, pessoaFisica.getSituacao());

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
            
            PreparedStatement ps = conexao.prepareStatement("update PESSOAFISICA set NOME = ?, CPF = ?, DATANASCIMENTO = ?, RG = ?, UF = ?, ORGAOEMISSOR = ?, SEXO = ?, SITUACAO = ?"
							+ "  where IDPESSOAFISICA = ?");

            //PessoaFisica pessoaFisica = new PessoaFisica();
            ps.setString(1, pessoaFisica.getNome()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setString(2, pessoaFisica.getCpf());
            ps.setString(3, pessoaFisica.getDataNascimento());
            ps.setString(4, pessoaFisica.getRg());
            ps.setString(5, pessoaFisica.getUf());
            ps.setString(6, pessoaFisica.getOrgaoEmissor());
            ps.setString(7, pessoaFisica.getSexo());
            ps.setString(8, pessoaFisica.getSituacao());
            ps.setInt(9, pessoaFisica.getIdPessoaFisica());
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoPessoaFisica").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(PessoaFisico pessoaFisica) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            PreparedStatement ps = conexao.prepareStatement("delete from PESSOAFISICA where IDPESSOAFISICA = ?");
            
            //PessoaFisico pessoaFisica = new PessoaFisica();
            ps.setInt(1, pessoaFisica.getIdPessoaFisica());

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoPessoaFisica").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
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
