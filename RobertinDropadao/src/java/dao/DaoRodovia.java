/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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




import model.Rodovia;    //importar a entidade rodovia

public class DaoRodovia extends ConnectionFactory {
    private static PreparedStatement ps;
    private static ResultSet rs;
    

   
    public void inserir(Rodovia rodovia) throws Exception {
        try {
            Connection con = new ConnectionFactory().getConnection();

            System.out.println(rodovia.getNome());
            System.out.println("ENTROU NO DAO RODOVIA");

            
            String ql = "INSERT INTO rodovia (IDRODOVIA, NOME, EXTENSAOKM, CIDADEINICIAL, UFINICIAL, CIDADEFINAL, UFFINAL, SITUACAO) VALUES(?,?,?,?,?,?,?,?)"; 
            
            //Conexao myconexao = new Conexao();
            //myconexao.abrirConexao();
            /*
            
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }
           
            */
            PreparedStatement stmt = con.prepareStatement(ql);

            stmt.setInt(1, rodovia.getIdRodovia());
            stmt.setString(2, rodovia.getNome()); //obtem os valores inseridos na model e passa para ps(convertendo os valores).
           // ps.setString(2, rodovia.getTipo());
            stmt.setFloat(3, rodovia.getExtensaoKm());
            stmt.setString(4, rodovia.getCidadeInicial());
            stmt.setString(5, rodovia.getUfInicial());
            stmt.setString(6, rodovia.getCidadeFinal());
            stmt.setString(7, rodovia.getUfFinal());
            
            stmt.setString(8, "0");
            

            stmt.executeUpdate(); // executa o update no banco (executeUpdate serve para INSERT, UPDATE, DELETE).
            stmt.close();
            //myconexao.fecharConexao();
	} catch (SQLException ex) {
            Logger.getLogger("DaoRodovia").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }
}
   