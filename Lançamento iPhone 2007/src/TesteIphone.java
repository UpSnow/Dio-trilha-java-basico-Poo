import SistemaDoIphone.SistemaIphone;

public class TesteIphone  {
    public static void main(String[] args)  { 
        SistemaIphone sistemaIphone = new SistemaIphone();
        // Teste métodos do aparelho telefônico
        System.out.println("Teste dos métodos do aparelho telefônico");
        sistemaIphone.AtenderA();
        sistemaIphone.IniciarCorreioVozA();
        sistemaIphone.LigaA("Arthur");
        System.out.println("Teste dos métodos do aparelho telefônico");
        System.out.println("");
        // Teste métodos do navegador de internet
        System.out.println("Teste dos métodoss do navegador de internet");
        sistemaIphone.AdicionarNovaAbaN();
        sistemaIphone.AtualizarPaginaN();
        sistemaIphone.ExibirPaginaN("Whatsapp");
        System.out.println("Teste dos métodos do navegador de internet");
        System.out.println("");
        // Teste métodos do reprodutor musical
        System.out.println("Teste dos métodos do reprodutor musical");
        sistemaIphone.TocarR();
        sistemaIphone.PausarR();
        sistemaIphone.SelecionarMusicaR("Mina do Condomínio");
        System.out.println("Teste dos métodos do reprodutor musical");
        System.out.println("");


    }
}
