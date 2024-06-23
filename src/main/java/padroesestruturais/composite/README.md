<h1 align="center">Diagrama e a Proposta</h1>

O diagrama representa um modelo de classes UML para um sistema de encomendas. 

A classe `Encomenda` possui uma relação de 1 para 1 com a classe abstrata `Conteudo`, que define a estrutura base para um conteúdo de encomenda. 

As classes `Caixa` e `Item` são subclasses de `Conteudo`, representando os tipos específicos de conteúdo. 

A classe `Item` tem uma relação de agregação com a classe `Caixa`, indicando que um `Item` pode estar dentro de uma `Caixa`. 

O diagrama demonstra que uma encomenda pode conter um ou mais conteúdos, que podem ser caixas ou itens.

![](./docs/diagram.jpg?raw=true "Diagrama")


<h2 align="center">Evidências de Execução (Captura de tela de sucesso dos testes)</h2>

![EncomendaTest](https://github.com/WallaceRomualdoJF/Aula_Padrao_Projeto/assets/67652151/f885f499-6d1e-4942-8ef2-e3b0cf977e51)


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
