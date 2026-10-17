# F.R.I.D.A.Y.

**Assistente pessoal para Windows desenvolvido em Java.**

A F.R.I.D.A.Y. é um projeto de automação e interação com o sistema operacional. Seu objetivo é interpretar comandos do usuário, executar rotinas no computador e, progressivamente, oferecer uma interface conversacional por texto e voz.

## Escopo

- Execução de comandos e rotinas para abrir aplicativos e páginas.
- Armazenamento de preferências e configurações em banco de dados.
- Interação por linguagem natural e reconhecimento de voz.
- Integração autorizada com serviços externos, incluindo e-mail.

As ações que envolvam envio de mensagens ou alterações sensíveis deverão exigir confirmação do usuário.

## Desenvolvimento

**Status: fase inicial.** A estrutura do projeto e o ponto de entrada em Java estão definidos. O primeiro módulo em desenvolvimento é a interpretação de comandos pelo terminal; as demais funcionalidades fazem parte da evolução planejada.

A implementação utiliza **Java** como linguagem principal. O roadmap técnico e as próximas entregas estão documentados em [docs/ROADMAP.md](docs/ROADMAP.md).

## Execução

Requer um JDK instalado. Para compilar e executar a estrutura inicial a partir da raiz do repositório:

```bash
javac -d out src/main/java/friday/Friday.java
java -cp out friday.Friday
```
