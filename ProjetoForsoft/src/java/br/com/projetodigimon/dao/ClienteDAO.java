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
import model.Cliente;


/**
 *
 * @author Usuario
 */
public class ClienteDAO {
    private Connection conexao = null;
    private String schema;
    
    public ClienteDAO() {
    }

    public ClienteDAO(String schema) {
        this.setSchema(schema);
    }
    
    public List<Cliente> buscar() {
        List<Cliente> lista = new ArrayList<Cliente>();
        try {
            conexao = Conexao.abrirConexao();
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }

            Statement cs = conexao.createStatement();
            ResultSet rs = cs.executeQuery("SELECT idcliente, nome, telefone, email, senha FROM public.cliente");

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idcliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEmail(rs.getString("email"));
                cliente.setSenha(rs.getString("senha"));
                
                lista.add(cliente);
            }
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("ClienteDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

    public Cliente buscar(Cliente cliente) {
        try {
            conexao = Conexao.abrirConexao();
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }

            PreparedStatement ps = conexao.prepareStatement("select nome, telefone, email, senha from cliente where idcliente=?");
            ps.setInt(1, cliente.getIdCliente());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cliente.setIdCliente(rs.getInt("idcliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEmail(rs.getString("email"));
                cliente.setSenha(rs.getString("senha"));
            }
            rs.close();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("ClienteDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return cliente;
    }

    public void inserir(Cliente cliente) {
        try {
            conexao = Conexao.abrirConexao();
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }

            PreparedStatement ps = conexao.prepareStatement("insert into cliente (nome, telefone, email, senha) values(?,?,?,?)");

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getTelefone());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getSenha());

            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("ClienteDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void atualizar(Cliente cliente) {
        try {
            conexao = Conexao.abrirConexao();
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }

            PreparedStatement ps = conexao.prepareStatement("update cliente set nome = ?, telefone = ?, email = ?, senha = ?"
							+ "  where idcliente = ?");

            // Altero o nome do cliente
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getTelefone());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getSenha());
            ps.setInt(5, cliente.getIdCliente());

            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("ClienteDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void deletar(Cliente cliente) {
        try {
            conexao = Conexao.abrirConexao();
            if (this.getSchema()!=null && this.getSchema().equals("")) {
                Statement stm = conexao.createStatement();
                stm.execute("SET SCHEMA = "+this.getSchema());
            }

            PreparedStatement ps = conexao.prepareStatement("delete from cliente where idcliente = ?");

            ps.setInt(1, cliente.getIdCliente());

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("ClienteDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
    }

    public String getSchema() {
        return schema;
    }

    public final void setSchema(String schema) {
        this.schema = schema;
    }
}
