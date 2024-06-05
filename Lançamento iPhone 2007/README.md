## UML De Classe
 No projeto Dio, foi necessário fazer um diagrama UML de classes. O tema foi 'Lançamento do iPhone 2007'.
 ## Diagrama do 'Lançamento do iPhone 2007'
 ```mermaid
classDiagram
    SistemaIphone  --|> InterfaceAparelhoTefonico
    SistemaIphone  --|> InterfaceNavegadorInternet
    SistemaIphone  --|> InterfaceReprodutorMusical
    TesteIphone --|> SistemaIphone
   class TesteIphone{
    + main(args : String[])  void

   }
    class InterfaceAparelhoTefonico{
      + IniciarCorreioVozA() void
      + AtenderA() void
      + LigaA(String nome) void
    }
    class InterfaceNavegadorInternet{
      +AtualizarPaginaN() void
      + AdicionarNovaAbaN() void
      +ExibirPaginaN(String nome) void

    }
    class InterfaceReprodutorMusical{
      +TocarR()void
      +PausarR() void
      +SelecionarMusicaR(String nome) void
    }
```
