/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DarkBox
 */
public class DaoTeste {
    public static void main(String[] args) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        
        String sql = "Insert into CONTATO" + 
                " (IDCONTATO, TELEFONE, CELULAR, EMAIL)"
                + " VALUES (?,?,?,?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
        
            stmt.setInt(1, 2);
            stmt.setString(2, "04");
            stmt.setString(3, "066");
            stmt.setString(4, "6666");
            
            stmt.executeUpdate();
            stmt.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
