# Multi Conversor (Programação de Dispositivos Móveis)

![Plataforma](https://img.shields.io/badge/Plataforma-Android-3DDC84.svg?style=for-the-badge&logo=android)
![Linguagem](https://img.shields.io/badge/Feito%20com-Kotlin-0095D5.svg?style=for-the-badge&logo=kotlin)

## 📖 Sobre o Projeto

Este projeto é uma aplicação utilitária de conversão de unidades para Android, desenvolvida no âmbito da unidade curricular de **Programação de Dispositivos Móveis (PDM)**.

O objetivo principal foi construir uma aplicação nativa moderna e extensível, utilizando **Kotlin** e **Jetpack Compose**. A aplicação destaca-se pela sua navegação fluida entre categorias e pela implementação de uma arquitetura flexível que permite converter tanto bases numéricas (para informática) como unidades físicas.

## ✨ Funcionalidades

A aplicação dispõe de um sistema de menus que organiza as conversões em duas categorias principais:

### 1. Bases Numéricas (Informática)
Conversões precisas entre os sistemas mais utilizados em computação:
* **Decimal** ↔ **Binário** (Base 2)
* **Decimal** ↔ **Hexadecimal** (Base 16)
* **Decimal** ↔ **Octal** (Base 8)
* Suporte para visualização de letras em Hexadecimal (A-F).

### 2. Unidades Físicas
Conversões práticas para o dia-a-dia:
* **Massa:** Quilogramas (kg) ↔ Gramas (g).
* **Distância:** Quilómetros (km) ↔ Metros (m).

### Outras Características:
* **Menu de Navegação:** Ecrã inicial intuitivo para seleção de categoria.
* **Tratamento de Erros:** Validação de entrada (impede cálculos com caracteres inválidos).
* **Limpeza Automática:** O input é limpo automaticamente ao mudar de tipo de conversão.
* **Feedback Visual:** Apresentação clara dos resultados em cartões destacados.

## 🎨 Design e UI

O projeto segue as diretrizes do **Material Design 3**, caracterizado por:
* **Consistência Visual:** Uso uniforme de cores do tema (Primary/Purple) em botões, ícones e títulos.
* **Componentes Nativos:** Utilização de `ExposedDropdownMenu` para seleção de opções e `OutlinedTextField` para entrada de dados.
* **Navegação:** Botão de "Voltar" nativo na barra superior para uma experiência de utilizador fluida.
* **Layout Adaptável:** Interface limpa que foca a atenção do utilizador na tarefa de conversão.

## 🛠️ Tecnologias Utilizadas

* **[Kotlin](https://kotlinlang.org/):** Linguagem de programação principal.
* **[Jetpack Compose](https://developer.android.com/jetpack/compose):** Toolkit moderno para construção de UI declarativa.
* **State Management:** Gestão de estado reativa com `remember` e `mutableStateOf` para controlar inputs, resultados e navegação.
* **Estrutura do Projeto:**
    * **`MainActivity.kt`:** Gere a navegação principal da aplicação.
