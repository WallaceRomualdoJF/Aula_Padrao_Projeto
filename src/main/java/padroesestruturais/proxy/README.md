<h1 align="center">Diagrama e a Proposta</h1>

O diagrama mostra a relação entre as classes `Veiculo`, `VeiculoRepository`, `VeiculoProxy`, `Chave` e `IVeiculo`.

- `Veiculo` implementa a interface `IVeiculo` e possui uma relação de agregação de 0..* com `VeiculoRepository`. 
- `VeiculoRepository` possui uma relação de associação de 1 para 1 com `Veiculo`.
- `VeiculoProxy` possui uma relação de associação de 1 para 1 com `Veiculo` e uma relação de associação de 1 para 1 com `Chave`.
- `IVeiculo` é uma interface e `Veiculo` a implementa. 

O diagrama sugere que `VeiculoProxy` é uma classe que encapsula `Veiculo` e `Chave` e pode ser utilizada para acessar `Veiculo` através de `Chave`. `VeiculoRepository` é uma classe que armazena `Veiculo` e pode ser utilizada para acessar `Veiculo` através de `VeiculoProxy` e `Chave`.

![](./docs/diagram.jpg?raw=true "Diagrama")
