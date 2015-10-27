/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DarkBox
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
        
        try{
            return DriverManager.getConnection("jdbc:oracle:thin:@192.168.26.129:1521:forsoft", "system", "123");
        }catch(SQLException e){
           throw new RuntimeException(e + " Erro 666: Miguel ferrou o DNS");
        }
        
    }
}
