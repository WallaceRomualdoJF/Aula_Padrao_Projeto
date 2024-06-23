<h1 align="center">Diagrama e a Proposta</h1>

O diagrama mostra a relação entre as classes `Veiculo`, `VeiculoRepository`, `VeiculoProxy`, `Chave` e `IVeiculo`.

- `Veiculo` implementa a interface `IVeiculo` e possui uma relação de agregação de 0..* com `VeiculoRepository`. 
- `VeiculoRepository` possui uma relação de associação de 1 para 1 com `Veiculo`.
- `VeiculoProxy` possui uma relação de associação de 1 para 1 com `Veiculo` e uma relação de associação de 1 para 1 com `Chave`.
- `IVeiculo` é uma interface e `Veiculo` a implementa. 

O diagrama sugere que `VeiculoProxy` é uma classe que encapsula `Veiculo` e `Chave` e pode ser utilizada para acessar `Veiculo` através de `Chave`. `VeiculoRepository` é uma classe que armazena `Veiculo` e pode ser utilizada para acessar `Veiculo` através de `VeiculoProxy` e `Chave`.

![](./docs/diagram.jpg?raw=true "Diagrama")

<h2 align="center">Evidências de Execução (Captura de tela de sucesso dos testes)</h2>
![VeiculoProxyTest](https://github.com/WallaceRomualdoJF/Aula_Padrao_Projeto/assets/67652151/c359e943-e5ce-49ad-a9ba-41789d7ba628)


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
