package br.agitaRural.models;

import br.agitaRural.enums.Status;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Acao {
    private String nome;
    private String sobre;
    private final List<RedeSocial> perfis;
    private Local localizacao;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private final List<Representante> representantes;
    private Unidade unidade;
    private Status status;

    public Acao(String nome, String sobre, Local localizacao, List<Representante> representantes, Unidade unidade) {
        this.nome = nome;
        this.sobre = sobre;
        this.localizacao = localizacao;
        this.representantes = representantes;
        this.unidade = unidade;
        this.dataInicio = LocalDateTime.now();
        this.perfis = new ArrayList<>();
        this.status = Status.ATIVO;
    }
}