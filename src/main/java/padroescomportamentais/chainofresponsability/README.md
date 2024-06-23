A imagem mostra um diagrama de classes UML. A classe `Pedido` possui uma associação de 0..1 com a classe abstrata `Funcionario`. A classe `Funcionario` é a classe pai para as classes `FuncionarioAtendente`, `FuncionarioChapeiro` e `FuncionarioCozinheiro`. Cada uma dessas classes possui uma associação de 1 para 1 com as classes `TipoPedidoRefrigerante`, `TipoPedidoHamburger` e `TipoPedidoBatata`, respectivamente. Todas essas classes herdam da interface `TipoPedido`. Um `TipoPedido` pode estar associado a 0 ou mais `Funcionarios`. 

![](./docs/diagram.jpg?raw=true "Diagrama")
