/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import controller.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Endereco;

/**
 *
 * @author Sora
 */
public class EnderecoDao {
    private final Connection connection;  
    public EnderecoDao(){
     this.connection = new ConnectionFactory().getConnection();
    }
    
    public void insert (Endereco endereco){     
              
        try {
         // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement("Insert into endereco (CEP, LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)");
         
         // seta os valores
         //stmt.setInt(1,endereco.getIdEndereco());
         stmt.setString(1, endereco.getCep());
         stmt.setString(2, endereco.getLogradouro());
         stmt.setString(3, endereco.getNumero());
         stmt.setString(4, endereco.getComplemento());
         stmt.setString(5, endereco.getBairro());
         stmt.setString(6, endereco.getCidade());
         stmt.setString(7, String.valueOf(endereco.getUf()));
        
        
         // executa
         stmt.executeUpdate();
         stmt.close();
         
     } catch (SQLException e) {
         throw new RuntimeException(e);
    
     }
    }
}





