O diagrama representa o padrão de projeto Decorator. A classe `Carro` é uma interface que define os métodos para um carro. A classe `Lancer` é uma implementação da interface `Carro`. A classe abstrata `CarroDecorator` implementa a interface `Carro` e possui um atributo privado da classe `Carro`. As classes `Intake`, `FiltroEsportivo` e `KitGas` são classes concretas que estendem a classe `CarroDecorator`, adicionando funcionalidades adicionais ao carro.

![](./docs/diagram.jpg?raw=true "Diagrama")
