# 🕰️ Reloginho — Projeto Java

## 📌 O que é / Objetivo do Projeto

O projeto **Reloginho** é uma aplicação Java que simula um relógio analógico, utilizando classes orientadas a objetos para representar elementos como **ponteiros** e o próprio **relógio**. O foco é demonstrar conceitos de orientação a objetos (OOP) e manipulação de tempo (horas, minutos e segundos) de maneira visual (em ASCII) no terminal.


## 🛠️ Tecnologias Utilizadas

- **Java SE 8+**
- Paradigma **Orientado a Objetos**
- Impressão de relógio em **ASCII Art**
- Execução via **linha de comando**

## 📦 Dependências Necessárias

Este projeto é puro Java, sem bibliotecas externas. As únicas dependências são:

- Java JDK (versão 8 ou superior)
- Terminal/Console para executar via `javac` e `java`

## ▶️ Como Rodar a Aplicação

1. **Compile os arquivos Java:**

```bash
javac Main.java Ponteiro.java Reloginho.java Texto.java
```

2. **Execute a aplicação:**

```bash
java Main
```
Você verá uma simulação do relógio no terminal sendo atualizada.



## ⚠️ Possíveis Problemas / Desafios Enfrentados

- O terminal pode não funcionar corretamente em IDEs que não interpretam bem o uso de `System.out.print("\033[H\033[2J")` (limpeza de tela).
- A IDE usada para o código foi a intellij
- A atualização do relógio pode ser limitada à performance do terminal.
- Falta de interface gráfica limita a usabilidade e visualização.

## 🔮 Próximos Passos

- ✅ Implementar testes automatizados (JUnit)
- ✅ Adicionar interface gráfica (JavaFX ou Swing)
- 🔄 Permitir ajuste de horário via input do usuário
- 🔄 Criar opção de relógio 24h/12h
- 🔄 Internacionalizar (tradução e adaptação para outros formatos)
