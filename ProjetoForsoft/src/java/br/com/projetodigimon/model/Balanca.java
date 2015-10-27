/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projetodigimon.model;

/**
 *
 * @author Javapos
 */
public class Balanca {
    private long idBalanca;
    private String numSerie;
    private String fabricante;
    private String modelo;
    private PostoPesagem postoPesagem;
    private Endereco idEndereco;

    public Endereco getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Endereco idEndereco) {
        this.idEndereco = idEndereco;
    }
    private PostoPesagem idPosto;

    public PostoPesagem getIdPosto() {
        return idPosto;
    }

    public void setIdPosto(PostoPesagem idPosto) {
        this.idPosto = idPosto;
    }

    public long getIdBalanca() {
        return idBalanca;
    }

    public void setIdBalanca(long idBalanca) {
        this.idBalanca = idBalanca;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public PostoPesagem getPostoPesagem() {
        return postoPesagem;
    }

    public void setPostoPesagem(PostoPesagem postoPesagem) {
        this.postoPesagem = postoPesagem;
    }
    
}
