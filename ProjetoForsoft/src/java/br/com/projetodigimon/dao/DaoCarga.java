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




import br.com.projetodigimon.model.Carga;    //importar a entidade rodovia



/**
 *
 * @author Usuario
 */


// ATENÇÃO, ANTES DE DE COMEÇAR A PROGRAMAR ABRA ESTE LINK PARA FLUIR --> https://www.youtube.com/watch?v=fYFd2K4XFfo&list=PL73iAmm7by8BDhhkvyfrmjebr0DV11MJj&index=14
public class DaoCarga {
    private Connection conexao = null;
   
    //fazer metodos construtores depois
    public DaoCarga() {
    }

   // public DaoCarga(String schema) {
   //     this.setSchema(schema);
   // }
   //verificar sobre a importancia desta setSchema 

    public List<Carga> buscar() {
        List<Carga> lista = new ArrayList<Carga>();
        try {
            conexao = DaoConexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            Statement cs = conexao.createStatement(); // Statement é o responsável por executar seus códigos sql no banco de dados. 
            ResultSet rs = cs.executeQuery("SELECT IDCARGA, TIPO, ORIGEM, DESTINO, REMETENTE, DESTINATARIO, SITUACAO FROM public.carga");

            while (rs.next()) {
                Carga carga = new Carga();
                carga.setIdRodovia(rs.getInt("IDCARGA"));
                carga.settipo(rs.getString("Tipo"));
                carga.setOrigem(rs.getString("ORIGEM"));
                carga.setdestino(rs.getString("DESTINO"));
                carga.setremetente(rs.getString("REMETENTE"));
                carga.setdestinatario(rs.getString("DESTINATARIO"));
                carga.setsituacao(rs.getString("SITUACAO"));
                
                lista.add(carga);
            }
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoCarga").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

    public Carga buscar(Carga carga) {
        try {
            conexao = DaoConexao.abrirConexao(); //abre a conexão com o bd.
            
            /* depois ver essa porra
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            
          */
            
            // PreparedStatemente é uma forma de fazer inserção no banco mais segura, onde você prepara os parametros para serem inseridos. 
            PreparedStatement ps = conexao.prepareStatement("select TIPO, ORIGEM, DESTINO, REMETENTE, DESTINATARIO, SITUACAO from RODOVIA where IDRODOVIA=?"); // pesquiso o id que o usuario digitou na tela e exibo o valor dos campos tabela para tal id
            ps.setInt(1, carga.getIDCARGA()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 

            ResultSet rs = ps.executeQuery(); // executequery e um metodo do preparedStatement, nossa querySQL e jogada para o executequery e apos, passamos ela para o resultset (executeQuery serve para fazer SELECT)

            while (rs.next()) { //percorre o resultset
                carga.setIdCarga(rs.getInt("IDCARGA")); // obtenho os dados do banco e alimento a classe model (convertendo os valores).
                carga.setTipo(rs.getString("TIPO"));
                carga.setOrigem(rs.getString("ORIGEM"));
                carga.setDestino(rs.getInt("DESTINO"));
                carga.setRemetente(rs.getString("REMETENTE"));
                carga.setDestinatario(rs.getString("DESTINATARIO"));
                carga.setSituacao(rs.getString("SITUACAO"));
            }
            
            // fecha os metodos e conexao; se as conexoes não forem fechadas da problemas com o banco.
            rs.close(); 
            ps.close();
            conexao.close();
        } catch (SQLException ex) { // trata o erro caso exista, a linguagem obriga a ter um tratamento.
            Logger.getLogger("DaoCarga").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return carga;
    }

    public void inserir(Carga carga) {
        try {
            conexao = DaoConexao.abrirConexao();
            
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            PreparedStatement ps = conexao.prepareStatement("insert into CARGA (TIPO, ORIGEM, DESTINO, REMETENTE, DESTINATARIO, SITUACAO) values(?,?,?,?,?,?)");

            ps.setString(1, carga.getTipo()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setString(2, carga.getOrigem());
            ps.setString(3, carga.getDestino());
            ps.setString(4, carga.getRemetente());
            ps.setString(5, carga.getDestinatario());
            ps.setString(6, carga.getSituacao());
            

            ps.executeUpdate(); // executa o update no banco (executeUpdate serve para INSERT, UPDATE, DELETE).
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoCarga").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void atualizar(Carga carga) {
        try {
            conexao = DaoConexao.abrirConexao();
            
            /*  PS: O SCHEMA não pode atrapalhar o Esquema 
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
             */
            
            PreparedStatement ps = conexao.prepareStatement("update CARGA set TIPO = ?, ORIGEM = ?, DESTINO = ?, REMETENTE = ?, DESTINATARIO = ?, SITUACAO = ?"
							+ "  where IDRODOVIA = ?");


            ps.setString(1, carga.getTipo());
            ps.setString(2, carga.getOrigem());
            ps.setString(3, carga.getDestino());
            ps.setString(4, carga.getRemetente());
            ps.setString(5, carga.getDestinatario());
            ps.setString(6, carga.getSituacao());
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoCarga").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(Carga carga) {
        try {
            conexao = DaoConexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            PreparedStatement ps = conexao.prepareStatement("delete from CARGA where IDCARGA = ?");

            ps.setInt(1, carga.getIdCarga());

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoCarga").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
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
