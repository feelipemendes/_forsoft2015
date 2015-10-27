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
import model.Motorista;    //importar a entidade rodovia

public class DaoMotorista {
    
    private Connection conexao = null;
   
    //fazer metodos construtores depois
    public DaoMotoriista() {
    }

    public DaoMotorista(String schema) {
        this.setSchema(schema);
    }
    

    public List<Motorista> buscar() {
        List<Motorista> lista = new ArrayList<Motorista>();
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            Statement cs = conexao.createStatement(); // Statement é o responsável por executar seus códigos sql no banco de dados. 
            ResultSet rs = cs.executeQuery("SELECT IDMOTORISTA, IDPESSOAFISICA, CNH, IDTRANSPORTADOR, SITUACAO FROM public.motorista");

            while (rs.next()) {
                Motorista motorista = new Motorista();
                
                motorista.setIdMotorista(rs.getInt("IDMOTORISTA"));
                motorista.setPessoaFisica(rs.getInt("IDPESSOAFISICA"));
                motorista.setCnh(rs.getString("CNH"));
                motorista.setIdTransportador(rs.getInt("IDTRANSPORTADOR"));
                motorista.setSituacao(rs.getString("SITUACAO"));
                
                lista.add(motorista);
            }
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoMotorista").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

    public Motorista buscar(Motorista motorista) {
        try {
            conexao = Conexao.abrirConexao(); //abre a conexão com o bd.
            
            /* depois ver essa porra
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            
          */
            
            // PreparedStatemente é uma forma de fazer inserção no banco mais segura, onde você prepara os parametros para serem inseridos. 
            
            
            PreparedStatement ps = conexao.prepareStatement("select IDPESSOAFISICA, CNH, IDTRANSPORTADOR, SITUACAO from MOTORISTA where IDMOTORISTA=?"); // pesquiso o id que o usuario digitou na tela e exibo o valor dos campos tabela para tal id
            ps.setInt(1, motorista.getIdMotorista()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 
                
            ResultSet rs = ps.executeQuery(); // executequery e um metodo do preparedStatement, nossa querySQL e jogada para o executequery e apos, passamos ela para o resultset (executeQuery serve para fazer SELECT)

            while (rs.next()) { //percorre o resultset
                motorista.setIdMotorista(rs.getInt("IDMOTORISTA"));// obtenho os dados do banco e alimento a classe model (convertendo os valores).
                motorista.setPessoaFisica(rs.getInt("IDPESSOAFISICA"));
                motorista.setCnh(rs.getString("CNH"));
                motorista.setIdTransportador(rs.getInt("IDTRANSPORTADOR"));
                motorista.setSituacao(rs.getString("SITUACAO"));
            }
            
            // fecha os metodos e conexao; se as conexoes não forem fechadas da problemas com o banco.
            rs.close(); 
            ps.close();
            conexao.close();
        } catch (SQLException ex) { // trata o erro caso exista, a linguagem obriga a ter um tratamento.
            Logger.getLogger("DaoRodovia").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return motorista;
    }

    public void inserir(Motorista motorista) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            PreparedStatement ps = conexao.prepareStatement("insert into MOTORISTA (CNH, SITUACAO) values(?,?)");
            
            
            ps.setString(1, motorista.getCnh()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setString(2, motorista.getSituacao());
            

            ps.executeUpdate(); // executa o update no banco (executeUpdate serve para INSERT, UPDATE, DELETE).
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoMotorista").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void atualizar(Motorista motorista) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*  PS: O SCHEMA não pode atrapalhar o Esquema 
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
             */
            
            PreparedStatement ps = conexao.prepareStatement("update MOTORISTA set CNH = ?, SITUACAO = ? where IDRODOVIA = ?");
            Motorista motorista = new Motorista();
            
            
            ps.setInt(3, motorista.getIdMotorista()); //obtenho o id digitado pelo usuario no banco e  seto no ps, 
            
            
            ps.setString(1, motorista.getCnh()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
            ps.setString(2, motorista.getSituacao());;

            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("DaoMotorista").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(Motorista motorista) {
        try {
            conexao = Conexao.abrirConexao();
            
            /*
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
            */
            
            PreparedStatement ps = conexao.prepareStatement("delete from MOTORISTA where IDMOTORISTA = ?");

           
            ps.setInt(1, motorista.getIdMotorista());

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("DaoMotorista").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
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
