/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projetodigimon.dao;

import java.sql.*;

public class DaoConexao {
    //private static Connection conexao;
        /* public static void main(String[] args) throws Exception {
                   Connection conexao = ObterConexao();
                   Statement statement = conexao.createStatement();
                   String query = "SELECT sysdate FROM dual";
                   ResultSet resultSet = statement.executeQuery(query);
                   if (resultSet.next()) {
                            System.out.println(resultSet.getDate("sysdate"));
                   }
         }*/
        
    static Connection connection;
    
    public static void abrirConexao() {
                  // Connection conexao = null;
                   /*try {
                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            conexao = DriverManager.getConnection(
                                               "jdbc:oracle:thin:@host:192.168.243.128:1521", "system", "123");
                   } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                   } catch (SQLException e) {
                            e.printStackTrace();
                   }
                   return conexao;*/
                   
                   //////////////////////////////////////////////////////////////////////////////////////////
                   
              
            try {  
                // Load the JDBC driver  
                String driverName = "oracle.jdbc.driver.OracleDriver";  
                Class.forName(driverName);  
               
                // Create a connection to the database  
                //String serverName = "192.168.243.128/digimon";  
                //String portNumber = "1521";  
                //String sid = "forsoft";  
                //String url = "jdbc: oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
                String url = "jdbc:oracle:thin:@192.168.26.131:1521:forsoft";
                String username = "system";  
                String password = "123";  
                connection = DriverManager.getConnection(url, username, password);  
            } catch (ClassNotFoundException e) {  
                // Could not find the database driver  
            } catch (SQLException e) {  
                // Could not connect to the database  
            } 
            
            
         }
    public static void fecharConexao() throws Exception{
        if (connection != null){
            connection.close();
        }
    }
//sim ... mas testa com um banco, pra ter certeza ... só uma coisa .. quase fiz merda
     
//public class DaoConexao {
    
//}
    

    
    
    

}