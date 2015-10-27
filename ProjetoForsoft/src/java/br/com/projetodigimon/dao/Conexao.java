/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projetodigimon.dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;

/**
 *
 * @author Leandro Cabral
 */
public class Conexao {

    Connection conexao;
    PreparedStatement stmt;
    ResultSet rs;

    /* Método que inicia conexao */
    public void abrirConexao() throws Exception {


        Class.forName("com.mysql.jdbc.Driver");

        String database = "jdbc:mysql://192.168.25.2/TESTE";
        String usuario = "forsoft";
        String senha = "forsoft";

        /* Chama o driver do Mysql*/

        conexao = (Connection) DriverManager.getConnection(database, usuario, senha);

        System.out.println("Conexão OK!!!");

    }
    /* Método que fecha conexao  */
    public void fecharConexao() throws Exception {

        if (conexao != null) {
            conexao.close();
        }
    }

    PreparedStatement prepareStatement(String insert_into_rodovia_nome_tipo_extensaokm_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}