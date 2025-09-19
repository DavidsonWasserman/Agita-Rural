package br.agitaRural.models;

import br.agitaRural.enums.Status;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Acao {
    private final String nome;
    private String sobre;
    private final List<RedeSocial> perfis;
    private Local localizacao;
    private final LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private final List<Representante> representantes;
    private final Unidade unidade;
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

    public String getNome() {
        return nome;
    }
    public String getSobre() {
        return sobre;
    }
    public void setSobre(String sobre) {
        this.sobre = sobre;
    }
    public List<RedeSocial> getPerfis() {
        return new ArrayList<>(perfis);
    }
    public void adicionarPerfil(RedeSocial perfil) {
        this.perfis.add(perfil);
    }
    public Local getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(Local localizacao) {
        this.localizacao = localizacao;
    }
    public LocalDateTime getDataInicio() {
        return dataInicio;
    }
    public LocalDateTime getDataFim() {
        return dataFim;
    }
    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }
    public List<Representante> getRepresentantes() {
        return new ArrayList<>(representantes);
    }
    public void adicionarRepresentante(Representante representante) {
        this.representantes.add(representante);
    }
    public Unidade getUnidade() {
        return unidade;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
}