package br.com.jonathan.screenmatch.principal;

import br.com.jonathan.screenmatch.modelos.Filme;
import br.com.jonathan.screenmatch.modelos.Serie;
import br.com.jonathan.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Vingadores Doomsday", 2026);
        Filme OutroFilme = new Filme("Avatar", 2023);
        var filmeDaMarvel= new Filme("Thunderbolts", 2024);
        Serie Flash= new Serie("Flash", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDaMarvel);
        lista.add(meuFilme);
        lista.add(OutroFilme);
        lista.add(Flash);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() < 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
    }
}
