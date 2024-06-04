package SistemaDoIphone;
import Interface.InterfaceAparelhoTefonico;
import Interface.InterfaceNavegadorInternet;
import Interface.InterfaceReprodutorMusical;


public class SistemaIphone implements InterfaceAparelhoTefonico,InterfaceNavegadorInternet, InterfaceReprodutorMusical {

    
    // Métodos do Navegador na Internet
    public void AdicionarNovaAbaN() {
       System.out.println("Adicionar nova aba");
    }

    public void AtualizarPaginaN() {
        System.out.println("Atualizar pagina");

    }
   
    public void ExibirPaginaN(String nome) {
        System.out.println("Exibir pagina");
        
    }
    // Métodos do Navegador na Internet


    // Métodos do Aparelho Tefônico
    public void AtenderA() {
        System.out.println("Atende");
        
    }
    public void IniciarCorreioVozA() {
        System.out.println("Iniciar correio de voz");

    }

    public void LigaA(String nome) {
        System.out.println("Liga");
        
    }
    // Métodos do Aparelho Tefônico


    // Métodos do Reprodutor Musical
    public void PausarR() {
        System.out.println("Pausar");
      
        
    }

    public void SelecionarMusicaR(String nome) {
        System.out.println("Selecionar musica");
        
        
    }

    public void TocarR() {
        System.out.println("Tocar");
    }
    // Métodos do Reprodutor Musical

   


    
}
