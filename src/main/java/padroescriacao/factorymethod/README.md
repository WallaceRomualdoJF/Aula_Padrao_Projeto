<h1 align="center">Diagrama e a Proposta</h1>

O diagrama representa um padrão de projeto Abstract Factory. 

A interface `IServico` define os métodos `executar()` e `cancelar()`, que são implementados pelas classes concretas `ServicoVenda`, `ServicoEmissaoNotaFiscal` e `ServicoCadastro`.

A classe `ServicoFactory` é responsável por criar instâncias das classes concretas de serviço, através do método `obterServico()`.

Esse padrão de projeto permite a criação de famílias de objetos relacionados, garantindo que objetos criados sejam compatíveis entre si.

![](./docs/diagram.jpg?raw=true "Diagrama")


<h2 align="center">Evidências de Execução (Captura de tela de sucesso dos testes)</h2>

![EmissãoNotaFiscal](https://github.com/WallaceRomualdoJF/Aula_Padrao_Projeto/assets/67652151/2d85f5ea-a768-4e4a-ab83-f601de14de6d)
![ServicoFactoryTest](https://github.com/WallaceRomualdoJF/Aula_Padrao_Projeto/assets/67652151/360b7007-b644-48f6-912b-fb76a931d455)
![ServicoVendaTest](https://github.com/WallaceRomualdoJF/Aula_Padrao_Projeto/assets/67652151/abb75ec2-e6a8-4d36-829f-a7c88fcb919b)


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
</table>
