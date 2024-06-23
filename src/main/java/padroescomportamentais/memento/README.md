A imagem é um diagrama de classes UML. A classe `Veiculo` está associada à classe `VeiculoEstado`. A classe `VeiculoEstado` é uma interface implementada por diversas classes, incluindo `VeiculoEstadoTransferido`, `VeiculoEstadoRoubado`, `VeiculoEstadoQuitado`, `VeiculoEstadoApreendido`, `VeiculoEstadoDestruido` e `VeiculoEstadoLicenciado`. A classe `Veiculo` pode ter 0 ou mais `VeiculoEstado`. A relação entre `Veiculo` e `VeiculoEstado` é 1 para muitos. 

![](./docs/diagram.jpg?raw=true "Diagrama")
