package loja;

import equipamentos.iphone.Iphone;

public class Usuario {
    public static void main(String[] args){
        Iphone iphone = new Iphone();

        System.out.println("Usuario Testando aparelho Iphone:");

        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorrerioVoz();

        iphone.atualizarPagina();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();        
    }
}
