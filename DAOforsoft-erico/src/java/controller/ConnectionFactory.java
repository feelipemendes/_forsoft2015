/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Higor
 */
public class ConnectionFactory {
      public Connection getConnection() {
          
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());    
            return DriverManager.getConnection(
          	"jdbc:oracle:thin:@192.168.88.131:1521:forsoft","system","123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
