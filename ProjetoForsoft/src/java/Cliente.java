/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private int idCliente;
    private String nome;
    private String telefone;
    private String email;
    private String senha;

    public Cliente() {
    }

    public Cliente(String nome, String telefone, String email, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ",nome=" + nome + ",telefone=" + telefone + ",email=" + email + ",senha=" + senha + '}';
    }
}
