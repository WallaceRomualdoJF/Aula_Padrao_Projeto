<h1 align="center">Diagrama e a Proposta</h1>

A imagem representa um diagrama de classes UML, mostrando um padrão de projeto Abstract Factory. 

A interface `AbstractFactory` é implementada por duas classes concretas: `FabricaCarro` e `FabricaMoto`. 
 
A classe `Veiculo` tem uma relação de dependência com as interfaces `Motor` e `Cambio`. 
 
As interfaces `Motor` e `Cambio` são implementadas por classes concretas específicas para carros e motos, como `MotorCarro`, `CambioCarro`, `MotorMoto` e `CambioMoto`. 
 
A relação entre as classes `FabricaCarro` e `FabricaMoto` com as classes concretas de `Motor` e `Cambio` é representada por linhas tracejadas, indicando que a criação de objetos dessas classes é delegada para as fábricas.  
 
Esse padrão de projeto permite a criação de famílias de objetos relacionados, garantindo que objetos criados sejam compatíveis entre si. 

![](./docs/diagram.jpg?raw=true "Diagrama")



<h2 align="center">Evidências de Execução (Captura de tela de sucesso dos testes)</h2>

![Teste Terminal](https://github.com/WallaceRomualdoJF/Aula_Padrao_Projeto/assets/67652151/95c57480-c9c5-4b6a-ab2b-196d452f64b8)


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
