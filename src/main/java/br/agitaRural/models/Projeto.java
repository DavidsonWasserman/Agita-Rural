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
}

