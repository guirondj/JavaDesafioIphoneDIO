package equipamentos.iphone;

import equipamentos.aparelhoTelefone.AparelhoTelefone;
import equipamentos.navegadorNaInternet.NavegadorNaInternet;
import equipamentos.reprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefone, NavegadorNaInternet{

    public void atender() {
        System.out.println("Atender Ligação");        
    }

    public void iniciarCorrerioVoz() {
        System.out.println("Correio De Voz");  
    }

    public void ligar() {
        System.out.println("Fazer Ligação");
        
    }

    public void pausar() {
        System.out.println("Música Pausada");
        
    }

    public void selecionarMusica() {
        System.out.println("Selecione Música");
        
    }

    public void tocar() {
        System.out.println("Tocar Música");
        
    }

    public void adicionarNovaAba() {
        System.out.println("Nova Aba");  
    }

    public void atualizarPagina() {
        System.out.println("Atualizar Pagina");  
    }

    public void exibirPagina() {
        System.out.println("Exibir Pagina");         
    }
    
}
