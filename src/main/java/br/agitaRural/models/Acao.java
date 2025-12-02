package br.agitaRural.models;

import br.agitaRural.enums.Status;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Acao {
    private final String nome;
    private String sobre;
    private String publicoAlvo;
    private final List<RedeSocial> perfis;
    private Local localizacao;
    private final LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private final List<Representante> representantes;
    private final Unidade unidade;
    private Status status;
    private final boolean taxa;
    private String preco;

    public Acao(String nome, String sobre, String publicoAlvo, Local localizacao, List<Representante> representantes, Unidade unidade, boolean taxa) {
        this.nome = nome;
        this.sobre = sobre;
        this.publicoAlvo = publicoAlvo;
        this.localizacao = localizacao;
        this.representantes = representantes;
        this.unidade = unidade;
        this.taxa = taxa;
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
    public String getPublicoAlvo() { return publicoAlvo; }
    public List<RedeSocial> getPerfis() {
        return new ArrayList<>(perfis);
    }
    public void adicionarPerfil(RedeSocial perfil) {
        this.perfis.add(perfil);
    }
    public Local getLocalizacao() {
        return localizacao;
    }
    public LocalDateTime getDataInicio() {
        return dataInicio;
    }
    public LocalDateTime getDataFim() {
        return dataFim;
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
    public boolean getTaxa() { return taxa; }
    public String getPreco() { return preco; }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }
    public void setPublicoAlvo(String publicoAlvo) { this.publicoAlvo = publicoAlvo; }
    public void setLocalizacao(Local localizacao) {
        this.localizacao = localizacao;
    }
    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public void setPreco(String preço) {
        this.preco = preco;
        if (!taxa) this.preco = "GRATUITO";
}
}