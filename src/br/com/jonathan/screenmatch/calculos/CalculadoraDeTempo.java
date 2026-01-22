package br.com.jonathan.screenmatch.calculos;

import br.com.jonathan.screenmatch.modelos.Filme;
import br.com.jonathan.screenmatch.modelos.Serie;
import br.com.jonathan.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int TempoTotal;

    public int getTempoTotal(){
        return TempoTotal;
    }

//    public void inclui(Filme f) {
//        TempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        TempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        this.TempoTotal += titulo.getDuracaoEmMinutos();

    }
}
