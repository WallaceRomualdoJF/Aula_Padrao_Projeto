<h1 align="center">Diagrama e a Proposta</h1>
A imagem mostra um diagrama de classes UML. A classe `Pedido` possui uma associação de 0..1 com a classe abstrata `Funcionario`. A classe `Funcionario` é a classe pai para as classes `FuncionarioAtendente`, `FuncionarioChapeiro` e `FuncionarioCozinheiro`. Cada uma dessas classes possui uma associação de 1 para 1 com as classes `TipoPedidoRefrigerante`, `TipoPedidoHamburger` e `TipoPedidoBatata`, respectivamente. Todas essas classes herdam da interface `TipoPedido`. Um `TipoPedido` pode estar associado a 0 ou mais `Funcionarios`. 

![](./docs/diagram.jpg?raw=true "Diagrama")

<h2 align="center">Evidências de Execução (Captura de tela de sucesso dos testes)</h2>

![PedidoTest](https://github.com/AndreiCardozo/CloningNetflix/assets/67652151/145af0cc-e9b4-441b-93b5-7600709e5921)

<h1 align="center">Autores</h1>

<table align="center">
  <tr>
    <td align="center">
      <a href="https://github.com/AndreiCardozo">
        <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/67652151?v=4" width="100px;" alt=""/><br/><sub><b>Andrei Cardozo</b></sub>
      </a> <br/>
      <a href="https://github.com/AndreiCardozo" title="Andrei Cardozo"></a>
    </td>
      <td align="center">
      <a href="https://github.com/WallaceRomualdoJF">
        <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/67033167?v=4" width="100px;" alt=""/><br/><sub><b>Wallace Romualdo</b></sub>
      </a> <br/>
      <a href="https://github.com/WallaceRomualdoJF" title="Wallace Romualdo"></a>
    </td>
      <td align="center">
      <a href="https://github.com/Gpimentel7">
        <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/50156614?v=4" width="100px;" alt=""/><br/><sub><b>Gustavo Pimentel</b></sub>
      </a> <br/>
      <a href="https://github.com/Gpimentel7" title="Gustavo Pimentel"></a>
    </td>
