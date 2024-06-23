<h1 align="center">Diagrama e a Proposta</h1>

O diagrama mostra um diagrama de classes UML, representando a relação entre veículos e combustíveis. A classe `Veículo`, uma classe abstrata, possui o método `calcularMediaCombustivel()`. Ela possui uma associação de 1 para 1 com a interface `Combustivel`, que possui o método `eficiencia()`. 

As classes `CarroPasseio`, `Caminhao` e `CarroCorrida` são subclasses de `Veiculo`. As classes `Gasolina`, `Diesel` e `Etanol` implementam a interface `Combustivel`. 

O diagrama mostra que um veículo pode ter um tipo de combustível, e um tipo de combustível pode ser utilizado por vários veículos. 



![](./docs/diagram.jpg?raw=true "Diagrama")


<h2 align="center">Evidências de Execução (Captura de tela de sucesso dos testes)</h2>

![CaminhaoTest](https://github.com/WallaceRomualdoJF/Aula_Padrao_Projeto/assets/67652151/a01a10f6-7e44-4085-9c34-8b36797f044c)
![CarroCorridaTest](https://github.com/WallaceRomualdoJF/Aula_Padrao_Projeto/assets/67652151/0ad75e37-677d-4c03-b526-d36855f80b6c)
![CarroPasseio](https://github.com/WallaceRomualdoJF/Aula_Padrao_Projeto/assets/67652151/0c622504-0bce-40d4-a435-bd27f9cd072f)


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
