package br.agitaRural.models;

import br.agitaRural.enums.TipoUnidade;

public class Unidade {
	private final String nome;
	private final TipoUnidade tipo;

    public Unidade(String nome, TipoUnidade tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }
    public TipoUnidade getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return nome + " | " + tipo;
    }
}

