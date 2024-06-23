<h1 align="center">Diagrama e a Proposta</h1>

A imagem representa um diagrama de classes UML que demonstra o padrão de projeto Builder.

A classe `Empresa` possui os atributos `cnpj`, `razaoSocial`, `nomeFantasia` e `telefone`. 
A classe `EmpresaBuilder` tem a responsabilidade de construir objetos da classe `Empresa`. 
Ela possui o método `build()`, que retorna um objeto `Empresa` completamente construído.

A relação entre as classes `Empresa` e `EmpresaBuilder` é representada por uma linha tracejada, indicando que `EmpresaBuilder` é responsável por construir objetos da classe `Empresa`.  
A seta pontilhada indica uma relação de dependência entre `EmpresaBuilder` e `Empresa`. 

Esse padrão de projeto é útil para construir objetos complexos, separando a construção dos objetos da sua representação. 
Ele facilita a criação de objetos complexos com diversas configurações. 

![](./docs/diagram.jpg?raw=true "Diagrama")



<h2 align="center">Evidências de Execução (Captura de tela de sucesso dos testes)</h2>

![Teste Builder](https://github.com/WallaceRomualdoJF/Aula_Padrao_Projeto/assets/67652151/97460d8b-cefe-49a4-91ae-317745e23747)



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
