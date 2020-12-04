# Design Patterns - Sistema de análise de arquivos
Projeto em Java desenvolvido para demonstrar o conhecimento sobre os Design Patterns mais usados.

A ideia do software é representar um sistema de análise de arquivos, que poderia efetuar alguma operação sobre os arquivos de acordo com seu tipo. As interações são demonstradas utilizando mensagens diretamente na classe Main.

Foram usados os patterns Abstract Factory, Chain of Responsibility e Builder.

## 

File é a interface da qual herdam todos os arquivos.

FileParser é a classe abstrata da qual herdam todos os "analisadores" de arquivo.

FileFactory é a interface da qual herdam todas as Factories que criam Files.

## Abstract Factory
Usado para a FileFactory. A aplicação deve ser capaz de analisar qualquer tipo de arquivo, então é usada uma interface comum para garantir que há um padrão nas assinaturas das factories que geram arquivos e um desacoplamento com relação à classe cliente, pois ela apenas precisa conhecer a interface File, não precisando importar suas implementações para usar objetos mais complexos.

## Chain of Responsibility
Usado para os FileParsers. A aplicação deve ser capaz de analisar os diferentes tipos de arquivo de formas diferentes e em uma ordem que seja otimizada para um problema específico. Assim, é possível escolher quais FileParsers serão executados e em qual ordem. Ao final da cadeia está sempre um Null Object, para poder tratar o caso de não ser possível analisar o arquivo.

## Builder
Usado no FileParserBuilder. A sintaxe das Chains of Responsibility podem se tornar um tanto quanto verbosas, então foi implementado um builder para que seja possível encadear os FileParsers de forma ainda mais desacoplada e com uma legibilidade melhor. Esta parte foi um pouco mais difícil de ser implementada e pode ter algum problema de eficiência, pois depende de métodos recursivos para adicionar os FileParsers sempre ao fim da sequência.
