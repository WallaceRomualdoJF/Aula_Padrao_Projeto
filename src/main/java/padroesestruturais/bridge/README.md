O diagrama mostra um diagrama de classes UML, representando a relação entre veículos e combustíveis. A classe `Veículo`, uma classe abstrata, possui o método `calcularMediaCombustivel()`. Ela possui uma associação de 1 para 1 com a interface `Combustivel`, que possui o método `eficiencia()`. 

As classes `CarroPasseio`, `Caminhao` e `CarroCorrida` são subclasses de `Veiculo`. As classes `Gasolina`, `Diesel` e `Etanol` implementam a interface `Combustivel`. 

O diagrama mostra que um veículo pode ter um tipo de combustível, e um tipo de combustível pode ser utilizado por vários veículos. 



![](./docs/diagram.jpg?raw=true "Diagrama")
