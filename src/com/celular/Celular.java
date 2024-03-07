package com.celular;

public class Celular implements ReprodutorMusical, AparelhoTelefonico, Navegador{
    private String nome="Iphone";
    private String numero="123123123";

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public void Tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void Pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void SelecionarMusica() {
        System.out.println("Selecionando musica");
    }

    @Override
    public void Ligar() {
        System.out.println("Fazendo ligação");
    }

    @Override
    public void Atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void ExibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void AdicionaNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("Atualizando pagina");
    }
}
