# F.R.I.D.A.Y. 

**Assistente pessoal para Windows, desenvolvido em Java.**

A F.R.I.D.A.Y. é um projeto pessoal de aprendizado: a ideia é construir uma assistente que receba comandos, automatize tarefas no computador e, futuramente, converse por texto e voz.

> **Estado atual:** estrutura inicial criada. As funcionalidades abaixo são objetivos de desenvolvimento, não recursos já implementados.

## Por que estou criando isso?

Quero desenvolver algo que eu realmente usaria: pedir para abrir meus programas de estudo, iniciar uma rotina, consultar informações e, com o tempo, conversar com a assistente e integrar serviços como Gmail.

O projeto também é uma forma de praticar programação, aprender novas tecnologias conforme surgirem necessidades reais e documentar minhas decisões.

## O que a F.R.I.D.A.Y. poderá fazer?

| Versão planejada | Objetivo | Status |
| --- | --- | --- |
| **0.1** | Receber comandos digitados e responder no terminal | 🔨 Próxima implementação |
| **0.2** | Abrir aplicativos e páginas autorizadas no Windows | ⏳ Planejado |
| **0.3** | Salvar rotinas e preferências em banco de dados | ⏳ Planejado |
| **0.4** | Conversar por texto com integração de IA | ⏳ Planejado |
| **0.5** | Reconhecer comandos de voz e responder por áudio | ⏳ Planejado |
| **0.6+** | Integrações com serviços externos, como Gmail | ⏳ Planejado |

A ordem pode mudar durante o aprendizado. Não há prazo fixo.

## Tecnologias

- **Java:** linguagem principal.
- **IntelliJ IDEA:** ambiente de desenvolvimento.
- **Git e GitHub:** versionamento do projeto.

**Para estudar futuramente**, quando forem necessários: orientação a objetos, JDBC, SQLite/SQL, HTTP/JSON, APIs, reconhecimento de fala e modelos de linguagem. Não é preciso usar tudo desde o começo.

## Primeiros passos

O código inicial está em [`src/main/java/friday/Friday.java`](src/main/java/friday/Friday.java).

1. Abra o projeto no IntelliJ IDEA com um JDK instalado.
2. Execute a classe `Friday`.
3. Implemente, aos poucos, os requisitos de [`docs/PRIMEIRA-MISSAO.md`](docs/PRIMEIRA-MISSAO.md).

Para executar pelo terminal, a partir da raiz do repositório:

```bash
javac -d out src/main/java/friday/Friday.java
java -cp out friday.Friday
```

## Documentação

- [Roteiro de desenvolvimento](docs/ROADMAP.md)
- [Primeira missão: comandos no terminal](docs/PRIMEIRA-MISSAO.md)

## Princípios do projeto

- **Aprender fazendo:** compreender e escrever o código, em vez de copiar uma aplicação inteira.
- **Começar pequeno:** implementar e testar uma funcionalidade por vez.
- **Segurança:** ações que alterem arquivos, enviem mensagens ou movimentem dados deverão exigir confirmação; credenciais nunca serão publicadas.
- **Privacidade:** futuras funções de memória e voz terão controles claros de armazenamento e exclusão de dados.

---

Projeto pessoal em desenvolvimento. A primeira versão ainda não é uma assistente com inteligência artificial.
