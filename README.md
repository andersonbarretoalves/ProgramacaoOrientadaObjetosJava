# Programação Orientada a Objetos com Java

---
## Percurso:
Aula 1: Porque usar?
Aula 2: Os Fundamentos
Aula 3: A estrutura
Aula 4: As relações

## Paradigma Estruturado Vs Orientado a Objetos
* Paradigma Estruturado foca em operações(funções) e dados
* Paradigma orientado a objeto foca em modelagem de entidades e nas interações entre estas
* Programação estruturado foca mais no "como fazer"
* Programação orientado a objeto foca mais no "o que fazer"

## Vantafens da Programação orientada a objeto
* Melhor coesão
* Melhor acoplamento
* Diminução do Gap semântico
* Coletor de lixo

---
### Definição:
A Orientação a Objeto é um paradigma de análise, projeto e programação
de sistemas de software baseado na composição e interação entre diversas
unidades de software chamadas de objetos.

### Fundamentos
* **Abstração:**
Processo pelo qual se isolam características de um objeto, considerando
os que tenham em comum certos grupos de objetos.
* **Reuso:**
Capacidade de criar novas unidades de código a partir de outras já existentes.
* **Encapsulamento:**
Capacidade de esconder complexidades e proteger dados.

---

## Estrutura básica da Orientação a Objeto
1. Apresentar os conceitos que criam as estruturas básicas da Orientação a Objeto
   * Classe
   * Atributo
   * Método
   * Objeto
   * Mensagem

### Classe
É uma estrutura que abstrai um conjunto de objetos com características
similares. Uma classe define o comportamento de seus objetos através de métodos
e os estados possíveis deste objetos através de atributos. Em outros termos,
uma classe descreve os serviços providos por seus objetos e quais informações
eles podem armazenar.

### Atributo
É o elemento de uma classe responsável por definir sua estrutura de dados.
O conjunto desdes será responsável por representar suas características e fará
parte dos objetos criados a partir da classe.

#### Atributo X Variável
* **Atributo:** o que é próprio e peculiar a alguém ou alguma coisa.
* **Variável:** sujeito a variações ou mudanças; que pode variar; incostante,
instável.

### Método
É uma porção de código (sub-rotina) o qual disponibilizada pela classe. Este é
executado quando é feito uma requisição a ele. Um método serve para identificar 
quais serviços, ações, que a classe oferece. Eles são responsáveis por definir
e realizar um determinado comportamento.

### Objeto
Um obejeto é a representação de um conceito/entidade que existe do mundo
real, que pode ser física (bola, carro, árvore, etc...) ou conceitual (viagem, 
estoque, compras, etc...) e possui um significado bem definido para um 
determinado software. Para esse conceito/entidade, deve ser definida inicialmente
uma classe a partir da qual posteriormente serão instanciados objetos distintos.

### Mensagem
É o processo de ativação de um método de um objeto. isto ocorre quando uma
requisição (chamada) a esse método é realizada, assim disparando a execução de
seu comportamento descrito por sua classe. Pode também ser direcionada diretamente
à classe, caso a requisição seja a um método estático.

---

## Herança
É o relacionamento entre classes em que uma classe chamada de subclasse
(classe filha, classe derivada) é uma extensão, um subtipo, de outra classe
chamada de superclasse (classe pai, classe mãe, classe base). Devido a isso, 
a subclasse consegue reaproveitar os atributos e métodos dela. Além dos que
venham a ser herdados, a subclasse pode definir seus próprios membros.

**Tipos de Herança:**<br>
* Simples:<br>
A classe filha tem só classe mãe.<br>
Ex: Funcionario <-- (Gerente, vendedor, Faxineiro, etc...).
* Múltipla:<Br>
A classe filha tem uma ou mais classes mães.<br>
Ex:Estagiário --> (Estudante, Funcionário).<br>
Obs: no java e C# não tem herança Múltipla, já no Python e C++ tem.
* Upcast:<br>
Ex: `A a = new B()`
* Downlast:<br>
EX: `B a = (b) new A()`
* Polimorfismo:<br>
A mesma ação, se comportando diferente.<br>
Ex: pagamento <-- (Boleto, Credito, Debito, pix)
* Sobrescrita:<br>
A mesma ação, podendo se comportar doferente.<br>
Ex: Conta `double saldo` `exibirSaldo()` <-- (Corrente, Poupanca `exibirSaldo()`, 
Especial `exibirSaldo()`, Universitaria).