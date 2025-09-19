package br.agitaRural.models;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
	private String nome;
	private String sobre;
	private Local localParaInformacao;
	private final List<Acao> acoes;
	private final List<RedeSocial> perfis;

    public Projeto(String nome, String sobre, Local localParaInformacao){
        this.nome = nome;
        this.sobre = sobre;
        this.localParaInformacao = localParaInformacao;
        this.acoes = new ArrayList<>();
        this.perfis = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobre() {
        return sobre;
    }
    public void setSobre(String sobre) {
        this.sobre = sobre;
    }
    public Local getLocalParaInformacao() {
        return localParaInformacao;
    }
    public void setLocalParaInformacao(Local localParaInformacao) {
        this.localParaInformacao = localParaInformacao;
    }
    public void adicionarAcao(Acao acao) {
        this.acoes.add(acao);
    }
    public List<Acao> getAcoes() {
        return new ArrayList<>(acoes);
    }
    public void adicionarPerfil(RedeSocial perfil) {
        this.perfis.add(perfil);
    }
    public List<RedeSocial> getPerfis() {
        return new ArrayList<>(perfis);
    }
}

