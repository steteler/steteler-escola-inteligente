# Escola Inteligente!

Boas-vindas ao repositório do exercício Escola Inteligente!

Para realizar o exercício, atente-se a cada passo descrito a seguir e se tiver **qualquer dúvida**, nos envie no _Slack_ da turma! #vqv 🚀

Aqui, você vai encontrar os detalhes de como estruturar o desenvolvimento do seu exercício a partir desse repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

## Termos e acordos
Ao iniciar este exercício, você concorda com as diretrizes do [Código de Conduta e do Manual da Pessoa Estudante da Trybe](https://app.betrybe.com/learn/student-manual/codigo-de-conduta-da-pessoa-estudante).

## Entregáveis

<details>
  <summary>🤷🏽‍♀️ Como entregar</summary><br />

Para entregar o seu exercício, você deverá criar um _Pull Request_ neste repositório.

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://app.betrybe.com/learn/course/5e938f69-6e32-43b3-9685-c936530fd326/module/fc998c60-386e-46bc-83ca-4269beb17e17/section/fe827a71-3222-4b4d-a66f-ed98e09961af/day/1a530297-e176-4c79-8ed9-291ae2950540/lesson/2b2edce7-9c49-4907-92a2-aa571f823b79) e nosso [Blog - Git & GitHub](https://blog.betrybe.com/tecnologia/git-e-github/) sempre que precisar!
</details>

<details>
  <summary>👨‍💻 O que deverá ser desenvolvido</summary><br />

A Escola Inteligente é uma aplicação Java que interage através do terminal apresentando algumas
funcionalidades para determinados departamentos:

- A funcionalidade de calcular a idade de uma pessoa estudante em dias para o departamento Pessoa
  Estudante.
- A funcionalidade de calcular a média das notas de uma pessoa estudante para o departamento
  Secretaria.
- A funcionalidade de gerar um relatório de controle de acesso das pessoas estudantes na escola para
  o departamento Portaria.

</details>

## Orientações

<details>

   <summary><strong>‼ Antes de começar a desenvolver </strong></summary>

<!-- 🤔 [HS] Aqui, deve-se adicionar os comandos mais utilizados e orientações de como preparar o repositório. Atualize o nome do repositório do exercício nas instruções a seguir -->

1. Clone o repositório

- Use o comando: `git clone <url do repositório>`
- Entre na pasta do repositório que você acabou de clonar:
    - `cd <nome do repositório>`

2. Instale as dependências

    - `mvn install`  

3. Crie uma branch a partir da branch `main`

- Verifique que você está na branch `main`
    - Exemplo: `git branch`
- Se você não estiver, mude para a branch `main`
    - Exemplo: `git checkout main`
- Agora, crie uma branch à qual você vai submeter os `commits` do seu exercício:
    - Você deve criar uma branch no seguinte formato: `nome-sobrenome-nome-do-exercício`;
    - Exemplo: `git checkout -b maria-soares-lessons-learned`

4. Crie na raiz do exercício os arquivos que você precisará desenvolver:

- Verifique que você está na raiz do exercício:
    - Exemplo: `pwd` -> o retorno vai ser algo tipo _/Users/maria/code/**sd-0x-project-lessons-learned**_
- Crie os arquivos index.html e style.css:
    - Exemplo: `touch index.html style.css`

5. Adicione as mudanças ao _stage_ do Git e faça um `commit`

- Verifique que as mudanças ainda não estão no _stage_:
    - Exemplo: `git status` (devem aparecer listados os novos arquivos em vermelho)
- Adicione o novo arquivo ao _stage_ do Git:
    - Exemplo:
        - `git add .` (adicionando todas as mudanças - _que estavam em vermelho_ - ao stage do Git)
        - `git status` (devem aparecer listados os arquivos em verde)
- Faça o `commit` inicial:
    - Exemplo:
        - `git commit -m 'iniciando o exercício. VAMOS COM TUDO :rocket:'` (fazendo o primeiro commit)
        - `git status` (deve aparecer uma mensagem tipo _nothing to commit_ )

6. Adicione a sua branch com o novo `commit` ao repositório remoto

- Usando o exemplo anterior: `git push -u origin maria-soares-lessons-learned`

7. Crie um novo `Pull Request` _(PR)_

- Vá até a página de _Pull Requests_ do [repositório no GitHub](https://github.com/tryber/sd-0x-project-lessons-learned/pulls)
    - Clique no botão verde _"New pull request"_
    - Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
- Coloque um título para o seu _Pull Request_
    - Exemplo: _"Cria tela de busca"_
- Clique no botão verde _"Create pull request"_

- Adicione uma descrição para o _Pull Request_, um título nítido que o identifique, e clique no botão verde _"Create pull request"_

 <img width="1335" alt="Exemplo de pull request" src="https://user-images.githubusercontent.com/42356399/166255109-b95e6eb4-2503-45e5-8fb3-cf7caa0436e5.png">

- Volte até a [página de _Pull Requests_ do repositório](https://github.com/tryber/sd-0x-project-lessons-learned/pulls) e confira que o seu _Pull Request_ está criado

</details>

<details>

<summary><strong>⌨️ Durante o desenvolvimento</strong></summary>

Faça `commits` das alterações que você fizer no código regularmente, pois assim você garante visibilidade para o time da Trybe e treina essa prática para o mercado de trabalho :) ;

- Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto;
- Os comandos que você utilizará com mais frequência são:
    - `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_;
    - `git add` _(para adicionar arquivos ao stage do Git)_;
    - `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_;
    - `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_;
    - `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_.

</details>

<details>
<summary><strong>🎛 Checkstyle</strong></summary>

Para garantir a qualidade do código, vamos utilizar neste exercício o `Checkstyle`. Assim o código estará alinhado com as boas práticas de desenvolvimento, sendo mais legível e de fácil manutenção! Para poder rodar o `Checkstyle` certifique-se de ter executado o comando `mvn install` dentro do repositório.

Para rodá-los localmente no repositório, execute os comandos abaixo:

```bash
mvn checkstyle:check
```

Se a análise do `Checkstyle` encontrar problemas no seu código, tais problemas serão mostrados no seu terminal. Se não houver problema no seu código, nada será impresso no seu terminal.

Você pode também instalar o plugin do `Checkstyle` na sua `IDE`. Para isso, volte na primeira seção do conteúdo.

⚠️ **PULL REQUESTS COM ISSUES NO `Checkstyle` NÃO SERÃO AVALIADAS. ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠️

</details>

<details>
<summary><strong>🛠 Testes</strong></summary>

<!-- 🤔 Escrever as instruções sobre os testes.-->

Para executar todos os testes basta rodar o comando:
```bash
mvn test
```

Para executar apenas uma classe de testes:
```bash
mvn test -Dtest="TestClassName"
```

</details>

## Requisitos

<details>
<summary><strong>🖥️ Antes de Iniciar</strong></summary>
O projeto já contém a classe App com o método `main`
implementado, onde é exibido um menu que contém as funcionalidades do sistema.

```java
public class App {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    System.out.println("Boas vindas a Escola Inteligente!");
    System.out.println("Escolha um departamento:");
    System.out.println("1 - Pessoa Estudante - Calcular idade em dias");
    System.out.println("2 - Secretaria - Calcular a média das notas");
    System.out.println("3 - Portaria - Gerar relatório de controle de acesso");

    short menuOption = 0;
    Scanner scanMenu = new Scanner(System.in);
    menuOption = scanMenu.nextShort();

    switch (menuOption) {
      case 1:
        PessoaEstudante.coletarInformacoes();
        break;
      case 2:
        Secretaria.coletarInformacoes();
        break;
      case 3:
        Portaria.coletarInformacoes();
        break;
      default:
        System.out.println("Opção Inválida.");
    }

    scanMenu.close();
  }
} 
```

A partir da opção selecionada, a aplicação coletará as informações necessárias para execução da
funcionalidade do Departamento, e ambas precisarão ser implementadas, tanto a coleta de informações,
quanto a funcionalidade, conforme detalhado nos requisitos abaixo.

As classes para cada departamento já estão criadas, são elas `PessoaEstudante`, `Portaria` e `Secretaria`.
</details>



### 1 - Calcular a idade em dias para o departamento Pessoa Estudante

<details>
  <summary>Descrição</summary>

Implemente os métodos `coletarInformacoes` e `calcularIdadeEmDias` contidos na
classe `PessoaEstudante`.
O método `coletarInformacoes` realiza a leitura do nome da pessoa estudante no console Java e mais três valores: anos, meses e dias.
Já o método `calcularIdadeEmDias`, recebe 3 argumentos do tipo `int`: anos, meses e dias. Esse método deve calcular e retornar a idade da pessoa estudante em dias, e esse retorno deve ser do tipo `int`. Em outras palavras:

1. Ao iniciar a aplicação e a opção 1 for escolhida, o método `coletarInformacoes` da
   classe `PessoaEstudante` será chamado.
2. Os dados nome e idade atual em quantidade de anos, meses e dias decorridos desde seu aniversário, deverão ser informados.
3. O método `calcularIdadeEmDias` deve calcular e retornar a idade da pessoa usuária em dias.

   **Para simplificar nosso cálculo, desconsidere anos bissextos, ou seja, considere que cada ano tem 365 dias. Considere também que todos os meses têm 30 dias.**

*Lembre-se* de que você deve fazer a conversão da entrada da pessoa usuária para inteiro para poder realizar o cálculo, pois o método `scanner.next()` lê a entrada da pessoa usuária e converte para `String`.

Suponha que a entrada seja:

  ```bash
  Boas vindas a Escola Inteligente!
  Escolha um departamento:
  1 - Pessoa Estudante - Calcular idade em dias
  2 - Secretaria - Calcular a média das notas
  3 - Portaria - Gerar relatório de controle de acesso
  1
  Qual o nome da Pessoa Estudante?
  Carla
  Qual a sua idade em anos, meses e dias?
  anos:
  32
  meses:
  2
  dias:
  29
  ```

Aqui nós lemos as entradas da pessoa estudante, fizemos as devidas conversões, passamos a quantidade de anos, de meses e de dias para o método `calcularIdadeEmDias(32, 2, 29)`, e a saída do método `calcularIdadeEmDias(32, 2, 29)` deve ser `11769`. Ou seja, a saída final do programa deve
ser similar a essa:

  ```bash
  A idade de Carla em dias é 11769.
  ```

</details>

## 2 - Calcular a média das notas de uma pessoa estudante

<details>
  <summary>Descrição</summary>

Implemente os métodos `coletarInformacoes` e `calcularMedia` contidos na classe `Secretaria`. 

O método `coletarInformacoes` realiza a leitura do nome da pessoa estudante do console
Java e mais quatro valores que serão referentes às notas de 4 avaliações. Já o método `calcularMedia`, recebe 4 argumentos do tipo `float` ou `double`: nota1, nota2, nota3 e nota4. Esse método deve calcular e retornar a média, e esse retorno deve ser do tipo `float` ou `double`. Em outras palavras:

1. Ao iniciar a aplicação e a opção 2 for escolhida, o método `coletarInformacoes` da
   classe `Secretaria` será chamado.
2. Os dados nome e quatro valores decimais das notas deverão ser informados;
3. O método `calcularMedia` deve calcular e retornar a média dos valores inseridos pela pessoa usuária.

*Lembre-se* de que você deve fazer a conversão da entrada da pessoa usuária para `float` ou `double` para poder realizar o cálculo, pois o método `scanner.next()` lê a entrada da pessoa usuária e converte para `String`.

Suponnha que a entrada seja:

```bash
Boas vindas a Escola Inteligente!
Escolha um departamento:
1 - Pessoa Estudante - Calcular idade em dias
2 - Secretaria - Calcular a média das notas
3 - Portaria - Gerar relatório de controle de acesso
2
Qual o nome da Pessoa Estudante?
Carla
Entre com as notas das provas:
Avaliação 1:
9.85
Avaliação 2:
9.58
Avaliação 3:
9.90
Avaliação 4:
8.75
```

Aqui nós lemos as entradas da pessoa estudante, fizemos as devidas conversões, passamos as notas das avaliações para o método `calcularMedia(9.85, 9.58, 9.90, 8.75)`, e a saída do método `calcularMedia(9.85, 9.58, 9.90, 8.75)` deve ser `9.52`. Ou seja, a saída final do programa deve ser similar a essa:

```bash
A média das notas de Carla é 9.52
```

</details>

## 3 - Realizar o controle de acesso e a emissão do relatório.

<details>
  <summary>Descrição</summary>

Implemente os métodos `coletarInformacoes` e `emitirRelatorio` contidos na
classe `Portaria`.

O método `coletarInformacoes` realiza a leitura da idade de todas as pessoas estudantes que acessam a escola pela portaria. Já o método `emitirRelatorio` informa o total de pessoas estudantes divididas nas categorias Ensino Fundamental I, Ensino Fundamental II e Ensino Médio. Em outras palavras:

1. Ao iniciar a aplicação e a opção 3 for escolhida, o método `coletarInformacoes` da
   classe `Portaria`será chamado.
2. **Inserir idade das pessoas estudantes no sistema:** essa etapa se repete até que a opção de finalizar acessos seja escolhida. A idade das pessoas estudantes deve ser armazenada em um array de tamanho dinâmico, já que não sabemos quantas pessoas estudantes entrarão na escola. *Dica:* utilize a classe `ArrayList` do Java para a criação e manipulação de arrays de tamanho dinâmico.
   Para mais informações você pode consultar o site da [W3Schools](https://www.w3schools.com/java/java_arraylist.asp) ou [JavaPoint](https://www.javatpoint.com/java-arraylist), ou então verificar a documentação da Oracle.

3. **Finalizar o sistema e mostrar o relatório:** nessa etapa, o laço de repetição deve ser terminado e então o relatório deve ser impresso no console. O relatório deve conter o total de pessoas estudantes que acessaram a escola através da portaria, e também o número de pessoas estudantes do ensino fundamental I (de 6 a 10 anos), o número de pessoas estudantes do ensino fundamental II (de 11 a 14 anos) e o número de pessoas estudantes do ensino médio (a partir de 15 anos). O relatório também deve calcular, em relação ao total de pessoas estudantes, a porcentagem delas por categoria de ensino.

A imagem abaixo mostra o fluxo que o programa deve seguir:

![SistemaFluxograma](/images/controle-acesso.png)

- A coleta de informações do departamento Portaria deve ter o formato:

```bash
Entre com o número correspondente à opção desejada:
1 - Registrar o acesso de pessoa estudante
2 - Finalizar o acesso e emitir o relatório
```

Se a opção 1 for escolhida, então a mensagem `Entre com a idade da pessoa estudante:` será impressa no console. Em seguida, após inserir a idade da pessoa estudante e pressionar enter, aparecerá uma das mensagens listadas abaixo:

- `Pessoa estudante do Ensino Fundamental I, catraca liberada!`: se a idade da pessoa inserida for menor ou igual a 10 anos.

- `Pessoa estudante do Ensino Fundamental II, catraca liberada!`: se a idade da pessoa inserida for entre 11 e 14 anos.

- `Pessoa estudante do Ensino Médio, catraca liberada!`: se a idade da pessoa inserida for maior ou igual a 15 anos.

Depois que a mensagem for impressa, então deverá retornar ao estado inicial do menu. Supondo que a idade da primeira pessoa seja 18 anos, um exemplo do conteúdo do console depois de inserir a idade da primeira pessoa cliente será:

```bash
Entre com o número correspondente à opção desejada:
1 - Registrar o acesso de pessoa estudante
2 - Finalizar o acesso e emitir o relatório
1
Informe a idade da pessoa estudante:
12
Pessoa estudante do Ensino Fundamental II, catraca liberada!
Entre com o número correspondente à opção desejada:
1 - Registrar o acesso de pessoa estudante
2 - Finalizar o acesso e emitir o relatório
```

Esse ciclo se repete até a opção 2 ser escolhida, o que indica que os acessos foram finalizados e o relatório deve ser emitido.

⚠️🔴**DICA: use uma variável do tipo `short` para armazenar a opção escolhida, já que é um valor numérico de pequena escala.** 🔴⚠️

O relatório deve ser impresso no console quando a opção 2 for selecionada. Supondo que 200 pessoas estudantes acessaram a escola, o relatório deve conter as seguintes informações:

- Número total de pessoas estudantes que entraram na escola: nesse caso, esse valor deverá ser 200.

- Número de pessoas estudantes do ensino fundamental I que entraram na escola: supondo que, das 200 pessoas, 40 tinham menos de 10 anos, então no relatório esse valor deverá ser 40.

- Número de pessoas estudantes do ensino fundamental II que entraram na escola: supondo que, das 200 pessoas, 100 tinham entre 11 e 14 anos, então esse valor deverá ser 100.

- Número de pessoas estudantes do ensino médio que entraram na escola: supondo que, das 200 pessoas, 60 tinham 15 anos ou mais, então esse valor deverá ser 60.

O relatório também deve calcular a porcentagem de pessoas em cada categoria em relação ao total de pessoas. Ainda seguindo a suposição anterior, o total de acessos à escola foi de 200 pessoas estudantes, então o relatório na parte dos números percentuais deve apresentar:

- Percentual de pessoas estudantes do ensino fundamental I: supondo que, das 200 pessoas, 40 tinham menos de 10 anos, então no relatório esse valor deverá ser 20.0%.

- Número de pessoas estudantes do ensino fundamental II que entraram na escola: supondo que, das 200 pessoas, 100 tinham entre 11 e 14 anos, então esse valor deverá ser 50.0%.

- Número de pessoas estudantes do ensino médio que entraram na escola: supondo que, das 200 pessoas, 60 tinham 15 anos ou mais, então esse valor deverá ser 30.0%.

Para essa suposição, a saída do relatório deve ser similar à saída abaixo:

```bash
----- Quantidade -----
Ensino Fundamental I: 40
Ensino Fundamental II: 100
Ensino Médio: 60

----- Percentual -----
Ensino Fundamental I: 20.0%
Ensino Fundamental II: 50.0%
Ensino Médio: 30.0%

TOTAL: 200
```

### Restrições

- O valor percentual deve ter duas casas decimais, exceto se for zero, então pode ser apenas uma casa decimal, como exposto no exemplo acima.
- Caso a opção inserida seja um valor diferente de 1 ou de 2, a mensagem `Entre com uma opção válida!` deve ser impressa no console, e o menu voltar para o estado inicial.

⚠️🔴**DICA: para fazer com que o valor do tipo `float` ou `double` tenha apenas duas casas decimais, pesquise sobre a classe `DecimalFormat`.** 🔴⚠️

</details>

<details>
<summary><strong> 🗣 Nos dê feedbacks sobre o exercício!</strong></summary>

Ao finalizar e submeter o exercício, não se esqueça de avaliar sua experiência preenchendo o [formulário](https://be-trybe.typeform.com/to/ZTeR4IbH#cohort_hidden=CH1&template=betrybe/java-0x-exercicio-escola-inteligente).
**Leva menos de 3 minutos!**

</details>

---

<!-- mdi versão 1.0 exercício como projeto ⚠️ não exclua esse comentário -->