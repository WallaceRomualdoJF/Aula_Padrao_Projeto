<h1 align="center">Diagrama e a Proposta</h1>

O diagrama representa um padrão de projeto Abstract Factory. 

A interface `IServico` define os métodos `executar()` e `cancelar()`, que são implementados pelas classes concretas `ServicoVenda`, `ServicoEmissaoNotaFiscal` e `ServicoCadastro`.

A classe `ServicoFactory` é responsável por criar instâncias das classes concretas de serviço, através do método `obterServico()`.

Esse padrão de projeto permite a criação de famílias de objetos relacionados, garantindo que objetos criados sejam compatíveis entre si.

![](./docs/diagram.jpg?raw=true "Diagrama")
