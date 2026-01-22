package br.com.jonathan.screenmatch.principal;

import br.com.jonathan.screenmatch.calculos.CalculadoraDeTempo;
import br.com.jonathan.screenmatch.calculos.FiltroRecomendacao;
import br.com.jonathan.screenmatch.modelos.Episodio;
import br.com.jonathan.screenmatch.modelos.Filme;
import br.com.jonathan.screenmatch.modelos.Serie;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Vingadores Doomsday", 2026);
        meuFilme.avalia(9);
        meuFilme.DuracaoEmMinutos = 180;
        System.out.println("Duração do filme: " + meuFilme.DuracaoEmMinutos + " minutos");

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        Filme OutroFilme = new Filme("Avatar", 2023);
        OutroFilme.avalia(7);
        OutroFilme.DuracaoEmMinutos = 200;


        Serie Flash= new Serie("Flash", 2000);
        Flash.exibeFichaTecnica();
        Flash.setTemporadas(7);
        Flash.setEpisodiosPorTemporada(23);
        Flash.setMinutosPorEpisodio(23);
        System.out.println("Tempo necessário para maratonar Flash " + Flash.getDuracaoEmMinutos() + " minutos" );

        CalculadoraDeTempo calculadora= new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(OutroFilme);
        calculadora.inclui(Flash);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro= new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio= new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(Flash);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDaMarvel= new Filme("Thunderbolts", 2024);
        filmeDaMarvel.avalia(8);
        filmeDaMarvel.setDuracaoEmMinutos(240);
        filmeDaMarvel.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDaMarvel);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(OutroFilme);
        System.out.println("Minha lista de filmes " + listaDeFilmes.size());
        System.out.println("Primeiro Filme "+ listaDeFilmes.get(0) .getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do " + listaDeFilmes.get(0).toString());



    }
}