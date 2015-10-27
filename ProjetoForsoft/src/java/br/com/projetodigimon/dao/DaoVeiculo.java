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




import model.DaoVeiculo;    //importar a entidade contato



/**
 *
 * @author Usuario
 */


// ATENÇÃO, ANTES DE DE COMEÇAR A PROGRAMAR ABRA ESTE LINK PARA FLUIR --> https://www.youtube.com/watch?v=fYFd2K4XFfo&list=PL73iAmm7by8BDhhkvyfrmjebr0DV11MJj&index=14
public class DaoVeiculo {
    private Connection conexao = null;
   
    //fazer metodos construtores depois
    public DaoVeiculo() {
    }

    public DaoVeiculo(String schema) {
        this.setSchema(schema);
    }
    

    public List<veiculo> buscar() {
        List<veiculo> lista = new ArrayList<veiculo>();
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            Statement cs = conexao.createStatement(); // Statement é o responsável por executar seus códigos sql no banco de dados. 
            ResultSet rs = cs.executeQuery("SELECT IDVEICULO, UF, PLACA, RENAVAM, TIPO, MODELO, MARCA, ANODEFABRIC, NUMEIXOS,TARA, CMT, PBT, IDTRANSPORTADOR, SITUACAO FROM public.veiculo");

            while (rs.next()) {
                Veiculo veiculo = new Veiculo();
                veiculo.setIdVeiculo(rs.getInt("IDVEICULO"));
                veiculo.setUf(rs.getString("UF"));
                veiculo.setPlaca(rs.getString("PLACA"));
                veiculo.setRenavam(rs.getString("RENAVAM"));
                veiculo.setTipo(rs.getString("TIPO"));
                veiculo.setModelo(rs.getString("MODELO"));
                veiculo.setMarca(rs.getString("MARCA"));
                veiculo.setNumDeFabric(rs.getString("ANODEFABRIC"));
                veiculo.setNumEixos(rs.getString("NUMEIXOS"));
                veiculo.setTara(rs.getString("TARA"));
                veiculo.setCmt(rs.getString("CMT"));
                veiculo.setPbt(rs.getString("PBT"));
                veiculo.setIdTransportador(rs.getInt("IDTRANSPORTADOR"));
                veiculo.setSituacao(rs.getString("SITUACAO"));
                lista.add(veiculo);
            }
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoVeiculo").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

    public Veiculo buscar(Veiculo veiculo) {
        try {
            conexao = Conexao.abrirConexao(); //abre a conexão com o bd.
            
            /* depois ver essa porra
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            
          */
            
            // PreparedStatemente é uma forma de fazer inserção no banco mais segura, onde você prepara os parametros para serem inseridos. 
            PreparedStatement ps = conexao.prepareStatement("select IDVEICULO, UF, PLACA, RENAVAM, TIPO, MODELO, MARCA, ANODEFABRIC, NUMEIXOS,TARA, CMT, PBT, IDTRANSPORTADOR, SITUACAO from VEICULO where IDVEICULO=?"); // pesquiso o id que o usuario digitou na tela e exibo o valor dos campos tabela para tal id
            ps.setInt(1, veiculo.getIDVEICULO()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 

            ResultSet rs = ps.executeQuery(); // executequery e um metodo do preparedStatement, nossa querySQL e jogada para o executequery e apos, passamos ela para o resultset (executeQuery serve para fazer SELECT)

            while (rs.next()) { //percorre o resultset
                //Veiculo veiculo = new Veiculo();
                veiculo.setIdVeiculo(rs.getInt("IDVEICULO"));
                veiculo.setUf(rs.getString("UF"));
                veiculo.setPlaca(rs.getString("PLACA"));
                veiculo.setRenavam(rs.getString("RENAVAM"));
                veiculo.setTipo(rs.getString("TIPO"));
                veiculo.setModelo(rs.getString("MODELO"));
                veiculo.setMarca(rs.getString("MARCA"));
                veiculo.setNumDeFabric(rs.getString("ANODEFABRIC"));
                veiculo.setNumEixos(rs.getString("NUMEIXOS"));
                veiculo.setTara(rs.getString("TARA"));
                veiculo.setCmt(rs.getString("CMT"));
                veiculo.setPbt(rs.getString("PBT"));
                veiculo.setIdTransportador(rs.getInt("IDTRANSPORTADOR"));
                veiculo.setSituacao(rs.getString("SITUACAO"));
                
            }
            
            // fecha os metodos e conexao; se as conexoes não forem fechadas da problemas com o banco.
            rs.close(); 
            ps.close();
            conexao.close();
        } catch (SQLException ex) { // trata o erro caso exista, a linguagem obriga a ter um tratamento.
            Logger.getLogger("DaoVeiculo").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return Veiculo;
    }

    public void inserir(Veiculo veiculo) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            PreparedStatement ps = conexao.prepareStatement("insert into PESSOAFISICA (UF, PLACA, RENAVAM, TIPO, MODELO, MARCA, ANODEFABRIC, NUMEIXOS,TARA, CMT, PBT, IDTRANSPORTADOR, SITUACAO) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            //Veiculo veiculo = new Veiculo();
            ps.setString(1, veiculo.getUf()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setString(2, veiculo.getPlaca());
            ps.setString(3, veiculo.getRenavam());
            ps.setString(4, veiculo.getTipo());
            ps.setString(5, veiculo.getModelo());
            ps.setString(6, veiculo.getMarca());
            ps.setString(7, veiculo.getAnoDeFabric());
            ps.setString(8, veiculo.getNumEixos());
            ps.setString(9, veiculo.getTara());
            ps.setString(10, veiculo.getCmt());
            ps.setStrig(11, veiculo.getPbt());
            ps.setString(12, veiculo.getIdTransportador());
            ps.setString(13, veiculo.getSituacao());

            ps.executeUpdate(); // executa o update no banco (executeUpdate serve para INSERT, UPDATE, DELETE).
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoVeiculo").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void atualizar(Veiculo veiculo) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*  PS: O SCHEMA não pode atrapalhar o Esquema 
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
             */
            
            PreparedStatement ps = conexao.prepareStatement("update VEICULO set UF = ?, PLACA = ?, RENAVAM = ?, TIPO = ?, MODELO = ?, MARCA = ?, ANODEFABRIC = ?, NUMEIXOS = ?, TARA = ?, CMT = ?, PBT = ?, IDTRANSPORTADOR = ?, SITUACAO = ?"
							+ "  where IDVEICULO = ?");

            //Veiculo veiculo = new Veiculo();
            ps.setString(1, veiculo.getUf()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setString(2, veiculo.getPlaca());
            ps.setString(3, veiculo.getRenavam());
            ps.setString(4, veiculo.getTipo());
            ps.setString(5, veiculo.getModelo());
            ps.setString(6, veiculo.getMarca());
            ps.setString(7, veiculo.getAnoDeFabric());
            ps.setString(8, veiculo.getNumEixos());
            ps.setString(9, veiculo.getTara());
            ps.setString(10, veiculo.getCmt());
            ps.setStrig(11, veiculo.getPbt());
            ps.setString(12, veiculo.getIdTransportador());
            ps.setString(13, veiculo.getSituacao());
            ps.setInt(14, veiculo.getIdVeiculo());
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoVeiculo").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(Veiculo veiculo) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            PreparedStatement ps = conexao.prepareStatement("delete from VEICULO where IDVEICULO = ?");
            
            ps.setInt(1, veiculo.getIdVeiculo());

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoVeiculo").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
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
