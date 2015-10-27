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




import model.DaoTransportador;    //importar a entidade contato



/**
 *
 * @author Usuario
 */


// ATENÇÃO, ANTES DE DE COMEÇAR A PROGRAMAR ABRA ESTE LINK PARA FLUIR --> https://www.youtube.com/watch?v=fYFd2K4XFfo&list=PL73iAmm7by8BDhhkvyfrmjebr0DV11MJj&index=14
public class DaoTransportador {
    private Connection conexao = null;
   
    //fazer metodos construtores depois
    public DaoTransportador() {
    }

    public DaoTransportador(String schema) {
        this.setSchema(schema);
    }
    

    public List<Transportador> buscar() {
        List<Transportador> lista = new ArrayList<Transportador>();
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            Statement cs = conexao.createStatement(); // Statement é o responsável por executar seus códigos sql no banco de dados. 
            ResultSet rs = cs.executeQuery("SELECT IDTRANSPORTADOR, TIPOPESSOA, IDPESSOA, RNTRC, SITUACAO FROM public.transportador");

            while (rs.next()) {
                Transportador transportador = new Transportador();
                transportador.setIdTransportador(rs.getInt("IDTRANSPORTADOR"));
                transportador.setTipoPessoa(rs.getString("TIPOPESSOA"));
                transportador.setIdPessoa(rs.getInt("IDPESSOA"));
                transportador.setRntrc(rs.getString("RNTRC"));
                transportador.setSituacao(rs.getString("SITUACAO"));
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
            PreparedStatement ps = conexao.prepareStatement("select IDTRANSPORTADOR, TIPOPESSOA, IDPESSOA, RNTRC, SITUACAO from TRANSPORTADOR where IDTRANSPORTADOR=?"); // pesquiso o id que o usuario digitou na tela e exibo o valor dos campos tabela para tal id
            ps.setInt(1, endereco.getIDENDERECO()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 

            ResultSet rs = ps.executeQuery(); // executequery e um metodo do preparedStatement, nossa querySQL e jogada para o executequery e apos, passamos ela para o resultset (executeQuery serve para fazer SELECT)

            while (rs.next()) {
                //Transportador transportador = new Transportador();
                transportador.setIdTransportador(rs.getInt("IDTRANSPORTADOR"));
                transportador.setTipoPessoa(rs.getString("TIPOPESSOA"));
                transportador.setIdPessoa(rs.getInt("IDPESSOA"));
                transportador.setRntrc(rs.getString("RNTRC"));
                transportador.setSituacao(rs.getString("SITUACAO"));
            }
            
            // fecha os metodos e conexao; se as conexoes não forem fechadas da problemas com o banco.
            rs.close(); 
            ps.close();
            conexao.close();
        } catch (SQLException ex) { // trata o erro caso exista, a linguagem obriga a ter um tratamento.
            Logger.getLogger("DaoTransportador").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return endereco;
    }

    public void inserir(Transportador transportador) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            PreparedStatement ps = conexao.prepareStatement("insert into TRANSPORTADOR (TIPOPESSOA, IDPESSOA, RNTRC, SITUACAO) values(?,?,?,?)");
            
            //Transportador transportador = new Transportador();
            transportador(1, transportador.getTipoPessoa);
            transportador(2, transportador.getIdPessoa);
            transportador(3, transportador.getRntrc);
            transportador(4, transportador.getSituacao);

            ps.executeUpdate(); // executa o update no banco (executeUpdate serve para INSERT, UPDATE, DELETE).
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoTransportador").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void atualizar(Transportador transportador) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*  PS: O SCHEMA não pode atrapalhar o Esquema 
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
             */
            
            PreparedStatement ps = conexao.prepareStatement("update ENDERECO set TIPOPESSOA = ?, IDPESSOA = ?, RNTRC = ?, SITUACAO = ?"
							+ "  where IDTRANSPORTADOR = ?");

            //Transportador transportador = new Transportador();
            transportador(1, transportador.getTipoPessoa);
            transportador(2, transportador.getIdPessoa);
            transportador(3, transportador.getRntrc);
            transportador(4, transportador.getSituacao);
            transportador(5, transportador.getIdTransportador);
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoTransportador").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(Transportador transportador) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            PreparedStatement ps = conexao.prepareStatement("delete from ENDERECO where IDENDERECO= ?");
            
            //Transportador transportador = new Transportador();
            ps.setInt(1, transportador.getIdTransportador());

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoTransportador").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
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
