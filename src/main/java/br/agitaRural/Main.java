package br.agitaRural;

import br.agitaRural.enums.Status;
import br.agitaRural.enums.TipoUnidade;
import br.agitaRural.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Unidade unidadeEdFisica = new Unidade("EdFisica", TipoUnidade.DEPARTAMENTO);

        Local quadra = new Local("Quadras", "Campus Seropédica", "Atras do alojamento");
        Local departamentoEsportesELazer = new Local("DepartamentoE&L", "Campos Seropédica", "Perto das quadras");

        Representante profTiago = new Representante("Tiago Teste", "123.456.789-10", "tiago@ufrrj.br");
        List<Representante> respresentante = new ArrayList<>();
        respresentante.add(profTiago);

        Acao tenis = new Acao("Tenis do Previt", "Treinos abertos de tenis", quadra, respresentante, unidadeEdFisica);
        tenis.adicionarRepresentante(profTiago);
        tenis.adicionarPerfil(new RedeSocial("Instagram", "instagram.com/previttenis"));

        Projeto previt = new Projeto("Projeto PREVIT", "Promoção da saúde através de esportes", departamentoEsportesELazer);
        previt.adicionarPerfil(new RedeSocial("Instagram", "instagram.com/projetoprevit"));
        previt.adicionarAcao(tenis);

        System.out.println("\nRepresentante:");
        System.out.println(profTiago);

        System.out.println("\nUnidade:");
        System.out.println(unidadeEdFisica);

        System.out.println("\nProjeto:");
        System.out.println(previt);

        tenis.setStatus(Status.PAUSADO);
        System.out.println("\nApós descontinuação da ação:");
        System.out.println(tenis);
            }
        }








