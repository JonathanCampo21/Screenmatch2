# 🎬 ScreenMatch

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em_Desenvolvimento-green?style=for-the-badge)

O **ScreenMatch** é um projeto desenvolvido em Java com o objetivo de modelar um sistema de streaming de filmes e séries. O foco principal da aplicação é colocar em prática os pilares da **Programação Orientada a Objetos (POO)**.

## 🔨 Funcionalidades

- **Cadastro de Títulos:** Representação de Filmes e Séries com atributos específicos.
- **Avaliação:** Sistema de notas para calcular a média de avaliação dos títulos.
- **Cálculo de Maratona:** Conversão de duração de temporadas e episódios para calcular o tempo total necessário para assistir a uma série ou lista de filmes.
- **Recomendação:** Filtragem de conteúdo baseada em classificações (estrelas) ou total de visualizações.

## 📚 Conceitos Aprendidos e Aplicados

Durante o desenvolvimento deste projeto, foram aplicados conceitos fundamentais do Java e da POO:

- **Abstração:** Criação da classe mãe `Titulo` para generalizar características comuns.
- **Herança:** Classes `Filme` e `Serie` herdando atributos e métodos de `Titulo`.
- **Encapsulamento:** Proteção dos atributos com modificadores de acesso (`private`) e uso de Getters e Setters.
- **Polimorfismo:** Capacidade de tratar diferentes objetos (Filmes e Séries) de forma genérica (como `Titulo` ou `Classificavel`).
- **Interfaces:** Implementação da interface `Classificavel` para padronizar o comportamento de itens que podem receber uma nota ou classificação.

## 📂 Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:

- `br.com.jonathan.screenmatch.modelos`: Contém as classes que representam os objetos do domínio (`Filme`, `Serie`, `Episodio`, `Titulo`).
- `br.com.jonathan.screenmatch.calculos`: Contém as classes de regras de negócio (`CalculadoraDeTempo`, `FiltroRecomendacao`, interface `Classificavel`).

