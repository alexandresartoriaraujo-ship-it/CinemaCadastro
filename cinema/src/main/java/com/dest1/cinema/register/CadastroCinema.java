package com.dest1.cinema.register;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CadastroCinema {

    @Id
    private int id;

    private String nomeFilme;
    private String genero;
    private String diretor;
    private int anoLancamento;
    private int duracao;
    private String classificacao;
    private String imagem;
    private String descricao;

    public CadastroCinema() {

    }

    public CadastroCinema(int id, String nomeFilme, String genero, String diretor, int anoLancamento, int duracao, String classificacao, String imagem, String descricao) {
        this.id = id;
        this.nomeFilme = nomeFilme;
        this.genero = genero;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}