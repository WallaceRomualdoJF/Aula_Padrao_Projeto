<h1 align="center">Diagrama e a Proposta</h1>

A imagem representa um diagrama de classes UML que demonstra o padrão de projeto Builder.

A classe `Empresa` possui os atributos `cnpj`, `razaoSocial`, `nomeFantasia` e `telefone`. 
A classe `EmpresaBuilder` tem a responsabilidade de construir objetos da classe `Empresa`. 
Ela possui o método `build()`, que retorna um objeto `Empresa` completamente construído.

A relação entre as classes `Empresa` e `EmpresaBuilder` é representada por uma linha tracejada, indicando que `EmpresaBuilder` é responsável por construir objetos da classe `Empresa`.  
A seta pontilhada indica uma relação de dependência entre `EmpresaBuilder` e `Empresa`. 

Esse padrão de projeto é útil para construir objetos complexos, separando a construção dos objetos da sua representação. 
Ele facilita a criação de objetos complexos com diversas configurações. 

![](./docs/diagram.jpg?raw=true "Diagrama")
