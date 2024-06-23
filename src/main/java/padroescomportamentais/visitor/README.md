Diagrama de Classe em Java

O diagrama a seguir ilustra a estrutura de classes do projeto em Java. Ele foi criado utilizando a ferramenta Visual Paradigm e StarUML.

![](./docs/diagram.jpg?raw=true "Diagrama")

A imagem é um diagrama de classes UML. A classe "PessoaVisitor" implementa a interface "Visitor" e possui duas associações: "Gerente" (associação pontilhada) e "Engenheiro" (associação pontilhada). A classe "Engenheiro" também implementa a interface "Visitor" e possui uma associação pontilhada com a classe "Pessoa". A classe "Piloto" implementa a interface "Pessoa". A interface "Pessoa" também é implementada pela interface "Visitor". Finalmente, a classe "Gerente" é associada à interface "Visitor" por meio de uma associação pontilhada.
