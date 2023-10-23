# Cilindro de Gás 
Implemente a classe do diagrama abaixo utilizando o conceito de encapsulamento.

  ### CilindroGas
  
  -idCilindro: int
  
  -capacidadeMaxima: float
  
  -capacidadeAtual: float
 
  -qtdeUltimoConsumo: float

  +registrarConsumo(double qtde): boolean



## Atributos:

capacidadeMaxima: Armazena a quantidade máxima de gás que cabe no cilindro.

capacidadeAtual: Armazena a quantidade de gás presente no cilindro.

qtdeUltimoConsumo: Armazena a quantidade de gás que foi retirado no cilindro no último consumo.

## Métodos:

#### registrarConsumo():

Armazena a quantidade recebida no parâmetro no atributo qtdeUltimoConsumo e debita da
capacidade atual do cilindro.

A capacidade atual do cilindro não pode ficar negativo. Se a operação acima for realizada, retornar
true; senão, retornar false.

#### Observações:

Um objeto da classe CilindroGas deve ser inicializado com o atributo qtdeUltimoConsumo zerado
e o atributo capacidadeAtual igual a capacidadeMaxima.

Os atributos capacidadeAtual e qtdeUltimoConsumo só podem ser alterados pelos métodos
registrarConsumo().

### 2. Implemente uma aplicação para:

a) Armazenar em um array 3 objetos da classe CilindroGas com a capacidade máxima de 50,
60 e 70 unidade de gás, respectivamente.

b) Receber e registrar 2 consumos para o primeiro cilindro do array.

c) Receber e registrar 3 consumos para o segundo cilindro do array. Um dos consumos deve se de
100 unidades de gás.

d) Mostrar o identificador, a capacidade atual e a quantidade do último consumo de todos os
cilindros.

e) Mostrar a capacidade total (com base na capacidade atual) dos cilindros.
Obs.: Os itens “b” e “c” devem testar se a operação pode ser realizada.
