package br.agitaRural.models;

public class Local {
	private final String nome;
	private final String endereco;
	private final String pontoDeReferencia;
	
    public Local(String nome, String endereco, String pontoDeReferencia){
        this.nome = nome;
        this.endereco = endereco;
        this.pontoDeReferencia = pontoDeReferencia;
    }
}
