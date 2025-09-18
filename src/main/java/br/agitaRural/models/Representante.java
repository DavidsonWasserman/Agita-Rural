package br.agitaRural.models;

public class Representante {
	private String nomeCompleto;
	private String cpf;
	private String contato;
	
    public Representante(String nomeCompleto, String cpf, String contato){
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.contato = contato;
    }
}
