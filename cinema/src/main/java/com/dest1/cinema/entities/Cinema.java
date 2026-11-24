
package com.dest1.cinema.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "cadastro_cinema")
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String sinopse;
    private String genero;
    private String classificacao;
    private int duracao;
    private String diretor;
    private int anoLancamento;
    private String idioma;
    private String formato;
    private String imagem;
    private String trailer;
    private boolean disponivel;

    public Cinema() {

    }

    public Cinema(int id, String titulo, String sinopse, String genero, String classificacao, int duracao, String diretor, int anoLancamento, String idioma, String formato, String imagem, String trailer, boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.genero = genero;
        this.classificacao = classificacao;
        this.duracao = duracao;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.idioma = idioma;
        this.formato = formato;
        this.imagem = imagem;
        this.trailer = trailer;
        this.disponivel = disponivel;
    }

    public Cinema(String titulo, String sinopse, String genero, String classificacao, int duracao, String diretor, int anoLancamento, String idioma, String formato, String imagem, String trailer, boolean disponivel) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.genero = genero;
        this.classificacao = classificacao;
        this.duracao = duracao;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.idioma = idioma;
        this.formato = formato;
        this.imagem = imagem;
        this.trailer = trailer;
        this.disponivel = disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getGenero() {
        return genero;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getFormato() {
        return formato;
    }

    public String getImagem() {
        return imagem;
    }

    public String getTrailer() {
        return trailer;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}


