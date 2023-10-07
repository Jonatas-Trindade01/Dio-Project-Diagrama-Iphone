package org.example;

public class Iphone implements ReprodutorMusical,AparelhoTelefônico, NavegadorNaInternet {
    @Override
    public void makeCall() {
        System.out.println("Ligando...");
    }

    @Override
    public void acceptCall() {
        System.out.println("Ligação aceita.");
    }

    @Override
    public void startCorreioVoz() {
        System.out.println("Primeira mensagem...");
    }

    @Override
    public void playMusic() {
        System.out.println("Ouvindo música!");
    }

    @Override
    public void stopMusic() {
        System.out.println("Parando a música");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecionando a música");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página");
    }

    @Override
    public void addNewPage() {
        System.out.println("Adicionado nova página");
    }

    @Override
    public void updatePage() {
        System.out.println("Atualizando a página");
    }
}
