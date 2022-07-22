# Integrantes
  - André Almeida
  - Jonathan Felix

# Descrição

Nesse exercício de Java você vai precisar usar os conhecimentos aprendidos para  auxiliar uma empresa a desenvolver um simulador de Tráfego.

O sistema ainda está na sua fase mais inicial, portanto ainda não há controle de direção e nem de colisão, os carros se locomovem de forma aleatória pela tela. Você não precisa se preocupar com isso, a empresa já está trabalhando nestes requisitos.

Sua missão é auxilia-los no deslocamento simultâneo dos carros em tela. Auxilie na implementação dos requisitos abaixo listados. Deixe o código bem explicado, detalhando o motivo de uso de cada recurso. Eles não possuem nenhum conhecimento de programação multithread e contam com sua ajuda para aprender.

## Regras do sistema:
* A fábrica produz 50L de combustível a cada 30 segundos
* Somente um carro pode ser abastecido por vez, cada carro leva 5 segundos para ser abastecido
* Se a fábrica está sem combustível, os carros deve ficar aguardando e serem atendidos um por vez 
* Quando um carro está sem combustível ele deve ser desenhado com um "x" na tela (recurso já implementado)
* Cada carro deve permanecer se locomovendo em tela (método mover() para locomoção já implementado, você precisa utiliza-lo)
* Cada locomoção consome um tanto de combustível (já implementado no método mover())

## Você precisa ajustar:
* O desenho do carros - hoje o sistema não está conseguindo desenhar 
* A implementação da fábrica de combustível
* As condições para que nenhum carro seja abastecido simultaneamente e cada carro permaneça em espera pelo seu abastecimento
