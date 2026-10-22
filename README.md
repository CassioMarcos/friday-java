# F.R.I.D.A.Y.

**Assistente pessoal para Windows desenvolvida em Java.**

A F.R.I.D.A.Y. é um projeto pessoal de aprendizado e automação. Seu objetivo é interpretar comandos do usuário, executar ações no computador e, futuramente, oferecer uma interface conversacional com inteligência artificial e voz.

## Status do projeto

**Versão 0.1 — Protótipo funcional**

Atualmente, a assistente recebe comandos digitados no terminal e identifica palavras-chave para executar ações previamente programadas.

## Funcionalidades implementadas

- Leitura contínua de comandos pelo terminal.
- Reconhecimento de palavras-chave em frases.
- Abertura do YouTube, Google e GitHub no navegador padrão.
- Inicialização do Visual Studio Code no Windows.
- Saudação personalizada.
- Identificação de comandos desconhecidos.
- Encerramento pelo comando `fechar`.
- Tratamento básico de erros na execução de ações.

## Tecnologias utilizadas

- **Java** — linguagem principal.
- **Scanner** — entrada de comandos.
- **Desktop e URI** — abertura de páginas.
- **ProcessBuilder** — inicialização de aplicativos.
- **Git e GitHub** — controle de versões.

## Como executar

É necessário ter um JDK instalado e os comandos `java` e `javac` disponíveis no terminal.

Na pasta principal do repositório, compile as classes:

```powershell
javac -d out src/main/java/friday/Friday.java src/main/java/friday/AcoesComputador.java
```

Depois execute:

```powershell
java -cp out friday.Friday
```

Exemplos de comandos:

```text
Sexta, abra o YouTube
Abre o Google
Abra meu GitHub
Inicia o VS Code
Fechar
```

**Observação:** a inicialização do VS Code depende do Windows e da disponibilidade do comando `code`.

## Próximos objetivos

- Melhorar o reconhecimento e a interpretação de comandos.
- Cadastrar novos aplicativos e sites.
- Implementar persistência de dados.
- Integrar uma API de inteligência artificial, como o Gemini.
- Adicionar reconhecimento de voz (STT) e síntese de voz (TTS).
- Explorar automações com dispositivos externos.

As funcionalidades futuras ainda não estão implementadas.

O planejamento completo está disponível em [docs/ROADMAP.md](docs/ROADMAP.md).

## Desenvolvimento

Projeto desenvolvido progressivamente como parte dos estudos de Java e programação orientada a objetos.