<h1 align="center">Diagrama e a Proposta</h1>

O diagrama representa um modelo de classes UML para um sistema de encomendas. 

A classe `Encomenda` possui uma relação de 1 para 1 com a classe abstrata `Conteudo`, que define a estrutura base para um conteúdo de encomenda. 

As classes `Caixa` e `Item` são subclasses de `Conteudo`, representando os tipos específicos de conteúdo. 

A classe `Item` tem uma relação de agregação com a classe `Caixa`, indicando que um `Item` pode estar dentro de uma `Caixa`. 

O diagrama demonstra que uma encomenda pode conter um ou mais conteúdos, que podem ser caixas ou itens.

![](./docs/diagram.jpg?raw=true "Diagrama")
