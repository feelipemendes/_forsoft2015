package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




import br.com.projetodigimon.model.Rodovia;    //importar a entidade rodovia



/**
 *
 * @author Usuario
 */



public class DaoRodovia extends DaoConexao {
    private static PreparedStatement ps;
    private static ResultSet rs;
    
   
    //fazer metodos construtores depois
    public DaoRodovia() {
    }

  //  public DaoRodovia(String schema) {
  //      this.setSchema(schema);
   // }
    

    public List<Rodovia> buscar() {
        List<Rodovia> lista = new ArrayList<Rodovia>();
        try {
            abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            Statement cs = connection.createStatement(); // Statement é o responsável por executar seus códigos sql no banco de dados. 
            ResultSet rs = cs.executeQuery("SELECT IDRODOVIA, NOME, TIPO, EXTENSAOKM, CIDADEINICIAL, UFINICIAL, CIDADEFINAL, UFFINAL, SITUACAO FROM public.rodovia");

            while (rs.next()) {
                Rodovia rodovia = new Rodovia();
                rodovia.setIdRodovia(rs.getInt("IDRODOVIA"));
                rodovia.setNome(rs.getString("NOME"));
                rodovia.setTipo(rs.getString("TIPO"));
                rodovia.setExtensaoKm(rs.getInt("EXTENSAOKM"));
                rodovia.setCidadeInicial(rs.getString("CIDADEINICIAL"));
                rodovia.setUfInicial(rs.getString("UFINICIAL"));
                rodovia.setCidadeFinal(rs.getString("CIDADEFINAL"));
                rodovia.setUfFinal(rs.getString("UFFINAL"));
                rodovia.setSituacao(rs.getString("SITUACAO"));
                
                lista.add(rodovia);
            }
            rs.close();
            cs.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoRodovia").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

    public Rodovia buscar(Rodovia rodovia) throws Exception {
        try {
            abrirConexao(); //abre a conexão com o bd.
            
            /* depois ver essa porra
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            
          */
            
            // PreparedStatemente é uma forma de fazer inserção no banco mais segura, onde você prepara os parametros para serem inseridos. 
            PreparedStatement ps = connection.prepareStatement("select NOME, TIPO, EXTENSAOKM, CIDADEINICIAL, UFINICIAL, CIDADEFINAL, UFFINAL, SITUACAO from RODOVIA where IDRODOVIA=?"); // pesquiso o id que o usuario digitou na tela e exibo o valor dos campos tabela para tal id
            ps.setInt(1, rodovia.getIdRodovia()); //obtenho o id digitado pelo usuario na model e seto no ps, 

            ResultSet rs = ps.executeQuery(); // executequery e um metodo do preparedStatement, nossa querySQL e jogada para o executequery e apos, passamos ela para o resultset (executeQuery serve para fazer SELECT)

            while (rs.next()) { //percorre o resultset
                rodovia.setIdRodovia(rs.getInt("IDRODOVIA")); // obtenho os dados do banco e alimento a classe model (convertendo os valores).
                rodovia.setNome(rs.getString("NOME"));
                rodovia.setTipo(rs.getString("TIPO"));
                rodovia.setExtensaoKm(rs.getInt("EXTENSAOKM"));
                rodovia.setCidadeInicial(rs.getString("CIDADEINICIAL"));
                rodovia.setUfInicial(rs.getString("UFINICIAL"));
                rodovia.setCidadeFinal(rs.getString("CIDADEFINAL"));
                rodovia.setUfFinal(rs.getString("UFFINAL"));
                rodovia.setSituacao(rs.getString("SITUACAO"));
            }
            
            // fecha os metodos e conexao; se as conexoes não forem fechadas da problemas com o banco.
            rs.close(); 
            ps.close();
            fecharConexao();
        } catch (SQLException ex) { // trata o erro caso exista, a linguagem obriga a ter um tratamento.
            Logger.getLogger("DaoRodovia").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return rodovia;
    }

    public void inserir(Rodovia rodovia) throws Exception {
        try {
            System.out.println(rodovia.getNome());
            abrirConexao();
            
            String sql = "INSERT INTO RODOVIA (NOME, TIPO, EXTENSAOKM, CIDADEINICIAL, UFINICIAL, CIDADEFINAL, UFFINAL, SITUACAO) VALUES(?,?,?,?,?,?,?,?)"; 
            
            //Conexao myconexao = new Conexao();
            //myconexao.abrirConexao();
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            ps = (PreparedStatement) connection.prepareStatement(sql);

            ps.setString(1, rodovia.getNome()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setString(2, rodovia.getTipo());
            ps.setFloat(3, rodovia.getExtensaoKm());
            ps.setString(4, rodovia.getCidadeInicial());
            ps.setString(5, rodovia.getUfInicial());
            ps.setString(6, rodovia.getCidadeFinal());
            ps.setString(7, rodovia.getUfFinal());
            ps.setString(8, rodovia.getSituacao());
            

            ps.executeUpdate(); // executa o update no banco (executeUpdate serve para INSERT, UPDATE, DELETE).
            ps.close();
            connection.close();
            //myconexao.fecharConexao();
	} catch (SQLException ex) {
            Logger.getLogger("DaoRodovia").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void atualizar(Rodovia rodovia) throws Exception {
        try {
            abrirConexao();
            
            /*  PS: O SCHEMA não pode atrapalhar o Esquema 
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
             */
            
            PreparedStatement ps = connection.prepareStatement("update RODOVIA set NOME = ?, TIPO = ?, EXTENSAOKM = ?, CIDADEINICIAL = ?, UFINICIAL = ?, CIDADEFINAL = ?, UFFINAL = ?, SITUACAO = ?"
							+ "  where IDRODOVIA = ?");
                                                        

            ps.setString(1, rodovia.getNome());
            ps.setString(2, rodovia.getTipo());
            ps.setFloat(3, rodovia.getExtensaoKm());
            ps.setString(4, rodovia.getCidadeInicial());
            ps.setString(5, rodovia.getUfInicial());
            ps.setString(6, rodovia.getCidadeFinal());
            ps.setString(7, rodovia.getUfFinal());
            ps.setString(8, rodovia.getSituacao());

            
            ps.executeUpdate();
            ps.close();
            fecharConexao();
	} catch (SQLException ex) {
            Logger.getLogger("DaoRodovia").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(Rodovia rodovia) throws Exception {
        try {
            abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            PreparedStatement ps = connection.prepareStatement("delete from RODOVIA where IDRODOVIA = ?");

            ps.setInt(1, rodovia.getIdRodovia());

            ps.executeUpdate();
            ps.close();
            fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger("DaoRodovia").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
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
