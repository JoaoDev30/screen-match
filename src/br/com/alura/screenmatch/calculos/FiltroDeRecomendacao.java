package br.com.alura.screenmatch.calculos;

public class FiltroDeRecomendacao {

    public void  filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Este título é um dos mais recomendáveis no momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Adicione na sua lista para assistir mais tarde !!!");
        }
    }
}
